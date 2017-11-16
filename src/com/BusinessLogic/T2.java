package com.BusinessLogic;

import com.google.gson.JsonObject;
import com.utilitys.HelpFunctions;

import java.util.concurrent.ConcurrentHashMap;


public class T2 implements T2Interface {

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

    private static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(T2.class.getName());

    private ConcurrentHashMap<Integer,Object>[] tableHashMaps=Dao.tableHashMaps;
 



    public void MotionProbe(JsonObject json, String userName, String version) {

        String UUID = json.get("UUID").toString().replace("\"", "");

        JsonObject accelerometerSensorProbeData=json.getAsJsonObject("edu.mit.media.funf.probe.builtin.AccelerometerSensorProbe");
        JsonObject gyroscopeSensorProbeData=json.getAsJsonObject("edu.mit.media.funf.probe.builtin.GyroscopeSensorProbe");
        JsonObject magneticFieldSensorProbeData=json.getAsJsonObject("edu.mit.media.funf.probe.builtin.MagneticFieldSensorProbe");
        JsonObject pressureSensorProbeData=json.getAsJsonObject("edu.mit.media.funf.probe.builtin.PressureSensorProbe");
        JsonObject linearAccelerationData=json.getAsJsonObject("edu.mit.media.funf.probe.builtin.LinearAccelerationSensorProbe");

        if(accelerometerSensorProbeData!=null){
            AccelerometerSensorProbe(accelerometerSensorProbeData, userName, version, UUID);
        }
        if(gyroscopeSensorProbeData!=null){
            GyroscopeSensorProbe(gyroscopeSensorProbeData, userName, version, UUID);
        }
        if(magneticFieldSensorProbeData!=null){
            MagneticFieldSensorProbe(magneticFieldSensorProbeData, userName, version, UUID);
        }
        if(pressureSensorProbeData!=null){
            PressureSensorProbe(pressureSensorProbeData, userName, version, UUID);
        }
        if(linearAccelerationData!=null){
            LinearAcceleration(linearAccelerationData, userName, version, UUID);
        }

    }


