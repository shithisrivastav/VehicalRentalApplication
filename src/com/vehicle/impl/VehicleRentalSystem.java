package com.vehicle.impl;

import com.vehicle.EEngineType;
import com.vehicle.ETemperatureControl;
import com.vehicle.ETripDetails;
import com.vehicle.EVehicle;
import com.vehicle.EVehicleType;
import com.vehicle.IStandardFare;

public class VehicleRentalSystem {

	public static void main(String[] args) {
         //This code is just for test
		//VehicleRentalSystem system = new VehicleRentalSystem();
		//Double calculateFare = system.calculateFare(EVehicle.VWpolo, 3, new ETripDetails[] { ETripDetails.Brno_Budapest });
		//System.out.println("Total trip fare : " + calculateFare+" EUR");
	}

	public Double calculateFare(EVehicle vehicle, Integer noOfPassengers, ETripDetails[] trips) {

		if(trips != null && vehicle != null && noOfPassengers > 0) {
			
			VehicleRentalDetails rentalDetails = new VehicleRentalDetails();
			Double allowedDiscount = rentalDetails.getDiscount(vehicle.getVehicleType());

			IStandardFare standardFareDetails = rentalDetails.getStandardFare();

			Double totalTripDistance = 0.0;
			for (ETripDetails trip : trips) {
				totalTripDistance += trip.getDistance();
			}
			System.out.println("Total trip distance : " + totalTripDistance);

			Integer noOfAddlPassengers = noOfPassengers - vehicle.getSeatingCapacity();

			Double standardFare = getBaseFare(standardFareDetails, vehicle, allowedDiscount);

			Double baseTripFare = (totalTripDistance * standardFare);

			System.out.println("Base Trip Fare : " + baseTripFare+" EUR");

			Double addlChargeForExcessPasseners = 0.0;
			if (noOfAddlPassengers > 0) {
				System.out.println("No of addl passengers : " + noOfAddlPassengers);

				addlChargeForExcessPasseners = ((noOfAddlPassengers * standardFareDetails.getAddlFareForExcessPassengers())
						* totalTripDistance);

				System.out.println("Addl Charge for Excess Passeners : " + addlChargeForExcessPasseners);
			}
			Double addlChargeForAC = 0.0;
			if (ETemperatureControl.AC.equals(vehicle.getTemperatureControl())) {
				addlChargeForAC = (standardFareDetails.getAddlFareForACVehicles() * totalTripDistance);
				System.out.println("Addl Charge for AC : " + addlChargeForAC+" EUR");
			}

			return Math.ceil((baseTripFare + addlChargeForExcessPasseners + addlChargeForAC));
		}
		
		return 0.0;
	}

	private Double getBaseFare(IStandardFare standardFareDetails, EVehicle vehicle, Double allowedDiscount) {
		Double standardFare = standardFareDetails.getStandardFare();
		System.out.println("Standard Fare : " + standardFare+" EUR");
		
		if (EVehicleType.BUS.equals(vehicle.getVehicleType())) {
			standardFare = standardFare - ((allowedDiscount / 100) * standardFare);
			System.out.println("Standard Fare for bus : " + standardFare+" EUR");
		}
		if (EEngineType.Diesel.equals(vehicle.getEngineType())) {
			standardFare = standardFare - 0.1;
			System.out.println("Standard Fare for diesel vehicle : " + standardFare+" EUR");
		}

		return standardFare;
	}

}
