package main;

import java.net.InetAddress;

public class Main {
    public static void main ( String[] args){
        System.out.println("Hello World");
        InetAddress ip=null;
        try{
            ip = InetAddress.getByName("www.google.com");
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("Host address :" + ip.getHostAddress());                        
            System.out.println("My address :" + InetAddress.getLocalHost().getHostAddress());                        
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}