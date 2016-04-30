package com.duwei.thinkingjava.reflect.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentDemo {  
    private int id;  
    private String name;  
    private String sex;  
    private String age;  
    private String brithday;  
    private String address;  
  
    public StudentDemo() {  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public String getSex() {  
        return sex;  
    }  
  
    public void setSex(String sex) {  
        this.sex = sex;  
    }  
  
    public String getAge() {  
        return age;  
    }  
  
    public void setAge(String age) {  
        this.age = age;  
    }  
  
    public String getBrithday() {  
        return brithday;  
    }  
  
    public void setBrithday(String brithday) {  
        this.brithday = brithday;  
    }  
  
    public String getAddress() {  
        return address;  
    }  
  
    public void setAddress(String address) {  
        this.address = address;  
    }  
    
    
    public static void main(String[] args) throws  
    IllegalArgumentException, IllegalAccessException, InvocationTargetException {  
        StudentDemo sd=new StudentDemo();   
        sd.setId(1);  
        sd.setName("测试invoke");  
        sd.setSex("未知");  
        sd.setAge("10000");  
        sd.setBrithday("19920205");  
        sd.setAddress("湖南");  
        Object[] agrs = new Object[]{};  
        StringBuilder sb = new StringBuilder();  
        for (Method m : sd.getClass().getMethods()) {  
            if (m.getName().startsWith("get")) {  
               // System.out.println(m.getName());  
                sb.append("  <" + m.getName().substring(3) + ">");  
                sb.append(m.invoke(sd,null)); //执行这个方法,参数列表
                sb.append("</"+m.getName().substring(3)+">\r");
               // System.out.println("---"+m.invoke(sd, args));  
            }  
        }  
        System.out.println(sb.toString());  
    }  
  
}  