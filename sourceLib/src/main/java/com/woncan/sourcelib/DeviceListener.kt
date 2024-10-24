package com.woncan.litesurvey.listener

import com.woncan.litesurvey.data.LiteSurveyDeviceInfo
import com.woncan.litesurvey.data.LiteSurveyLocation

internal interface DeviceListener {

		fun onDeviceInfoReceive(deviceInfo : LiteSurveyDeviceInfo)

		fun onLocationReceive(location : LiteSurveyLocation)

		fun onSatelliteReceive(satelliteList : List<IntArray>)

		fun onLaserStatusReceive(isOpen : Boolean)

		fun onBatteryInfoReceive(percent : Int , isConnect : Boolean , isCharging : Boolean)

		fun onRTCMReceive(byteArray : ByteArray)

		fun onNMEAReceive(byteArray : ByteArray)

		fun onSFRReceive(byteArray : ByteArray)

		fun onIMUReceive(accelerometer : FloatArray , gyroscope : FloatArray)

		fun onDataReceive(byteArray : ByteArray)

		fun onPackCallback(packIndex : IntArray)

}