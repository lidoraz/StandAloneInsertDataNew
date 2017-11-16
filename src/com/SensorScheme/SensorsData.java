package com.SensorScheme;

/**
 * Created by Tomer on 10/09/2014.
 */
public class SensorsData {
    private String value;

    private String sensorName;

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getSensorName ()
    {
        return sensorName;
    }

    public void setSensorName (String sensorName)
    {
        this.sensorName = sensorName;
    }
}
