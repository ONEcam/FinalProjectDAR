package org.apache.poi.ss;

public class ProxyPattern {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		DataSheet dataSheet = new ProxySheet("Track : Orlando Kart Center");
		
		dataSheet.display();
		System.out.println("Downloading Please Wait...");
		
		dataSheet.display();
	}

}