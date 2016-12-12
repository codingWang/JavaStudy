package com.duwei.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOprator {
	/**
	 * 读取文件内容到字节数组并返回
	 * @param filePath	文件路径
	 * @return	文件的字节数组
	 * @throws IOException 
	 */
	public static byte[] getByteFromFile(String filePath) throws IOException{
		
		File file  = new File(filePath);
		if (!file.exists()) {
			throw new FileNotFoundException();
		}
		
		byte[] b = new byte[(int) file.length()];
		
		FileInputStream in = new FileInputStream(file);
		
		int offset = 0;  
        int numRead = 0;  								//分段读入缓冲字节数组
        while (offset < b.length && (numRead = in.read(b, offset, b.length - offset)) >= 0) {  
            offset += numRead;  
        } 
		
     // 确保所有数据均被读取  
        if (offset != b.length) {  
        	throw new IOException("Could not completely read file " + file.getName());  
        }  
        in.close();  
        return b;  
		
	}
	
	
	


}
