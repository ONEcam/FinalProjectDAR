package org.apache.poi.ss;

public class RealData implements DataSheet {
	
	private String fileName;
	
		public RealData(String fileName) {
			this.fileName = fileName;
			loadFromDatalogger(fileName);
			
		}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	private void loadFromDatalogger(String fileName) {
		System.out.println("Loading Data " + fileName);
		
	}

}