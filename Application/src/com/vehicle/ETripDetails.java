package com.vehicle;

public enum ETripDetails {

	Prague_Brno("Prague-Brno", 207.0), Prague_Budapest("Prague-Budapest", 550.0), Brno_Viena("Brno-Viena",
			150.0), Brno_Budapest("Brno-Budapest", 350.0),
	Brno_Prague("Brno-Prague", 205.0), Budapest_Prague("Budapest-Prague", 550.0), Viena_Brno("Viena_Brno",
			150.0), Budapest_Brno("Budapest-Brno", 350.0);

	private String name;
	private Double distance;

	ETripDetails(String name, Double distance) {
		this.name = name;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

}
