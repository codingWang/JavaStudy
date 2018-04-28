package com.duwei.designpattern.state;
/**
 * 电梯状态抽象类
 * @author 杜伟
 */
public abstract class LiftState {
	protected Context context;
	
	public void setContext(Context _context){
		this.context = _context;
	}
	
	public abstract void open();
	public abstract void close();
	public abstract void run();
	public abstract void stop();
	
}
