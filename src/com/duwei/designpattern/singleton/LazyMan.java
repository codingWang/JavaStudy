package com.duwei.designpattern.singleton;

public class LazyMan {
	private static LazyMan instance = null; // 延迟加载

	private LazyMan() {
	}

	synchronized public static LazyMan getInstance() {
		if (instance == null) {
			instance = new LazyMan();
		}
		return instance;
	}
}
