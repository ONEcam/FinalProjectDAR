package org.apache.poi.ss;

public class Turn5 implements Data {
	
	@Override
	public void accelerate() {
		System.out.println("S3Lap 1 : Accelerate Early");
		System.out.println("S3 Lap 2 : Acceleration OK");
	}
	
	public void braking() {
		System.out.println("S3 Lap 1 : Braking OK  ");
		System.out.println("S3 Lap 2 : Braking OK  ");
	}
	
	public void apex() {
		System.out.println("S3 Lap 1 : Apex OK ");
		System.out.println("S3 Lap 2 : Apex OK ");
	}
	
	public void turn_In() {
		System.out.println("S3 Lap 1 : Turn In OK");
		System.out.println("S3 Lap 2 : Turn In OK");
	}
	
	
	public void turn_Exit() {
		System.out.println("S3 Lap 1 : Turn Exit OK");
		System.out.println("S3 Lap 2 : Turn Exit OK");
	}		
	

}