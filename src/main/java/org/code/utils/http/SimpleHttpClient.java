/* 
* Created on 2003-12-7 by Liudong 
*/

package org.code.utils.http; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/** 
 *提交参数演示
 *该程序连接到一个用于查询手机号码所属地的页面
 *以便查询号码段1330227所在的省份以及城市
 *@authorLiudong
 */

public class SimpleHttpClient { 

   public static void main(String[] args) throws IOException {
	// (1) 创建HttpGet实例  
			HttpGet get = new HttpGet("http://www.sxmx.gov.cn:82/commons/GetHits.action?id=7031");  
			// (2) 使用HttpClient发送get请求，获得返回结果HttpResponse  
			HttpClient http = new DefaultHttpClient();  
			try {
				HttpResponse response = http.execute(get);
				if (response.getStatusLine().getStatusCode() == 200) {
//					response.get
				    HttpEntity entity = response.getEntity();  
				  System.out.println();
//				  entity.
				    InputStream in = entity.getContent();  
				    readResponse(in);  
				}  
			} catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}  
   }
   
   public static void readResponse(InputStream in) throws Exception{  
	   
	    BufferedReader reader = new BufferedReader(new InputStreamReader(in));  
	    String line = null;  
	    StringBuffer sb = new StringBuffer();
	    while ((line = reader.readLine()) != null) {  
	        System.out.println(line);  
	        sb.append(line);
	    }
	    parseString(sb.toString());
	}
   
   public static void parseString(String str){
	   str = str.replace("document.write(\"", "");
	   str = str.replace("\")", "");
	   System.out.println(str);
//	   System.out.println(str.replace("document.write(", ""));
//	   document.write("352");
//	   Pattern p = Pattern.compile("writes"); 
//	   Matcher matcher = p.matcher(str);
//	   System.out.println(matcher.start());
//	   StringUtils.substringBetween("(", ")");
   }

}