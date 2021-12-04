package com.vehicle.impl;

import com.vehicle.EVehicleType;
import com.vehicle.IStandardFare;
import com.vehicle.IVehicleRentalDetails;

public class VehicleRentalDetails implements IVehicleRentalDetails {
	
	@Override
	public Double getDiscount(EVehicleType vehicleType) {

		switch (vehicleType) {
		case BUS:
			return 2.0;

		default:
			break;
		}
		
		return 0.0;
	}

	@Override
	public IStandardFare getStandardFare() {
		StandardFare standardFare = new StandardFare();
		standardFare.setStandardFare(1.5);
		standardFare.setAddlFareForACVehicles(0.2);
		standardFare.setAddlFareForExcessPassengers(0.1);
		
		return standardFare;
	}

}
