package com.woncan.litesurvey.device

import android.content.Context
import androidx.annotation.Nullable
import com.woncan.litesurvey.data.GnssSystem
import com.woncan.litesurvey.data.NmeaType
import com.woncan.litesurvey.data.LiteSurveyDeviceInfo
import com.woncan.litesurvey.data.NtripAccount
import com.woncan.litesurvey.listener.LiteSurveyDeviceListener
import com.woncan.litesurvey.listener.NtripMountpointCallback

/**
 * This interface provides access to LiteSurvey devices.
 * Methods contained in this interface allow applications to
 * 1. Scan for, connect to, and disconnect from LiteSurvey devices;
 * 2. Change the settings of device's output or peripherals;
 * 3. Receive notifications when data have arrived from the device;
 * 4. Query basic information about the device.
 *
 * Implemented by the LiteSurveyDevice class.
 */
interface LiteSurveyDevice {

		/**
		 *  Display name of the LiteSurvey device
		 */
		val displayName : String

		/**
		 * Data transport type of the LiteSurvey device
		 * @see DataTransportType
		 */
		val dataTransportType : DataTransportType

		/**
		 * General device information of the LiteSurvey device
		 * @return LiteSurveyDeviceInfo deviceInfo General device information of the LiteSurvey device
		 * @see LiteSurveyDeviceInfo
		 */
		fun getDeviceInfo() : LiteSurveyDeviceInfo?

		/**
		 * Initiates connection to the LiteSurvey device. Monitor its progress with the onConnect callback
		 * @param context Context
		 * @param listener Listener for LiteSurvey device notifications
		 * @see LiteSurveyDeviceListener
		 */
		fun connect(context : Context , listener : LiteSurveyDeviceListener)

		/**
		 * Attempts to disconnect from the LiteSurvey device. Monitor its progress with the onDisconnect callback
		 * @see LiteSurveyDeviceListener.onDisconnect
		 */
		fun disconnect()

		/**
		 *
		 * @param predicate
		 */
		fun setGnssSystems(predicate : (GnssSystem) -> Boolean)

		/**
		 * Sets the output rate of an NMEA message
		 *
		 * @param nmeaType Type of an NMEA message
		 * @param enable NMEA enable
		 */
		fun setNmeaOutput(nmeaType : NmeaType , enable : Boolean)

		/**
		 * Enable the output of a RTCM message (if supported)
		 *
		 * @param rtcmMessageNumber RTCM message number
		 */
		fun enableRtcmOutput(vararg rtcmMessageNumber : Int)

		/**
		 * Disable the output of a RTCM message (if supported)
		 *
		 */
		fun disableRtcmOutput()

		/**
		 * Enables or disables the laser of the LiteSurvey device
		 *
		 * @param enable TRUE = enable laser. FALSE = disable laser.
		 */
		fun setLaserState(enable : Boolean)

		/**
		 * Set the output rate of the inertial measurement unit (IMU), if available
		 *
		 * @param rateMillis Output rate in milliseconds
		 */
		fun setImuOutput(rateMillis : Int)

		/**
		 * Query whether firmware upgrade is available for this LiteSurvey device.
		 * Monitor the onFirmwareUpgradeAvailability callback for results.
		 *
		 * This request will send your basic device information (device ID, serial number, etc.) to Woncan servers.
		 *
		 * @param context Context
		 */
		fun queryFirmwareUpgrade()

		/**
		 * Attempts to upgrade the firmware of this LiteSurvey device.
		 * Monitor the onFirmwareUpgradeProgress callback for upgrade progress
		 *
		 * This request will send your basic device information (device ID, serial number, etc.) to Woncan servers.
		 *
		 */
		fun startFirmwareUpgrade(context : Context)

		/**
		 * Query NTRIP mountpoints for an NTRIP server
		 *
		 * @param address IP address or URL of NTRIP server
		 * @param port Port of NTRIP server
		 * @param ntripMountpointCallback Callback for receiving mountpoint information or errors
		 */
		fun queryNtripMountpoint(address : String ,
		                         port : Int ,
		                         ntripMountpointCallback : NtripMountpointCallback)
		/**
		 * Connect to the specified NTRIP account.
		 *
		 * @param ntripAccount NTRIP account to connect
		 */
		fun startNtripConnection(ntripAccount : NtripAccount)

		/**
		 * Connect to the specified NTRIP account.
		 *
		 * @param ntripAccount NTRIP account to connect
		 * @param transmitNmeaPosition if true, location of LiteSurvey device will be transmitted to the NTRIP server.
		 * This is often required for virtual reference station (VRS) networks.
		 */
		fun startNtripConnection(ntripAccount : NtripAccount , transmitNmeaPosition : Boolean = true)

		/**
		 * Disconnect NTRIP service for this LiteSurvey device
		 */
		fun stopNtripConnection()

		/**
		 * Retrieves details of currently active NTRIP account
		 *
		 * @return Currently active NTRIP account. Null if no account is set.
		 */
		fun getNtripAccount() : NtripAccount?

}

/**
 * Data transport types of a LiteSurvey device
 *
 */
enum class DataTransportType {

		/**
		 * Bluetooth classic transport
		 */
		BluetoothClassicTransport ,

		/**
		 * USB serial transport
		 */
		UsbSerialTransport ,
}