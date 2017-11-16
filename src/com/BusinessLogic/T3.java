package com.BusinessLogic;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.utilitys.HelpFunctions;
import java.util.concurrent.ConcurrentHashMap;

public class T3 implements T3Interface //implements t3Interface//
{

    private ConcurrentHashMap<Integer, Object>[] tableHashMaps = Dao.tableHashMaps;


    private static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(T3.class.getName());

    @Override
    public void audioSesnsor(JsonObject json, String userName, String version) {

        String uuid = json.get("UUID").toString().replace("\"", "");

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T3 t3 = (com.xyz.T3) tableHashMaps[Dao._T3].get(hashCode);
        if (t3 == null) {
            t3 = new com.xyz.T3(userName, uuid);
            tableHashMaps[Dao._T3].put(hashCode, t3);
            t3.setCreatedOnTimestamp(System.currentTimeMillis());
        }

        t3.setVersion(version);
        t3.setAudioDiffSecs(HelpFunctions.checkNull(json.get("diffSecs")));
        t3.setAudioL1Norm(HelpFunctions.checkNull(json.get("l1Norm")));
        t3.setAudioL2Norm(HelpFunctions.checkNull(json.get("l2Norm")));
        t3.setAudioLinfNorm(HelpFunctions.checkNull(json.get("linfNorm")));
        JsonArray psdAcrossFrequencyBands = json.getAsJsonArray("psdAcrossFrequencyBands");
        t3.setAudPSDAcrossFreqBands0(psdAcrossFrequencyBands.get(0).toString());
        t3.setAudPSDAcrossFreqBands1(psdAcrossFrequencyBands.get(1).toString());
        t3.setAudPSDAcrossFreqBands2(psdAcrossFrequencyBands.get(2).toString());
        t3.setAudPSDAcrossFreqBands3(psdAcrossFrequencyBands.get(3).toString());
        JsonArray audioArraymfccs = json.getAsJsonArray("mfccs");
        t3.setAudioMfccs0(audioArraymfccs.get(0).toString());
        t3.setAudioMfccs1(audioArraymfccs.get(1).toString());
        t3.setAudioMfccs2(audioArraymfccs.get(2).toString());
        t3.setAudioMfccs3(audioArraymfccs.get(3).toString());
        t3.setAudioMfccs4(audioArraymfccs.get(4).toString());
        t3.setAudioMfccs5(audioArraymfccs.get(5).toString());
        t3.setAudioMfccs6(audioArraymfccs.get(6).toString());
        t3.setAudioMfccs7(audioArraymfccs.get(7).toString());
        t3.setAudioMfccs8(audioArraymfccs.get(8).toString());
        t3.setAudioMfccs9(audioArraymfccs.get(9).toString());
        t3.setAudioMfccs10(audioArraymfccs.get(10).toString());
        t3.setAudioMfccs11(audioArraymfccs.get(11).toString());

        // t3.setAudioMfccs(json.get("mfccs").toString().replace("\"[]", ""));
        String StringTime = HelpFunctions.checkNull(json.get("timestamp")).replace(".", "");
        t3.setAudioTimestemp(HelpFunctions.calcTimeStamp(StringTime));

    }

    @Override
    public void lightSensor(JsonObject json, String userName, String version) {

        String uuid = json.get("UUID").toString().replace("\"", "");

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);

        //TODO:: FIX IN ALL SECTIONS LIKE THIS:
        // BEFORE CASTING NEED TO check for null.
        com.xyz.T3 t3 = (com.xyz.T3) tableHashMaps[Dao._T3].get(hashCode);
        if (t3 == null) {
            t3 = new com.xyz.T3(userName, uuid);
            tableHashMaps[Dao._T3].put(hashCode, t3);
            t3.setCreatedOnTimestamp(System.currentTimeMillis());
        }



        t3.setVersion(version);
        t3.setLightAccuracy(HelpFunctions.checkNull(json.get("accuracy")).replace("\"", ""));
        t3.setLightLux(HelpFunctions.checkNull(json.get("lux")));
        String StringTime = HelpFunctions.checkNull(json.get("timestamp")).replace(".", "").substring(0, json.get("timestamp").toString().length() - 7);
        t3.setLightTimestamp(HelpFunctions.calcTimeStamp(StringTime));

    }

}

