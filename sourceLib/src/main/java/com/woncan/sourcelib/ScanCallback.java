package com.woncan.sourcelib;

import com.woncan.litesurvey.device.LiteSurveyDevice;

/**
 * Used for receiving notifications when LiteSurvey devices are discovered.
 */
public interface ScanCallback {

    /**
     * Called when a LiteSurvey device is discovered.
     *
     * @param device Represents the discovered LiteSurveyDevice. Use dataTransportType to determine
     *               whether it is Bluetooth or USB. Use displayName to obtain its display name.
     */
    public void onScanResult(LiteSurveyDevice device);
}
