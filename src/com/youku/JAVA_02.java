package com.youku;
/**
 * 子类父类的加载顺序问题
 * @author 杜伟
 *
 */
public class JAVA_02 extends X{
	Y y = new Y();
	
	public JAVA_02(){
		System.out.println("JAVA_02");
	}

	public static void main(String[] args) {
		new JAVA_02();
	}
}

class X{
	Y y = new Y();
	public X(){
		System.out.println("X");
	}
}


class Y{
	public Y(){
		System.out.println("Y");
	}
}
