package logic;

import deviceImpl.MySQLAccess;
import iotsuite.pubsubmiddleware.PubSubMiddleware;
import iotsuite.semanticmodel.*;
import framework.*;

public class LogicRoomAvgTemp extends RoomAvgTemp {

	MySQLAccess dao = new MySQLAccess();

	public LogicRoomAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo,
			Object ui) {
		super(pubSubM, deviceInfo);

	}

	public void onNewtempMeasurement(TempStruct arg) {
		System.out.println("Temperature value from sensor has been received in RoomAvgTemp");
		System.out.println("Location Longitude  is "+arg.getlongitude()+"Latitude is "+arg.getlatitude());

		try {
			dao.readDataBase(arg.getlongitude(),arg.getlatitude());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// setroomAvgTempMeasurement(new TempStruct(arg.gettempValue() + 25,
		// "C"));

	}

}