/*************************************************************
 * Title: MD5.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月25日 下午3:18:41
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.encryp;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密算法
 */
public class MD5 {
	public byte[] eccrypt(String info) throws NoSuchAlgorithmException{
		MessageDigest md5 = MessageDigest.getInstance("SHA");
		byte[] srcBytes = info.getBytes();
		//使用srcBytes更新摘要
		md5.update(srcBytes);
		//完成哈希计算，得到result
		byte[] resultBytes = md5.digest();
		return resultBytes;
	}

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException 
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String msg = "郭德纲-精品相声技术";
		MD5 sha = new MD5();
		byte[] resultBytes = sha.eccrypt(msg);
		System.out.println("明文是：" + msg);
		try {
			System.out.println("密文是：" + new String(resultBytes,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
