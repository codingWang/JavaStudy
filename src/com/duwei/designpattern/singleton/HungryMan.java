package com.duwei.designpattern.singleton;

public class HungryMan {
	
	private static final HungryMan instance = new HungryMan();
		
	public static HungryMan getInstance(){
		return instance;
	} 

	private HungryMan(){}

}
