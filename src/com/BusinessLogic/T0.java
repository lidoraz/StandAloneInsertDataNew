package com.BusinessLogic;

import com.google.gson.JsonObject;
import com.utilitys.HelpFunctions;

import java.util.concurrent.ConcurrentHashMap;


public class T0 implements T0Interface {
    /**
     * parse T0
     * TelephoneyProb
     * HardwareProb
     * SystemInfoProb
     */


    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(T0.class.getName());

private ConcurrentHashMap<Integer,Object>[] tableHashMaps=Dao.tableHashMaps;


    @Override
    public void TelephoneyProb(JsonObject json, String userName, String version) {

            String uuid = HelpFunctions.checkNull(json.get("UUID")).replace("\"", "");

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T0 t0 = (com.xyz.T0) tableHashMaps[Dao._T0].get(hashCode);
        if (t0 == null) {
            t0 = new com.xyz.T0(userName, uuid);
            tableHashMaps[Dao._T0].put(hashCode, t0);
            t0.setCreatedOnTimestamp(System.currentTimeMillis());
        }

            t0.setVersion(version);
            t0.setUuid(HelpFunctions.checkNull(json.get("UUID")).replace("\"", ""));
            t0.setTelephoneyDeviceId(HelpFunctions.checkNull(json.get("deviceId")).replace("\"", ""));
            t0.setTelephoneyDeviceSoftwareVersion(HelpFunctions.checkNull(json.get("deviceSoftwareVersion")).replace("\"", ""));
            t0.setTelephoneyNetworkCountryIso(HelpFunctions.checkNull(json.get("networkCountryIso")).replace("\"", ""));
            t0.setTelephoneyNetworkOperator(HelpFunctions.checkNull(json.get("networkOperator")).replace("\"", ""));
            t0.setTelephoneyNetworkOperatorName(HelpFunctions.checkNull(json.get("networkOperatorName")).replace("\"", ""));
            t0.setTelephoneyNetworkType(HelpFunctions.checkNull(json.get("networkType")));
            t0.setTelephoneyPhoneType(HelpFunctions.checkNull(json.get("phoneType")));
            t0.setTelephoneySimCountryIso(HelpFunctions.checkNull(json.get("simCountryIso")).replace("\"", ""));
            t0.setTelephoneySimOperator(HelpFunctions.checkNull(json.get("simOperator")).replace("\"", ""));
            t0.setTelephoneySimOperatorName(HelpFunctions.checkNull(json.get("simOperatorName")).replace("\"", ""));
            t0.setTelephoneySimSerialNumber(HelpFunctions.checkNull(json.get("simSerialNumber")).replace("\"", ""));
            t0.setTelephoneySimState(HelpFunctions.checkNull(json.get("simState")));
            t0.setTelephoneySubscriberId(HelpFunctions.checkNull(json.get("subscriberId")).replace("\"", ""));
            t0.setTelephoneyHassIccCard(HelpFunctions.checkNull(json.get("hassIccCard")));

            String StringTime = HelpFunctions.checkNull(json.get("timestamp")).replace(".", "");
            t0.setTelephoneyTimestemp(HelpFunctions.calcTimeStamp(StringTime));


    }

    @Override
    public void HardwareProb(JsonObject json, String userName, String version) {

            String uuid = HelpFunctions.checkNull(json.get("UUID")).replace("\"", "");

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T0 t0 = (com.xyz.T0) tableHashMaps[Dao._T0].get(hashCode);
        if (t0 == null) {
            t0 = new com.xyz.T0(userName, uuid);
            tableHashMaps[Dao._T0].put(hashCode, t0);
            t0.setCreatedOnTimestamp(System.currentTimeMillis());
        }

            t0.setVersion(version);
            t0.setUuid(HelpFunctions.checkNull(json.get("UUID")).replace("\"", ""));
            t0.setHardwareWifiMac(HelpFunctions.checkNull(json.get("wifiMac")).replace("\"", ""));
            t0.setHardwareBluetoothMac(HelpFunctions.checkNull(json.get("bluetoothMac")).replace("\"", ""));
            t0.setHardwareAndroidId(HelpFunctions.checkNull(json.get("androidId")).replace("\"", ""));
            t0.setHardwareBrand(HelpFunctions.checkNull(json.get("brand")).replace("\"", ""));
            t0.setHardwareModel(HelpFunctions.checkNull(json.get("model")).replace("\"", ""));
            t0.setHardwareDeviceId(HelpFunctions.checkNull(json.get("deviceId")).replace("\"", ""));

    }

    public void SystemInfoProb(JsonObject json, String userName, String version) {

            String uuid = HelpFunctions.checkNull(json.get("UUID")).replace("\"", "");

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T0 t0 = (com.xyz.T0) tableHashMaps[Dao._T0].get(hashCode);
        if (t0 == null) {
            t0 = new com.xyz.T0(userName, uuid);
            tableHashMaps[Dao._T0].put(hashCode, t0);
            t0.setCreatedOnTimestamp(System.currentTimeMillis());
        }

            t0.setVersion(version);
            t0.setUuid(HelpFunctions.checkNull(json.get("UUID")).replace("\"", ""));
            t0.setSystemInfoOSVersion(HelpFunctions.checkNull(json.get("OS_version")).replace("\"", ""));
            t0.setSystemInfoBasebandVersion(HelpFunctions.checkNull(json.get("Baseband_version")).replace("\"", ""));
            t0.setSystemInfoSDK(HelpFunctions.checkNull(json.get("SDK")).replace("\"", ""));
            t0.setSystemInfoKernelInfo(HelpFunctions.checkNull(json.get("KernelInfo")).replace("\"", ""));
            String StringTime = HelpFunctions.checkNull(json.get("timestamp")).replace(".", "");
            t0.setSystemInfoTimestemp(HelpFunctions.calcTimeStamp(StringTime));

    }



}
