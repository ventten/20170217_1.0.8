package com.ljwd.plms.core.util.exportPdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.ljwd.plms.core.util.FileUtil;
/**
 * 
 * ClassName: MergerPdf 
 * @Description: 多个pdf拼接
 * @author zhengjizhao
 * @date 2016年10月28日上午10:28:33
 */
public class MergerPdf {
	

	/*public static void main(String[] args) {
        try {
            List<String> pdfs = new ArrayList<String>();
            pdfs.add("F:\\信函模板\\最新的模板\\new\\00a3161b-2cc3-4620-8ee8-311f97228e6e.pdf");
            pdfs.add("F:\\信函模板\\最新的模板\\new\\44b22f67-9072-4481-a063-65dc87cd024a.pdf");
            pdfs.add("F:\\信函模板\\最新的模板\\new\\逾期通知书第一次—模版.pdf");
            String name = "F:\\信函模板\\最新的模板\\new\\123\\merge22.pdf";
            
            MergerPdf.concatPDFs(pdfs, name, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
	/**
	 * 
	 * @Description: 多个PDF文件拼接方法
	 * @param @param pathList 多个的PDF文件集合
	 * @param @param pathOut 输出的PDF文件
	 * @param @param paginate    是否需要页码
	 * @return void  
	 * @throws
	 * @author zhengjizhao
	 * @date 2016年10月28日上午10:29:19
	 */
    public static Boolean concatPDFs(List<String> pathList,String pathOut, boolean paginate) {
  
    	List<InputStream> pdfs = new ArrayList<InputStream>();
    	Document document = new Document();
    	try {
    		for(int i=0;i<pathList.size();i++){
    			pdfs.add(new FileInputStream(pathList.get(i)));
    		}
    		//输出文件夹不存在时创建
    		File  file = new File(pathOut);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            //创建输出的pdf文件
            OutputStream output = new FileOutputStream(pathOut);
    		List<PdfReader> readers = new ArrayList<PdfReader>();
    		//int totalPages = 0;//创建页码初始值
    		Iterator<InputStream> iteratorPDFs = pdfs.iterator();

    		//创建PDF文件读取流
    		while (iteratorPDFs.hasNext()) {
    			InputStream pdf = iteratorPDFs.next();
    			PdfReader pdfReader = new PdfReader(pdf);
    			readers.add(pdfReader);
    			//totalPages += pdfReader.getNumberOfPages();
    		}
    		//创建一个写文件的输出流
    		PdfWriter writer = PdfWriter.getInstance(document, output);

    		document.open();
    		//创建多页PDF文件的页码下标的字体
    		//BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA,BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
    		PdfContentByte cb = writer.getDirectContent(); // 读取pdf
    		// data
    		PdfImportedPage page;
    		int currentPageNumber = 0;
    		int pageOfCurrentReaderPDF = 0;
    		Iterator<PdfReader> iteratorPDFReader = readers.iterator();

    		// 循环的PDF文件并添加到输出
    		while (iteratorPDFReader.hasNext()) {
    			PdfReader pdfReader = iteratorPDFReader.next();

    			while (pageOfCurrentReaderPDF < pdfReader.getNumberOfPages()) {
    				document.newPage();
    				pageOfCurrentReaderPDF++;
    				currentPageNumber++;
    				page = writer.getImportedPage(pdfReader,
    						pageOfCurrentReaderPDF);
    				cb.addTemplate(page, 0, 0);

    				// 编辑页码格式
    				/*if (paginate) {
                        cb.beginText();
                        cb.setFontAndSize(bf, 9);
                        cb.showTextAligned(PdfContentByte.ALIGN_CENTER, ""
                                + currentPageNumber + " of " + totalPages, 520,
                                5, 0);
                        cb.endText();
                    }*/
    			}
    			pageOfCurrentReaderPDF = 0;
    		}
    		//处理完成后删除所有的临时文件
    		for(int i=0;i<pathList.size();i++){
    			//删除文件
    			FileUtil.deleteFile(pathList.get(i));
    		}
    		output.flush();
    		document.close();
    		output.close();
    		return true;
    	} catch (Exception e) {
            e.printStackTrace();
            return false;
        } 
    }
}
