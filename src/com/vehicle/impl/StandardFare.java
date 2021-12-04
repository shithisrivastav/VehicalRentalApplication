package com.vehicle.impl;

import com.vehicle.IStandardFare;

public class StandardFare implements IStandardFare {

	private Double standardFare;
	private Double addlFareForExcessPassengers;
	private Double addlFareForACVehicles;
	
	@Override
	public Double getStandardFare() {
		return standardFare;
	}

	@Override
	public void setStandardFare(Double fare) {
		this.standardFare = fare;
	}

	@Override
	public Double getAddlFareForExcessPassengers() {
		return addlFareForExcessPassengers;
	}

	@Override
	public void setAddlFareForExcessPassengers(Double fare) {
		this.addlFareForExcessPassengers = fare;
		
	}

	@Override
	public Double getAddlFareForACVehicles() {
		return addlFareForACVehicles;
	}

	@Override
	public void setAddlFareForACVehicles(Double fare) {
		this.addlFareForACVehicles = fare;
	}

	
}
