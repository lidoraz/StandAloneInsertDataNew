package com.BusinessLogic;

import com.google.gson.JsonObject;

/**
 * Created by Tomer on 4/2/2015.
 */
public interface T3Interface {

    /**
     * parse T3
     * audioSesnsor
     * lightSensor
     */

    void audioSesnsor(JsonObject json, String userName, String version);

    void lightSensor(JsonObject json, String userName, String version);
}
