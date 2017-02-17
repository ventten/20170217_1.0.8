package com.ljwd.plms.core.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class FileUtil {

    /**
     * 以流的形式下载文件,并删除原文件
     * @param fileName 下载后的文件名(带文件格式)
     * @param path 文件路径
     * @param request request
     * @param response response
     */
    public static void downloadFile(String fileName,String path, HttpServletRequest request,HttpServletResponse response) {
        try {
            // path是指欲下载的文件的路径
            // 以流的形式下载文件
            InputStream fis = new BufferedInputStream(new FileInputStream(path));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            // 清空response
            response.reset();
            // 设置response的Header
            try{
                String userAgent = request.getHeader("User-Agent");
                //针对各浏览器文件中文名称乱码问题
                if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
                    //针对IE或者以IE为内核的浏览器
                    fileName = java.net.URLEncoder.encode(fileName, "UTF-8");
                } else {
                    //非IE浏览器或者以IE为内核的处理
                    fileName = new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));//文件名外的双引号处理firefox的空格截断问题
            OutputStream toClient = new BufferedOutputStream(
                    response.getOutputStream());
            toClient.write(buffer);
            toClient.flush();
            toClient.close();
            //删除文件
            FileUtil.deleteFile(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{

        }
    }

	/**
	* @Description: 创建文件夹（若存在则不再创建）
	* @param docsPath
	* @return boolean
	*/
	public static boolean createFile(String docsPath) {
        File dir = new File(docsPath);
        if (dir.exists()) {
            System.out.println("目录" + docsPath + "已经存在");
            return true;
        }
        if (!docsPath.endsWith(File.separator)) {
            docsPath = docsPath + File.separator;
        }
        //创建目录
        if (dir.mkdirs()) {
            System.out.println("创建目录" + docsPath + "成功！");
            return true;
        } else {
            System.out.println("创建目录" + docsPath + "失败！");
            return false;
        }
    }

	/** 
	 * 删除单个文件 
	 * @param   sPath    被删除文件的文件名 
	 * @return 单个文件删除成功返回true，否则返回false 
	 */  
	public static boolean deleteFile(String sPath) {  
	    boolean flag = false;  
	    File file = new File(sPath);  
	    // 路径为文件且不为空则进行删除  
	    if (file.isFile() && file.exists()) {  
	        file.delete();  
	        flag = true;  
	    }  
	    return flag;  
	}
	/**
	 * @Description: 删除文件夹
	 * @param @param folderPath   文件夹完整绝对路径
	 * @author zhengjizhao
	 * @date 2016年12月29日下午2:14:00
	 */
     public static void delFolder(String folderPath) {
	     try {
	        delAllFile(folderPath); //删除完里面所有内容
	        String filePath = folderPath;
	        filePath = filePath.toString();
	        java.io.File myFilePath = new java.io.File(filePath);
	        myFilePath.delete(); //删除空文件夹
	     } catch (Exception e) {
	       e.printStackTrace(); 
	     }
	}
     /**
      * @Description: 删除指定文件夹下所有文件
      * @param  path 文件夹完整绝对路径
      * @return boolean  
      * @author zhengjizhao
      * @date 2016年12月29日下午2:14:32
      */
     public static boolean delAllFile(String path) {
	       boolean flag = false;
	       File file = new File(path);
	       if (!file.exists()) {
	         return flag;
	       }
	       if (!file.isDirectory()) {
	         return flag;
	       }
	       String[] tempList = file.list();
	       File temp = null;
	       for (int i = 0; i < tempList.length; i++) {
	          if (path.endsWith(File.separator)) {
	             temp = new File(path + tempList[i]);
	          } else {
	              temp = new File(path + File.separator + tempList[i]);
	          }
	          if (temp.isFile()) {
	             temp.delete();
	          }
	          if (temp.isDirectory()) {
	             delAllFile(path + "/" + tempList[i]);//先删除文件夹里面的文件
	             delFolder(path + "/" + tempList[i]);//再删除空文件夹
	         flag = true;
	      }
	   }
	   return flag;
	 }
}
