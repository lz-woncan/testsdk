package com.woncan.litesurvey.data

/**
 * Inertial measurement unit (IMU) data
 *
 * @property accelerometer Accelerometer X,Y,Z data in unit of gravitational acceleration g
 * @property gyroscope Gyroscope X,Y,Z in degrees per second
 * @property magnetometer
 */
data class ImuData(
		val accelerometer : FloatArray? ,
		val gyroscope : FloatArray? ,
		val magnetometer : FloatArray? = null
) {

		override fun equals(other : Any?) : Boolean {
				if (this === other) return true
				if (javaClass != other?.javaClass) return false

				other as ImuData

				if (accelerometer != null) {
						if (other.accelerometer == null) return false
						if (! accelerometer.contentEquals(other.accelerometer)) return false
				} else if (other.accelerometer != null) return false
				if (gyroscope != null) {
						if (other.gyroscope == null) return false
						if (! gyroscope.contentEquals(other.gyroscope)) return false
				} else if (other.gyroscope != null) return false
				if (magnetometer != null) {
						if (other.magnetometer == null) return false
						if (! magnetometer.contentEquals(other.magnetometer)) return false
				} else if (other.magnetometer != null) return false

				return true
		}

		override fun hashCode() : Int {
				var result = accelerometer?.contentHashCode() ?: 0
				result = 31 * result + (gyroscope?.contentHashCode() ?: 0)
				result = 31 * result + (magnetometer?.contentHashCode() ?: 0)
				return result
		}
}
