/*************************************************************
 * Title: FileUtils.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月3日 下午3:03:24
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;

/**
 * 
 */
public class FileUtils {

	
	/**
	 *  读取流到文件
	 * @return
	 */
	public String readIoToString(String filePath){
		StringBuffer buffer = new StringBuffer() ;
		try {
			
//			InputStream is = new FileInputStream("D:\\xml.xml");
		    InputStream is = new FileInputStream(filePath);
	        String line; // 用来保存每行读取的内容
	        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	        line = reader.readLine(); // 读取第一行
	        while (line != null) { // 如果 line 为空说明读完了
	        	System.out.println(line);
	            buffer.append(line); // 将读到的内容添加到 buffer 中
	            buffer.append("\n"); // 添加换行符
	            line = reader.readLine(); // 读取下一行
	        }
	        reader.close();
	        is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}
	
	@Test
	public void testIo(){
		String path = "D:\\xml.xml";
		readIoToString(path);
	}
}
