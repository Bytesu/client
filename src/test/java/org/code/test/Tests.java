/*************************************************************
 * Title: Tests.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年8月7日 上午11:25:42
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.test;

import org.junit.Test;

/**
 * 
 */
public class Tests {

	@Test
	public void test(){
		String fileName = "/upload/video/中文.xml";
		fileName = fileName.subSequence(0, fileName.lastIndexOf("/")+1)
				+fileName.substring(fileName.lastIndexOf("/")+1, fileName.lastIndexOf("."))
				+fileName.substring(fileName.lastIndexOf("."));
		System.out.println(fileName.substring(fileName.lastIndexOf("/")+1, fileName.lastIndexOf(".")));
		System.out.println(fileName);
	}
}
