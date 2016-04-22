package com.duwei.designpattern.singleton;

public class LazyMan {
	private static LazyMan instance = null; // ясЁы╪сть

	private LazyMan() {
	}

	synchronized public static LazyMan getInstance() {
		if (instance == null) {
			instance = new LazyMan();
		}
		return instance;
	}
}
