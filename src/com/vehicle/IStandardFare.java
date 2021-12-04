package com.vehicle;

public interface IStandardFare {

	public Double getStandardFare();
	
	public void setStandardFare(Double fare);
	
	public Double getAddlFareForExcessPassengers();
	
	public void setAddlFareForExcessPassengers(Double fare);
	
	public Double getAddlFareForACVehicles();
	
	public void setAddlFareForACVehicles(Double fare);
	
}
