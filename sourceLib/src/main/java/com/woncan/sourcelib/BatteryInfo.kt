package com.woncan.litesurvey.data

/**
 * LiteSurvey device battery information
 *
 * @property percentageRemaining Battery percentage remaining
 * @property chargerConnected true if charger is connected, false otherwise
 * @property isCharging true if battery is charging, false otherwise
 */
data class BatteryInfo(val percentageRemaining : Int ,
                       val chargerConnected : Boolean ,
                       val isCharging : Boolean ,
                       val stateOfHealth : Int? = null ,
                       val temperatureCelcius : Float? = null ,
                       val voltageMilliVolts : Float? = null ,
                       val remainingCapacityMAH : Int? = null ,
                       val fullChargeCapacityMAH : Int? = null ,
                       val designCapacityMAH : Int? = null ,
                       val batteryCurrentMA : Int? = null ,
                       val timeToEmptyMinutes : Int? = null ,
                       val cycleCount : Int? = null ,)
