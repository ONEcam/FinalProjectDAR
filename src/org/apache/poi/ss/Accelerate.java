package org.apache.poi.ss;

public class Accelerate implements DataCommand {
	
	private Data data;
	
	public Accelerate(Data raceCar) {
		this.data = raceCar;
		
	}
	
	@Override
	public void execute() {
		this.data.accelerate();
		
	}
}