    @Override
    public void AccelerometerSensorProbe(JsonObject json, String userName, String version, String uuid) {

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T2 t2 = (com.xyz.T2) tableHashMaps[Dao._T2].get(hashCode);
        if (t2 == null) {
            t2 = new com.xyz.T2(userName, uuid);
            tableHashMaps[Dao._T2].put(hashCode, t2);
            t2.setCreatedOnTimestamp(System.currentTimeMillis());
        }

        t2.setVersion(version);

        t2.setTimeStemp(HelpFunctions.calcTimeStamp(uuid));
        t2.setAccelerometerStatXDCFFT(HelpFunctions.checkNull(json.get("x_DC_FFT")));
        t2.setAccelerometerStatXFIRSTIDXFFT(HelpFunctions.checkNull(json.get("x_FIRST_IDX_FFT")));
        t2.setAccelerometerStatXFIRSTVALFFT(HelpFunctions.checkNull(json.get("x_FIRST_VAL_FFT")));
        t2.setAccelerometerStatXFOURTHIDXFFT(HelpFunctions.checkNull(json.get("x_FOURTH_IDX_FFT")));
        t2.setAccelerometerStatXFOURTHVALFFT(HelpFunctions.checkNull(json.get("x_FOURTH_VAL_FFT")));
        t2.setAccelerometerStatXMEAN(HelpFunctions.checkNull(json.get("x_MEAN")));
        t2.setAccelerometerStatXMEANFFT(HelpFunctions.checkNull(json.get("x_MEAN_FFT")));
        t2.setAccelerometerStatXMEDIAN(HelpFunctions.checkNull(json.get("x_MEDIAN")));
        t2.setAccelerometerStatXMEDIANFFT(HelpFunctions.checkNull(json.get("x_MEDIAN_FFT")));
        t2.setAccelerometerStatXMIDDLESAMPLE(HelpFunctions.checkNull(json.get("x_MIDDLE_SAMPLE")));
        t2.setAccelerometerStatXSECONDIDXFFT(HelpFunctions.checkNull(json.get("x_SECOND_IDX_FFT")));
        t2.setAccelerometerStatXSECONDVALFFT(HelpFunctions.checkNull(json.get("x_SECOND_VAL_FFT")));
        t2.setAccelerometerStatXTHIRDIDXFFT(HelpFunctions.checkNull(json.get("x_THIRD_IDX_FFT")));
        t2.setAccelerometerStatXTHIRDVALFFT(HelpFunctions.checkNull(json.get("x_THIRD_VAL_FFT")));
        t2.setAccelerometerStatXVAR(HelpFunctions.checkNull(json.get("x_VAR")));
        t2.setAccelerometerStatXVARFFT(HelpFunctions.checkNull(json.get("x_VAR_FFT")));
        t2.setAccelerometerStatYDCFFT(HelpFunctions.checkNull(json.get("y_DC_FFT")));
        t2.setAccelerometerStatYFIRSTIDXFFT(HelpFunctions.checkNull(json.get("y_FIRST_IDX_FFT")));
        t2.setAccelerometerStatYFIRSTVALFFT(HelpFunctions.checkNull(json.get("y_FIRST_VAL_FFT")));
        t2.setAccelerometerStatYFOURTHIDXFFT(HelpFunctions.checkNull(json.get("y_FOURTH_IDX_FFT")));
        t2.setAccelerometerStatYFOURTHVALFFT(HelpFunctions.checkNull(json.get("y_FOURTH_VAL_FFT")));
        t2.setAccelerometerStatYMEAN(HelpFunctions.checkNull(json.get("y_MEAN")));
        t2.setAccelerometerStatYMEANFFT(HelpFunctions.checkNull(json.get("y_MEAN_FFT")));
        t2.setAccelerometerStatYMEDIAN(HelpFunctions.checkNull(json.get("y_MEDIAN")));
        t2.setAccelerometerStatYMEDIANFFT(HelpFunctions.checkNull(json.get("y_MEDIAN_FFT")));
        t2.setAccelerometerStatYMIDDLESAMPLE(HelpFunctions.checkNull(json.get("y_MIDDLE_SAMPLE")));
        t2.setAccelerometerStatYSECONDIDXFFT(HelpFunctions.checkNull(json.get("y_SECOND_IDX_FFT")));
        t2.setAccelerometerStatYSECONDVALFFT(HelpFunctions.checkNull(json.get("y_SECOND_VAL_FFT")));
        t2.setAccelerometerStatYTHIRDIDXFFT(HelpFunctions.checkNull(json.get("y_THIRD_IDX_FFT")));
        t2.setAccelerometerStatYTHIRDVALFFT(HelpFunctions.checkNull(json.get("y_THIRD_VAL_FFT")));
        t2.setAccelerometerStatYVAR(HelpFunctions.checkNull(json.get("y_VAR")));
        t2.setAccelerometerStatYVARFFT(HelpFunctions.checkNull(json.get("y_VAR_FFT")));
        t2.setAccelerometerStatZDCFFT(HelpFunctions.checkNull(json.get("z_DC_FFT")));
        t2.setAccelerometerStatZFIRSTIDXFFT(HelpFunctions.checkNull(json.get("z_FIRST_IDX_FFT")));
        t2.setAccelerometerStatZFIRSTVALFFT(HelpFunctions.checkNull(json.get("z_FIRST_VAL_FFT")));
        t2.setAccelerometerStatZFOURTHIDXFFT(HelpFunctions.checkNull(json.get("z_FOURTH_IDX_FFT")));
        t2.setAccelerometerStatZFOURTHVALFFT(HelpFunctions.checkNull(json.get("z_FOURTH_VAL_FFT")));
        t2.setAccelerometerStatZMEAN(HelpFunctions.checkNull(json.get("z_MEAN")));
        t2.setAccelerometerStatZMEANFFT(HelpFunctions.checkNull(json.get("z_MEAN_FFT")));
        t2.setAccelerometerStatZMEDIAN(HelpFunctions.checkNull(json.get("z_MEDIAN")));
        t2.setAccelerometerStatZMEDIANFFT(HelpFunctions.checkNull(json.get("z_MEDIAN_FFT")));
        t2.setAccelerometerStatZMIDDLESAMPLE(HelpFunctions.checkNull(json.get("z_MIDDLE_SAMPLE")));
        t2.setAccelerometerStatZSECONDIDXFFT(HelpFunctions.checkNull(json.get("z_SECOND_IDX_FFT")));
        t2.setAccelerometerStatZSECONDVALFFT(HelpFunctions.checkNull(json.get("z_SECOND_VAL_FFT")));
        t2.setAccelerometerStatZTHIRDIDXFFT(HelpFunctions.checkNull(json.get("z_THIRD_IDX_FFT")));
        t2.setAccelerometerStatZTHIRDVALFFT(HelpFunctions.checkNull(json.get("z_THIRD_VAL_FFT")));
        t2.setAccelerometerStatZVAR(HelpFunctions.checkNull(json.get("z_VAR")));
        t2.setAccelerometerStatZVARFFT(HelpFunctions.checkNull(json.get("z_VAR_FFT")));
        t2.setAccelerometerStatCOVYX(HelpFunctions.checkNull(json.get("COV(x,y)")));
        t2.setAccelerometerStatCOVZX(HelpFunctions.checkNull(json.get("COV(z,x)")));
        t2.setAccelerometerStatCOVZY(HelpFunctions.checkNull(json.get("COV(z,y)")));

    }

