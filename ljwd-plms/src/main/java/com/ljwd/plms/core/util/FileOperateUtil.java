package com.ljwd.plms.core.util;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
 
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
 
/**
 * 
 * ClassName: FileOperateUtil 
 * @Description: 文件上传和下载工具
 * @author zhengjizhao
 * @date 2016年11月3日上午10:01:55
 */
public class FileOperateUtil {
	//文件上传保存的路径
    public static String FILEDIR = null;
    /**
     * 上传
     * @param request 
     * @param filePath 要存放的文件路径
     * @return 返回文件保存的路径 ，为了存入数据库
     * @throws IOException
     */
    public static String upload(HttpServletRequest request,String filePath){  
    	//文件保存地址
    	String pathDoc = "";
    	try{
        MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> fileMap = mRequest.getFileMap(); 
        FILEDIR = filePath;
        File file = new File(FILEDIR);
        if (!file.exists()) {
            file.mkdirs();
        }
        Iterator<Map.Entry<String, MultipartFile>> it = fileMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, MultipartFile> entry = it.next();
            MultipartFile mFile = entry.getValue();
            if(mFile.getSize() != 0 && !"".equals(mFile.getName())){
            	//写出文件地址
            	String outPath = FILEDIR ;
            	/*File fileOut = new File("D:\\picture\\sysManage\\corres\\逾期通知书第一次—模版.pdf");
            	if (!fileOut.exists()) {
            		fileOut.mkdirs();
                }*/
            	pathDoc = outPath+ mFile.getOriginalFilename();
                write(mFile.getInputStream(), new FileOutputStream(pathDoc));
            }else{
            	return "isnull";
            }
        }
    	}catch(Exception e){
    		e.printStackTrace();
    		return "error";
    	}
		return pathDoc;
    }
    
    public static void download(String downloadfFileName, ServletOutputStream out,String filePath) {
        try {
            FileInputStream in = new FileInputStream(new File(filePath + File.separator + downloadfFileName));
            write(in, out);
        } catch (FileNotFoundException e) {
            try {
                FileInputStream in = new FileInputStream(new File(filePath + File.separator
                        + new String(downloadfFileName.getBytes("iso-8859-1"),"utf-8")));
                write(in, out);
            } catch (IOException e1) {              
                e1.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }       
    }
    /**
     * 写入数据
     * @param in 读取路径
     * @param out 写出路径
     * @throws IOException
     */
    public static void write(InputStream in, OutputStream out) throws IOException{
        try{
            byte[] buffer = new byte[1024];
            int bytesRead = -1;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            out.flush();
            out.close();
        } finally {
            try {
                in.close();
            }
            catch (IOException ex) {
            }
            try {
                out.close();
            }
            catch (IOException ex) {
            }
        }
    }   
}