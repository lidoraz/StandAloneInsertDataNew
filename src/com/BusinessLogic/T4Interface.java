package com.BusinessLogic;

import com.google.gson.JsonObject;

/**
 * Created by Tomer on 3/1/2015.
 */
public interface T4Interface {

    /**
     * parse T4
     * BatteryProbe
     * TrafficStatsProbe
     * ApplicationInsert
     */


    public void BatteryProbe(JsonObject json, String userName, String version);

    public void TrafficStatsProbe(JsonObject json, String userName, String version);
}
