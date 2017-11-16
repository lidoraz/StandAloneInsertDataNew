package com.BusinessLogic;

import com.google.gson.JsonObject;

/**
 * Created by Tomer on 3/1/2015.
 */
public interface T2Interface {

    /**
     * parse T2
     * MotionProbe
     * AccelerometerSensorProbe
     * GyroscopeSensorProbe
     * MagneticFieldSensorProbe
     * PressureSensorProbe
     * OrientationRotationProbe
     * LinearAcceleration
     */


    void AccelerometerSensorProbe(JsonObject json, String userName, String version, String UUID);

    void GyroscopeSensorProbe(JsonObject json, String userName, String version, String UUID);

    void MagneticFieldSensorProbe(JsonObject json, String userName, String version, String UUID);

    void PressureSensorProbe(JsonObject json, String userName, String version, String UUID);

     void MotionProbe(JsonObject json, String userName, String version);

     void OrientationRotationProbe(JsonObject json, String userName, String version);

     void LinearAcceleration(JsonObject json, String userName, String version, String UUID);

}
