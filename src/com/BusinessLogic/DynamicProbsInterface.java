package com.BusinessLogic;

import com.google.gson.JsonObject;

/**
 * Created by Tomer on 4/20/2015.
 */
public interface DynamicProbsInterface {

    void screenOn(JsonObject json, String userName, String version);

    void userPresent(JsonObject json, String userName, String version);

    void errorSensor(JsonObject json, String userName, String version);

    void AllBroadcastProbe(JsonObject json, String userName, String version);

    void moriartyProb(JsonObject json, String userName);

    void browserInfoProbe(JsonObject json1, String userName);

    void AppListProbe(JsonObject json, String userName, String version);

    void AppListProbeArray(JsonObject json, String userName, String version);


}


