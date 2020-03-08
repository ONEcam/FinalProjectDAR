package org.apache.poi.ss;

public class Apex implements DataCommand {
	private Data data;
	
	public Apex(Data raceCar) {
		this.data = raceCar;
		
	}
	
	@Override
	public void execute(){
		this.data.apex();
		
	}
}