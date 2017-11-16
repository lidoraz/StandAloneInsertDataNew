package com.BusinessLogic;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.utilitys.HelpFunctions;
import com.xyz.*;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Tomer on 3/1/2015.
 */


public class T1 implements T1Interface {
    /**
     * parse T1
     * CallInfoProbe
     * GooglePlayServicesLoc
     * insertCallData
     * SmsInfoProbe
     * insertSMS
     * CellTower
     * bluetooth
     * WifiProb
     * StatusDetailsProbe
     */
    private static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(T1.class.getName());


    private ConcurrentHashMap<Integer,Object>[] tableHashMaps=Dao.tableHashMaps;


    public void CallInfoProbe(JsonObject json, String userName, String version) {


            String UUID = HelpFunctions.checkNull(json.get("UUID")).replace("\"", "");

            JsonArray callData = json.getAsJsonArray("CallsData");
            insertCallData(callData, UUID, userName);

    }

    public void GooglePlayServicesLoc(JsonObject json, String userName, String version) {

            String uuid = HelpFunctions.checkNull(json.get("UUID")).replace("\"", "");


        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T1 t1 = (com.xyz.T1) tableHashMaps[Dao._T1].get(hashCode);
        if (t1 == null) {
            t1 = new com.xyz.T1(userName, uuid);
            tableHashMaps[Dao._T1].put(hashCode, t1);
            t1.setCreatedOnTimestamp(System.currentTimeMillis());
        }

            t1.setVersion(version);
            t1.setUuid(HelpFunctions.checkNull(json.get("UUID")).replace("\"", ""));
            t1.setGooglePlayLocSpeed(HelpFunctions.checkNull(json.get("Speed")));
            t1.setGooglePlayLocMAccuracy(HelpFunctions.checkNull(json.get("mAccuracy")));
            t1.setGooglePlayLocMAltitude(HelpFunctions.checkNull(json.get("mAltitude")));
            t1.setGooglePlayLocMLatitude(HelpFunctions.checkNull(json.get("mLatitude")));
            t1.setGooglePlayLocMLongitude(HelpFunctions.checkNull(json.get("mLongitude")));
            // t1.setGooglePlayLocTimestamp(HelpFunctions.checkNull(json.get("timestamp")));
            String StringTime = json.get("timestamp").toString().replace(".", "");
            t1.setGooglePlayLocTimestamp(HelpFunctions.calcTimeStamp(StringTime));

    }


    public void insertCallData(JsonArray callData, String UUID, String userName) {


        for (JsonElement jsonele : callData) {

                JsonObject json = jsonele.getAsJsonObject();

                //create Data object
                Call callDataObject = new Call(HelpFunctions.checkNull(json.get("Date")), userName, UUID);

                callDataObject.setAddress(HelpFunctions.checkNull(json.get("Address")).replace("\"", ""));
                callDataObject.setDuration(HelpFunctions.checkNull(json.get("Duration")));
                callDataObject.setFromContacts(HelpFunctions.checkNull(json.get("FromContacts")));
                callDataObject.setType(HelpFunctions.checkNull(json.get("Type")));


            tableHashMaps[Dao._CALL].put(callDataObject.hashCode(), callDataObject);

        }
    }

    public void SmsInfoProbe(JsonObject json, String userName, String version) {

            String UUID = HelpFunctions.checkNull(json.get("UUID")).replace("\"", "");

            JsonArray smsData = json.getAsJsonArray("SmsData");

            for (JsonElement jsonele : smsData) {

                    JsonObject json1 = jsonele.getAsJsonObject();

                    Sms sms = new Sms(HelpFunctions.checkNull(json1.get("Date")), userName, UUID);

                    sms.setAddress(HelpFunctions.checkNull(json1.get("Address")).replace("\"", ""));
                    sms.setContainsURL(HelpFunctions.checkNull(json1.get("ContainsURL")));
                    sms.setFromContacts(HelpFunctions.checkNull(json1.get("FromContacts")));
                    sms.setType(HelpFunctions.checkNull(json1.get("Type")));


                    tableHashMaps[Dao._SMS].put(sms.hashCode(), sms);
            }
    }


    public void CellTower(JsonObject json, String userName, String version) {

            String uuid = HelpFunctions.checkNull(json.get("UUID")).replace("\"", "");

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T1 t1 = (com.xyz.T1) tableHashMaps[Dao._T1].get(hashCode);
        if (t1 == null) {
            t1 = new com.xyz.T1(userName, uuid);
            tableHashMaps[Dao._T1].put(hashCode, t1);
            t1.setCreatedOnTimestamp(System.currentTimeMillis());
        }

            t1.setVersion(version);
            t1.setUuid(HelpFunctions.checkNull(json.get("UUID")).replace("\"", ""));
            t1.setCellTowerCid(HelpFunctions.checkNull(json.get("cid")));
            t1.setCellTowerLac(HelpFunctions.checkNull(json.get("lac")));
            t1.setCellTowerPsc(HelpFunctions.checkNull(json.get("psc")));
            t1.setCellTowerType(HelpFunctions.checkNull(json.get("type")));


            String StringTime = HelpFunctions.checkNull(json.get("timestamp")).replace(".", "");
            t1.setCellTowerTimestamp(HelpFunctions.calcTimeStamp(StringTime));

    }

