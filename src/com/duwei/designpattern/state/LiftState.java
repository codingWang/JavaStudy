package com.duwei.designpattern.state;
/**
 * µçÌİ×´Ì¬³éÏóÀà
 * @author ¶ÅÎ°
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