    @Override
    public void GyroscopeSensorProbe(JsonObject json, String userName, String version, String uuid) {

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T2 t2 = (com.xyz.T2) tableHashMaps[Dao._T2].get(hashCode);
        if (t2 == null) {
            t2 = new com.xyz.T2(userName, uuid);
            tableHashMaps[Dao._T2].put(hashCode, t2);
            t2.setCreatedOnTimestamp(System.currentTimeMillis());
        }

        t2.setGyroscopeStatXDCFFT(HelpFunctions.checkNull(json.get("x_DC_FFT")));
        t2.setGyroscopeStatXFIRSTIDXFFT(HelpFunctions.checkNull(json.get("x_FIRST_IDX_FFT")));
        t2.setGyroscopeStatXFIRSTVALFFT(HelpFunctions.checkNull(json.get("x_FIRST_VAL_FFT")));
        t2.setGyroscopeStatXFOURTHIDXFFT(HelpFunctions.checkNull(json.get("x_FOURTH_IDX_FFT")));
        t2.setGyroscopeStatXFOURTHVALFFT(HelpFunctions.checkNull(json.get("x_FOURTH_VAL_FFT")));
        t2.setGyroscopeStatXMEAN(HelpFunctions.checkNull(json.get("x_MEAN")));
        t2.setGyroscopeStatXMEANFFT(HelpFunctions.checkNull(json.get("x_MEAN_FFT")));
        t2.setGyroscopeStatXMEDIAN(HelpFunctions.checkNull(json.get("x_MEDIAN")));
        t2.setGyroscopeStatXMEDIANFFT(HelpFunctions.checkNull(json.get("x_MEDIAN_FFT")));
        t2.setGyroscopeStatXMIDDLESAMPLE(HelpFunctions.checkNull(json.get("x_MIDDLE_SAMPLE")));
        t2.setGyroscopeStatXSECONDIDXFFT(HelpFunctions.checkNull(json.get("x_SECOND_IDX_FFT")));
        t2.setGyroscopeStatXSECONDVALFFT(HelpFunctions.checkNull(json.get("x_SECOND_VAL_FFT")));
        t2.setGyroscopeStatXTHIRDIDXFFT(HelpFunctions.checkNull(json.get("x_THIRD_IDX_FFT")));
        t2.setGyroscopeStatXTHIRDVALFFT(HelpFunctions.checkNull(json.get("x_THIRD_VAL_FFT")));
        t2.setGyroscopeStatXVAR(HelpFunctions.checkNull(json.get("x_VAR")));
        t2.setGyroscopeStatXVARFFT(HelpFunctions.checkNull(json.get("x_VAR_FFT")));
        t2.setGyroscopeStatYDCFFT(HelpFunctions.checkNull(json.get("y_DC_FFT")));
        t2.setGyroscopeStatYFIRSTIDXFFT(HelpFunctions.checkNull(json.get("y_FIRST_IDX_FFT")));
        t2.setGyroscopeStatYFIRSTVALFFT(HelpFunctions.checkNull(json.get("y_FIRST_VAL_FFT")));
        t2.setGyroscopeStatYFOURTHIDXFFT(HelpFunctions.checkNull(json.get("y_FOURTH_IDX_FFT")));
        t2.setGyroscopeStatYFOURTHVALFFT(HelpFunctions.checkNull(json.get("y_FOURTH_VAL_FFT")));
        t2.setGyroscopeStatYMEAN(HelpFunctions.checkNull(json.get("y_MEAN")));
        t2.setGyroscopeStatYMEANFFT(HelpFunctions.checkNull(json.get("y_MEAN_FFT")));
        t2.setGyroscopeStatYMEDIAN(HelpFunctions.checkNull(json.get("y_MEDIAN")));
        t2.setGyroscopeStatYMEDIANFFT(HelpFunctions.checkNull(json.get("y_MEDIAN_FFT")));
        t2.setGyroscopeStatYMIDDLESAMPLE(HelpFunctions.checkNull(json.get("y_MIDDLE_SAMPLE")));
        t2.setGyroscopeStatYSECONDIDXFFT(HelpFunctions.checkNull(json.get("y_SECOND_IDX_FFT")));
        t2.setGyroscopeStatYSECONDVALFFT(HelpFunctions.checkNull(json.get("y_SECOND_VAL_FFT")));
        t2.setGyroscopeStatYTHIRDIDXFFT(HelpFunctions.checkNull(json.get("y_THIRD_IDX_FFT")));
        t2.setGyroscopeStatYTHIRDVALFFT(HelpFunctions.checkNull(json.get("y_THIRD_VAL_FFT")));
        t2.setGyroscopeStatYVAR(HelpFunctions.checkNull(json.get("y_VAR")));
        t2.setGyroscopeStatYVARFFT(HelpFunctions.checkNull(json.get("y_VAR_FFT")));
        t2.setGyroscopeStatZDCFFT(HelpFunctions.checkNull(json.get("z_DC_FFT")));
        t2.setGyroscopeStatZFIRSTIDXFFT(HelpFunctions.checkNull(json.get("z_FIRST_IDX_FFT")));
        t2.setGyroscopeStatZFIRSTVALFFT(HelpFunctions.checkNull(json.get("z_FIRST_VAL_FFT")));
        t2.setGyroscopeStatZFOURTHIDXFFT(HelpFunctions.checkNull(json.get("z_FOURTH_IDX_FFT")));
        t2.setGyroscopeStatZFOURTHVALFFT(HelpFunctions.checkNull(json.get("z_FOURTH_VAL_FFT")));
        t2.setGyroscopeStatZMEAN(HelpFunctions.checkNull(json.get("z_MEAN")));
        t2.setGyroscopeStatZMEANFFT(HelpFunctions.checkNull(json.get("z_MEAN_FFT")));
        t2.setGyroscopeStatZMEDIAN(HelpFunctions.checkNull(json.get("z_MEDIAN")));
        t2.setGyroscopeStatZMEDIANFFT(HelpFunctions.checkNull(json.get("z_MEDIAN_FFT")));
        t2.setGyroscopeStatZMIDDLESAMPLE(HelpFunctions.checkNull(json.get("z_MIDDLE_SAMPLE")));
        t2.setGyroscopeStatZSECONDIDXFFT(HelpFunctions.checkNull(json.get("z_SECOND_IDX_FFT")));
        t2.setGyroscopeStatZSECONDVALFFT(HelpFunctions.checkNull(json.get("z_SECOND_VAL_FFT")));
        t2.setGyroscopeStatZTHIRDIDXFFT(HelpFunctions.checkNull(json.get("z_THIRD_IDX_FFT")));
        t2.setGyroscopeStatZTHIRDVALFFT(HelpFunctions.checkNull(json.get("z_THIRD_VAL_FFT")));
        t2.setGyroscopeStatZVAR(HelpFunctions.checkNull(json.get("z_VAR")));
        t2.setGyroscopeStatZVARFFT(HelpFunctions.checkNull(json.get("z_VAR_FFT")));
        t2.setGyroscopeStatCOVYX(HelpFunctions.checkNull(json.get("COV(x,y)")));
        t2.setGyroscopeStatCOVZX(HelpFunctions.checkNull(json.get("COV(z,x)")));
        t2.setGyroscopeStatCOVZY(HelpFunctions.checkNull(json.get("COV(z,y)")));

    }


