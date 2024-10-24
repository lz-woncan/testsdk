package com.woncan.litesurvey.listener

import com.woncan.litesurvey.data.NtripMountpoint

/**
 * Used to receive Ntrip mountpoint query results
 *
 */
interface NtripMountpointCallback {
		/**
		 * called when ntrip mountpoint query failed
		 *
		 * @param errorMessage error message
		 */
		fun onNtripMountpointFailure(errorMessage : String)

		/**
		 * Called when mountpoint list was retrieved from ntrip server
		 *
		 * @param mountpointList List of ntrip mountpoints
		 */
		fun onNtripMountpointListRetrieved(mountpointList: List<NtripMountpoint>)
}