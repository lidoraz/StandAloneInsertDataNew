//package com.utilitys;
//
///**
// * Created by IntelliJ IDEA.
// * User: Aviram Dayan
// * Date: 23/12/12
// * Time: 15:58
// *
// *<a href=mailto:avdayan@cs.bgu.ac.il>avdayan@cs.bgu.ac.il</a>
// */
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.Produces;
//import javax.ws.rs.WebApplicationException;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.MultivaluedMap;
//import javax.ws.rs.ext.MessageBodyReader;
//import javax.ws.rs.ext.MessageBodyWriter;
//import javax.ws.rs.ext.Provider;
//import java.io.*;
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Type;
//
//
///**
// * A JAX-RS provider. The GSON is an HTTP to JSON converter.
// *
// * @author Aviram Dayan
// */
//@Provider
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
//public class GsonProvider implements MessageBodyWriter<Object>, MessageBodyReader<Object> {
//
//    private GsonUtility gson;
//
//    public GsonProvider() {
//        gson = new GsonUtility();
//    }
//
//    @Override
//    public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
//        return true;
//    }
//
//    @Override
//    public void writeTo(
//            Object t,
//            Class<?> aClass,
//            Type type,
//            Annotation[] annotations,
//            MediaType mediaType,
//            MultivaluedMap<String, Object> stringObjectMultivaluedMap,
//            OutputStream entityStream
//    ) throws IOException {
//        String json = gson.toJson(t);
//        entityStream.write(json.getBytes());
//    }
//
//    @Override
//    public long getSize(Object o, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
//        return -1;
//    }
//
//    @Override
//    public boolean isReadable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
//        return true;
//    }
//
//    @Override
//    public Object readFrom(
//            Class<Object> objectClass,
//            Type type,
//            Annotation[] annotations,
//            MediaType mediaType,
//            MultivaluedMap<String, String> stringStringMultivaluedMap,
//            InputStream inputStream
//    ) throws IOException, WebApplicationException {
//        Reader reader = new InputStreamReader(inputStream);
//        return gson.fromJson(reader, objectClass);
//    }
//}