package org.apache.poi.ss;

public class DataCondition implements Status {
	
	private Status dataStatus;
	
	public void setStatus(Status status) {
		this.dataStatus=status;
		
	}
	
	public Status getStatus() {
		return this.dataStatus;
		
	}
	public void steps() {
		this.dataStatus.steps();
	}

}