    @Override
    public void MagneticFieldSensorProbe(JsonObject json, String userName, String version, String uuid) {

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T2 t2 = (com.xyz.T2) tableHashMaps[Dao._T2].get(hashCode);
        if (t2 == null) {
            t2 = new com.xyz.T2(userName, uuid);
            tableHashMaps[Dao._T2].put(hashCode, t2);
            t2.setCreatedOnTimestamp(System.currentTimeMillis());
        }

        t2.setMagneticFieldXDCFFT(HelpFunctions.checkNull(json.get("x_DC_FFT")));
        t2.setMagneticFieldXFIRSTIDXFFT(HelpFunctions.checkNull(json.get("x_FIRST_IDX_FFT")));
        t2.setMagneticFieldXFIRSTVALFFT(HelpFunctions.checkNull(json.get("x_FIRST_VAL_FFT")));
        t2.setMagneticFieldXFOURTHIDXFFT(HelpFunctions.checkNull(json.get("x_FOURTH_IDX_FFT")));
        t2.setMagneticFieldXFOURTHVALFFT(HelpFunctions.checkNull(json.get("x_FOURTH_VAL_FFT")));
        t2.setMagneticFieldXMEAN(HelpFunctions.checkNull(json.get("x_MEAN")));
        t2.setMagneticFieldXMEANFFT(HelpFunctions.checkNull(json.get("x_MEAN_FFT")));
        t2.setMagneticFieldXMEDIAN(HelpFunctions.checkNull(json.get("x_MEDIAN")));
        t2.setMagneticFieldXMEDIANFFT(HelpFunctions.checkNull(json.get("x_MEDIAN_FFT")));
        t2.setMagneticFieldXMIDDLESAMPLE(HelpFunctions.checkNull(json.get("x_MIDDLE_SAMPLE")));
        t2.setMagneticFieldXSECONDIDXFFT(HelpFunctions.checkNull(json.get("x_SECOND_IDX_FFT")));
        t2.setMagneticFieldXSECONDVALFFT(HelpFunctions.checkNull(json.get("x_SECOND_VAL_FFT")));
        t2.setMagneticFieldXTHIRDIDXFFT(HelpFunctions.checkNull(json.get("x_THIRD_IDX_FFT")));
        t2.setMagneticFieldXTHIRDVALFFT(HelpFunctions.checkNull(json.get("x_THIRD_VAL_FFT")));
        t2.setMagneticFieldXVAR(HelpFunctions.checkNull(json.get("x_VAR")));
        t2.setMagneticFieldXVARFFT(HelpFunctions.checkNull(json.get("x_VAR_FFT")));
        t2.setMagneticFieldYDCFFT(HelpFunctions.checkNull(json.get("y_DC_FFT")));
        t2.setMagneticFieldYFIRSTIDXFFT(HelpFunctions.checkNull(json.get("y_FIRST_IDX_FFT")));
        t2.setMagneticFieldYFIRSTVALFFT(HelpFunctions.checkNull(json.get("y_FIRST_VAL_FFT")));
        t2.setMagneticFieldYFOURTHIDXFFT(HelpFunctions.checkNull(json.get("y_FOURTH_IDX_FFT")));
        t2.setMagneticFieldYFOURTHVALFFT(HelpFunctions.checkNull(json.get("y_FOURTH_VAL_FFT")));
        t2.setMagneticFieldYMEAN(HelpFunctions.checkNull(json.get("y_MEAN")));
        t2.setMagneticFieldYMEANFFT(HelpFunctions.checkNull(json.get("y_MEAN_FFT")));
        t2.setMagneticFieldYMEDIAN(HelpFunctions.checkNull(json.get("y_MEDIAN")));
        t2.setMagneticFieldYMEDIANFFT(HelpFunctions.checkNull(json.get("y_MEDIAN_FFT")));
        t2.setMagneticFieldYMIDDLESAMPLE(HelpFunctions.checkNull(json.get("y_MIDDLE_SAMPLE")));
        t2.setMagneticFieldYSECONDIDXFFT(HelpFunctions.checkNull(json.get("y_SECOND_IDX_FFT")));
        t2.setMagneticFieldYSECONDVALFFT(HelpFunctions.checkNull(json.get("y_SECOND_VAL_FFT")));
        t2.setMagneticFieldYTHIRDIDXFFT(HelpFunctions.checkNull(json.get("y_THIRD_IDX_FFT")));
        t2.setMagneticFieldYTHIRDVALFFT(HelpFunctions.checkNull(json.get("y_THIRD_VAL_FFT")));
        t2.setMagneticFieldYVAR(HelpFunctions.checkNull(json.get("y_VAR")));
        t2.setMagneticFieldYVARFFT(HelpFunctions.checkNull(json.get("y_VAR_FFT")));
        t2.setMagneticFieldZDCFFT(HelpFunctions.checkNull(json.get("z_DC_FFT")));
        t2.setMagneticFieldZFIRSTIDXFFT(HelpFunctions.checkNull(json.get("z_FIRST_IDX_FFT")));
        t2.setMagneticFieldZFIRSTVALFFT(HelpFunctions.checkNull(json.get("z_FIRST_VAL_FFT")));
        t2.setMagneticFieldZFOURTHIDXFFT(HelpFunctions.checkNull(json.get("z_FOURTH_IDX_FFT")));
        t2.setMagneticFieldZFOURTHVALFFT(HelpFunctions.checkNull(json.get("z_FOURTH_VAL_FFT")));
        t2.setMagneticFieldZMEAN(HelpFunctions.checkNull(json.get("z_MEAN")));
        t2.setMagneticFieldZMEANFFT(HelpFunctions.checkNull(json.get("z_MEAN_FFT")));
        t2.setMagneticFieldZMEDIAN(HelpFunctions.checkNull(json.get("z_MEDIAN")));
        t2.setMagneticFieldZMEDIANFFT(HelpFunctions.checkNull(json.get("z_MEDIAN_FFT")));
        t2.setMagneticFieldZMIDDLESAMPLE(HelpFunctions.checkNull(json.get("z_MIDDLE_SAMPLE")));
        t2.setMagneticFieldZSECONDIDXFFT(HelpFunctions.checkNull(json.get("z_SECOND_IDX_FFT")));
        t2.setMagneticFieldZSECONDVALFFT(HelpFunctions.checkNull(json.get("z_SECOND_VAL_FFT")));
        t2.setMagneticFieldZTHIRDIDXFFT(HelpFunctions.checkNull(json.get("z_THIRD_IDX_FFT")));
        t2.setMagneticFieldZTHIRDVALFFT(HelpFunctions.checkNull(json.get("z_THIRD_VAL_FFT")));
        t2.setMagneticFieldZVAR(HelpFunctions.checkNull(json.get("z_VAR")));
        t2.setMagneticFieldZVARFFT(HelpFunctions.checkNull(json.get("z_VAR_FFT")));
        t2.setMagneticFieldCOVYX(HelpFunctions.checkNull(json.get("COV(x,y)")));
        t2.setMagneticFieldCOVZX(HelpFunctions.checkNull(json.get("COV(z,x)")));
        t2.setMagneticFieldCOVZY(HelpFunctions.checkNull(json.get("COV(z,y)")));



    }

