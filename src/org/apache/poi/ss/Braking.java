package org.apache.poi.ss;

public class Braking implements DataCommand {
	private Data data;
	
	public Braking(Data raceCar) {
		this.data = raceCar;
		
	}
	
	@Override
	public void execute(){
		this.data.braking();
		
	}
}