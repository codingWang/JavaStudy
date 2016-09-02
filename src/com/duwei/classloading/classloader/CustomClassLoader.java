package com.duwei.classloading.classloader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
/**
 * blog.csdn.net/xyang81/article/details/7292380
 * @author 杜伟
 *
 */
public class CustomClassLoader extends ClassLoader{
	private String rootUrlString;
	
	public CustomClassLoader(String rootUrl) {
		this.rootUrlString = rootUrl;
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		Class clazz = null;
		byte[] classDate = getclassData(name);
		if (classDate == null ) {
			throw new ClassNotFoundException();
		}
		clazz = defineClass(name, classDate,0, classDate.length);
		//Converts an array of bytes into an instance of class
		return clazz;
	}

	private byte[] getclassData(String name) {
		  InputStream is = null;//输入流
	        try {
	            String path = rootUrlString + "/" + name.replace(".", "/") + ".class";
	            URL url = new URL(path);
	            byte[] buff = new byte[1024*4];//字节缓冲
	            int len = -1;
	            is = url.openStream();	//打开流
	            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	            while((len = is.read(buff)) != -1) {
	                baos.write(buff,0,len);//写入字节数组
	            }
	            return baos.toByteArray();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (is != null) {
	               try {
	                  is.close();
	               } catch(IOException e) {
	                  e.printStackTrace();
	               }
	            }
	        }
	        return null;
	}
}
