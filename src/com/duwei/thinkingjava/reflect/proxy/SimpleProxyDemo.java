package com.duwei.thinkingjava.reflect.proxy;

public class SimpleProxyDemo {
	
	public static void consumer(Interface iface){
		
		iface.doSomething();
		iface.somthingElse("bonobo");
		
	}

	public static void main(String[] args) {
		//consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}

}
