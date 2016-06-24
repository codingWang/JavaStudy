package com.duwei.designpattern.state;

public class ClosingState extends LiftState{

	@Override
	public void open() {
		super.context.setLiftState(Context.OPENNING_STATE);
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		System.out.println("µÁÃ›√≈πÿ±’°£°£°£");
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.RUNNING_STATE);
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.STOPPING_STATE);
		super.context.getLiftState().stop();
	}

}
