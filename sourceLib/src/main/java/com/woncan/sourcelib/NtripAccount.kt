package com.woncan.litesurvey.data

/**
 * Ntrip account details
 *
 * @property address IP address or URL
 * @property port Port number
 * @property mountpoint
 * @property username
 * @property password
 */
data class NtripAccount(
		val address : String,
		val port : Int,
		val mountpoint : String,
		val username : String,
		val password : String,
)
