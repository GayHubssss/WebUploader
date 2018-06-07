package pers.me.pharmacy.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class MD5 {
	
	/**
	 * 
	 * @param 需要加密的字符串str
	 * @return 加密后的字符串
	 * @throws NoSuchAlgorithmException 没有这种产生消息摘要的算法
	 * @throws UnsupportedEncodingException
	 */
	public String EncoderByMd5(String str)throws NoSuchAlgorithmException,UnsupportedEncodingException{
		
		MessageDigest md5 =  MessageDigest.getInstance("MD5");
		
		BASE64Encoder base64en = new BASE64Encoder();
		
		String newStr = base64en.encode(md5.digest(str.getBytes("UTF-8")));
		
		return newStr;
	}
	
//MD5验证	
//	public boolean checkpassword(String newpasswd,String oldpasswd) throws NoSuchAlgorithmException, UnsupportedEncodingException{
//	　　　　if(EncoderByMd5(newpasswd).equals(oldpasswd))
//	 　　　　　　return true;
//	　　　　else
//	 　　　　　　return false;
//	}

}
