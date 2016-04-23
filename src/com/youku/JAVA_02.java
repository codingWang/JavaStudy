package com.youku;

public class JAVA_02 extends X{
	Y y = new Y();
	
	public JAVA_02(){
		System.out.println("JAVA_02");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
