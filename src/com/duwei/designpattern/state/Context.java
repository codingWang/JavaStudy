package com.duwei.designpattern.state;

public class Context {

	public static final OpeningState OPENNING_STATE = new OpeningState();
	public static final ClosingState CLOSEING_STATE = new ClosingState();
	public static final RunningState RUNNING_STATE = new RunningState();
	public static final StoppingState STOPPING_STATE = new StoppingState();
	
	/**内部状态的控制*/
	private LiftState liftState;
	
	public LiftState getLiftState(){
		return liftState;
	}
	
	public void setLiftState(LiftState _liftState){
		this.liftState = _liftState;
		this.liftState.setContext(this);
	}
	
	public void open(){
		this.liftState.open();
	}
	
	public void close(){
		this.liftState.close();
	}
	
	public void run(){
		this.liftState.run();
	}
	
	public void stop(){
		this.liftState.stop();
	}
	
}
