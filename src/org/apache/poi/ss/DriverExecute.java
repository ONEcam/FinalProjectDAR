package org.apache.poi.ss;

public class DriverExecute {
	
	private DataCommand command;
	
	public DriverExecute(DataCommand command) {
		this.command = command;
		
	}
	
	public void run() {
		this.command.execute();
	}

}