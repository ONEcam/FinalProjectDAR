package org.apache.poi.ss;

import java.util.concurrent.TimeUnit;

public class DataSystem {

	private String status ="";
	public void setStatus(String status) {
		this.status=status;
		
	}

	public void steps() {
		if(status.equalsIgnoreCase("ON")) {
			
			System.out.println("Data System is ON");
			
			System.out.println("Track is Configured");
		
			
			
		} else if(status.equalsIgnoreCase("OFF")){
			System.out.println("Data System is OFF");
		}
	}
	
	public static void main(String args[]) {
		DataSystem console = new DataSystem();
		
		console.setStatus("ON");
		console.steps();
		
//		console.setStatus("OFF");
//		console.steps();
//		
	}
}