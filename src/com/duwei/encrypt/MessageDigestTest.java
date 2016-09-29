package com.duwei.encrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void MDAl(String content){
		//常用算法：MD5、SHA、CRC
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] result = digest.digest(content.getBytes());
		//消息摘要的结果一般都是转换成16 进制字符串形式展示
		//String hex = Hex.encode(result);
		//MD5 结果为16 字节（128 个比特位）、转换为16 进制表示后长度是32 个字符
		//SHA 结果为20 字节（160 个比特位）、转换为16 进制表示后长度是40 个字符
		//System.out.println(hex);
	}

}
