package org.apache.poi.ss;

public abstract class DecoratorData implements Data{
	
	private Data data;
	
	public DecoratorData(Data raceCar) {
		this.data = raceCar;
				
	}
	
	protected Data getData() {
		return this.data;
	}

}