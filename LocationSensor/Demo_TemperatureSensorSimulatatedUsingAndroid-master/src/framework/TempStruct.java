package framework;

import java.io.Serializable;

import android.util.Log;

public class TempStruct implements Serializable {
	private static final long serialVersionUID = 1L;

	private double longitude;
	private double latitude;

	public double getlongitude()
	{
		//Log.i("LocationValue","Lon"+longitude+"in TempStruct");
		return longitude;
	}

	
	public double getlatitude()
	{
		//Log.i("LocationValue","Lan"+latitude+"in TempStruct");
		return latitude;
	}

	/*public double gettempValue() {
		return tempValue;
	}

	private String unitOfMeasurement;

	public String getunitOfMeasurement() {
		return unitOfMeasurement;
	}*/

	public TempStruct(double longitude, double latitude) {

		this.longitude = longitude;
		this.latitude = latitude;
	}
}