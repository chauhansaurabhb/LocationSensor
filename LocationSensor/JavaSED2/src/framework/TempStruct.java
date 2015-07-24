//package fr.inria.arles.pankesh.gen;

package framework;

import java.io.Serializable;

public class TempStruct implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private double longitude;
	private double latitude;
	


	public double getlongitude() {
		
		System.out.println("Longitude is"+longitude+"in TempStruct.java");
		return longitude;
	}

	public double getlatitude() {
		System.out.println("Latitude is"+latitude+"in TempStruct.java");
		return latitude;
	}
	
	public TempStruct(double longitude, double latitude) {

		this.longitude = longitude;
		this.latitude = latitude;
	}
	/*private double tempValue;

	public double gettempValue() {
		return tempValue;
	}

	private String unitOfMeasurement;

	public String getunitOfMeasurement() {
		return unitOfMeasurement;
	}

	public TempStruct(double tempValue, String unitOfMeasurement) {

		this.tempValue = tempValue;
		this.unitOfMeasurement = unitOfMeasurement;
	}*/
}