package org.apache.poi.ss;

public class Turn10 implements Data {
	
	@Override
	public void accelerate() {
		System.out.println("Turn4: Acceleration OK ");
	}
	
	public void braking() {
		System.out.println("Turn4: Braking OK  ");
	}
	
	public void apex() {
		System.out.println("Turn4: Apex OK ");
	}
	
	public void turn_In() {
		System.out.println("Turn4: Turn In OK");
	}
	
	
	public void turn_Exit() {
		System.out.println("Turn4: Exit OK");
	}		
	

}