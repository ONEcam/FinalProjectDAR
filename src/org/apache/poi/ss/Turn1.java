package org.apache.poi.ss;

public class Turn1 implements Data {
	
	@Override
	public void accelerate() {
		System.out.println("S1 Lap 1 : Accelerate Early");
		System.out.println("S1 Lap 2 : Accelerate Early");
	}
	
	public void braking() {
		System.out.println("S1 Lap 1 : Brake Late");
		System.out.println("S1 Lap 2 : Brake Late");
	}
	
	public void apex() {
		System.out.println("S1 Lap 1 : Apex Missed");
		System.out.println("S1 Lap 2 : Apex OK");
	}
	
	public void turn_In() {
		System.out.println("S1 Lap 1 : Turn In OK");
		System.out.println("S1 Lap 2 : Turn In OK");
		
	}
	
	public void turn_Exit() {
		System.out.println("S1 Lap 1 : Turn Exit Wide");
		System.out.println("S1 Lap 2 : Turn Exit OK");
	}		
	

}