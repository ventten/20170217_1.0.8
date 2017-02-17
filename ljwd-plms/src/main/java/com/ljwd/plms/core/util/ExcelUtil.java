package com.ljwd.plms.core.util;

import com.ljwd.plms.web.model.outsource.PlmsOutsrcComContact;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zhengzw on 2016/9/18
 * Excel工具类
 */
public class ExcelUtil {
    public static final DecimalFormat df = new DecimalFormat("#");                  //格式化数字-字符
    public static final DecimalFormat df2 = new DecimalFormat("0.00");              //格式化数字
    public static final SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");   //日期格式化

    /**
     * 根据上传的Excel文件获取委外机构通讯录
     * @param inputStream 输入流
     * @param fileName 文件名称
     * @param outsrcComId 委外机构ID
     * @param loginUserId 登录用户ID
     * @return 实体集
     * */
    public static List<PlmsOutsrcComContact> getOutsrcComContactList(InputStream inputStream,String fileName,Long outsrcComId,String loginUserId) throws Exception {
        Workbook workbook = createWorkbook(inputStream, fileName);
        if(workbook == null){
//            throw new RuntimeException("解析的Excel文件错误");
            return null;
        }

        //委外机构通讯录集合
        List<PlmsOutsrcComContact> contactList = new ArrayList<PlmsOutsrcComContact>();

        Sheet sheet = null;
        Row row = null;
        Cell cell = null;

        String isActive = "Y";
        Date time = new Date();

        //遍历Excel中所有的sheet
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            sheet = workbook.getSheetAt(i);
            if(sheet == null) continue;

            //遍历当前sheet中的所有行
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++){
                row = sheet.getRow(j);
                //排除第一行
                if(j == 0 || row == null) continue;

                if(row.getLastCellNum() >= 4){
                    String name = getCellValue(row.getCell(0)).toString();
                    if(StringUtil.isEmpty(name)) continue;

                    PlmsOutsrcComContact contact = new PlmsOutsrcComContact();
                    contact.setOutsrcComId(outsrcComId);
                    contact.setIsActive(isActive);
                    contact.setCreateTime(time);
                    contact.setUpdateTime(time);
                    contact.setCreatedBy(loginUserId);
                    contact.setUpdatedBy(loginUserId);
                    contact.setRecVer(0L);
                    contact.setTagSeq(1L);

                    String position = getCellValue(row.getCell(1)).toString();
                    String mobile = getCellValue(row.getCell(2)).toString();
                    String tel = getCellValue(row.getCell(3)).toString();
                    String email = getCellValue(row.getCell(4)).toString();

                    contact.setName(name.trim());

                    position = StringUtil.isEmpty(position) ? null : position.trim();
                    contact.setPosition(position);

                    if(!StringUtil.isEmpty(mobile)){
                        mobile = mobile.replaceAll("-", "").trim();
                        mobile = StringUtil.isMobile(mobile) ? mobile : null;
                        contact.setMobile(mobile);
                    }

                    tel = StringUtil.isTel(tel) ? tel.trim() : null;
                    contact.setTel(tel);

                    email = StringUtil.isEmail(email) ? email.trim() : null;
                    contact.setEmail(email);

                    contactList.add(contact);
                }
            }
        }

        return contactList;
    }

    /**
     * 描述：对表格中数值进行格式化
     * @param cell 单元格
     * @return Object
     */
    public static Object getCellValue(Cell cell){
        if (cell == null) return "";
        Object value = "";
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                value = cell.getRichStringCellValue().getString();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                if("General".equals(cell.getCellStyle().getDataFormatString())){
                    value = df.format(cell.getNumericCellValue());
                }else if("m/d/yy".equals(cell.getCellStyle().getDataFormatString())){
                    value = sdf.format(cell.getDateCellValue());
                }else{
                    value = df2.format(cell.getNumericCellValue());
                }
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
            case Cell.CELL_TYPE_BLANK:
                value = "";
                break;
            default:
                break;
        }
        return value;
    }

    /**
     * 创建Excel工作薄
     * @param inputStream 输入流
     * @param fileName 文件名称
     * @return Excel工作薄
     * */
    public static Workbook createWorkbook(InputStream inputStream,String fileName) throws IOException {
        Workbook workbook = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        if(".XLS".equalsIgnoreCase(fileType)){
            workbook = new HSSFWorkbook(inputStream);             //Excel 2003
        }else if (".XLSX".equalsIgnoreCase(fileType)){
            workbook = new XSSFWorkbook(inputStream);             //Excel 2007/2010
        }else {
            throw new RuntimeException("解析的文件格式有误");
        }
        if(inputStream != null) inputStream.close();
        return workbook;
    }

}
