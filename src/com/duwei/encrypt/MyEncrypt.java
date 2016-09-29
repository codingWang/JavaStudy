package com.duwei.encrypt;

public class MyEncrypt {
	public static void main(String[] args) {
		
	}
	
	/**
     * 加密
     * @param input 数据源（需要加密的数据）
     * @param key 秘钥，即偏移量
     * @return 返回加密后的数据
     */
    public static String encrypt(String input, int key) {
        //得到字符串里的每一个字符
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; ++i) {
            //字符转换成ASCII 码值
            int ascii = array[i];
            //字符偏移，例如a->b
            ascii = ascii + key;
            //ASCII 码值转换为char
            char newChar = (char) ascii;
            //替换原有字符
            array[i] = newChar;

            //以上4 行代码可以简写为一行
            //array[i] = (char) (array[i] + key);
        }
        //字符数组转换成String
        return new String(array);
    }

    /**
     * 解密
     * @param input 数据源（被加密后的数据）
     * @param key 秘钥，即偏移量
     * @return 返回解密后的数据
     */
    public static String decrypt(String input, int key) {
        //得到字符串里的每一个字符
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; ++i) {
            //字符转换成ASCII 码值
            int ascii = array[i];
            //恢复字符偏移，例如b->a
            ascii = ascii - key;
            //ASCII 码值转换为char
            char newChar = (char) ascii;
            //替换原有字符
            array[i] = newChar;

            //以上4 行代码可以简写为一行
            //array[i] = (char) (array[i] - key);
        }

        //字符数组转换成String
        return new String(array);
    }
}
