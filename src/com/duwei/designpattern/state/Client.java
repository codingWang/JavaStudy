package com.duwei.designpattern.state;
/**
 * 状态模式的定义：
 * 当一个对象内在状态改变时允许其改变行为
 * 状态的改变引起了行为的改变
 * @author 杜伟
 *
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}

}
