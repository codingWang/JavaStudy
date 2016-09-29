package com.duwei.encrypt;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSA {
	//一次性加密数据的长度不能大于117 字节
	private static final int ENCRYPT_BLOCK_MAX = 117;
	//一次性解密的数据长度不能大于128 字节
	private static final int DECRYPT_BLOCK_MAX = 128;

	public static void main(String[] args) {

	}
	/**
	 * RSA加密解密API
	 * @param content
	 */
	public void encryptRsa(String content) {
		try {
			// 1，获取cipher 对象
			Cipher cipher = Cipher.getInstance("RSA");
			// 2，通过秘钥对生成器KeyPairGenerator 生成公钥和私钥
			KeyPair keyPair = KeyPairGenerator
					.getInstance("RSA")
					.generateKeyPair();
			PublicKey publicKey = keyPair.getPublic();//公钥
			PrivateKey privateKey = keyPair.getPrivate();//私钥
			// 3,使用公钥初始化密码器
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			// 4，执行加密操作
			byte[] result = cipher.doFinal(content.getBytes());
			// 使用私钥初始化密码器
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			// 执行解密操作
			byte[] deResult = cipher.doFinal(result);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