    public void bluetooth(JsonObject json, String userName, String version) {

        String uuid = HelpFunctions.checkNull(json.get("UUID")).replace("\"", "");


            if (json.get("data").isJsonArray()) {
                JsonArray jsonArray = json.get("data").getAsJsonArray();
                String StringTime = HelpFunctions.checkNull(json.get("timestamp")).replace(".", "");
                HashSet<String> hashSet = new HashSet<>();

                for (JsonElement bluetooth : jsonArray) {

                    if (!hashSet.contains(HelpFunctions.checkNull(json.get("")).replace("\"", ""))) {

                        Bluetooth BluetoothDataObject = new Bluetooth("null",userName , uuid);
                        BluetoothDataObject.setBluetoothTimestamp(HelpFunctions.calcTimeStamp(StringTime));
                        JsonObject bluetoothObject = bluetooth.getAsJsonObject();
                        BluetoothDataObject.setBluetoothAppearance(HelpFunctions.checkNull(bluetoothObject.get("android.bluetooth.device.extra.APPEARANCE")).replace("\"", ""));
                        BluetoothDataObject.setBluetoothClass(bluetoothObject.get("android.bluetooth.device.extra.CLASS").getAsJsonObject().get("mClass").toString());
                        JsonObject Device = bluetoothObject.get("android.bluetooth.device.extra.DEVICE").getAsJsonObject();
                        BluetoothDataObject.setBluetoothMAddress(HelpFunctions.checkNull(Device.get("mAddress")).replace("\"", ""));
                        BluetoothDataObject.setBluetoothMRemoteBrsf(HelpFunctions.checkNull(Device.get("mRemoteBrsf")));
                        BluetoothDataObject.setBluetoothMValueNREC(HelpFunctions.checkNull(Device.get("mValueNREC")));
                        BluetoothDataObject.setBluetoothMValueWBS(HelpFunctions.checkNull(Device.get("mValueWBS")));
                        BluetoothDataObject.setBluetoothName(HelpFunctions.checkNull(bluetoothObject.get("android.bluetooth.device.extra.NAME")).replace("\"", ""));
                        BluetoothDataObject.setBluetoothRssi(HelpFunctions.checkNull(bluetoothObject.get("android.bluetooth.device.extra.RSSI")));


                        tableHashMaps[Dao._BLUETOOTH].put(BluetoothDataObject.hashCode(), BluetoothDataObject);

                        hashSet.add(HelpFunctions.checkNull(json.get("mAddress")).replace("\"", ""));
                    }
                }
            }


    }


    public void WifiProb(JsonObject jsonOb, String userName, String version) {

            String UUID = HelpFunctions.checkNull(jsonOb.get("UUID")).replace("\"", "");
            JsonArray Data = jsonOb.getAsJsonArray("data");

            HashSet<String> hashSet = new HashSet();
            if (Data != null) {
                for (JsonElement jsonele : Data) {
                    JsonObject json = jsonele.getAsJsonObject();
                    //create Data object
                    if (!hashSet.contains(json.get("SSID").toString().replace("\"", ""))){
                        Wifi WifiDataObject = new Wifi(HelpFunctions.checkNull(json.get("SSID")).replace("\"", ""), userName, UUID);
                        WifiDataObject.setCapabilities(HelpFunctions.checkNull(json.get("capabilities")).replace("\"", ""));
                        WifiDataObject.setFreq(HelpFunctions.checkNull(json.get("freq")));
                        WifiDataObject.setLevel(HelpFunctions.checkNull(json.get("lvl")));


                        tableHashMaps[Dao._WIFI].put(WifiDataObject.hashCode(), WifiDataObject);

                        hashSet.add(json.get("SSID").toString().replace("\"", ""));
                    }
                    else
                        continue;
                }
            }
    }

    public void StatusDetailsProbe(JsonObject json, String userName, String version) {

            String uuid = HelpFunctions.checkNull(json.get("UUID")).replace("\"", "");

            int hashCode = HelpFunctions.generateHashCode(uuid, userName);
            com.xyz.T1 t1 = (com.xyz.T1) tableHashMaps[Dao._T1].get(hashCode);
            if (t1 == null) {
                t1 = new com.xyz.T1(userName, uuid);
                tableHashMaps[Dao._T1].put(hashCode, t1);
                t1.setCreatedOnTimestamp(System.currentTimeMillis());
            }
            t1.setVersion(version);
            t1.setUuid(HelpFunctions.checkNull(json.get("UUID")).replace("\"", ""));
            t1.setStatusAlarmVol(HelpFunctions.checkNull(json.get("AlarmVol")).replace("\"", ""));
            t1.setStatusBrightnessMode(HelpFunctions.checkNull(json.get("BrightnessMode")).replace("\"", ""));
            t1.setStatusBrightnessFile(HelpFunctions.checkNull(json.get("Brightness_file")).replace("\"", ""));
            t1.setStatusBrightnessSettings(HelpFunctions.checkNull(json.get("Brightness_settings")).replace("\"", ""));
            t1.setStatusDtmfVol(HelpFunctions.checkNull(json.get("DtmfVol")).replace("\"", ""));
            t1.setStatusMusicVol(HelpFunctions.checkNull(json.get("MusicVol")).replace("\"", ""));
            t1.setStatusNotificationVol(HelpFunctions.checkNull(json.get("NotificationVol")).replace("\"", ""));
            t1.setStatusOrientation(HelpFunctions.checkNull(json.get("Orientation")).replace("\"", ""));
            t1.setStatusRingerMode(HelpFunctions.checkNull(json.get("RingerMode")).replace("\"", ""));
            t1.setStatusRingtoneVol(HelpFunctions.checkNull(json.get("RingtoneVol")).replace("\"", ""));
            t1.setStatusSystemVol(HelpFunctions.checkNull(json.get("SystemVol")).replace("\"", ""));
            t1.setStatusVoiceCallVol(HelpFunctions.checkNull(json.get("VoiceCallVol")).replace("\"", ""));
            String StringTime = HelpFunctions.checkNull(json.get("timestamp")).replace(".", "");
            t1.setStatusTimestamp(HelpFunctions.calcTimeStamp(StringTime));
    }


}

