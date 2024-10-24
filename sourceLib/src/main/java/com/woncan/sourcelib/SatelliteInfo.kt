package com.woncan.litesurvey.data
/**
 * GNSS Satellite information
 *
 * @property system GNSS system / constellation of this satellite
 * @property satelliteId FCN & OSN number for Glonass, PRN for other systems
 * @property usedInFix true if satellite was used in recent GNSS fix, false otherwise
 * @property elevationDegrees elevation angle of this satellite, in degrees
 * @property azimuthDegrees azimuth angle of this satellite, in degrees
 * @property signalList List of signal information received by this satellite
 */
data class SatelliteInfo(
		val system : GnssSystem ,
		val satelliteId : Int ,
		val usedInFix : Boolean ,
		val elevationDegrees : Int ,
		val azimuthDegrees : Int ,
		val signalList : List<SignalInfo> ,
)

/**
 * GNSS Signal Information
 *
 * @property gsvSignalId Signal Id number as defined by NMEA GSV message
 * @property signalName Name of the signal (for reference only)
 * @property cn0DbHz Signal-to-noise ratio (C/N0) in dBHz
 */
data class SignalInfo(
		val gsvSignalId : Int ,
		val signalName : String ,
		val cn0DbHz : Int ,
)
/**
 * GNSS Systems
 *
 * @property prefix One character prefix of the GNSS system (as appears in RINEX files)
 * @property shortName Short name of the GNSS system
 * @property fullName Full name of the GNSS system
 */
enum class GnssSystem(val prefix : String, val shortName:String, val fullName : String){
		GnssSystemGPS("G", "GPS", "GPS"),
		GnssSystemGLONASS("R", "GLO", "GLONASS"),
		GnssSystemGALILEO("E", "GAL", "GALILEO"),
		GnssSystemBeidou("C", "BDS", "Beidou"),
		GNSSSystemQZSS("J", "QZSS", "QZSS"),
}