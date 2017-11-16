package com.BusinessLogic;

import com.SensorScheme.MainJsonClass;
import com.SensorScheme.SensorsData;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Lidor on 17/10/2017.
 */
public class Dao {

    private static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Dao.class.getName());

    private T0Interface T0;
    private T1Interface T1;
    private T2Interface T2;
    private T3Interface T3;
    private T4Interface T4;
    private DynamicProbsInterface Dynamicprobs;

    public static ConcurrentHashMap[] tableHashMaps;
    static final int _ALLBROADCASTPROBE = 0;
    static final int _APPLICATION = 1;
    static final int _APPPACKAGES = 2;
    static final int _BLUETOOTH = 3;
    static final int _BROSWERSEARCHES = 4;
    static final int _CALL = 5;
    static final int _CHROMEBOOKMARKS = 6;
    static final int _ERRORSENSOR = 7;
    static final int _SCREENON = 9;
    static final int _MORIARTYPROBE = 8;
    static final int _SMS = 10;
    public static final int _T0 = 11;
    static final int _T1 = 12;
    static final int _T2 = 13;
    public static final int _T3 = 14;
    static final int _T4 = 15;
    static final int _USERPRESENTPROBE = 16;
    static final int _WIFI = 17;

    public long uuidRestrictionMax=0;
    public long uuidRestrictionMin=0;

    public Dao(ConcurrentHashMap[] tableMaps ) {

        tableHashMaps = tableMaps;

        T0 = new T0();
        T1 = new T1();
        T2 = new T2();
        T3 = new T3();
        T4 = new T4();
        Dynamicprobs = new DynamicProbs();

    }


    /**
     * This function read every line and parse the data
     * every Json parse and in the switch case we determine which Json go to which sensor parser
     * T0 - T4 and DynamicProbes
     *
     * @param line     The line we should parse
     * @param userName The username that the line belong too
     */
    public void detectSensor(String line, String userName) {
        Gson gson;
        JsonParser parser;
        try {
            parser = new JsonParser();
            GsonBuilder gb = new GsonBuilder();
            gb.serializeNulls();
            gson = gb.create();

            JsonReader jsonReader = new JsonReader(new StringReader(line));
            jsonReader.setLenient(true);
            try {
                MainJsonClass target = gson.fromJson(jsonReader, MainJsonClass.class); // deserializes json into target2

                SensorsData[] sensorsData = target.getSensorsData();
                String version = target.getVersion();
                if (version.equals("1.0.1"))
                    version = "1.1";


                for (SensorsData sensor : sensorsData) {
                        JsonObject jsonObject = (JsonObject) parser.parse(sensor.getValue());
                        parseOnSensorName(sensor.getSensorName(), userName, version, jsonObject);
                        // LOGGER.info("Sensor: finished processing '"+sensor.getSensorName()+"'");

                }


            } catch (IllegalStateException | JsonSyntaxException e) {
                LOGGER.warning("###JsonSyntaxException###DaoError: user: " + userName + " Exception - " + e.getCause());
            }


        } catch (Exception e) {
            //TODO: could be some exception in t2 in PressureSensorProbe
            LOGGER.warning("EXCEPTION: DAO: unknown error at last CATCH IN DAO " + userName + e.getMessage());
            System.out.println("EXCEPTION: DAO: unknown error at last CATCH IN DAO " + userName + e.getMessage());
           // LOGGER.warning(e.getCause().getMessage());

            //e.printStackTrace();

        }
    }

    private void parseOnSensorName(String sensorName, String userName, String version, JsonObject jsonObject) {
        String uuid = jsonObject.get("UUID").toString().replace("\"", "");

       if(uuidRestrictionMax!=0&&uuidRestrictionMin!=0){//safety check
           long uuidL=Long.parseLong(uuid);
           if(!isInRangeLimitUUID(uuidL)){
               return;
           }
       }


        switch (sensorName) {

            /*T0**/
            case "com.bgu.agent.sensors.TelephonyProbe":
                T0.TelephoneyProb(jsonObject, userName, version);
                break;
            case "edu.mit.media.funf.probe.builtin.HardwareInfoProbe":
                T0.HardwareProb(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.SystemInfoProbe":
                T0.SystemInfoProb(jsonObject, userName, version);
                break;
            /*T1**/
            case "edu.mit.media.funf.probe.builtin.CellTowerProbe":
                T1.CellTower(jsonObject, userName, version);
                break;

            case "com.bgu.agent.sensors.GooglePlayServicesLocationProbe":
                T1.GooglePlayServicesLoc(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.StatusDetailsProbe":

                T1.StatusDetailsProbe(jsonObject, userName, version);
                break;

            //different tables, but are on T1
            case "com.bgu.agent.sensors.WifiProbe":
                T1.WifiProb(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.BluetoothProbe":
                T1.bluetooth(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.CallInfoProbe":
                T1.CallInfoProbe(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.SmsInfoProbe":
                T1.SmsInfoProbe(jsonObject, userName, version);
                break;

            /*T2**/
            case "com.bgu.agent.sensors.MotionProbe":
                T2.MotionProbe(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.OrientationRotationProbe":
                T2.OrientationRotationProbe(jsonObject, userName, version);
                break;
            /*T3**/
            case "edu.mit.media.funf.probe.builtin.LightSensorProbe":
                T3.lightSensor(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.AudioFeaturesProbe":
                T3.audioSesnsor(jsonObject, userName, version);
                break;
            /*T4**/
            case "com.bgu.agent.sensors.TrafficStatsProbe":
                T4.TrafficStatsProbe(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.TrafficStatsProbe2":
                T4.TrafficStatsProbe(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.BatteryProbe":
                T4.BatteryProbe(jsonObject, userName, version);
                break;
            case "edu.mit.media.funf.probe.builtin.BatteryProbe":
                T4.BatteryProbe(jsonObject, userName, version);
                break;
            /*DynamicProbes**/
            case "edu.mit.media.funf.probe.builtin.ScreenProbe":
                Dynamicprobs.screenOn(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.EventBaseProbes.UserPresentProbe":
                Dynamicprobs.userPresent(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.ErrorSensor":
                Dynamicprobs.errorSensor(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.EventBaseProbes.AllBroadcastProbe":
                Dynamicprobs.AllBroadcastProbe(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.MoriartyProbe":
                Dynamicprobs.moriartyProb(jsonObject, userName);
                break;
            case "com.bgu.agent.sensors.BrowserInfoProbe":
                Dynamicprobs.browserInfoProbe(jsonObject, userName);
                break;

            case "com.bgu.agent.sensors.EventBaseProbes.AppChangedProbe":
                Dynamicprobs.AppListProbe(jsonObject, userName, version);
                break;
            case "com.bgu.agent.sensors.AppListProbe":
                Dynamicprobs.AppListProbeArray(jsonObject, userName, version);
                break;
        }
    }

    private boolean isInRangeLimitUUID(long l) {

        return uuidRestrictionMin <= l && uuidRestrictionMax > l;
    }
}
