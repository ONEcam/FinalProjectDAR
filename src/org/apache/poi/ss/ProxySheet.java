package org.apache.poi.ss;

public class ProxySheet implements DataSheet {
	
	private RealData realData;
	private String fileName;
	
	public ProxySheet(String fileName) {
		this.fileName = fileName;
		
	}

	public void display() {
		if(realData ==null) {
			realData = new RealData(fileName);
		
		}
		realData.display();
		
	}
}