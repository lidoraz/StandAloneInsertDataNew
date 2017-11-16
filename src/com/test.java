package com;

public class test {

    public static void main(String[] args){



        try{
            throw new Exception("hello");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("hello worlds");
    }
}
