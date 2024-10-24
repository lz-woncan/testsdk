package com.woncan.litesurvey.scan

import android.Manifest
import android.content.Context
import androidx.annotation.RequiresPermission
import com.woncan.litesurvey.listener.ScanCallback

object LiteSurveyDeviceScanner {

		/**
		 * Scans for LiteSurvey devices (Bluetooth and USB serial).
		 * The given callback will be called for each discovered LiteSurvey device.
		 *
		 * Due to the nature of Bluetooth scans, multiple callbacks may occur for the same LiteSurvey device.
		 * When displaying device list to the user, application is responsible for removing duplicate entries.
		 *
		 * @param context Context
		 * @param callback Callback handler that will receive asynchronous callbacks for each LiteSurvey device discovered.
		 */
		@JvmStatic
		@RequiresPermission(allOf = [Manifest.permission.ACCESS_COARSE_LOCATION , Manifest.permission.BLUETOOTH_SCAN , Manifest.permission.BLUETOOTH_CONNECT])
		fun startScan(context : Context , callback : ScanCallback) {
//				scanner.startScan(context , callback)
		}

		/**
		 * Scans for LiteSurvey devices (Bluetooth only)
		 *
		 * @param context Context
		 * @param callback Callback handler that will receive asynchronous callbacks for each LiteSurvey device discovered.
		 * @see startScan
		 */
		@JvmStatic
		@RequiresPermission(allOf = [Manifest.permission.ACCESS_COARSE_LOCATION , Manifest.permission.BLUETOOTH_SCAN , Manifest.permission.BLUETOOTH_CONNECT])
		fun startBluetoothScan(context : Context , callback : ScanCallback) {
//				scanner.startBluetoothScan(context , callback)
		}

		/**
		 * Scans for LiteSurvey devices (USB serial only)
		 *
		 * @param context Context
		 * @param callback Callback handler that will receive asynchronous callbacks for each LiteSurvey device discovered.
		 * @see startScan
		 */
		@JvmStatic
		fun startUsbSerialScan(context : Context , callback : ScanCallback) {
//				scanner.startUsbSerialScan(context , callback)
		}

		/**
		 * Stops a previous scan for LiteSurvey devices
		 *
		 * @param context Context
		 */
		fun stopScan(context : Context) {
//				scanner.stopScan(context)
		}



}
