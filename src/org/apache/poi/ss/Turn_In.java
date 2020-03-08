package org.apache.poi.ss;

public class Turn_In implements DataCommand {
	private Data data;
	
	public Turn_In(Data raceCar) {
		this.data = raceCar;
		
	}
	
	@Override
	public void execute(){
		this.data.turn_In();
		
	}
}

