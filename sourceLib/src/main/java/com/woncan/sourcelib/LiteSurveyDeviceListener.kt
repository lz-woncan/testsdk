package com.woncan.litesurvey.listener

import com.woncan.litesurvey.data.BatteryInfo
import com.woncan.litesurvey.data.ImuData
import com.woncan.litesurvey.data.LiteSurveyDeviceInfo
import com.woncan.litesurvey.data.LiteSurveyLocation
import com.woncan.litesurvey.data.SatelliteInfo

/**
 * Listener for monitoring data and connection status of LiteSurvey devices
 */
interface LiteSurveyDeviceListener {

		/**
		 * Called when a LiteSurvey device has connected.
		 */
		fun onConnect()

		/**
		 * Called when a LiteSurvey device has disconnected.
		 */
		fun onDisconnect()

		/**
		 * Called when general information about the device was received from a LiteSurvey device.
		 *
		 * @param deviceInfo General device information of the LiteSurvey device
		 * @see LiteSurveyDeviceInfo
		 */
		fun onDeviceInfo(deviceInfo: LiteSurveyDeviceInfo)

		/**
		 * Called when LiteSurvey device updates is location
		 *
		 * @param location Location of the LiteSurvey device
		 */
		fun onLocationChanged(location: LiteSurveyLocation)

		/**
		 * Called when LiteSurvey device updates satellite information
		 *
		 * @param satelliteInfoList List of satellite information
		 * @see SatelliteInfo
		 */
		fun onSatelliteInfo(satelliteInfoList : List<SatelliteInfo>)

		/**
		 * Called when an NMEA message is received from LiteSurvey device
		 *
		 * @param nmeaMessage NMEA message
		 */
		fun onNmeaMessage(nmeaMessage : String)

		/**
		 * Called when a RTCM message is received from LiteSurvey device
		 *
		 * @param rtcmMessage RTCM message
		 */
		fun onRtcmMessage(rtcmMessage : ByteArray)

		/**
		 * Called when LiteSurvey device updates its battery information
		 *
		 * @param batteryInfo Battery information of LiteSurvey device
		 */
		fun onBatteryInfo(batteryInfo : BatteryInfo)

		/**
		 * Called when the laser on LiteSurvey device was toggled
		 *
		 * @param laserState true if laser was turned on, false if laser was turned off
		 */
		fun onLaserStateChange(laserState : Boolean)

		/**
		 * Called when IMU data was received from LiteSurvey device
		 *
		 * @param imuData IMU data
		 * @see ImuData
		 */
		fun onImuData(imuData: ImuData)

		/**
		 * Called when Woncan server reports whether a firmware upgrade for this LiteSurvey device is available
		 *
		 * @param newFirmwareAvailable true if firmware upgrade is available, false otherwise
		 */
		fun onFirmwareUpgradeAvailability(newFirmwareAvailable : Boolean)

		/**
		 * Called when firmware upgrade of LiteSurvey device has progressed
		 *
		 * @param progressPercentage Progress percentage
		 */
		fun onFirmwareUpgradeProgress(progressPercentage: Int)

		/**
		 * Called when firmware update (query or the update itself) encounters an error
		 *
		 * @param errorMessage Error message
		 */
		fun onFirmwareUpgradeError(errorMessage : String)


		/**
		 * Called when Ntrip connection fails
		 *
		 * @param errorMessage Error message
		 */
		fun onNtripConnectionError(errorMessage : String)
}