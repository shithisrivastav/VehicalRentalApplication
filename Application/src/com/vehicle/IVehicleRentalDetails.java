package com.vehicle;

public interface IVehicleRentalDetails {

	public Double getDiscount(EVehicleType vehicleType);
	
	public IStandardFare getStandardFare();
	
}