    @Override
    public void PressureSensorProbe(JsonObject json, String userName, String version, String uuid) {


        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T2 t2 = (com.xyz.T2) tableHashMaps[Dao._T2].get(hashCode);
        if (t2 == null) {
            t2 = new com.xyz.T2(userName, uuid);
            tableHashMaps[Dao._T2].put(hashCode, t2);
            t2.setCreatedOnTimestamp(System.currentTimeMillis());
        }

        t2.setPressureDCFFT(HelpFunctions.checkNull(json.get("pressure_DC_FFT")));
        t2.setPressureFIRSTIDXFFT(HelpFunctions.checkNull(json.get("pressure_FIRST_IDX_FFT")));
        t2.setPressureFIRSTVALFFT(HelpFunctions.checkNull(json.get("pressure_FIRST_VAL_FFT")));
        t2.setPressureFOURTHIDXFFT(HelpFunctions.checkNull(json.get("pressure_FOURTH_IDX_FFT")));
        t2.setPressureFOURTHVALFFT(HelpFunctions.checkNull(json.get("pressure_FOURTH_VAL_FFT")));
        t2.setPressureMEAN(HelpFunctions.checkNull(json.get("pressure_MEAN")));
        t2.setPressureMEANFFT(HelpFunctions.checkNull(json.get("pressure_MEAN_FFT")));
        t2.setPressureMEDIAN(HelpFunctions.checkNull(json.get("pressure_MEDIAN")));
        t2.setPressureMEDIANFFT(HelpFunctions.checkNull(json.get("pressure_MEDIAN_FFT")));
        t2.setPressureMIDDLESAMPLE(HelpFunctions.checkNull(json.get("pressure_MIDDLE_SAMPLE")));
        t2.setPressureSECONDIDXFFT(HelpFunctions.checkNull(json.get("pressure_SECOND_IDX_FFT")));
        t2.setPressureSECONDVALFFT(HelpFunctions.checkNull(json.get("pressure_SECOND_VAL_FFT")));
        t2.setPressureTHIRDIDXFFT(HelpFunctions.checkNull(json.get("pressure_THIRD_IDX_FFT")));
        t2.setPressureTHIRDVALFFT(HelpFunctions.checkNull(json.get("pressure_THIRD_VAL_FFT")));
        t2.setPressureVAR(HelpFunctions.checkNull(json.get("pressure_VAR")));
        t2.setPressureVARFFT(HelpFunctions.checkNull(json.get("pressure_VAR_FFT")));




    }

