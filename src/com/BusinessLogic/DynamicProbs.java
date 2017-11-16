package com.BusinessLogic;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.utilitys.HelpFunctions;
import com.xyz.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;


public class DynamicProbs implements DynamicProbsInterface {
    /**
     * Parse DynamicProobs
     */

    private static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(DynamicProbs.class.getName());

    private ConcurrentHashMap<Integer,Object>[] tableHashMaps=Dao.tableHashMaps;




    @Override
    public void screenOn(JsonObject json, String userName, String version) {
       // try {

            String UUID = json.get("UUID").toString().replace("\"", "");
            ScreenOn screenOn = new com.xyz.ScreenOn(userName, UUID);

        screenOn.setScreenOn(json.get("screenOn").toString());
            String StringTime = json.get("timestamp").toString().replace(".", "");
        screenOn.setTimestamp(HelpFunctions.calcTimeStamp(StringTime));

          //  entityManager.persist(ScreenOn);
        tableHashMaps[Dao._SCREENON].put(screenOn.hashCode(), screenOn);


//        } catch (EntityExistsException e) {
//
//
//        } catch (Exception e) {
//            LOGGER.warning(e.getMessage());
//        }
    }

    public void errorSensor(JsonObject json, String userName, String version) {

            String UUID = json.get("UUID").toString().replace("\"", "");
            ErrorSensor errorSensor = new com.xyz.ErrorSensor(userName, UUID);

            errorSensor.setErrorInSensor(json.get("errorInSensor").toString().replace("\"", ""));
            errorSensor.setErrorMessage(json.get("errorMessage").toString().replace("\"", ""));

           // entityManager.persist(errorSensor);
        tableHashMaps[Dao._ERRORSENSOR].put(errorSensor.hashCode(), errorSensor);

//
    }

    public void AllBroadcastProbe(JsonObject json, String userName, String version) {


//            AllBroadcastProbeId allBroadcastProbeId = new AllBroadcastProbeId();
//
//            allBroadcastProbeId.setUuid(json.get("UUID").toString().replace("\"", ""));
//            allBroadcastProbeId.setUserId(userName);
//            allBroadcastProbeId.setAction(json.get("Action").toString().replace("\"", ""));

            com.xyz.AllBroadcastProbe allBroadcastProbe;
                String UUID = json.get("UUID").toString().replace("\"", "");
                allBroadcastProbe = new com.xyz.AllBroadcastProbe(json.get("Action").toString().replace("\"", ""), userName, UUID);


                String extrasString = json.get("Extras").toString().replace("\"", "");
                if (extrasString.length() > 500)
                    allBroadcastProbe.setExtras(extrasString.substring(0, 499));
                else
                    allBroadcastProbe.setExtras(json.get("Extras").toString().replace("\"", ""));
                allBroadcastProbe.setTimestamp(json.get("timestamp").toString().replace("\"", ""));

                String StringTime = HelpFunctions.checkNull(json.get("timestamp")).replace(".", "");
                allBroadcastProbe.setTimestamp(HelpFunctions.calcTimeStamp(StringTime));

             //   entityManager.persist(allBroadcastProbe);
        tableHashMaps[Dao._ALLBROADCASTPROBE].put(allBroadcastProbe.hashCode(), allBroadcastProbe);

    }


    @Override
    public void userPresent(JsonObject json, String userName, String version) {

       // try {

            String UUID = json.get("UUID").toString().replace("\"", "");
            UserPresentProbe userPrsent = new com.xyz.UserPresentProbe(userName, UUID);


            String StringTime = json.get("timestamp").toString().replace(".", "");
            userPrsent.setTimestamp(HelpFunctions.calcTimeStamp(StringTime));

            //entityManager.persist(userPrsent);
        tableHashMaps[Dao._USERPRESENTPROBE].put(userPrsent.hashCode(), userPrsent);
          //  entityManager.flush();

//        } catch (EntityExistsException e) {
//
//        } catch (Exception e) {
//            LOGGER.warning(e.getMessage());
//        }
    }

