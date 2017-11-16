package com.BusinessLogic.BusinessLogicTests;
import com.BusinessLogic.Dao;
import com.xyz.Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.concurrent.ConcurrentHashMap;

public class HiveJdbcClient {
    private static String driverName = "org.apache.hadoop.hive.jdbc.HiveDriver";

    public static void main(String[] args) throws SQLException, IOException {

        int i=5;
        //File folder=new File("/outputTSV");

        File f=new File("outputTSV\\"+i+".tsv");
        f.getParentFile().mkdir();
        f.createNewFile();
        PrintWriter writer=new PrintWriter(f);
        writer.println(50);
        writer.close();
//        ConcurrentHashMap<Integer,Object> map=new ConcurrentHashMap<>();
//        Application app=new Application();
//        app.setUuid("1235");
//        map.put(app.hashCode(),app);
//
//
//        System.out.println(map.get(app.hashCode()).toString());
//
//        ConcurrentHashMap<Integer,Object> map2=new ConcurrentHashMap<>();
//
//
//        com.xyz.T3 t3 = (com.xyz.T3) map2[Dao._T3].get(hashCode);
//        if (t3 == null) {
//            t3 = new com.xyz.T3(userName, uuid);
//            tableHashMaps[Dao._T3].put(hashCode, t3);
//        }
//        Double num=(Double)map2.get(5);
//        System.out.println( );


//        try {
//            Class.forName(driverName);
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            System.exit(1);
//        }
//        Connection con = DriverManager.getConnection("jdbc:hive://localhost:10000/default", "", "");
//        Statement stmt = con.createStatement();
//        String tableName = "testHiveDriverTable";
//        stmt.executeQuery("drop table " + tableName);
//        ResultSet res = stmt.executeQuery("create table " + tableName + " (key int, value string)");
//        // show tables
//        String sql = "show tables '" + tableName + "'";
//        System.out.println("Running: " + sql);
//        res = stmt.executeQuery(sql);
//        if (res.next()) {
//            System.out.println(res.getString(1));
//        }
//        // describe table
//        sql = "describe " + tableName;
//        System.out.println("Running: " + sql);
//        res = stmt.executeQuery(sql);
//        while (res.next()) {
//            System.out.println(res.getString(1) + "\t" + res.getString(2));
//        }
//
//        // load data into table
//        // NOTE: filepath has to be local to the hive server
//        // NOTE: /tmp/a.txt is a ctrl-A separated file with two fields per line
//        String filepath = "/tmp/a.txt";
//        sql = "load data local inpath '" + filepath + "' into table " + tableName;
//        System.out.println("Running: " + sql);
//        res = stmt.executeQuery(sql);
//
//        // select * query
//        sql = "select * from " + tableName;
//        System.out.println("Running: " + sql);
//        res = stmt.executeQuery(sql);
//        while (res.next()) {
//            System.out.println(String.valueOf(res.getInt(1)) + "\t" + res.getString(2));
//        }
//
//        // regular hive query
//        sql = "select count(1) from " + tableName;
//        System.out.println("Running: " + sql);
//        res = stmt.executeQuery(sql);
//        while (res.next()) {
//            System.out.println(res.getString(1));
//        }
    }
}