package com.BusinessLogic;

import com.google.gson.JsonObject;

/**
 * Created by Tomer on 4/26/2015.
 */
public interface T0Interface {
    /**
     * parse T0
     * TelephoneyProb
     * HardwareProb
     * SystemInfoProb
     */

    void TelephoneyProb(JsonObject json, String userName, String version);

    void HardwareProb(JsonObject json, String userName, String version);

    void SystemInfoProb(JsonObject json, String userName, String version) ;
}
