//package com.utilitys;
//
///**
// * Created by Tomer on 15/09/2014.
// */
//public interface Constants {
//
//
//    //connection pool
//
//    public static final String CLASS_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//
//// //local
////
//    public static final String DB_URL = "jdbc:sqlserver://localhost;databaseName=sensorsProbs;integratedSecurity=true;";
//    public static final String SET_USERNAME = "tomer123@gmail.com";
//    public static final String SET_PASSWORD = "58@@58aa";
// //   public static final String WORKING_PATH = "c:\\work\\out\\";
//
//    //server
//
////  public static final String DB_URL="jdbc:sqlserver://LAB317D\\SQL2012;databaseName=sensorsProbs;integratedSecurity=true;";
////  public static final String SET_USERNAME="liokumov@bgu-users";
////  public static final String SET_PASSWORD="qwASzx12";
////  public static final String WORKING_PATH="d:\\out\\";
////
//
//
//
////liokumov@bgu-users";
//
//
//    //---------------------------------T1---------------------------------------------
//
//    //CallInFoProbe number of Field number 7
//
//    // call data is an array so he have his oun table
//    public static final String CALLINFO_INCALLS = "CallInfo_InCalls";
//    public static final String CALLINFO_MISSEDCALLS = "CallInfo_MissedCalls";
//    public static final String CALLINFO_NOTINCONTACTS = "CallInfo_NotInContacts";
//    public static final String CALLINFO_OUTCALLS = "CallInfo_OutCalls";
//    public static final String CALLINFO_TOTALDURATION = "CallInfo_TotalDuration";
//    public static final String CALLINFO_UUID = "CallInfo_UUID";
//    public static final String CALLINFO_TIMESTAMP = "CallInfo_timestamp";
//    public static final String CALLINFO_INSERT_VALUE = "?,?,?,?,?,?,?";
//    public static final String CALLINFO_INSERT_STRING = CALLINFO_INCALLS + ","
//            + CALLINFO_MISSEDCALLS + "," + CALLINFO_NOTINCONTACTS + ","
//            + CALLINFO_OUTCALLS + "," + CALLINFO_TOTALDURATION + ","
//            + CALLINFO_UUID + "," + CALLINFO_TIMESTAMP;
//
//
//    //SmsInfoProbe number of Field number 6
//
//    // call data is an array so he have his own table
//    public static final String SMSINFO_INSMS = "SmsInfo_InSMS";
//    public static final String SMSINFO_NOTINCONTACTS = "SmsInfo_NotInContacts";
//    public static final String SMSINFO_OUTSMS = "SmsInfo_OutSMS";
//    public static final String SMSINFO_UUID = "SmsInfo_UUID";
//    public static final String SMSINFO_TIMESTAMP = "SmsInfo_timestamp";
//    public static final String SMSINFO_URLLIST = "SmsInfo_urlList";
//    public static final String SMSINFO_INSERT_VALUE = "?,?,?,?,?,?";
//    public static final String SMSINFO_INSERT_STRING = SMSINFO_INSMS + ","
//            + SMSINFO_NOTINCONTACTS + "," + SMSINFO_OUTSMS + ","
//            + SMSINFO_UUID + "," + SMSINFO_TIMESTAMP + ","
//            + SMSINFO_URLLIST;
//
//    //WifiProbe number of Field number 6
//
//
//    //BatteryProbe number of field number 16
//    //The small-icon have a problem with the '-' char so the insertion don't have constant !!!
//    public static final String BATTERYPROBE_UUID = "Battery_UUID";
//    public static final String BATTERYPROBE_CHARGE_TYPE = "Battery_charge_type";
//    public static final String BATTERYPROB_CURRENT_AVG_ = "Battery_current_avg";
//    public static final String BATTERYPROB_HEALTH = "Battery_health";
//    public static final String BATTERYPROB_ICON_SMALL = "Battery_icon_small";
//    public static final String BATTERYPROB_INVALID_CHARGER = "Battery_invalid_charger";
//    public static final String BATTERYPROBE_LEVEL = "Battery_level";
//    public static final String BATTERYPROBE_ONLINE = "Battery_online";
//    public static final String BATTERYPROB_PLUGGED_ = "Battery_plugged";
//    public static final String BATTERYPROB_PRESENT = "Battery_present";
//    public static final String BATTERYPROB_SCALE = "Battery_scale";
//    public static final String BATTERYPROB_STATUS_ = "Battery_status";
//    public static final String BATTERYPROBE_TECHNOLOGY = "Battery_technology";
//    public static final String BATTERYPROBE_TEMPERATURE = "Battery_temperature";
//    public static final String BATTERYPROB_TIMESTAMP = "Battery_timestamp";
//    public static final String BATTERYPROB_VOLTAGE = "Battery_voltage";
//    public static final String BATTERYPROB_INSERT_VALUE = "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
//    public static final String BATTERYPROB_INSERT_STRING = BATTERYPROBE_UUID + ","
//            + BATTERYPROBE_CHARGE_TYPE + "," + BATTERYPROB_CURRENT_AVG_ + ","
//            + BATTERYPROB_HEALTH + "," + BATTERYPROB_ICON_SMALL + ","
//            + BATTERYPROB_INVALID_CHARGER + "," + BATTERYPROBE_LEVEL + ","
//            + BATTERYPROBE_ONLINE + "," + BATTERYPROB_PLUGGED_ + ","
//            + BATTERYPROB_PRESENT + "," + BATTERYPROB_SCALE + ","
//            + BATTERYPROB_STATUS_ + "," + BATTERYPROBE_TECHNOLOGY + ","
//            + BATTERYPROBE_TEMPERATURE + "," + BATTERYPROB_TIMESTAMP + ","
//            + BATTERYPROB_VOLTAGE;
//
//
//    //TrafficStatsProbe number of field number 14
//
//    public static final String TRAFFICSTATSPROBE_UUID = "Traffic_UUID";
//    public static final String TRAFFICSTATSPROBE_MOBILERXBYTES = "Traffic_MobileRxBytes";
//    public static final String TRAFFICSTATSPROBE_MOBILERXPACKETS = "Traffic_MobileRxPackets";
//    public static final String TRAFFICSTATSPROBE_MOBILETXBYTES = "Traffic_MobileTxBytes";
//    public static final String TRAFFICSTATSPROBE_MOBILETXPACKETS = "Traffic_MobileTxPackets";
//    public static final String TRAFFICSTATSPROBE_TOTALRXBYTES = "Traffic_TotalRxBytes";
//    public static final String TRAFFICSTATSPROBE_TOTALRXPACKETS = "Traffic_TotalRxPackets";
//    public static final String TRAFFICSTATSPROBE_TOTALTXBYTES = "Traffic_TotalTxBytes";
//    public static final String TRAFFICSTATSPROBE_TOTALTXPACKETS = "Traffic_TotalTxPackets";
//    public static final String TRAFFICSTATSPROBE_TOTALWIFIRXBYTES = "Traffic_TotalWifiRxBytes";
//    public static final String TRAFFICSTATSPROBE_TOTALWIFIRXPACKETS = "Traffic_TotalWifiRxPackets";
//    public static final String TRAFFICSTATSPROBE_TOTALWIFITXBYTES = "Traffic_TotalWifiTxBytes";
//    public static final String TRAFFICSTATSPROBE_TOTALWIFITXPACKETS = "Traffic_TotalWifiTxPackets";
//    public static final String TRAFFICSTATSPROBE_TIMESTAMP = "Traffic_timestamp";
//    public static final String TRAFFICSTATSPROBE_INSERT_VALUE = "?,?,?,?,?,?,?,?,?,?,?,?,?,?";
//    public static final String TRAFFICSTATSPROBE_INSERT_STRING = TRAFFICSTATSPROBE_UUID + "," + TRAFFICSTATSPROBE_MOBILERXBYTES + ","
//            + TRAFFICSTATSPROBE_MOBILERXPACKETS + "," + TRAFFICSTATSPROBE_MOBILETXBYTES + ","
//            + TRAFFICSTATSPROBE_MOBILETXPACKETS + "," + TRAFFICSTATSPROBE_TOTALRXBYTES + ","
//            + TRAFFICSTATSPROBE_TOTALRXPACKETS + "," + TRAFFICSTATSPROBE_TOTALTXBYTES + ","
//            + TRAFFICSTATSPROBE_TOTALTXPACKETS + "," + TRAFFICSTATSPROBE_TOTALWIFIRXBYTES + ","
//            + TRAFFICSTATSPROBE_TOTALWIFIRXPACKETS + "," + TRAFFICSTATSPROBE_TOTALWIFITXBYTES + ","
//            + TRAFFICSTATSPROBE_TOTALWIFITXPACKETS + "," + TRAFFICSTATSPROBE_TIMESTAMP;
//
//    //OrientationStatisticsProbe number of field number 37
//
//    public static final String ORIENTATION_STAT_AVGAZIMUTH = "Orientation_AvgAZIMUTH";
//    public static final String ORIENTATION_STAT_AVGABSAZIMUTH = "Orientation_AvgAbsAZIMUTH";
//    public static final String ORIENTATION_STAT_AVGABSPITCH = "Orientation_AvgAbsPITCH";
//    public static final String ORIENTATION_STAT_AVGABSROLL = "Orientation_AvgAbsROLL";
//    public static final String ORIENTATION_STAT_AVGPITCH = "Orientation_AvgPITCH";
//    public static final String ORIENTATION_STAT_AVGROLL = "Orientation_AvgROLL";
//    public static final String ORIENTATION_STAT_COVABSPITCH_AZIMUTH = "Orientation_CovAbsPITCH_AZIMUTH";
//    public static final String ORIENTATION_STAT_COVABSPITCH_ROLL = "Orientation_CovAbsPITCH_ROLL";
//    public static final String ORIENTATION_STAT_COVABSROLL_AZIMUTH = "Orientation_CovAbsROLL_AZIMUTH";
//    public static final String ORIENTATION_STAT_COVPITCH_AZIMUTH = "Orientation_CovPITCH_AZIMUTH";
//    public static final String ORIENTATION_STAT_COVPITCH_ROLL = "Orientation_CovPITCH_ROLL";
//    public static final String ORIENTATION_STAT_COVROLL_AZIMUTH = "Orientation_CovROLL_AZIMUTH";
//    public static final String ORIENTATION_STAT_RABSPITCH_AZIMUTH = "Orientation_RAbsPITCH_AZIMUTH";
//    public static final String ORIENTATION_STAT_RABSPITCH_ROLL = "Orientation_RAbsPITCH_ROLL";
//    public static final String ORIENTATION_STAT_RABSROLL_AZIMUTH = "Orientation_RAbsROLL_AZIMUTH";
//    public static final String ORIENTATION_STAT_R_PITCH_AZIMUTH = "Orientation_R_PITCH_AZIMUTH";
//    public static final String ORIENTATION_STAT_R_PITCH_ROLL = "Orientation_R_PITCH_ROLL";
//    public static final String ORIENTATION_STAT_R_ROLL_AZIMUTH = "Orientation_R_ROLL_AZIMUTH";
//    public static final String ORIENTATION_STAT_SUMAZIMUTH = "Orientation_SumAZIMUTH";
//    public static final String ORIENTATION_STAT_SUMABSAZIMUTH = "Orientation_SumAbsAZIMUTH";
//    public static final String ORIENTATION_STAT_SUMABSPITCH = "Orientation_SumAbsPITCH";
//    public static final String ORIENTATION_STAT_SUMABSPITCH_AZIMUTH = "Orientation_SumAbsPITCH_AZIMUTH";
//    public static final String ORIENTATION_STAT_SUMABSPITCH_ROLL = "Orientation_SumAbsPITCH_ROLL";
//    public static final String ORIENTATION_STAT_SUMABSROLL = "Orientation_SumAbsROLL";
//    public static final String ORIENTATION_STAT_SUMABSROLL_AZIMUTH = "Orientation_SumAbsROLL_AZIMUTH";
//    public static final String ORIENTATION_STAT_SUMPITCH = "Orientation_SumPITCH";
//    public static final String ORIENTATION_STAT_SUMPITCH_AZIMUTH = "Orientation_SumPITCH_AZIMUTH";
//    public static final String ORIENTATION_STAT_SUMPITCH_ROLL = "Orientation_SumPITCH_ROLL";
//    public static final String ORIENTATION_STAT_SUMROLL = "Orientation_SumROLL";
//    public static final String ORIENTATION_STAT_SUMROLL_AZIMUTH = "Orientation_SumROLL_AZIMUTH";
//    public static final String ORIENTATION_STAT_UUID = "Orientation_UUID";
//    public static final String ORIENTATION_STAT_VARAZIMUTH = "Orientation_VarAZIMUTH";
//    public static final String ORIENTATION_STAT_VARABSAZIMUTH = "Orientation_VarAbsAZIMUTH";
//    public static final String ORIENTATION_STAT_VARABSPITCH = "Orientation_VarAbsPITCH";
//    public static final String ORIENTATION_STAT_VARABSROLL = "Orientation_VarAbsROLL";
//    public static final String ORIENTATION_STAT_VARPITCH = "Orientation_VarPITCH";
//    public static final String ORIENTATION_STAT_VARROLL = "Orientation_VarROLL";
//    public static final String ORIENTATION_STAT_ETIME = "Orientation_eTime";
//
//    public static final String ORIENTATION_STAT_INSERT_VALUE = "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
//    public static final String ORIENTATION_STAT_INSERT_STRING =
//            ORIENTATION_STAT_AVGAZIMUTH + "," +
//                    ORIENTATION_STAT_AVGABSAZIMUTH + "," +
//                    ORIENTATION_STAT_AVGABSPITCH + "," +
//                    ORIENTATION_STAT_AVGABSROLL + "," +
//                    ORIENTATION_STAT_AVGPITCH + "," +
//                    ORIENTATION_STAT_AVGROLL + "," +
//                    ORIENTATION_STAT_COVABSPITCH_AZIMUTH + "," +
//                    ORIENTATION_STAT_COVABSPITCH_ROLL + "," +
//                    ORIENTATION_STAT_COVABSROLL_AZIMUTH + "," +
//                    ORIENTATION_STAT_COVPITCH_AZIMUTH + "," +
//                    ORIENTATION_STAT_COVPITCH_ROLL + "," +
//                    ORIENTATION_STAT_COVROLL_AZIMUTH + "," +
//                    ORIENTATION_STAT_RABSPITCH_AZIMUTH + "," +
//                    ORIENTATION_STAT_RABSPITCH_ROLL + "," +
//                    ORIENTATION_STAT_RABSROLL_AZIMUTH + "," +
//                    ORIENTATION_STAT_R_PITCH_AZIMUTH + "," +
//                    ORIENTATION_STAT_R_PITCH_ROLL + "," +
//                    ORIENTATION_STAT_R_ROLL_AZIMUTH + "," +
//                    ORIENTATION_STAT_SUMAZIMUTH + "," +
//                    ORIENTATION_STAT_SUMABSAZIMUTH + "," +
//                    ORIENTATION_STAT_SUMABSPITCH + "," +
//                    ORIENTATION_STAT_SUMABSPITCH_AZIMUTH + "," +
//                    ORIENTATION_STAT_SUMABSPITCH_ROLL + "," +
//                    ORIENTATION_STAT_SUMABSROLL + "," +
//                    ORIENTATION_STAT_SUMABSROLL_AZIMUTH + "," +
//                    ORIENTATION_STAT_SUMPITCH + "," +
//                    ORIENTATION_STAT_SUMPITCH_AZIMUTH + "," +
//                    ORIENTATION_STAT_SUMPITCH_ROLL + "," +
//                    ORIENTATION_STAT_SUMROLL + "," +
//                    ORIENTATION_STAT_SUMROLL_AZIMUTH + "," +
//                    ORIENTATION_STAT_UUID + "," +
//                    ORIENTATION_STAT_VARAZIMUTH + "," +
//                    ORIENTATION_STAT_VARABSAZIMUTH + "," +
//                    ORIENTATION_STAT_VARABSPITCH + "," +
//                    ORIENTATION_STAT_VARABSROLL + "," +
//                    ORIENTATION_STAT_VARPITCH + "," +
//                    ORIENTATION_STAT_VARROLL + "," +
//                    ORIENTATION_STAT_ETIME;
//
//
//    //AccelerometerStatisticsProbe number of field number 39
//
//    public static final String ACCELEROMETERSTAT_X_DC_FFT = "AccelerometerStat_x_DC_FFT";
//    public static final String ACCELEROMETERSTAT_X_FIRST_IDX_FFT = "AccelerometerStat_x_FIRST_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_X_FIRST_VAL_FFT = "AccelerometerStat_x_FIRST_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_X_FOURTH_IDX_FFT = "AccelerometerStat_x_FOURTH_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_X_FOURTH_VAL_FFT = "AccelerometerStat_x_FOURTH_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_X_MEAN = "AccelerometerStat_x_MEAN";
//    public static final String ACCELEROMETERSTAT_X_MEAN_FFT = "AccelerometerStat_x_MEAN_FFT";
//    public static final String ACCELEROMETERSTAT_X_MEDIAN = "AccelerometerStat_x_MEDIAN";
//    public static final String ACCELEROMETERSTAT_X_MEDIAN_FFT = "AccelerometerStat_x_MEDIAN_FFT";
//    public static final String ACCELEROMETERSTAT_X_SECOND_IDX_FFT = "AccelerometerStat_x_SECOND_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_X_SECOND_VAL_FFT = "AccelerometerStat_x_SECOND_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_X_THIRD_IDX_FFT = "AccelerometerStat_x_THIRD_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_X_THIRD_VAL_FFT = "AccelerometerStat_x_THIRD_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_X_VAR = "AccelerometerStat_x_VAR";
//    public static final String ACCELEROMETERSTAT_X_VAR_FFT = "AccelerometerStat_x_VAR_FFT";
//    public static final String ACCELEROMETERSTAT_Y_DC_FFT = "AccelerometerStat_y_DC_FFT";
//    public static final String ACCELEROMETERSTAT_Y_FIRST_IDX_FFT = "AccelerometerStat_y_FIRST_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_Y_FIRST_VAL_FFT = "AccelerometerStat_y_FIRST_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_Y_FOURTH_IDX_FFT = "AccelerometerStat_y_FOURTH_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_Y_FOURTH_VAL_FFT = "AccelerometerStat_y_FOURTH_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_Y_MEAN = "AccelerometerStat_y_MEAN";
//    public static final String ACCELEROMETERSTAT_Y_MEAN_FFT = "AccelerometerStat_y_MEAN_FFT";
//    public static final String ACCELEROMETERSTAT_Y_MEDIAN = "AccelerometerStat_y_MEDIAN";
//    public static final String ACCELEROMETERSTAT_Y_MEDIAN_FFT = "AccelerometerStat_y_MEDIAN_FFT";
//    public static final String ACCELEROMETERSTAT_Y_SECOND_IDX_FFT = "AccelerometerStat_y_SECOND_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_Y_SECOND_VAL_FFT = "AccelerometerStat_y_SECOND_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_Y_THIRD_IDX_FFT = "AccelerometerStat_y_THIRD_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_Y_THIRD_VAL_FFT = "AccelerometerStat_y_THIRD_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_Y_VAR = "AccelerometerStat_y_VAR";
//    public static final String ACCELEROMETERSTAT_Y_VAR_FFT = "AccelerometerStat_y_VAR_FFT";
//    public static final String ACCELEROMETERSTAT_Z_DC_FFT = "AccelerometerStat_z_DC_FFT";
//    public static final String ACCELEROMETERSTAT_Z_FIRST_IDX_FFT = "AccelerometerStat_z_FIRST_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_Z_FIRST_VAL_FFT = "AccelerometerStat_z_FIRST_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_Z_FOURTH_IDX_FFT = "AccelerometerStat_z_FOURTH_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_Z_FOURTH_VAL_FFT = "AccelerometerStat_z_FOURTH_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_Z_MEAN = "AccelerometerStat_z_MEAN";
//    public static final String ACCELEROMETERSTAT_Z_MEAN_FFT = "AccelerometerStat_z_MEAN_FFT";
//    public static final String ACCELEROMETERSTAT_Z_MEDIAN = "AccelerometerStat_z_MEDIAN";
//    public static final String ACCELEROMETERSTAT_Z_MEDIAN_FFT = "AccelerometerStat_z_MEDIAN_FFT";
//    public static final String ACCELEROMETERSTAT_Z_SECOND_IDX_FFT = "AccelerometerStat_z_SECOND_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_Z_SECOND_VAL_FFT = "AccelerometerStat_z_SECOND_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_Z_THIRD_IDX_FFT = "AccelerometerStat_z_THIRD_IDX_FFT";
//    public static final String ACCELEROMETERSTAT_Z_THIRD_VAL_FFT = "AccelerometerStat_z_THIRD_VAL_FFT";
//    public static final String ACCELEROMETERSTAT_Z_VAR = "AccelerometerStat_z_VAR";
//    public static final String ACCELEROMETERSTAT_Z_VAR_FFT = "AccelerometerStat_z_VAR_FFT";
//
//    public static final String ACCELEROMETERSTAT_STAT_INSERT_VALUE = "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
//    public static final String ACCELEROMETERSTAT_STAT_INSERT_STRING =
//                    ACCELEROMETERSTAT_X_DC_FFT + "," +
//                    ACCELEROMETERSTAT_X_FIRST_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_X_FIRST_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_X_FOURTH_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_X_FOURTH_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_X_MEAN + "," +
//                    ACCELEROMETERSTAT_X_MEAN_FFT + "," +
//                    ACCELEROMETERSTAT_X_MEDIAN + "," +
//                    ACCELEROMETERSTAT_X_MEDIAN_FFT + "," +
//                    ACCELEROMETERSTAT_X_SECOND_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_X_SECOND_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_X_THIRD_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_X_THIRD_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_X_VAR + "," +
//                    ACCELEROMETERSTAT_X_VAR_FFT + "," +
//                    ACCELEROMETERSTAT_Y_DC_FFT + "," +
//                    ACCELEROMETERSTAT_Y_FIRST_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_Y_FIRST_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_Y_FOURTH_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_Y_FOURTH_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_Y_MEAN + "," +
//                    ACCELEROMETERSTAT_Y_MEAN_FFT + "," +
//                    ACCELEROMETERSTAT_Y_MEDIAN + "," +
//                    ACCELEROMETERSTAT_Y_MEDIAN_FFT + "," +
//                    ACCELEROMETERSTAT_Y_SECOND_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_Y_SECOND_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_Y_THIRD_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_Y_THIRD_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_Y_VAR + "," +
//                    ACCELEROMETERSTAT_Y_VAR_FFT + "," +
//                    ACCELEROMETERSTAT_Z_DC_FFT + "," +
//                    ACCELEROMETERSTAT_Z_FIRST_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_Z_FIRST_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_Z_FOURTH_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_Z_FOURTH_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_Z_MEAN + "," +
//                    ACCELEROMETERSTAT_Z_MEAN_FFT + "," +
//                    ACCELEROMETERSTAT_Z_MEDIAN + "," +
//                    ACCELEROMETERSTAT_Z_MEDIAN_FFT + "," +
//                    ACCELEROMETERSTAT_Z_SECOND_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_Z_SECOND_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_Z_THIRD_IDX_FFT + "," +
//                    ACCELEROMETERSTAT_Z_THIRD_VAL_FFT + "," +
//                    ACCELEROMETERSTAT_Z_VAR + "," +
//                    ACCELEROMETERSTAT_Z_VAR_FFT;
//
//    //GyroscopeStatisticsProbe number of field number 39
//
//    public static final String GYROSCOPESTAT_x_DC_FFT= "GyroscopeStat_x_DC_FFT";
//    public static final String GYROSCOPESTAT_x_FIRST_IDX_FFT= "GyroscopeStat_x_FIRST_IDX_FFT";
//    public static final String GYROSCOPESTAT_x_FIRST_VAL_FFT= "GyroscopeStat_x_FIRST_VAL_FFT";
//    public static final String GYROSCOPESTAT_x_FOURTH_IDX_FFT= "GyroscopeStat_x_FOURTH_IDX_FFT";
//    public static final String GYROSCOPESTAT_x_FOURTH_VAL_FFT= "GyroscopeStat_x_FOURTH_VAL_FFT";
//    public static final String GYROSCOPESTAT_x_MEAN= "GyroscopeStat_x_MEAN";
//    public static final String GYROSCOPESTAT_x_MEAN_FFT= "GyroscopeStat_x_MEAN_FFT";
//    public static final String GYROSCOPESTAT_x_MEDIAN= "GyroscopeStat_x_MEDIAN";
//    public static final String GYROSCOPESTAT_x_MEDIAN_FFT= "GyroscopeStat_x_MEDIAN_FFT";
//    public static final String GYROSCOPESTAT_x_SECOND_IDX_FFT= "GyroscopeStat_x_SECOND_IDX_FFT";
//    public static final String GYROSCOPESTAT_x_SECOND_VAL_FFT= "GyroscopeStat_x_SECOND_VAL_FFT";
//    public static final String GYROSCOPESTAT_x_THIRD_IDX_FFT= "GyroscopeStat_x_THIRD_IDX_FFT";
//    public static final String GYROSCOPESTAT_x_THIRD_VAL_FFT= "GyroscopeStat_x_THIRD_VAL_FFT";
//    public static final String GYROSCOPESTAT_x_VAR= "GyroscopeStat_x_VAR";
//    public static final String GYROSCOPESTAT_x_VAR_FFT= "GyroscopeStat_x_VAR_FFT";
//    public static final String GYROSCOPESTAT_y_DC_FFT= "GyroscopeStat_y_DC_FFT";
//    public static final String GYROSCOPESTAT_y_FIRST_IDX_FFT= "GyroscopeStat_y_FIRST_IDX_FFT";
//    public static final String GYROSCOPESTAT_y_FIRST_VAL_FFT= "GyroscopeStat_y_FIRST_VAL_FFT";
//    public static final String GYROSCOPESTAT_y_FOURTH_IDX_FFT= "GyroscopeStat_y_FOURTH_IDX_FFT";
//    public static final String GYROSCOPESTAT_y_FOURTH_VAL_FFT= "GyroscopeStat_y_FOURTH_VAL_FFT";
//    public static final String GYROSCOPESTAT_y_MEAN= "GyroscopeStat_y_MEAN";
//    public static final String GYROSCOPESTAT_y_MEAN_FFT= "GyroscopeStat_y_MEAN_FFT";
//    public static final String GYROSCOPESTAT_y_MEDIAN= "GyroscopeStat_y_MEDIAN";
//    public static final String GYROSCOPESTAT_y_MEDIAN_FFT= "GyroscopeStat_y_MEDIAN_FFT";
//    public static final String GYROSCOPESTAT_y_SECOND_IDX_FFT= "GyroscopeStat_y_SECOND_IDX_FFT";
//    public static final String GYROSCOPESTAT_y_SECOND_VAL_FFT= "GyroscopeStat_y_SECOND_VAL_FFT";
//    public static final String GYROSCOPESTAT_y_THIRD_IDX_FFT= "GyroscopeStat_y_THIRD_IDX_FFT";
//    public static final String GYROSCOPESTAT_y_THIRD_VAL_FFT= "GyroscopeStat_y_THIRD_VAL_FFT";
//    public static final String GYROSCOPESTAT_y_VAR= "GyroscopeStat_y_VAR";
//    public static final String GYROSCOPESTAT_y_VAR_FFT= "GyroscopeStat_y_VAR_FFT";
//    public static final String GYROSCOPESTAT_z_DC_FFT= "GyroscopeStat_z_DC_FFT";
//    public static final String GYROSCOPESTAT_z_FIRST_IDX_FFT= "GyroscopeStat_z_FIRST_IDX_FFT";
//    public static final String GYROSCOPESTAT_z_FIRST_VAL_FFT= "GyroscopeStat_z_FIRST_VAL_FFT";
//    public static final String GYROSCOPESTAT_z_FOURTH_IDX_FFT= "GyroscopeStat_z_FOURTH_IDX_FFT";
//    public static final String GYROSCOPESTAT_z_FOURTH_VAL_FFT= "GyroscopeStat_z_FOURTH_VAL_FFT";
//    public static final String GYROSCOPESTAT_z_MEAN= "GyroscopeStat_z_MEAN";
//    public static final String GYROSCOPESTAT_z_MEAN_FFT= "GyroscopeStat_z_MEAN_FFT";
//    public static final String GYROSCOPESTAT_z_MEDIAN= "GyroscopeStat_z_MEDIAN";
//    public static final String GYROSCOPESTAT_z_MEDIAN_FFT= "GyroscopeStat_z_MEDIAN_FFT";
//    public static final String GYROSCOPESTAT_z_SECOND_IDX_FFT= "GyroscopeStat_z_SECOND_IDX_FFT";
//    public static final String GYROSCOPESTAT_z_SECOND_VAL_FFT= "GyroscopeStat_z_SECOND_VAL_FFT";
//    public static final String GYROSCOPESTAT_z_THIRD_IDX_FFT= "GyroscopeStat_z_THIRD_IDX_FFT";
//    public static final String GYROSCOPESTAT_z_THIRD_VAL_FFT= "GyroscopeStat_z_THIRD_VAL_FFT";
//    public static final String GYROSCOPESTAT_z_VAR= "GyroscopeStat_z_VAR";
//    public static final String GYROSCOPESTAT_z_VAR_FFT= "GyroscopeStat_z_VAR_FFT";
//
//    public static final String GYROSCOPESTAT_STAT_INSERT_VALUE = "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
//    public static final String GYROSCOPESTAT_STAT_INSERT_STRING =
//                    GYROSCOPESTAT_x_DC_FFT+ "," +
//                    GYROSCOPESTAT_x_FIRST_IDX_FFT+ "," +
//                    GYROSCOPESTAT_x_FIRST_VAL_FFT+ "," +
//                    GYROSCOPESTAT_x_FOURTH_IDX_FFT+ "," +
//                    GYROSCOPESTAT_x_FOURTH_VAL_FFT+ "," +
//                    GYROSCOPESTAT_x_MEAN+ "," +
//                    GYROSCOPESTAT_x_MEAN_FFT+ "," +
//                    GYROSCOPESTAT_x_MEDIAN+ "," +
//                    GYROSCOPESTAT_x_MEDIAN_FFT+ "," +
//                    GYROSCOPESTAT_x_SECOND_IDX_FFT+ "," +
//                    GYROSCOPESTAT_x_SECOND_VAL_FFT+ "," +
//                    GYROSCOPESTAT_x_THIRD_IDX_FFT+ "," +
//                    GYROSCOPESTAT_x_THIRD_VAL_FFT+ "," +
//                    GYROSCOPESTAT_x_VAR+ "," +
//                    GYROSCOPESTAT_x_VAR_FFT+ "," +
//                    GYROSCOPESTAT_y_DC_FFT+ "," +
//                    GYROSCOPESTAT_y_FIRST_IDX_FFT+ "," +
//                    GYROSCOPESTAT_y_FIRST_VAL_FFT+ "," +
//                    GYROSCOPESTAT_y_FOURTH_IDX_FFT+ "," +
//                    GYROSCOPESTAT_y_FOURTH_VAL_FFT+ "," +
//                    GYROSCOPESTAT_y_MEAN+ "," +
//                    GYROSCOPESTAT_y_MEAN_FFT+ "," +
//                    GYROSCOPESTAT_y_MEDIAN+ "," +
//                    GYROSCOPESTAT_y_MEDIAN_FFT+ "," +
//                    GYROSCOPESTAT_y_SECOND_IDX_FFT+ "," +
//                    GYROSCOPESTAT_y_SECOND_VAL_FFT+ "," +
//                    GYROSCOPESTAT_y_THIRD_IDX_FFT+ "," +
//                    GYROSCOPESTAT_y_THIRD_VAL_FFT+ "," +
//                    GYROSCOPESTAT_y_VAR+ "," +
//                    GYROSCOPESTAT_y_VAR_FFT+ "," +
//                    GYROSCOPESTAT_z_DC_FFT+ "," +
//                    GYROSCOPESTAT_z_FIRST_IDX_FFT+ "," +
//                    GYROSCOPESTAT_z_FIRST_VAL_FFT+ "," +
//                    GYROSCOPESTAT_z_FOURTH_IDX_FFT+ "," +
//                    GYROSCOPESTAT_z_FOURTH_VAL_FFT+ "," +
//                    GYROSCOPESTAT_z_MEAN+ "," +
//                    GYROSCOPESTAT_z_MEAN_FFT+ "," +
//                    GYROSCOPESTAT_z_MEDIAN+ "," +
//                    GYROSCOPESTAT_z_MEDIAN_FFT+ "," +
//                    GYROSCOPESTAT_z_SECOND_IDX_FFT+ "," +
//                    GYROSCOPESTAT_z_SECOND_VAL_FFT+ "," +
//                    GYROSCOPESTAT_z_THIRD_IDX_FFT+ "," +
//                    GYROSCOPESTAT_z_THIRD_VAL_FFT+ "," +
//                    GYROSCOPESTAT_z_VAR+ "," +
//                    GYROSCOPESTAT_z_VAR_FFT;
//
//
//    //LightStatisticsProbe number of field number 7
//
//    public static final String LIGHTSTATISTICSPROBE_LUX_DC_FFT= "LightStatisticsProbe_lux_DC_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_FIRST_IDX_FFT= "LightStatisticsProbe_lux_FIRST_IDX_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_FIRST_VAL_FFT= "LightStatisticsProbe_lux_FIRST_VAL_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_FOURTH_IDX_FFT= "LightStatisticsProbe_lux_FOURTH_IDX_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_FOURTH_VAL_FFT= "LightStatisticsProbe_lux_FOURTH_VAL_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_MEAN= "LightStatisticsProbe_lux_MEAN";
//    public static final String LIGHTSTATISTICSPROBE_LUX_MEAN_FFT= "LightStatisticsProbe_lux_MEAN_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_MEDIAN= "LightStatisticsProbe_lux_MEDIAN";
//    public static final String LIGHTSTATISTICSPROBE_LUX_MEDIAN_FFT= "LightStatisticsProbe_lux_MEDIAN_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_SECOND_IDX_FFT= "LightStatisticsProbe_lux_SECOND_IDX_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_SECOND_VAL_FFT= "LightStatisticsProbe_lux_SECOND_VAL_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_THIRD_IDX_FFT= "LightStatisticsProbe_lux_THIRD_IDX_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_THIRD_VAL_FFT= "LightStatisticsProbe_lux_THIRD_VAL_FFT";
//    public static final String LIGHTSTATISTICSPROBE_LUX_VAR= "LightStatisticsProbe_lux_VAR";
//    public static final String LIGHTSTATISTICSPROBE_LUX_VAR_FFT= "LightStatisticsProbe_lux_VAR_FFT";
//    public static final String LIGHTSTATISTICSPROBE_STAT_INSERT_VALUE= "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
//    public static final String LIGHTSTATISTICSPROBE_STAT_INSERT_STRING=
//            LIGHTSTATISTICSPROBE_LUX_DC_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_FIRST_IDX_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_FIRST_VAL_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_FOURTH_IDX_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_FOURTH_VAL_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_MEAN+ "," +
//            LIGHTSTATISTICSPROBE_LUX_MEAN_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_MEDIAN+ "," +
//            LIGHTSTATISTICSPROBE_LUX_MEDIAN_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_SECOND_IDX_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_SECOND_VAL_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_THIRD_IDX_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_THIRD_VAL_FFT+ "," +
//            LIGHTSTATISTICSPROBE_LUX_VAR+ "," +
//            LIGHTSTATISTICSPROBE_LUX_VAR_FFT;
//
//    //GyroscopeStatisticsProbe number of field number 39
//
//    public static final String  MAGNETICFIELD_X_DC_FFT= "MagneticField_x_DC_FFT";
//    public static final String  MAGNETICFIELD_X_FIRST_IDX_FFT= "MagneticField_x_FIRST_IDX_FFT";
//    public static final String  MAGNETICFIELD_X_FIRST_VAL_FFT= "MagneticField_x_FIRST_VAL_FFT";
//    public static final String  MAGNETICFIELD_X_FOURTH_IDX_FFT= "MagneticField_x_FOURTH_IDX_FFT";
//    public static final String  MAGNETICFIELD_X_FOURTH_VAL_FFT= "MagneticField_x_FOURTH_VAL_FFT";
//    public static final String  MAGNETICFIELD_X_MEAN= "MagneticField_x_MEAN";
//    public static final String  MAGNETICFIELD_X_MEAN_FFT= "MagneticField_x_MEAN_FFT";
//    public static final String  MAGNETICFIELD_X_MEDIAN= "MagneticField_x_MEDIAN";
//    public static final String  MAGNETICFIELD_X_MEDIAN_FFT= "MagneticField_x_MEDIAN_FFT";
//    public static final String  MAGNETICFIELD_X_SECOND_IDX_FFT= "MagneticField_x_SECOND_IDX_FFT";
//    public static final String  MAGNETICFIELD_X_SECOND_VAL_FFT= "MagneticField_x_SECOND_VAL_FFT";
//    public static final String  MAGNETICFIELD_X_THIRD_IDX_FFT= "MagneticField_x_THIRD_IDX_FFT";
//    public static final String  MAGNETICFIELD_X_THIRD_VAL_FFT= "MagneticField_x_THIRD_VAL_FFT";
//    public static final String  MAGNETICFIELD_X_VAR= "MagneticField_x_VAR";
//    public static final String  MAGNETICFIELD_X_VAR_FFT= "MagneticField_x_VAR_FFT";
//    public static final String  MAGNETICFIELD_Y_DC_FFT= "MagneticField_y_DC_FFT";
//    public static final String  MAGNETICFIELD_Y_FIRST_IDX_FFT= "MagneticField_y_FIRST_IDX_FFT";
//    public static final String  MAGNETICFIELD_Y_FIRST_VAL_FFT= "MagneticField_y_FIRST_VAL_FFT";
//    public static final String  MAGNETICFIELD_Y_FOURTH_IDX_FFT= "MagneticField_y_FOURTH_IDX_FFT";
//    public static final String  MAGNETICFIELD_Y_FOURTH_VAL_FFT= "MagneticField_y_FOURTH_VAL_FFT";
//    public static final String  MAGNETICFIELD_Y_MEAN= "MagneticField_y_MEAN";
//    public static final String  MAGNETICFIELD_Y_MEAN_FFT= "MagneticField_y_MEAN_FFT";
//    public static final String  MAGNETICFIELD_Y_MEDIAN= "MagneticField_y_MEDIAN";
//    public static final String  MAGNETICFIELD_Y_MEDIAN_FFT= "MagneticField_y_MEDIAN_FFT";
//    public static final String  MAGNETICFIELD_Y_SECOND_IDX_FFT= "MagneticField_y_SECOND_IDX_FFT";
//    public static final String  MAGNETICFIELD_Y_SECOND_VAL_FFT= "MagneticField_y_SECOND_VAL_FFT";
//    public static final String  MAGNETICFIELD_Y_THIRD_IDX_FFT= "MagneticField_y_THIRD_IDX_FFT";
//    public static final String  MAGNETICFIELD_Y_THIRD_VAL_FFT= "MagneticField_y_THIRD_VAL_FFT";
//    public static final String  MAGNETICFIELD_Y_VAR= "MagneticField_y_VAR";
//    public static final String  MAGNETICFIELD_Y_VAR_FFT= "MagneticField_y_VAR_FFT";
//    public static final String  MAGNETICFIELD_Z_DC_FFT= "MagneticField_z_DC_FFT";
//    public static final String  MAGNETICFIELD_Z_FIRST_IDX_FFT= "MagneticField_z_FIRST_IDX_FFT";
//    public static final String  MAGNETICFIELD_Z_FIRST_VAL_FFT= "MagneticField_z_FIRST_VAL_FFT";
//    public static final String  MAGNETICFIELD_Z_FOURTH_IDX_FFT= "MagneticField_z_FOURTH_IDX_FFT";
//    public static final String  MAGNETICFIELD_Z_FOURTH_VAL_FFT= "MagneticField_z_FOURTH_VAL_FFT";
//    public static final String  MAGNETICFIELD_Z_MEAN= "MagneticField_z_MEAN";
//    public static final String  MAGNETICFIELD_Z_MEAN_FFT= "MagneticField_z_MEAN_FFT";
//    public static final String  MAGNETICFIELD_Z_MEDIAN= "MagneticField_z_MEDIAN";
//    public static final String  MAGNETICFIELD_Z_MEDIAN_FFT= "MagneticField_z_MEDIAN_FFT";
//    public static final String  MAGNETICFIELD_Z_SECOND_IDX_FFT= "MagneticField_z_SECOND_IDX_FFT";
//    public static final String  MAGNETICFIELD_Z_SECOND_VAL_FFT= "MagneticField_z_SECOND_VAL_FFT";
//    public static final String  MAGNETICFIELD_Z_THIRD_IDX_FFT= "MagneticField_z_THIRD_IDX_FFT";
//    public static final String  MAGNETICFIELD_Z_THIRD_VAL_FFT= "MagneticField_z_THIRD_VAL_FFT";
//    public static final String  MAGNETICFIELD_Z_VAR= "MagneticField_z_VAR";
//    public static final String  MAGNETICFIELD_Z_VAR_FFT= "MagneticField_z_VAR_FFT";
//
//    public static final String  MAGNETICFIELD_STAT_INSERT_VALUE = "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
//    public static final String  MAGNETICFIELD_STAT_INSERT_STRING =
//                     MAGNETICFIELD_X_DC_FFT+ "," +
//                     MAGNETICFIELD_X_FIRST_IDX_FFT+ "," +
//                     MAGNETICFIELD_X_FIRST_VAL_FFT+ "," +
//                     MAGNETICFIELD_X_FOURTH_IDX_FFT+ "," +
//                     MAGNETICFIELD_X_FOURTH_VAL_FFT+ "," +
//                     MAGNETICFIELD_X_MEAN+ "," +
//                     MAGNETICFIELD_X_MEAN_FFT+ "," +
//                     MAGNETICFIELD_X_MEDIAN+ "," +
//                     MAGNETICFIELD_X_MEDIAN_FFT+ "," +
//                     MAGNETICFIELD_X_SECOND_IDX_FFT+ "," +
//                     MAGNETICFIELD_X_SECOND_VAL_FFT+ "," +
//                     MAGNETICFIELD_X_THIRD_IDX_FFT+ "," +
//                     MAGNETICFIELD_X_THIRD_VAL_FFT+ "," +
//                     MAGNETICFIELD_X_VAR+ "," +
//                     MAGNETICFIELD_X_VAR_FFT+ "," +
//                     MAGNETICFIELD_Y_DC_FFT+ "," +
//                     MAGNETICFIELD_Y_FIRST_IDX_FFT+ "," +
//                     MAGNETICFIELD_Y_FIRST_VAL_FFT+ "," +
//                     MAGNETICFIELD_Y_FOURTH_IDX_FFT+ "," +
//                     MAGNETICFIELD_Y_FOURTH_VAL_FFT+ "," +
//                     MAGNETICFIELD_Y_MEAN+ "," +
//                     MAGNETICFIELD_Y_MEAN_FFT+ "," +
//                     MAGNETICFIELD_Y_MEDIAN+ "," +
//                     MAGNETICFIELD_Y_MEDIAN_FFT+ "," +
//                     MAGNETICFIELD_Y_SECOND_IDX_FFT+ "," +
//                     MAGNETICFIELD_Y_SECOND_VAL_FFT+ "," +
//                     MAGNETICFIELD_Y_THIRD_IDX_FFT+ "," +
//                     MAGNETICFIELD_Y_THIRD_VAL_FFT+ "," +
//                     MAGNETICFIELD_Y_VAR+ "," +
//                     MAGNETICFIELD_Y_VAR_FFT+ "," +
//                     MAGNETICFIELD_Z_DC_FFT+ "," +
//                     MAGNETICFIELD_Z_FIRST_IDX_FFT+ "," +
//                     MAGNETICFIELD_Z_FIRST_VAL_FFT+ "," +
//                     MAGNETICFIELD_Z_FOURTH_IDX_FFT+ "," +
//                     MAGNETICFIELD_Z_FOURTH_VAL_FFT+ "," +
//                     MAGNETICFIELD_Z_MEAN+ "," +
//                     MAGNETICFIELD_Z_MEAN_FFT+ "," +
//                     MAGNETICFIELD_Z_MEDIAN+ "," +
//                     MAGNETICFIELD_Z_MEDIAN_FFT+ "," +
//                     MAGNETICFIELD_Z_SECOND_IDX_FFT+ "," +
//                     MAGNETICFIELD_Z_SECOND_VAL_FFT+ "," +
//                     MAGNETICFIELD_Z_THIRD_IDX_FFT+ "," +
//                     MAGNETICFIELD_Z_THIRD_VAL_FFT+ "," +
//                     MAGNETICFIELD_Z_VAR+ "," +
//                     MAGNETICFIELD_Z_VAR_FFT;
//
//    // PRESSURE sensor
//
//    public static final String  PRESSURE_DC_FFT= "Pressure_DC_FFT";
//    public static final String  PRESSURE_FIRST_IDX_FFT= "Pressure_FIRST_IDX_FFT";
//    public static final String  PRESSURE_FIRST_VAL_FFT= "Pressure_FIRST_VAL_FFT";
//    public static final String  PRESSURE_FOURTH_IDX_FFT= "Pressure_FOURTH_IDX_FFT";
//    public static final String  PRESSURE_FOURTH_VAL_FFT= "Pressure_FOURTH_VAL_FFT";
//    public static final String  PRESSURE_MEAN= "Pressure_MEAN";
//    public static final String  PRESSURE_MEAN_FFT= "Pressure_MEAN_FFT";
//    public static final String  PRESSURE_MEDIAN= "Pressure_MEDIAN";
//    public static final String  PRESSURE_MEDIAN_FFT= "Pressure_MEDIAN_FFT";
//    public static final String  PRESSURE_SECOND_IDX_FFT= "Pressure_SECOND_IDX_FFT";
//    public static final String  PRESSURE_SECOND_VAL_FFT= "Pressure_SECOND_VAL_FFT";
//    public static final String  PRESSURE_THIRD_IDX_FFT= "Pressure_THIRD_IDX_FFT";
//    public static final String  PRESSURE_THIRD_VAL_FFT= "Pressure_THIRD_VAL_FFT";
//    public static final String  PRESSURE_VAR= "Pressure_VAR";
//    public static final String  PRESSURE_VAR_FFT= "Pressure_VAR_FFT";
//
//    public static final String  PRESSURE_STAT_INSERT_VALUE = "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
//    public static final String  PRESSURE_STAT_INSERT_STRING =
//                    PRESSURE_DC_FFT+ "," +
//                    PRESSURE_FIRST_IDX_FFT+ "," +
//                    PRESSURE_FIRST_VAL_FFT+ "," +
//                    PRESSURE_FOURTH_IDX_FFT+ "," +
//                    PRESSURE_FOURTH_VAL_FFT+ "," +
//                    PRESSURE_MEAN+ "," +
//                    PRESSURE_MEAN_FFT+ "," +
//                    PRESSURE_MEDIAN+ "," +
//                    PRESSURE_MEDIAN_FFT+ "," +
//                    PRESSURE_SECOND_IDX_FFT+ "," +
//                    PRESSURE_SECOND_VAL_FFT+ "," +
//                    PRESSURE_THIRD_IDX_FFT+ "," +
//                    PRESSURE_THIRD_VAL_FFT+ "," +
//                    PRESSURE_VAR+ "," +
//                    PRESSURE_VAR_FFT;
//
//
//
//    //RotationVectorStatistic snumber of field number 39
//
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_DC_FFT= "RotationVector_xSinThetaOver2_DC_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_FIRST_IDX_FFT= "RotationVector_xSinThetaOver2_FIRST_IDX_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_FIRST_VAL_FFT= "RotationVector_xSinThetaOver2_FIRST_VAL_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_FOURTH_IDX_FFT= "RotationVector_xSinThetaOver2_FOURTH_IDX_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_FOURTH_VAL_FFT= "RotationVector_xSinThetaOver2_FOURTH_VAL_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_MEAN= "RotationVector_xSinThetaOver2_MEAN";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_MEAN_FFT= "RotationVector_xSinThetaOver2_MEAN_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_MEDIAN= "RotationVector_xSinThetaOver2_MEDIAN";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_MEDIAN_FFT= "RotationVector_xSinThetaOver2_MEDIAN_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_SECOND_IDX_FFT= "RotationVector_xSinThetaOver2_SECOND_IDX_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_SECOND_VAL_FFT= "RotationVector_xSinThetaOver2_SECOND_VAL_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_THIRD_IDX_FFT= "RotationVector_xSinThetaOver2_THIRD_IDX_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_THIRD_VAL_FFT= "RotationVector_xSinThetaOver2_THIRD_VAL_FFT";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_VAR= "RotationVector_xSinThetaOver2_VAR";
//    public static final String ROTATIONVECTOR_XSINTHETAOVER2_VAR_FFT= "RotationVector_xSinThetaOver2_VAR_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_DC_FFT= "RotationVector_ySinThetaOver2_DC_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_FIRST_IDX_FFT= "RotationVector_ySinThetaOver2_FIRST_IDX_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_FIRST_VAL_FFT= "RotationVector_ySinThetaOver2_FIRST_VAL_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_FOURTH_IDX_FFT= "RotationVector_ySinThetaOver2_FOURTH_IDX_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_FOURTH_VAL_FFT= "RotationVector_ySinThetaOver2_FOURTH_VAL_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_MEAN= "RotationVector_ySinThetaOver2_MEAN";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_MEAN_FFT= "RotationVector_ySinThetaOver2_MEAN_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_MEDIAN= "RotationVector_ySinThetaOver2_MEDIAN";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_MEDIAN_FFT= "RotationVector_ySinThetaOver2_MEDIAN_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_SECOND_IDX_FFT= "RotationVector_ySinThetaOver2_SECOND_IDX_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_SECOND_VAL_FFT= "RotationVector_ySinThetaOver2_SECOND_VAL_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_THIRD_IDX_FFT= "RotationVector_ySinThetaOver2_THIRD_IDX_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_THIRD_VAL_FFT= "RotationVector_ySinThetaOver2_THIRD_VAL_FFT";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_VAR= "RotationVector_ySinThetaOver2_VAR";
//    public static final String ROTATIONVECTOR_YSINTHETAOVER2_VAR_FFT= "RotationVector_ySinThetaOver2_VAR_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_DC_FFT= "RotationVector_zSinThetaOver2_DC_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_FIRST_IDX_FFT= "RotationVector_zSinThetaOver2_FIRST_IDX_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_FIRST_VAL_FFT= "RotationVector_zSinThetaOver2_FIRST_VAL_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_FOURTH_IDX_FFT= "RotationVector_zSinThetaOver2_FOURTH_IDX_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_FOURTH_VAL_FFT= "RotationVector_zSinThetaOver2_FOURTH_VAL_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_MEAN= "RotationVector_zSinThetaOver2_MEAN";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_MEAN_FFT= "RotationVector_zSinThetaOver2_MEAN_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_MEDIAN= "RotationVector_zSinThetaOver2_MEDIAN";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_MEDIAN_FFT= "RotationVector_zSinThetaOver2_MEDIAN_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_SECOND_IDX_FFT= "RotationVector_zSinThetaOver2_SECOND_IDX_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_SECOND_VAL_FFT= "RotationVector_zSinThetaOver2_SECOND_VAL_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_THIRD_IDX_FFT= "RotationVector_zSinThetaOver2_THIRD_IDX_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_THIRD_VAL_FFT= "RotationVector_zSinThetaOver2_THIRD_VAL_FFT";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_VAR= "RotationVector_zSinThetaOver2_VAR";
//    public static final String ROTATIONVECTOR_ZSINTHETAOVER2_VAR_FFT= "RotationVector_zSinThetaOver2_VAR_FFT";
//
//
//    public static final String ROTATIONVECTOR_STAT_INSERT_VALUE = "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
//    public static final String ROTATIONVECTOR_STAT_INSERT_STRING =
//                    ROTATIONVECTOR_XSINTHETAOVER2_DC_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_FIRST_IDX_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_FIRST_VAL_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_FOURTH_IDX_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_FOURTH_VAL_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_MEAN+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_MEAN_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_MEDIAN+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_MEDIAN_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_SECOND_IDX_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_SECOND_VAL_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_THIRD_IDX_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_THIRD_VAL_FFT+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_VAR+ "," +
//                    ROTATIONVECTOR_XSINTHETAOVER2_VAR_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_DC_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_FIRST_IDX_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_FIRST_VAL_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_FOURTH_IDX_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_FOURTH_VAL_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_MEAN+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_MEAN_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_MEDIAN+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_MEDIAN_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_SECOND_IDX_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_SECOND_VAL_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_THIRD_IDX_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_THIRD_VAL_FFT+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_VAR+ "," +
//                    ROTATIONVECTOR_YSINTHETAOVER2_VAR_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_DC_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_FIRST_IDX_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_FIRST_VAL_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_FOURTH_IDX_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_FOURTH_VAL_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_MEAN+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_MEAN_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_MEDIAN+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_MEDIAN_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_SECOND_IDX_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_SECOND_VAL_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_THIRD_IDX_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_THIRD_VAL_FFT+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_VAR+ "," +
//                    ROTATIONVECTOR_ZSINTHETAOVER2_VAR_FFT;
//
//
//    //GooglePlayServicesLocationProbe number of field number 7
//
//    public static final String GOOGLEPLAYLOCATION_SPEED = "GooglePlayLoc_Speed";
//    public static final String GOOGLEPLAYLOCATION_UUID = "GooglePlayLoc_UUID";
//    public static final String GOOGLEPLAYLOCATION_MACCURACY = "GooglePlayLoc_mAccuracy";
//    public static final String GOOGLEPLAYLOCATION_MALTITUDE = "GooglePlayLoc_mAltitude";
//    public static final String GOOGLEPLAYLOCATION_MLATITUDE = "GooglePlayLoc_mLatitude";
//    public static final String GOOGLEPLAYLOCATION_MLONGITUDE = "GooglePlayLoc_mLongitude";
//    public static final String GOOGLEPLAYLOCATION_TIMESTAMP = "GooglePlayLoc_timestamp";
//
//    public static final String GOOGLEPLAYLOCATION_INSERT_VALUE = "?,?,?,?,?,?,?";
//    public static final String GOOGLEPLAYLOCATION_INSERT_STRING =
//            GOOGLEPLAYLOCATION_UUID + "," +
//                    GOOGLEPLAYLOCATION_SPEED + "," +
//                    GOOGLEPLAYLOCATION_MACCURACY + "," +
//                    GOOGLEPLAYLOCATION_MALTITUDE + "," +
//                    GOOGLEPLAYLOCATION_MLATITUDE + "," +
//                    GOOGLEPLAYLOCATION_MLONGITUDE + "," +
//                    GOOGLEPLAYLOCATION_TIMESTAMP;
//
//
////    //-----------------------------T1 prepareStatment:----------------------------------
//
//    //Add to the insertion and to value don't forget!!!
//    //Add only to the end or change the schema
//
//    public static final String T1_PREPARE_STAMTMENT_INSERTION = "INSERT INTO T1" + "( Userid," +
//            GOOGLEPLAYLOCATION_INSERT_STRING + "," +
//            CALLINFO_INSERT_STRING + "," +
//            SMSINFO_INSERT_STRING +
//            ")";
//    public static final String T1_PREPARE_STAMTMENT_VALUES = " values (?," +
//            GOOGLEPLAYLOCATION_INSERT_VALUE + "," +
//            //2-8//
//            CALLINFO_INSERT_VALUE + "," +
//            //9-14//
//            SMSINFO_INSERT_VALUE +
//            ")";
//
//
//    //    //-----------------------------T2 prepareStatment:----------------------------------
//
//    //Add to the insertion and to value don't forget!!!
//    //Add only to the end or change the schema
//
//    public static final String T2_PREPARE_STAMTMENT_INSERTION = "INSERT INTO T2" + "( Userid," +"UUID,"+
//            ACCELEROMETERSTAT_STAT_INSERT_STRING + "," +
//            GYROSCOPESTAT_STAT_INSERT_STRING + "," +
//            LIGHTSTATISTICSPROBE_STAT_INSERT_STRING + "," +
//            MAGNETICFIELD_STAT_INSERT_STRING + "," +
//            PRESSURE_STAT_INSERT_STRING+ "," +
//            ROTATIONVECTOR_STAT_INSERT_STRING +
//            ")";
//    public static final String T2_PREPARE_STAMTMENT_VALUES = " values (?,?," +
//            //2-7//
//            ACCELEROMETERSTAT_STAT_INSERT_VALUE + "," +
////            //8-13//
//            GYROSCOPESTAT_STAT_INSERT_VALUE + "," +
////            //14-17//
//            LIGHTSTATISTICSPROBE_STAT_INSERT_VALUE + "," +
//
//            MAGNETICFIELD_STAT_INSERT_VALUE+ "," +
////            //18-23//
//            PRESSURE_STAT_INSERT_VALUE  + "," +
////            //24-27//
//            ROTATIONVECTOR_STAT_INSERT_VALUE +
//            //28-31
//
//            ")";
//
//
////    //-----------------------------T3 prepareStatment:----------------------------------
//
//    //Add to the insertion and to value don't forget!!!
//    //Add only to the end or change the schema
//
//    public static final String T3_PREPARE_STAMTMENT_INSERTION = "INSERT INTO T3" + "( Userid," +
//            BATTERYPROB_INSERT_STRING + "," +
//            TRAFFICSTATSPROBE_INSERT_STRING + //+","+
////            ORIENTATION_STAT_INSERT_STRING +","+
////            ACCELEROMETERSTAT_STAT_INSERT_STRING +","+
////            GYROSCOPESTAT_STAT_INSERT_STRING +","+
////            LIGHTSTATISTICSPROBE_STAT_INSERT_STRING+","+
////            ROTATIONVECTORSTATISTICS_STAT_INSERT_STRING+","+
////            GOOGLEPLAYLOCATION_INSERT_STRING+
//            ")";
//    public static final String T3_PREPARE_STAMTMENT_VALUES = " values (?," +
//            //2-17
//            BATTERYPROB_INSERT_VALUE + "," +
//            //18-26
//            TRAFFICSTATSPROBE_INSERT_VALUE +//+ ","+
////            //27-64
////            ORIENTATION_STAT_INSERT_VALUE +","+
////            //65-104
////            ACCELEROMETERSTAT_STAT_INSERT_VALUE +","+
////            //105-144
////            GYROSCOPESTAT_STAT_INSERT_VALUE+","+
////            //145-151
////            LIGHTSTATISTICSPROBE_STAT_INSERT_VALUE+","+
////            //152-191
////            ROTATIONVECTORSTATISTICS_STAT_INSERT_VALUE+","+
////            //192-198
////            GOOGLEPLAYLOCATION_INSERT_VALUE+
//            ")";
//
//
//    //-----------------------------CallInfo--------------------
//
//    public static final String PROCCES_CALL_INFO_INSERT_STATMENT = "INSERT INTO CallData" + "(" +
//            "UserId" + "," +
//            "UUID" + "," +
//            "Address" + "," +
//            "Date" + "," +
//            "Duration" + "," +
//            "FromContacts" + "," +
//            "Type" +
//            ")" +
//            " values (?,?,?,?,?,?,?" + ")";
//
//    //-----------------------------SMS--------------------
//
//    public static final String PROCCES_SMS_INSERT_STATMENT = "INSERT INTO Sms" + "(" +
//            "UserId" + "," +
//            "UUID" + "," +
//            "Address" + "," +
//            "ContainsURL" + "," +
//            "Date" + "," +
//            "FromContacts" + "," +
//            "Type" +
//            ")" +
//            " values (?,?,?,?,?,?,?" + ")";
//
//    //  ---------------------------proccesTraffic------------------------
//    public static final String PROCCES_TRAFFIC_INSERT_STATMENT = "INSERT INTO ProcTraffic" + "(" +
//            "UserId" + "," +
//            "UUID" + "," +
//            "ApplicationName" + "," +
//            "CPU_USAGE" + "," +
//            "PackageName" + "," +
//            "PackageUID" + "," +
//            "UidRxBytes" + "," +
//            "UidRxPackets" + "," +
//            "UidTxBytes" + "," +
//            "UidTxPackets" + "," +
//            "cguest_time" + "," +
//            "cmaj_flt" + "," +
//            "cutime" + "," +
//            "dalvikPrivateDirty" + "," +
//            "dalvikPss" + "," +
//            "dalvikSharedDirty" + "," +
//            "guest_time" + "," +
//            "importance" + "," +
//            "importanceReasonCode" + "," +
//            "importanceReasonPid" + "," +
//            "lru" + "," +
//            "nativePrivateDirty" + "," +
//            "nativePss" + "," +
//            "nativeSharedDirty" + "," +
//            "num_threads" + "," +
//            "otherPrivateDirty" + "," +
//            "otherPss" + "," +
//            "otherSharedDirty" + "," +
//            "pgid" + "," +
//            "pid" + "," +
//            "ppid" + "," +
//            "priority" + "," +
//            "rss" + "," +
//            "rsslim" + "," +
//            "sid" + "," +
//            "start_time" + "," +
//            "state" + "," +
//            "stime" + "," +
//            "tcomm" + "," +
//            "utime" + "," +
//            "vsize" +
//            ")" +
//            " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?" + ")";
//
//
//    //---------------------------------------T2 new------------------------------
//
//    public static final String T2_STATMENT = "INSERT INTO T2" + "(" +
//            "x_DC_FFT" + "," +
//            "x_FIRST_IDX_FFT" + "," +
//            "x_FIRST_VAL_FFT" + "," +
//            "x_FOURTH_IDX_FFT" + "," +
//            "x_FOURTH_VAL_FFT" + "," +
//            "x_MEAN" + "," +
//            "x_MEAN_FFT" + "," +
//            "x_MEDIAN" + "," +
//            "x_MEDIAN_FFT" + "," +
//            "x_SECOND_IDX_FFT" + "," +
//            "x_SECOND_VAL_FFT" + "," +
//            "x_THIRD_IDX_FFT" + "," +
//            "x_THIRD_VAL_FFT" + "," +
//            "x_VAR" + "," +
//            "x_VAR_FFT" + "," +
//            "y_DC_FFT" + "," +
//            "y_FIRST_IDX_FFT" + "," +
//            "y_FIRST_VAL_FFT" + "," +
//            "y_FOURTH_IDX_FFT" + "," +
//            "y_FOURTH_VAL_FFT" + "," +
//            "y_MEAN" + "," +
//            "y_MEAN_FFT" + "," +
//            "y_MEDIAN" + "," +
//            "y_MEDIAN_FFT" + "," +
//            "y_SECOND_IDX_FFT" + "," +
//            "y_SECOND_VAL_FFT" + "," +
//            "y_THIRD_IDX_FFT" + "," +
//            "y_THIRD_VAL_FFT" + "," +
//            "y_VAR" + "," +
//            "y_VAR_FFT" + "," +
//            "z_DC_FFT" + "," +
//            "z_FIRST_IDX_FFT" + "," +
//            "z_FIRST_VAL_FFT" + "," +
//            "z_FOURTH_IDX_FFT" + "," +
//            "z_FOURTH_VAL_FFT" + "," +
//            "z_MEAN" + "," +
//            "z_MEAN_FFT" + "," +
//            "z_MEDIAN" + "," +
//            "z_MEDIAN_FFT" + "," +
//            "z_SECOND_IDX_FFT" + "," +
//            "z_SECOND_VAL_FFT" + "," +
//            "z_THIRD_IDX_FFT" + "," +
//            "z_THIRD_VAL_FFT" + "," +
//            "z_VAR" + "," +
//            "z_VAR_FFT" + "," ;
//
//
//    //---------------------------------------------------find user--------------------------------------------
//    public static final String USER_PREPARE_STAMTMENT = "select * " +
//            "FROM [sensorsProbs].[dbo].Users";
////        "Where UserName='Aladin'";
//
//}