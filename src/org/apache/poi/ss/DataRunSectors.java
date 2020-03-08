package org.apache.poi.ss;

import java.util.Iterator;

public class DataRunSectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataRunSectors datarunsectors = new DataRunSectors();
		DataSectors sectors = new DataSectors();
		
		for (Iterator iterator = sectors.getIterator(); iterator.hasNext(); ){
			
			System.out.println(iterator.next());
			
		}
		
	}

}