package com.SensorScheme;

/**
 * Created by Tomer on 10/09/2014.
 */
public class MainJsonClass {
    private String experimentId;

    private String sendToServerTime;

    private String userId;

    private String lastSyncTime;

    private SensorsData[] sensorsData;

    private String version;

    public String getExperimentId ()
    {
        return experimentId;
    }

    public void setExperimentId (String experimentId)
    {
        this.experimentId = experimentId;
    }

    public String getSendToServerTime ()
    {
        return sendToServerTime;
    }

    public void setSendToServerTime (String sendToServerTime)
    {
        this.sendToServerTime = sendToServerTime;
    }

    public String getUserId ()
    {
        return userId;
    }

    public void setUserId (String userId)
    {
        this.userId = userId;
    }

    public String getLastSyncTime ()
    {
        return lastSyncTime;
    }

    public void setLastSyncTime (String lastSyncTime)
    {
        this.lastSyncTime = lastSyncTime;
    }

    public SensorsData[] getSensorsData ()
    {
        return sensorsData;
    }

    public void setSensorsData (SensorsData[] sensorsData)
    {
        this.sensorsData = sensorsData;
    }

    public String getVersion ()
    {
        return version;
    }


}