    @Override
    public void OrientationRotationProbe(JsonObject json, String userName, String version) {

        String Orientation_UUID = json.get("UUID").toString().replace("\"", "");
        JsonObject Orientation_Json = json.getAsJsonObject("edu.mit.media.funf.probe.builtin.OrientationSensorProbe");
        JsonObject Rotation_Json = json.getAsJsonObject("edu.mit.media.funf.probe.builtin.RotationVectorSensorProbe");

        int hashCode = HelpFunctions.generateHashCode(Orientation_UUID, userName);
        com.xyz.T2 t2 = (com.xyz.T2) tableHashMaps[Dao._T2].get(hashCode);
        if (t2 == null) {
            t2 = new com.xyz.T2(userName, Orientation_UUID);
            tableHashMaps[Dao._T2].put(hashCode, t2);
            t2.setCreatedOnTimestamp(System.currentTimeMillis());
        }

        t2.setOrientationProbeAzimuthMEAN(HelpFunctions.checkNull(Orientation_Json.get("azimuth_MEAN")));
        t2.setOrientationProbeAzimuthMEDIAN(HelpFunctions.checkNull(Orientation_Json.get("azimuth_MEDIAN")));
        t2.setOrientationProbeAzimuthMIDDLESAMPLE(HelpFunctions.checkNull(Orientation_Json.get("azimuth_MIDDLE_SAMPLE")));
        t2.setOrientationProbePitchMEAN(HelpFunctions.checkNull(Orientation_Json.get("pitch_MEAN")));
        t2.setOrientationProbePitchMEDIAN(HelpFunctions.checkNull(Orientation_Json.get("pitch_MEDIAN")));
        t2.setOrientationProbePitchMIDDLESAMPLE(HelpFunctions.checkNull(Orientation_Json.get("pitch_MIDDLE_SAMPLE")));
        t2.setOrientationProbeRollMEAN(HelpFunctions.checkNull(Orientation_Json.get("roll_MEAN")));
        t2.setOrientationProbeRollMEDIAN(HelpFunctions.checkNull(Orientation_Json.get("roll_MEDIAN")));
        t2.setOrientationProbeRollMIDDLESAMPLE(HelpFunctions.checkNull(Orientation_Json.get("roll_MIDDLE_SAMPLE")));
        t2.setRotationVectorCosThetaOver2MEAN(HelpFunctions.checkNull(Rotation_Json.get("cosThetaOver2_MEAN")));
        t2.setRotationVectorCosThetaOver2MEDIAN(HelpFunctions.checkNull(Rotation_Json.get("cosThetaOver2_MEDIAN")));
        t2.setRotationVectorCosThetaOver2MIDDLESAMPLE(HelpFunctions.checkNull(Rotation_Json.get("cosThetaOver2_MIDDLE_SAMPLE")));
        t2.setRotationVectorXSinThetaOver2MEAN(HelpFunctions.checkNull(Rotation_Json.get("xSinThetaOver2_MEAN")));
        t2.setRotationVectorXSinThetaOver2MEDIAN(HelpFunctions.checkNull(Rotation_Json.get("xSinThetaOver2_MEDIAN")));
        t2.setRotationVectorXSinThetaOver2MIDDLESAMPLE(HelpFunctions.checkNull(Rotation_Json.get("xSinThetaOver2_MIDDLE_SAMPLE")));
        t2.setRotationVectorYSinThetaOver2MEAN(HelpFunctions.checkNull(Rotation_Json.get("ySinThetaOver2_MEAN")));
        t2.setRotationVectorYSinThetaOver2MEDIAN(HelpFunctions.checkNull(Rotation_Json.get("ySinThetaOver2_MEDIAN")));
        t2.setRotationVectorYSinThetaOver2MIDDLESAMPLE(HelpFunctions.checkNull(Rotation_Json.get("ySinThetaOver2_MIDDLE_SAMPLE")));
        t2.setRotationVectorZSinThetaOver2MEAN(HelpFunctions.checkNull(Rotation_Json.get("zSinThetaOver2_MEAN")));
        t2.setRotationVectorZSinThetaOver2MEDIAN(HelpFunctions.checkNull(Rotation_Json.get("zSinThetaOver2_MEDIAN")));
        t2.setRotationVectorZSinThetaOver2MIDDLESAMPLE(HelpFunctions.checkNull(Rotation_Json.get("zSinThetaOver2_MIDDLE_SAMPLE")));



    }

