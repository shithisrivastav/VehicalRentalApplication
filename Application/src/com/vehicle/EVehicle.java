package com.vehicle;

public enum EVehicle {

	VWGolf("VW Golf", 4, EEngineType.Diesel, EVehicleType.CAR, ETemperatureControl.NON_AC), 
	VWPolo("VW Polo", 4, EEngineType.Petrol,EVehicleType.CAR, ETemperatureControl.AC), 
	BUS("Bus", 20, EEngineType.Diesel, EVehicleType.BUS, ETemperatureControl.NON_AC),
	SUV("suv", 7, EEngineType.Petrol  , EVehicleType.SUV, ETemperatureControl.NON_AC),
	VAN("van", 10, EEngineType.Diesel, EVehicleType.VAN, ETemperatureControl.AC);
	private String name;
	private EEngineType engineType;
	private EVehicleType vehicleType;
	private Integer seatingCapacity;
	private ETemperatureControl temperatureControl;

	EVehicle(String name, Integer seatingCapacity, EEngineType engineType, EVehicleType vehicleType, ETemperatureControl temperatureControl) {
		this.name = name;
		this.seatingCapacity = seatingCapacity;
		this.engineType = engineType;
		this.vehicleType = vehicleType;
		this.temperatureControl = temperatureControl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EEngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EEngineType engineType) {
		this.engineType = engineType;
	}

	public EVehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(EVehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public ETemperatureControl getTemperatureControl() {
		return temperatureControl;
	}

	public void setTemperatureControl(ETemperatureControl temperatureControl) {
		this.temperatureControl = temperatureControl;
	}
	
}
