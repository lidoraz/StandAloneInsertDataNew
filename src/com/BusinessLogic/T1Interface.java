package com.BusinessLogic;

import com.google.gson.JsonObject;

/**
 * Created by Tomer on 3/1/2015.
 */
public interface T1Interface {
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

     void CallInfoProbe(JsonObject json, String userName, String version);

     void GooglePlayServicesLoc(JsonObject json, String userName, String version);

     void SmsInfoProbe(JsonObject json, String userName, String version) ;

     void CellTower(JsonObject json, String userName, String version);

     void WifiProb(JsonObject json, String userName, String version);

     void bluetooth(JsonObject json, String userName, String version);

     void StatusDetailsProbe(JsonObject json, String userName, String version);

}
