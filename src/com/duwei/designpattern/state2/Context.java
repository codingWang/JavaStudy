package com.duwei.designpattern.state2;

public class Context {

	private State state; // 维持一个对抽象状态对象的引用
	private int value; // 其他属性值，该属性值的变化可能会导致对象状态发生变化

	// 设置状态对象
	public void setState(State state) {
		this.state = state;
	}

	public void request() {
		// 其他代码
		state.handle(); // 调用状态对象的业务方法
		// 其他代码
	}
}