    @Override
    public void LinearAcceleration(JsonObject json, String userName, String version, String uuid) {

        int hashCode = HelpFunctions.generateHashCode(uuid, userName);
        com.xyz.T2 t2 = (com.xyz.T2) tableHashMaps[Dao._T2].get(hashCode);
        if (t2 == null) {
            t2 = new com.xyz.T2(userName, uuid);
            tableHashMaps[Dao._T2].put(hashCode, t2);
            t2.setCreatedOnTimestamp(System.currentTimeMillis());
        }

        t2.setLinearAccelerationXDCFFT(HelpFunctions.checkNull(json.get("x_DC_FFT")));
        t2.setLinearAccelerationXFIRSTIDXFFT(HelpFunctions.checkNull(json.get("x_FIRST_IDX_FFT")));
        t2.setLinearAccelerationXFIRSTVALFFT(HelpFunctions.checkNull(json.get("x_FIRST_VAL_FFT")));
        t2.setLinearAccelerationXFOURTHIDXFFT(HelpFunctions.checkNull(json.get("x_FOURTH_IDX_FFT")));
        t2.setLinearAccelerationXFOURTHVALFFT(HelpFunctions.checkNull(json.get("x_FOURTH_VAL_FFT")));
        t2.setLinearAccelerationXMEAN(HelpFunctions.checkNull(json.get("x_MEAN")));
        t2.setLinearAccelerationXMEANFFT(HelpFunctions.checkNull(json.get("x_MEAN_FFT")));
        t2.setLinearAccelerationXMEDIAN(HelpFunctions.checkNull(json.get("x_MEDIAN")));
        t2.setLinearAccelerationXMEDIANFFT(HelpFunctions.checkNull(json.get("x_MEDIAN_FFT")));
        t2.setLinearAccelerationXMIDDLESAMPLE(HelpFunctions.checkNull(json.get("x_MIDDLE_SAMPLE")));
        t2.setLinearAccelerationXSECONDIDXFFT(HelpFunctions.checkNull(json.get("x_SECOND_IDX_FFT")));
        t2.setLinearAccelerationXSECONDVALFFT(HelpFunctions.checkNull(json.get("x_SECOND_VAL_FFT")));
        t2.setLinearAccelerationXTHIRDIDXFFT(HelpFunctions.checkNull(json.get("x_THIRD_IDX_FFT")));
        t2.setLinearAccelerationXTHIRDVALFFT(HelpFunctions.checkNull(json.get("x_THIRD_VAL_FFT")));
        t2.setLinearAccelerationXVAR(HelpFunctions.checkNull(json.get("x_VAR")));
        t2.setLinearAccelerationXVARFFT(HelpFunctions.checkNull(json.get("x_VAR_FFT")));
        t2.setLinearAccelerationYDCFFT(HelpFunctions.checkNull(json.get("y_DC_FFT")));
        t2.setLinearAccelerationYFIRSTIDXFFT(HelpFunctions.checkNull(json.get("y_FIRST_IDX_FFT")));
        t2.setLinearAccelerationYFIRSTVALFFT(HelpFunctions.checkNull(json.get("y_FIRST_VAL_FFT")));
        t2.setLinearAccelerationYFOURTHIDXFFT(HelpFunctions.checkNull(json.get("y_FOURTH_IDX_FFT")));
        t2.setLinearAccelerationYFOURTHVALFFT(HelpFunctions.checkNull(json.get("y_FOURTH_VAL_FFT")));
        t2.setLinearAccelerationYMEAN(HelpFunctions.checkNull(json.get("y_MEAN")));
        t2.setLinearAccelerationYMEANFFT(HelpFunctions.checkNull(json.get("y_MEAN_FFT")));
        t2.setLinearAccelerationYMEDIAN(HelpFunctions.checkNull(json.get("y_MEDIAN")));
        t2.setLinearAccelerationYMEDIANFFT(HelpFunctions.checkNull(json.get("y_MEDIAN_FFT")));
        t2.setLinearAccelerationYMIDDLESAMPLE(HelpFunctions.checkNull(json.get("y_MIDDLE_SAMPLE")));
        t2.setLinearAccelerationYSECONDIDXFFT(HelpFunctions.checkNull(json.get("y_SECOND_IDX_FFT")));
        t2.setLinearAccelerationYSECONDVALFFT(HelpFunctions.checkNull(json.get("y_SECOND_VAL_FFT")));
        t2.setLinearAccelerationYTHIRDIDXFFT(HelpFunctions.checkNull(json.get("y_THIRD_IDX_FFT")));
        t2.setLinearAccelerationYTHIRDVALFFT(HelpFunctions.checkNull(json.get("y_THIRD_VAL_FFT")));
        t2.setLinearAccelerationYVAR(HelpFunctions.checkNull(json.get("y_VAR")));
        t2.setLinearAccelerationYVARFFT(HelpFunctions.checkNull(json.get("y_VAR_FFT")));
        t2.setLinearAccelerationZDCFFT(HelpFunctions.checkNull(json.get("z_DC_FFT")));
        t2.setLinearAccelerationZFIRSTIDXFFT(HelpFunctions.checkNull(json.get("z_FIRST_IDX_FFT")));
        t2.setLinearAccelerationZFIRSTVALFFT(HelpFunctions.checkNull(json.get("z_FIRST_VAL_FFT")));
        t2.setLinearAccelerationZFOURTHIDXFFT(HelpFunctions.checkNull(json.get("z_FOURTH_IDX_FFT")));
        t2.setLinearAccelerationZFOURTHVALFFT(HelpFunctions.checkNull(json.get("z_FOURTH_VAL_FFT")));
        t2.setLinearAccelerationZMEAN(HelpFunctions.checkNull(json.get("z_MEAN")));
        t2.setLinearAccelerationZMEANFFT(HelpFunctions.checkNull(json.get("z_MEAN_FFT")));
        t2.setLinearAccelerationZMEDIAN(HelpFunctions.checkNull(json.get("z_MEDIAN")));
        t2.setLinearAccelerationZMEDIANFFT(HelpFunctions.checkNull(json.get("z_MEDIAN_FFT")));
        t2.setLinearAccelerationZMIDDLESAMPLE(HelpFunctions.checkNull(json.get("z_MIDDLE_SAMPLE")));
        t2.setLinearAccelerationZSECONDIDXFFT(HelpFunctions.checkNull(json.get("z_SECOND_IDX_FFT")));
        t2.setLinearAccelerationZSECONDVALFFT(HelpFunctions.checkNull(json.get("z_SECOND_VAL_FFT")));
        t2.setLinearAccelerationZTHIRDIDXFFT(HelpFunctions.checkNull(json.get("z_THIRD_IDX_FFT")));
        t2.setLinearAccelerationZTHIRDVALFFT(HelpFunctions.checkNull(json.get("z_THIRD_VAL_FFT")));
        t2.setLinearAccelerationZVAR(HelpFunctions.checkNull(json.get("z_VAR")));
        t2.setLinearAccelerationZVARFFT(HelpFunctions.checkNull(json.get("z_VAR_FFT")));
        t2.setLinearAccelerationCOVYX(HelpFunctions.checkNull(json.get("COV(x,y)")));
        t2.setLinearAccelerationCOVZX(HelpFunctions.checkNull(json.get("COV(z,x)")));
        t2.setLinearAccelerationCOVZY(HelpFunctions.checkNull(json.get("COV(z,y)")));




    }
}



