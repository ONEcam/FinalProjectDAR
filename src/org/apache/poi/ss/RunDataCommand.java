package org.apache.poi.ss;
import java.util.concurrent.TimeUnit;

public class RunDataCommand {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Downloading Data Please Wait...");
		TimeUnit.MILLISECONDS.sleep(2500);

		//Turn 1
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
		
		
		//Turn 2
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
		
		
		//Turn 3
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
		
		
		//Turn 4
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
		
		//Turn 5
		DataCommand command21 = new Accelerate(new Turn4()) ;
		DataCommand command22 = new Braking(new Turn4()) ;
		DataCommand command23 = new Apex(new Turn4()) ;
		DataCommand command24 = new Turn_In(new Turn4()) ;
		DataCommand command25 = new Turn_Exit(new Turn4()) ;
		
		DriverExecute driver21 = new DriverExecute(command16);
		DriverExecute driver22 = new DriverExecute(command17);
		DriverExecute driver23 = new DriverExecute(command18);
		DriverExecute driver24 = new DriverExecute(command19);
		DriverExecute driver25 = new DriverExecute(command20);
		
		driver21.run();
		driver22.run();
		driver23.run();
		driver24.run();
		driver25.run();
		
		//Turn 6
		DataCommand command26 = new Accelerate(new Turn4()) ;
		DataCommand command27 = new Braking(new Turn4()) ;
		DataCommand command28 = new Apex(new Turn4()) ;
		DataCommand command29 = new Turn_In(new Turn4()) ;
		DataCommand command30 = new Turn_Exit(new Turn4()) ;
		
		DriverExecute driver26 = new DriverExecute(command16);
		DriverExecute driver27 = new DriverExecute(command17);
		DriverExecute driver28 = new DriverExecute(command18);
		DriverExecute driver29 = new DriverExecute(command19);
		DriverExecute driver30 = new DriverExecute(command20);
		
		driver26.run();
		driver27.run();
		driver28.run();
		driver29.run();
		driver30.run();
		
	}

}