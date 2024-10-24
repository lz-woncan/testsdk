package com.woncan.litesurvey.data
/**
 * Types of NMEA messages
 */
enum class NmeaType(val type : String, internal val mask : String){
		/**
		 * NMEA GGA message (Global Positioning System Fix Data)
		 */
		NmeaTypeGGA("GGA", "**GGA"),
		/**
		 * NMEA GSA message (GNSS DOP and Active Satellites)
		 */
		NmeaTypeGSA("GSA", "**GSA"),
		/**
		 * NMEA GSV message (GNSS Satellites In View)
		 */
		NmeaTypeGSV("GSV", "**GSV"),
		/**
		 * NMEA RMC message (Recommended Minimum Specific GNSS Data)
		 */
		NmeaTypeRMC("RMC", "**RMC"),
		/**
		 * NMEA VTG message (Course Over Ground & Ground Speed)
		 */
		NmeaTypeVTG("VTG", "**VTG"),
		/**
		 * NMEA GST message (GNSS Pseudorange Error Statistics)
		 */
		NmeaTypeGST("GST", "**GST"),
		/**
		 * NMEA ZDA message (Time & Date)
		 */
		NmeaTypeZDA("ZDA", "**ZDA"),
}