    public void AppListProbeArray(JsonObject json, String userName, String version) {

     //   try {
            JsonObject jsonObject;
            String UUID = json.get("UUID").toString().replace("\"", "");
            JsonArray jsonArray = json.getAsJsonArray("value");
            for (JsonElement json1 : jsonArray) {
               // try {
                    jsonObject = json1.getAsJsonObject();
                    AppPackages appPackage = new com.xyz.AppPackages(jsonObject.get("AppPackage").toString().replace("\"", ""),userName, UUID);

                    appPackage.setAction(HelpFunctions.checkNull(jsonObject.get("Action")).replace("\"", ""));
                    appPackage.setAppUID(HelpFunctions.checkNull(jsonObject.get("AppUID")).replace("\"", ""));
                    appPackage.setAppName(HelpFunctions.checkNull(jsonObject.get("App_Name")).replace("\"", ""));
                    appPackage.setInstallSrc(HelpFunctions.checkNull(jsonObject.get("InstallSrc")).replace("\"", ""));
                    appPackage.setInstallTime(HelpFunctions.checkNull(jsonObject.get("InstallTime")).replace("\"", ""));
                    appPackage.setPackageHASH(HelpFunctions.checkNull(jsonObject.get("PackageHASH")).replace("\"", ""));
                    appPackage.setPermissions(HelpFunctions.checkNull(json1.getAsJsonObject().get("Permissions")).replace("\"", ""));
                    appPackage.setVersionName(HelpFunctions.checkNull(jsonObject.get("versionName")).replace("\"", ""));
                    appPackage.setVersionCode(HelpFunctions.checkNull(jsonObject.get("versionCode")).replace("\"", ""));
                    appPackage.setSherlockVersion(version);

                  //  entityManager.persist(appPackage);
                tableHashMaps[Dao._APPPACKAGES].put(appPackage.hashCode(), appPackage);


//                } catch (EntityExistsException e) {


//                }catch (Exception e) {
//                    e.printStackTrace();
//                }
            }

//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }


    public void AppListProbe(JsonObject json, String userName, String version) {

      //  try {

            String UUID = json.get("UUID").toString().replace("\"", "");
            AppPackages appPackage = new com.xyz.AppPackages(json.get("AppPackage").toString().replace("\"", ""), userName, UUID);

            appPackage.setAction(HelpFunctions.checkNull(json.get("Action")).replace("\"", ""));
            appPackage.setAppUID(HelpFunctions.checkNull(json.get("AppUID")).replace("\"", ""));
            appPackage.setAppName(HelpFunctions.checkNull(json.get("App_Name")).replace("\"", ""));
            appPackage.setInstallSrc(HelpFunctions.checkNull(json.get("InstallSrc")).replace("\"", ""));
            appPackage.setInstallTime(HelpFunctions.checkNull(json.get("InstallTime")).replace("\"", ""));
            appPackage.setPackageHASH(HelpFunctions.checkNull(json.get("PackageHASH")).replace("\"", ""));
            appPackage.setPermissions(HelpFunctions.checkNull(json.get("Permissions")).replace("\"", ""));
            appPackage.setVersionName(HelpFunctions.checkNull(json.get("versionName")).replace("\"", ""));
            appPackage.setVersionCode(HelpFunctions.checkNull(json.get("versionCode")).replace("\"", ""));
            appPackage.setSherlockVersion(version);


        tableHashMaps[Dao._APPPACKAGES].put(appPackage.hashCode(), appPackage);


//        } catch (EntityExistsException e) {
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public void moriartyProb(JsonObject json1, String userName) {
        try {

            String string1 = json1.get("MoriartyClues").toString();
            if (string1.contains("}{"))
                string1 = string1.replace("}{", "},{");


            JSONArray jsonArray = new JSONArray(string1.substring(1, string1.length() - 1).replace("\\", "").replace("\"Password\"", "Password"));
            //  JSONArray jsonArray = new JSONArray(string1);
            HashSet<String> hashSet = new HashSet();

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject = jsonArray.getJSONObject(i);

                if (!hashSet.contains(jsonObject.get("UUID").toString().replace("\"", ""))) {

                    String UUID = jsonObject.get("UUID").toString().replace("\"", "");
                    MoriartyProbe moriartyProbe = new com.xyz.MoriartyProbe(userName, UUID);
                    moriartyProbe.setAction(jsonObject.get("Action").toString().replace("\"", ""));

//                        String DetailsString = jsonObject.get("Details").toString().replace("\"", "");
//                        if (DetailsString.length() > 500)
//                            moriartyProbe.setDetails(DetailsString.substring(0,499));
//                        else
                    moriartyProbe.setDetails(jsonObject.get("Details").toString().replace("\"", ""));

//                        moriartyProbe.setDetails(jsonObject.get("Details").toString().replace("\"", ""));
                    if (jsonObject.has("ActionType"))
                        moriartyProbe.setActionType(jsonObject.get("ActionType").toString().replace("\"", ""));
                    if (jsonObject.has("SessionType"))
                        moriartyProbe.setSessionType(jsonObject.get("SessionType").toString().replace("\"", ""));
                    if (jsonObject.has("Version"))
                        moriartyProbe.setVersion(jsonObject.get("Version").toString().replace("\"", ""));
                    if (jsonObject.has("SessionID"))
                        moriartyProbe.setSessionID(jsonObject.get("SessionID").toString().replace("\"", ""));
                    if (jsonObject.has("Behavior"))
                        moriartyProbe.setBehavior(jsonObject.get("Behavior").toString().replace("\"", ""));
                    tableHashMaps[Dao._MORIARTYPROBE].put(moriartyProbe.hashCode(), moriartyProbe);


                    hashSet.add(jsonObject.get("UUID").toString().replace("\"", ""));
                }
            }
        }
        catch (JSONException e){
            LOGGER.warning("NOTE : @@@moriartyProb JSONException e ");
        }


    }


    public void browserInfoProbe(JsonObject json1, String userName) {
        try {
            String jsonString;
            JSONArray jsonArray;
            HashSet<String> hashSet = new HashSet();
            HashSet<String> hashSetSearch = new HashSet();

            jsonString = json1.get("ChromeBookmarks").toString();
            jsonArray = new JSONArray(jsonString.replace("\\", ""));

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String UUID = jsonObject.get("date").toString().replace("\"", "");
                if (!hashSet.contains(UUID)) {
                    ChromeBookmarks chromeBookmarks = new com.xyz.ChromeBookmarks(UUID, userName);
                    String url = jsonObject.get("url").toString().replace("\"", "");
                    if (url.length() > 500)
                        chromeBookmarks.setUrl(url.substring(0, 499));
                    else
                        chromeBookmarks.setUrl(url);

                    tableHashMaps[Dao._CHROMEBOOKMARKS].put(chromeBookmarks.hashCode(), chromeBookmarks);

                    hashSet.add(UUID);
                }
            }

            jsonString = json1.get("DefaultBrowserBookmarks").toString();
            jsonArray = new JSONArray(jsonString.replace("\\", ""));

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String UUID = jsonObject.get("date").toString().replace("\"", "");
                if (!hashSet.contains(UUID)) {
                    ChromeBookmarks chromeBookmarks = new com.xyz.ChromeBookmarks(UUID, userName);
                    String url = jsonObject.get("url").toString().replace("\"", "");
                    if (url.length() > 500)
                        chromeBookmarks.setUrl(url.substring(0, 499));
                    else
                        chromeBookmarks.setUrl(url);

                    tableHashMaps[Dao._CHROMEBOOKMARKS].put(chromeBookmarks.hashCode(), chromeBookmarks);

                    hashSet.add(UUID);
                }
            }

            jsonString = json1.get("ChromeSearches").toString();
            jsonArray = new JSONArray(jsonString.replace("\\", ""));

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String UUID = jsonObject.get("date").toString().replace("\"", "");
                if (!hashSetSearch.contains(UUID)) {
                    BrowserSearches browserSearches = new com.xyz.BrowserSearches(UUID, userName);
                    String url = jsonObject.get("search").toString().replace("\"", "");
                    if (url.length() > 500)
                        browserSearches.setUrl(url.substring(0, 499));
                    else
                        browserSearches.setUrl(url);

                    //entityManager.persist(browserSearches);
                    tableHashMaps[Dao._BROSWERSEARCHES].put(browserSearches.hashCode(), browserSearches);

                    hashSetSearch.add(UUID);
                }
            }

            jsonString = json1.get("DefaultBrowserSearches").toString();
            jsonArray = new JSONArray(jsonString.replace("\\", ""));

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String UUID = jsonObject.get("date").toString().replace("\"", "");
                if (!hashSetSearch.contains(UUID)) {
                    BrowserSearches browserSearches = new com.xyz.BrowserSearches(UUID, userName);
                    String url = jsonObject.get("search").toString().replace("\"", "");
                    if (url.length() > 500)
                        browserSearches.setUrl(url.substring(0, 499));
                    else
                        browserSearches.setUrl(url);

                    //entityManager.persist(browserSearches);
                    tableHashMaps[Dao._BROSWERSEARCHES].put(browserSearches.hashCode(), browserSearches);

                    hashSetSearch.add(UUID);

                }
            }
            //entityManager.flush();

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}


