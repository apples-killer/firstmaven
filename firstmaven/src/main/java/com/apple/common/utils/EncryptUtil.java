package com.apple.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {

	
	
	
	public static String MD5(String content){
		byte[] bytes=content.getBytes();
		//单线程使用StringBulider速度快，多线程使用StringBuffer线程安全
		StringBuilder result=new StringBuilder();
		try {
			MessageDigest mInst=MessageDigest.getInstance("MD5");
			mInst.update(bytes);
			byte[] md=mInst.digest();
			char[] hexDigits={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
			
			for(int i=0;i<md.length;i++){
				byte b=md[i];
				result.append(hexDigits[b>>>4&0xf]).append(hexDigits[b&0xf]);
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String result=EncryptUtil.MD5("sadfadfs");
		System.out.println(result);
	}
}
