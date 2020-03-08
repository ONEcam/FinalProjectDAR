package org.apache.poi.ss;

public class DataConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataCondition condition = new DataCondition();
		Status onState = new OnState();
		Status offState = new OffState();
		
		condition.setStatus(onState);
		condition.steps();
		
		condition.setStatus(offState);
		condition.steps();
		

	}

}