package com.woncan.litesurvey.data

import android.location.Location
import androidx.core.location.LocationCompat

/**
 * Location class as reported by LiteSurvey devices. Inherits from the system Location class.
 */
class LiteSurveyLocation : Location(LITE_SURVEY) {

		companion object {

				const val LITE_SURVEY = "LiteSurvey"
		}

		/**
		 * GNSS fix status
		 * @see GnssFixStatus
		 */
		var fixStatus : GnssFixStatus = GnssFixStatus.GnssFixUnknown
				private set

		/**
		 * Number of satellites in view
		 */
		var numSatsInView : Int = 0

		/**
		 * Number of satellites used in GNSS fix
		 */
		var numSatsInUse : Int = 0

		/**
		 * Differential reference station ID, 0000-1023
		 */
		var refStationId : Int = 0

		/**
		 * Age of Differential GNSS data in seconds
		 */
		var diffDataDelaySeconds : Float = 0.0f

		/**
		 * Horizontal dilution of precision
		 */
		var hdop : Float = 0.0f

		/**
		 * Vertical dilution of precision
		 */
		var vdop : Float = 0.0f

		/**
		 * Position dilution of precision
		 */
		var pdop : Float = 0.0f

		/**
		 * Geoid Separation in meters
		 */
		var geoidSeparationMeters : Float = 0.0f

		var mVerticalAccuracy : Float
				set(value) {
						LocationCompat.setVerticalAccuracyMeters(this , value)
				}
				get() {
						return LocationCompat.getVerticalAccuracyMeters(this)
				}

		override fun getVerticalAccuracyMeters() : Float {
				return LocationCompat.getVerticalAccuracyMeters(this)
		}

		fun setStatus(value:Int){
				fixStatus= GnssFixStatus.creator(value)
		}

}

/**
 * Gnss fix status
 *
 * @property status Integer representing the fix status as defined in NMEA GGA message
 */
enum class GnssFixStatus(val status : Int) {

		/**
		 * GNSS single solution, differential data not in use
		 */
		GnssFixSingle(1) ,

		/**
		 * DGNSS solution, differential GNSS based on pseudorange only
		 */
		GnssFixDGNSS(2) ,

		/**
		 * RTK fixed GNSS solution
		 */
		GnssFixFixed(4) ,

		/**
		 * RTK float GNSS solution
		 */
		GnssFixFloat(5) ,

		/**
		 * GNSS fix status invalid or unknown
		 */
		GnssFixUnknown(0) ;

		companion object {
				@JvmStatic
				fun creator(value: Int): GnssFixStatus {
					return 	when(value){
								1->GnssFixSingle
								2->GnssFixDGNSS
								4->GnssFixFixed
								5->GnssFixFloat
								else->GnssFixUnknown
						}
				}
		}
}