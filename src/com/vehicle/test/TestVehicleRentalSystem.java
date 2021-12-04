package com.vehicle.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.vehicle.ETripDetails;
import com.vehicle.EVehicle;
import com.vehicle.impl.VehicleRentalSystem;

class TestVehicleRentalSystem {

	VehicleRentalSystem system = new VehicleRentalSystem();
	
	@Test
	void testSingleTrip() {
		
		Double calculateFare = system.calculateFare(EVehicle.BUS, 3, new ETripDetails[] { ETripDetails.Brno_Budapest });
		Double exceptedValue=480.0;
		int delta=5;
		System.out.println("Total trip fare : " + calculateFare + " EUR");
	        assertEquals(exceptedValue,calculateFare,delta);
	        assertEquals(480.0,calculateFare,5);
	   
	}
	@Test
	void testSingleSuvTrip() {
		
		Double calculateFare = system.calculateFare(EVehicle.SUV, 5, new ETripDetails[] { ETripDetails.Brno_Budapest });
		Double exceptedValue=525.0;
		int delta=5;
		System.out.println("Total trip fare : " + calculateFare + " EUR");
	        assertEquals(exceptedValue,calculateFare,delta);
	        assertEquals(525.0,calculateFare,5);
	   
	}
	@Test
	void testSingleVanTrip() {
		
		Double calculateFare = system.calculateFare(EVehicle.VAN,11, new ETripDetails[] { ETripDetails.Brno_Budapest });
		Double exceptedValue=595.0;
		int delta=5;
		System.out.println("Total trip fare : " + calculateFare + " EUR");
	        assertEquals(exceptedValue,calculateFare,delta);
	        assertEquals(595.0,calculateFare,5);
	   
	}

   //Below is the given example trip  details with multiple routes
	@Test
	void testMultiPleTrips() {
		Double calculateFare = system.calculateFare(EVehicle.VWGolf, 3, new ETripDetails[] { ETripDetails.Prague_Brno,
				ETripDetails.Brno_Budapest, ETripDetails.Budapest_Prague });
		Double exceptedValue=1550.0;
		int delta=1;
		System.out.println("Total trip fare : " + calculateFare + " EUR");
		assertEquals(exceptedValue,calculateFare,delta);
	        assertEquals(1550.0,calculateFare,1);
	     
	    
	}
	

}
