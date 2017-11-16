package com.utilitys;

import com.google.gson.JsonElement;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Tomer on 1/29/2015.
 */
public class HelpFunctions {

    //private static final Logger LOGGER = Logger.getInstance(LogCategory.OPENEJB_STARTUP_CONFIG, HelpFunctions.class);

    public static String calcTimeStamp(String StringTime) {
//        if(StringTime.contains("E"))
//            return "null";
        Date time;
        Timestamp timestamp;
        try {

            while (StringTime.length() < 13) {
                StringTime += "0";
            }
           // time = new Date(Long.valueOf(StringTime.replace(".", "").trim()));
            timestamp = new Timestamp(Long.valueOf(StringTime.replace(".", "").trim()));



            return (timestamp.toString());
        }catch (Exception e){
            return "null";
        }

    }

    public static String checkNull(JsonElement jsonElement) {

        if (jsonElement==null||jsonElement.toString().equals("null"))
            return "NULL";
        else
            return jsonElement.toString();

    }
    //public static boolean checkAndInsert()


    /**
     * @param uuid
     * @param userName
     * @return integer which represents the hashcode of concatenation of 2 params
     */
    public static int generateHashCode(String uuid,String userName){
        return (uuid+userName).hashCode();
    }
    public static String checkNull(Object jsonElement) {

        if (jsonElement==null||jsonElement.toString().equals("null"))
            return "NULL";
        else
            return jsonElement.toString();

    }
}
