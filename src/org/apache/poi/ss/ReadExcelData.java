package org.apache.poi.ss;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelData {

    public static void main(String[] args) throws Exception{
    	
    	FileInputStream fis = new FileInputStream("C:\\Users\\e372242\\Desktop\\Sectors.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        
        XSSFSheet s1 = workbook.getSheet("Lap1");
        XSSFSheet s2 = workbook.getSheet("Lap2");
        
        //Sector1 Lap 1
        XSSFRow row = s1.getRow(1);       
        XSSFCell cell = row.getCell(0);
 
        //Sector1 Lap 2
        XSSFRow row11 = s2.getRow(1);       
        XSSFCell cell12 = row11.getCell(0);
        
        //Sector2 Lap 1
        XSSFRow row3 = s1.getRow(1);       
        XSSFCell cell3 = row3.getCell(2);
        
        //Sector2 Lap 2
        XSSFRow row13 = s2.getRow(1);       
        XSSFCell cell14 = row13.getCell(2);
        
        //Sector3 Lap 1
        XSSFRow row5 = s1.getRow(1);       
        XSSFCell cell5 = row5.getCell(4);
        
        //Sector3 Lap 2
        XSSFRow row15 = s2.getRow(1);       
        XSSFCell cell16 = row15.getCell(4);       
        
        //LapTime Lap 1
        XSSFRow row7 = s1.getRow(1);       
        XSSFCell cell7 = row7.getCell(6);
        
        //LapTime Lap 2
        XSSFRow row17 = s2.getRow(1);       
        XSSFCell cell17 = row17.getCell(6);             
        
        //S1 RPM High/Low Lap 1
        XSSFRow row1 = s1.getRow(1);      
        XSSFRow row2 = s1.getRow(2); 
        XSSFCell cell1 = row1.getCell(1);
        XSSFCell cell2 = row2.getCell(1);
        
        //S1 RPM High/Low Lap 2
        XSSFRow row18 = s2.getRow(1);      
        XSSFRow row19 = s2.getRow(2); 
        XSSFCell cell18 = row18.getCell(1);
        XSSFCell cell19 = row19.getCell(1);
        
        //S2 RPM High/Low Lap 1
        XSSFRow row4= s1.getRow(1);      
        XSSFRow row6 = s1.getRow(2); 
        XSSFCell cell4 = row4.getCell(3);
        XSSFCell cell6 = row6.getCell(3);
        
        //S2 RPM High/Low Lap 2
        XSSFRow row20= s2.getRow(1);      
        XSSFRow row21 = s2.getRow(2); 
        XSSFCell cell20 = row20.getCell(3);
        XSSFCell cell21 = row21.getCell(3);
                
        //S3 RPM High/Low Lap 1
        XSSFRow row8= s1.getRow(1);      
        XSSFRow row10 = s1.getRow(2); 
        XSSFCell cell8 = row8.getCell(5);
        XSSFCell cell10 = row10.getCell(5);
         
        //S3 RPM High/Low Lap 2
        XSSFRow row22= s2.getRow(1);      
        XSSFRow row23 = s2.getRow(2); 
        XSSFCell cell22 = row22.getCell(5);
        XSSFCell cell23 = row23.getCell(5);   
        
        //Implementing State Design Patter
		DataSystem console = new DataSystem();
		console.setStatus("ON");
		console.steps();
        
		//Implementing Proxy Pattern Pattern
		DataSheet dataSheet = new ProxySheet("Track : Orlando Kart Center");
		dataSheet.display();
		System.out.println("Downloading Please Wait...");
		TimeUnit.MILLISECONDS.sleep(1500);
		dataSheet.display();
		
		System.out.println("");
		System.out.println("<SECTOR 1-------------------------------->");
		
		//Print of Sector 1 Lap 1
        String Sector1 = String.valueOf(cell.getNumericCellValue());
        System.out.println("Sector 1 Lap 1: " + Sector1 );
        TimeUnit.MILLISECONDS.sleep(800);
        
        //Print of Sector 1 Lap 2
        String Sector1Lap2 = String.valueOf(cell12.getNumericCellValue());
        System.out.println("Sector 1 Lap 2: " + Sector1Lap2 );
        TimeUnit.MILLISECONDS.sleep(800);
        
    	System.out.println("");
        System.out.println("<RPM------------------------------------>"); 
        
        //Print of High and Low RPM Sector 1 Lap 1
        String RPMs1High = String.valueOf (cell1.getNumericCellValue());
        Double RPMs1Low = cell2.getNumericCellValue();
        System.out.println("RPM S1 Lap 1:" + " High " + RPMs1High + " Low " + RPMs1Low);
        TimeUnit.MILLISECONDS.sleep(800);
        
        //Print of High and Low RPM Sector 1 Lap 2
        String RPMs1HighLap2 = String.valueOf (cell18.getNumericCellValue());
        Double RPMs1LowLap2 = cell19.getNumericCellValue();
        System.out.println("RPM S1 Lap 2:" + " High " + RPMs1HighLap2 + " Low " + RPMs1LowLap2);
        TimeUnit.MILLISECONDS.sleep(700);
        
    	System.out.println("");
        System.out.println("<TURN 1------------------------------------>");
        
		//Print Turn 1 Driver Errors, Implementing Command Design Pattern 
		DataCommand command1 = new Accelerate(new Turn1()) ;
		DataCommand command2 = new Braking(new Turn1()) ;
		DataCommand command3 = new Apex(new Turn1()) ;
		DataCommand command4 = new Turn_In(new Turn1()) ;
		DataCommand command5 = new Turn_Exit(new Turn1()) ;
		
		DriverExecute driver1 = new DriverExecute(command1);
		DriverExecute driver2 = new DriverExecute(command2);
		DriverExecute driver3 = new DriverExecute(command3);
		DriverExecute driver4 = new DriverExecute(command4);
		DriverExecute driver5 = new DriverExecute(command5);
		
		driver1.run();
		driver2.run();
		driver3.run();
		driver4.run();
		driver5.run();   
		 
		System.out.println("");
		System.out.println("<TURN 2------------------------------------>");
		
		//Print Turn 2 Driver Errors, Implementing Command Design Pattern 
		DataCommand command6 = new Accelerate(new Turn2()) ;
		DataCommand command7 = new Braking(new Turn2()) ;
		DataCommand command8 = new Apex(new Turn2()) ;
		DataCommand command9 = new Turn_In(new Turn2()) ;
		DataCommand command10 = new Turn_Exit(new Turn2()) ;
		
		DriverExecute driver6 = new DriverExecute(command6);
		DriverExecute driver7 = new DriverExecute(command7);
		DriverExecute driver8 = new DriverExecute(command8);
		DriverExecute driver9 = new DriverExecute(command9);
		DriverExecute driver10 = new DriverExecute(command10);
		
		driver6.run();
		driver7.run();
		driver8.run();
		driver9.run();
		driver10.run();
		
		System.out.println("");
		System.out.println("<SECTOR 2-------------------------------->");
        
        //Print of Sector 2 Lap 1
        String Sector2 = String.valueOf(cell3.getNumericCellValue());
        System.out.println("Sector 2 Lap 1: " + Sector2 );
        TimeUnit.MILLISECONDS.sleep(600);       
        
        //Print of Sector 2 Lap 2
        String Sector2Lap2 = String.valueOf(cell14.getNumericCellValue());
        System.out.println("Sector 2 Lap 2: " + Sector2Lap2 );
        TimeUnit.MILLISECONDS.sleep(500);
        
    	System.out.println("");
        System.out.println("<RPM------------------------------------>"); 
        
        // Print of High and Low RPM Sector 2 Lap 1
        String RPMs2High = String.valueOf (cell4.getNumericCellValue());
        Double RPMs2Low = cell6.getNumericCellValue();
        System.out.println("RPM S2 Lap 1:" + " High "+ RPMs2High + " Low " + RPMs2Low);        
        TimeUnit.MILLISECONDS.sleep(400);
        
        // Print of High and Low RPM Sector 2 Lap 2
        String RPMs2HighLap2 = String.valueOf (cell20.getNumericCellValue());
        Double RPMs2LowLap2 = cell21.getNumericCellValue();
        System.out.println("RPM S2 Lap 2:" + " High "+ RPMs2HighLap2 + " Low " + RPMs2LowLap2);        
        TimeUnit.MILLISECONDS.sleep(300);
        
    	System.out.println("");
        System.out.println("<TURN 3------------------------------------>");
        
        //Print Turn 3 Driver Errors, Implementing Command Design Pattern 
		DataCommand command11 = new Accelerate(new Turn3()) ;
		DataCommand command12 = new Braking(new Turn3()) ;
		DataCommand command13 = new Apex(new Turn3()) ;
		DataCommand command14 = new Turn_In(new Turn3()) ;
		DataCommand command15 = new Turn_Exit(new Turn3()) ;
		
		DriverExecute driver11 = new DriverExecute(command11);
		DriverExecute driver12 = new DriverExecute(command12);
		DriverExecute driver13 = new DriverExecute(command13);
		DriverExecute driver14 = new DriverExecute(command14);
		DriverExecute driver15 = new DriverExecute(command15);
		
		driver11.run();
		driver12.run();
		driver13.run();
		driver14.run();
		driver15.run();

		System.out.println("");
		System.out.println("<TURN 4------------------------------------>");
        
        //Print Turn 4 Driver Errors, Implementing Command Design Pattern 
		DataCommand command16 = new Accelerate(new Turn4()) ;
		DataCommand command17 = new Braking(new Turn4()) ;
		DataCommand command18 = new Apex(new Turn4()) ;
		DataCommand command19 = new Turn_In(new Turn4()) ;
		DataCommand command20 = new Turn_Exit(new Turn4()) ;
		
		DriverExecute driver16 = new DriverExecute(command16);
		DriverExecute driver17 = new DriverExecute(command17);
		DriverExecute driver18 = new DriverExecute(command18);
		DriverExecute driver19 = new DriverExecute(command19);
		DriverExecute driver20 = new DriverExecute(command20);
		
		driver16.run();
		driver17.run();
		driver18.run();
		driver19.run();
		driver20.run();

		System.out.println("");
		System.out.println("<SECTOR 3-------------------------------->");
        
        //Print of Sector 3 Lap 1
        String Sector3 = String.valueOf(cell5.getNumericCellValue());
        System.out.println("Sector 3 Lap 1: " + Sector3 );
        TimeUnit.MILLISECONDS.sleep(200);
        
        //Print of Sector 3 Lap 2
        String Sector3Lap2 = String.valueOf(cell16.getNumericCellValue());
        System.out.println("Sector 3 Lap 2: " + Sector3Lap2 );
        TimeUnit.MILLISECONDS.sleep(100);
        
    	System.out.println("");
        System.out.println("<RPM------------------------------------>"); 
        
        // Print of High and Low RPM Sector 3 Lap 1
        String RPMs3High = String.valueOf (cell8.getNumericCellValue());
        Double RPMs3Low = cell10.getNumericCellValue();
        System.out.println("RPM S3 Lap 1:" + " High "+ RPMs3High + " Low " + RPMs3Low);        
        TimeUnit.MILLISECONDS.sleep(100);
        
        // Print of High and Low RPM Sector 3 Lap 2
        String RPMs3HighLap2 = String.valueOf (cell22.getNumericCellValue());
        Double RPMs3LowLap2 = cell23.getNumericCellValue();
        System.out.println("RPM S3 Lap 2:" + " High "+ RPMs3HighLap2 + " Low " + RPMs3LowLap2);   
        TimeUnit.MILLISECONDS.sleep(100);
        
    	System.out.println("");
        System.out.println("<Turn 5------------------------------------>");
        
        //Print Turn 5 Driver Errors, Implementing Command Design Pattern 
		DataCommand command21 = new Accelerate(new Turn4()) ;
		DataCommand command22 = new Braking(new Turn4()) ;
		DataCommand command23 = new Apex(new Turn4()) ;
		DataCommand command24 = new Turn_In(new Turn4()) ;
		DataCommand command25 = new Turn_Exit(new Turn4()) ;
		
		DriverExecute driver21 = new DriverExecute(command21);
		DriverExecute driver22 = new DriverExecute(command22);
		DriverExecute driver23 = new DriverExecute(command23);
		DriverExecute driver24 = new DriverExecute(command24);
		DriverExecute driver25 = new DriverExecute(command25);
		
		driver21.run();
		driver22.run();
		driver23.run();
		driver24.run();
		driver25.run();
		
		System.out.println("");
		System.out.println("<Turn 6------------------------------------>");
		
		//Print Turn 6 Driver Errors, Implementing Command Design Pattern 
		DataCommand command26 = new Accelerate(new Turn4()) ;
		DataCommand command27 = new Braking(new Turn4()) ;
		DataCommand command28 = new Apex(new Turn4()) ;
		DataCommand command29 = new Turn_In(new Turn4()) ;
		DataCommand command30 = new Turn_Exit(new Turn4()) ;
		
		DriverExecute driver26 = new DriverExecute(command26);
		DriverExecute driver27 = new DriverExecute(command27);
		DriverExecute driver28 = new DriverExecute(command28);
		DriverExecute driver29 = new DriverExecute(command29);
		DriverExecute driver30 = new DriverExecute(command30);
		
		driver26.run();
		driver27.run();
		driver28.run();
		driver29.run();
		driver30.run();        

		System.out.println("");
		System.out.println("<Final Lap Times--------------------------->");
                
        //Print of LapTime Lap 1
        String LapTime = String.valueOf(cell7.getStringCellValue());
        System.out.println("LapTime: " + LapTime );
        TimeUnit.MILLISECONDS.sleep(100);
        
        //Print of LapTime Lap 2
        String LapTimeLap2 = String.valueOf(cell17.getStringCellValue());
        System.out.println("LapTime: " + LapTimeLap2 );   
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("");
        
        //Implement Container Design Pattern
        DataRunSectors datarunsectors = new DataRunSectors();
		DataSectors sectors = new DataSectors();
		System.out.println("<Time Breakdown-------------------------->");
		TimeUnit.MILLISECONDS.sleep(300);
		for (Iterator iterator = sectors.getIterator(); iterator.hasNext(); )
		{
			System.out.println(iterator.next());
		}
        
    }
}