package com.duwei.thinkingjava.reflect.proxy;

public class SimpleProxy implements Interface{
	
	private Interface proxied;
	
	public SimpleProxy(Interface proxied){
		this.proxied=proxied;
	}

	@Override
	public void doSomething() {
		System.out.println("SimpleProxy.dosomthing");	
		proxied.doSomething();
	}

	@Override
	public void somthingElse(String arg) {
		System.out.println("SimpleProxy.somthingElse=="+arg);
		proxied.somthingElse(arg);
	}


}
