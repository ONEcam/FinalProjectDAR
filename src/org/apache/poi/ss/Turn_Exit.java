package org.apache.poi.ss;

public class Turn_Exit implements DataCommand {
	private Data data;
	
	public Turn_Exit(Data raceCar) {
		this.data = raceCar;
		
	}
	
	@Override
	public void execute(){
		this.data.turn_Exit();
		
	}
}
