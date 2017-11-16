//package com.utilitys;
//
//import com.google.gson.Gson;
//
//import java.io.Reader;
//
///**
// * @author Barak Zacharish, created on 12/12/13 at 11:59.
// */
//public class GsonUtility {
//
//    private Gson gson;
//
//    public GsonUtility() {
//        gson = new Gson();
//        /*GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.registerTypeAdapter(WorldEntityDTO.class, new InterfaceAdapter<WorldEntityDTO>());
//        gson = gsonBuilder.create();*/
//    }
//
//    public String toJson(Object t) {
//        return gson.toJson(t);
//    }
//
//    public Object fromJson(Reader reader, Class<Object> objectClass) {
//        return gson.fromJson(reader, objectClass);
//    }
//
//    public <T> T fromJson(String JSONString, Class<T> objectClass) {
//        return gson.fromJson(JSONString, objectClass);
//    }
//}
