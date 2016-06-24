package com.duwei.designpattern.state;

public class StoppingState extends LiftState{

	@Override
	public void open() {
		super.context.setLiftState(Context.OPENNING_STATE);
		super.context.getLiftState().open();
		
	}

	@Override
	public void close() {
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.RUNNING_STATE);
		super.context.getLiftState().run();
		
	}

	@Override
	public void stop() {
		System.out.println("µÁÃ›Õ£÷π¡À°£°£°£");
	}

}
