package com.woncan.litesurvey.data

/**
 * General information of a LiteSurvey device
 *
 * @property deviceModel Device model
 * @property deviceId Device unique ID
 * @property productName Product name
 * @property serialNumber Internal hardware identification number
 * @property firmwareVersion Firmware version
 * @property hardwareVersion Hardware version
 */
data class LiteSurveyDeviceInfo(
		val deviceModel: String,
		val deviceId: String,
		val productName: String,
		internal val serialNumber: String,
		val firmwareVersion: String,
		val hardwareVersion: String,
)
