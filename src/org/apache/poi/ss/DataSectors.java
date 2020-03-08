package org.apache.poi.ss;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataSectors implements DataContainer{
	
	private List<String> sectors = new ArrayList<String>();
	
	public DataSectors() {
		sectors.add("S1 Lap 1: +0.15 slower then Lap 2");
		sectors.add("S1 Lap 2: -0.15 faster then Lap 1");
		sectors.add("S2 Lap 1: +0.20 slower then Lap 2");
		sectors.add("S2 Lap 2: -0.20 faster then Lap 1");
		sectors.add("S3 Lap 1: +0.02 slower then Lap 2");
		sectors.add("S3 Lap 2: -0.02 faster then Lap 1");
		sectors.add("LapTime 1: +0.40 slower then Lap 2");
		sectors.add("LapTime 2: -0.40 faster then Lap 1");
	}
		
		@Override
		public Iterator getIterator() {
			return new SectorIterator();
			
		}
		
		private class SectorIterator implements Iterator {
			
			private int position;
			
			@Override
			public boolean hasNext() {
				if(position < sectors.size())
					return true;
				return false;
				
			}
			
			@Override 
			public Object next() {
				if (this.hasNext())
					return sectors.get(position++);
				return null;
			}
			
		}

	}