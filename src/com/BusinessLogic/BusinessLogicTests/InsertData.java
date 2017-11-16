//package com.BusinessLogic.BusinessLogicTests;
//
////import com.BusinessLogic.Dao;
////import com.utilitys.LineObject;
//import com.xyz.Sms;
//
//import javax.annotation.ManagedBean;
//import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.PersistenceContext;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
///**
// * Created by Tomer on 4/24/2015.
// */
//@Stateless
//@ManagedBean
//public class InsertData {
//
//
//
//    @PersistenceContext(unitName = "my-pu")
//    private static EntityManager entityManager;
//
//
//    public static void main(String args[]) {
//
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//        EntityManager entityManager = emf.createEntityManager();
//
////TODO: cannot begin twice! only once.
//        //TODO: learn why flush throws an illigal state - in SO says it needs to by committed first.
//////TODO:each commit needs to have a begin! like in ###
//
//        Sms sms = new Sms("1","a","1234");
//        Sms sms2 = new Sms("2","a@","1234");
//
//
//        //entityManager.getTransaction().begin();
//       // System.out.println("begining first");
//        //System.out.println(entityManager.getTransaction().isActive());
//       entityManager.getTransaction().begin();
//       // entityManager.
//        System.out.println("begining twice"+entityManager.isOpen());
//        //System.out.println(entityManager.getFlushMode().name());
//        entityManager.persist(sms);
//
//       // entityManager.getTransaction().begin();
//        entityManager.flush();
//        System.out.println("finished flush");
//        //entityManager.getTransaction().commit();
//
//
//        System.out.println("commited first");
//
////        entityManager.getTransaction().begin();//todo : ###
////        entityManager.persist(sms2);
////
////        entityManager.getTransaction().commit();//todo : ###
//
////        Query q1 = entityManager.createQuery("select x.callInfoUUID FROM T1 x");
//        //List<T1> t1 = entityManager.createQuery("select x.callInfoUUID FROM T1 x" ,T1.class ).getResultList();
////        System.out.println("Total Points: " + q1.getSingleResult());
////        System.out.println(t1.get(1).toString());
//
//
//        System.out.println("trying to close entityManager");
//        entityManager.close();
//        System.out.println("entityManager is close()");
//        emf.close();
//        //read the file and insert to data queue
////        String fileName = "json\\3a5877cd64_1427903328350";
////        BufferedReader reader = null;
////        String line;
//////        Dao dao = new Dao();
////        try {
////            reader = new BufferedReader(new FileReader(fileName));
////            LineObject lineObject;
////            while ((line = reader.readLine()) != null) {
////                lineObject = new LineObject();
////                lineObject.setJson(line);
////                lineObject.setUserName(fileName.substring(0, 10));
////                String lines = lineObject.getJson().replace(" ", "");
////                String username = lineObject.getUserName();
////                dao.detectSensor(lines, username);
////            }
////        } catch (IOException e) {
////            System.out.print("exeption i reading");
////            System.out.print(e.toString());
////        } finally {
////            try {
////                reader.close();
////            } catch (Exception e) {
////                System.out.print("exeption cant close reader");
////                e.printStackTrace();
////            } catch (Throwable throwable) {
////                throwable.printStackTrace();
////            }
////
////
////        }
//    }
//}
