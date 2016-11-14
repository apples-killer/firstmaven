package com.apple.common.utils;

public class CommonUtil {

	public static String randomStr(int len) {
		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
				'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
				'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6',
				'7', '8', '9' };
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < len; i++) {
			int index = (int) (Math.random() * chars.length);
			char rand = chars[index];
			result.append(rand);
		}
		return result.toString();
	}

	public static String randomPhone() {
		char[] chars = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		StringBuilder result = new StringBuilder();
		result.append('1');
		for (int i = 0; i < 10; i++) {
			int index = (int) (Math.random() * chars.length);
			char rand = chars[index];
			result.append(rand);
		}
		return result.toString();
	}

	public static String randomAge() {
		int age = (int) (Math.random() * 100);
		return Integer.toString(age);
	}
	
	public static String randomSex() {
		double b =Math.random();
		if(b>0.5){
			return "male";
		}else{
			return "female";
		}
	}
	public static String randomMail() {
		char[] chars0 = { '1', '2', '3', '4', '5', '6',
				'7', '8', '9' };
		char[] chars = { '0','1', '2', '3', '4', '5', '6',
				'7', '8', '9' };
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			char rand;
			if(i==0){
				int index = (int) (Math.random() * chars0.length);
				rand = chars0[index];
			}else{
				int index = (int) (Math.random() * chars.length);
				rand = chars[index];
			}
			result.append(rand);
		}
		result.append("@qq.com");
		return result.toString();
	}
	

	public static void main(String[] args) {
		String str = CommonUtil.randomStr(3);
		System.err.println(str);
	}
}
