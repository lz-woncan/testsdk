package com.woncan.litesurvey.data

/**
 * Ntrip mountpoint (see NTRIP specification)
 *
 * @property mountPoint Mountpoint name
 *
 */
data class NtripMountpoint(
		val mountPoint : String,
		val type : String? = null,
		val identifier : String? = null,
		val format : String? = null,
		val formatDetails : String? = null,
		val carrier : Int = 0,
		val navSystem : String? = null,
		val network : String? = null,
		val country : String? = null,
		val latitude : Float? = null,
		val longitude : Float? = null,
		val nmea : Boolean? = null,
		val solution : Boolean? = null,
		val generator : String? = null,
		val comprEncryp : String? = null,
		val authentication : String? = null,
		val fee : Boolean? = null,
		val bitRate : Int? = null,
)
