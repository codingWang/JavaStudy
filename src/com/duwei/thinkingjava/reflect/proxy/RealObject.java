package com.duwei.thinkingjava.reflect.proxy;

public class RealObject implements Interface{


	@Override
	public void doSomething() {
		System.out.println("doSomething");
	}

	@Override
	public void somthingElse(String arg) {
		System.out.println("somthingElse=="+arg);
	}
	

}
