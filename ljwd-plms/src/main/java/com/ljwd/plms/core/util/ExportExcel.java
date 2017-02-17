package com.ljwd.plms.core.util;


import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.IndexedColors;

/**
 * 利用开源组件POI3.0.2动态导出EXCEL文档
 * 
 * @version v1.0
 * @param <T>
 *            应用泛型，代表任意一个符合javabean风格的类
 *            注意这里为了简单起见，boolean型的属性xxx的get器方式为getXxx(),而不是isXxx()
 *            byte[]表jpg格式的图片数据
 */
public class ExportExcel<T> {
	//定义一个excel表单
    HSSFWorkbook wbook = new HSSFWorkbook();
	public static final String FILE_SEPARATOR = System.getProperties()
			.getProperty("file.separator");

	public void exportExcel(Collection<T> dataset, OutputStream out) {
		cutDataAndToCreateExcel("案件管理导出EXCEL文档", null, dataset, out, "yyyy-MM-dd");
	}

	public void exportExcel(String[] headers, Collection<T> dataset,
			OutputStream out) {
		cutDataAndToCreateExcel("案件管理导出EXCEL文档", headers, dataset, out, "yyyy-MM-dd");
	}

	public void exportExcel(String[] headers, Collection<T> dataset,
			OutputStream out, String pattern) {
		cutDataAndToCreateExcel("案件管理导出EXCEL文档", headers, dataset, out, pattern);
	}
	/**
	 * 
	 * @Description: 导出excel表的时候对数据分析，如果数据量太大就截取生成多sheet导出
	 * @param  title excel文件名
	 * @param  headers excel 列头名
	 * @param  dataset 要生成的数据源
	 * @param  out 输出文件流（输出文件地址）
	 * @param  pattern   时间格式
	 * @author zhengjizhao
	 * @date 2017年1月18日下午1:16:18
	 */
	public void cutDataAndToCreateExcel(String title, String[] headers,Collection<T> dataset, OutputStream out, String pattern){
		List list;
		if (dataset instanceof List){
		  list = (List)dataset;
		}
		else{
		  list = new ArrayList(dataset);
		}
		//定义为每个sheet中的数据为50000条
        if (list.size() > 50000) {
            int k = (list.size() + 50000) / 50000;
            for (int i = 1; i <= k; i++) {
                if (i < k) {
                	generateExcel(i,title,headers,list.subList((i - 1) * 50000, i * 50000),out,pattern);
                } else {
                	generateExcel(i,title,headers,list.subList((i - 1) * 50000, list.size()),out,pattern);
                }
            }
        } else {
        	generateExcel(0,title,headers,list,out,pattern);
        }
        try {
        	//写出excel
			wbook.write(out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @Description: 生成excel报表
	 * @param	num sheet 标号
	 * @param  excelName excel文件名
	 * @param  excelHeader excel 列头名
	 * @param  list  要生成的数据源
	 * @param  out 输出文件流（输出文件地址）
	 * @param  dateFormat 时间格式
	 * @author zhengjizhao
	 * @date 2017年1月18日上午10:37:36
	 */
	public void generateExcel(int num,String excelName,String[] excelHeader,List<T> list,OutputStream out,String dateFormat){
		if (list.size()!=0) {
			HSSFSheet sheet = null;
			//设置sheet名
			if(num != 0){
				 sheet  = wbook.createSheet(excelName+num);
			}else{
				 sheet  = wbook.createSheet(excelName);
			}
	        // 给工作表列定义列宽(实际应用自己更改列数)  
	        for (int i = 0; i < excelHeader.length; i++) {
	            sheet.setColumnWidth(i, 6000); 
	        }
	        // 创建列头样式  
	        HSSFCellStyle headerStyle = wbook.createCellStyle();  
	        // 指定单元格居中对齐  
	        headerStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
	        // 指定单元格垂直居中对齐  
	        headerStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
	        // 设置背景色
	        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_TURQUOISE.getIndex());
	        headerStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			//设置边框
	        headerStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
	        headerStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
	        headerStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
	        headerStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
	        // 设置列头字体  
	        HSSFFont headerfont = wbook.createFont();  
	        headerfont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);  //加粗
	        headerfont.setFontName("宋体");  //字体
	        headerfont.setFontHeight((short) 200); //字体高度
	        headerStyle.setFont(headerfont); 
	        // 创建数据列样式  ----------------------------------------------------------------
	        HSSFCellStyle bodyStyle = wbook.createCellStyle();  
	        // 指定单元格居中对齐  
	        bodyStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
	        // 指定单元格垂直居中对齐  
	        bodyStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
			//设置边框
	        bodyStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
	        bodyStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
	        bodyStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
	        bodyStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
	        // 设置列头字体  
	        HSSFFont bodyFont = wbook.createFont();  
	        //bodyFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);  
	        bodyFont.setFontName("宋体");  
	        bodyFont.setFontHeight((short) 200);
	        bodyStyle.setFont(bodyFont);
	        // 指定当单元格内容显示不下时自动换行  
	        //cellStyle.setWrapText(true);  
	        // 设置列头  
	        HSSFRow rowHeader = sheet.createRow(0);//table第一列
	        for(int i = 0; i < excelHeader.length; i++){
		        HSSFCell cell = rowHeader.createCell(i);  
		        cell.setCellStyle(headerStyle);  
		        cell.setCellValue(excelHeader[i]); 
	        }
	        // 声明一个画图的顶级管理器
	        HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
	        // 遍历集合数据，产生数据行
			Iterator<T> it = list.iterator();
			int index = 0;
			while (it.hasNext()){
				index++;
				//产生数据的行编号
				HSSFRow rowBody = sheet.createRow(index);//第一列是列头，加1从第二列开始打印数据 
				T t = (T) it.next();
				//利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值
				Field[] fields = t.getClass().getDeclaredFields();
				for (short i = 0; i < fields.length; i++){
					HSSFCell cell = rowBody.createCell(i);
					cell.setCellStyle(bodyStyle);
					Field field = fields[i];
					String fieldName = field.getName();
					String getMethodName = "get"+ fieldName.substring(0, 1).toUpperCase()+ fieldName.substring(1);
					try {
						Class tCls = t.getClass();
						Method getMethod = tCls.getMethod(getMethodName,new Class[]{});
						Object value = getMethod.invoke(t,new Object[]{});
						// 判断值的类型后进行强制类型转换
						String textValue = null;
						if(value==null||value.equals("")){
							textValue = "";
						}else{
							//如果属性数据是布尔型
							if(value instanceof Boolean) {
								textValue = (String) value;
							//如果属性数据是时间格式
							} else if (value instanceof Date) {
								Date date = (Date) value;
								SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
								textValue = sdf.format(date);
							//如果属性数据是byte
							} else if (value instanceof byte[]) {
								// 有图片时，设置行高为60px;
								rowBody.setHeightInPoints(60);
								// 设置图片所在列宽度为80px,注意这里单位的一个换算
								sheet.setColumnWidth(i, (short) (35.7 * 80));
								// sheet.autoSizeColumn(i);
								byte[] bsValue = (byte[]) value;
								HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0,
										1023, 255, (short) 6, index, (short) 6, index);
								anchor.setAnchorType(2);
								patriarch.createPicture(anchor, wbook.addPicture(bsValue, HSSFWorkbook.PICTURE_TYPE_JPEG));
							} else {
								// 其它数据类型都当作字符串简单处理
								textValue = value.toString();
							}
							
						}
						// 如果不是图片数据，就利用正则表达式判断textValue是否全部由数字组成
						if (textValue != null) {
							Pattern p = Pattern.compile("^//d+(//.//d+)?$");
							Matcher matcher = p.matcher(textValue);
							if (matcher.matches()) {
								// 是数字当作double处理
								cell.setCellValue(Double.parseDouble(textValue));
							} else {
								HSSFRichTextString richString = new HSSFRichTextString(textValue);
								cell.setCellValue(richString);
							}
						}
					} catch (SecurityException e) {
						e.printStackTrace();
					} catch (NoSuchMethodException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} finally {
						// 清理资源
					}
				}
			}
		} 
	}
}
