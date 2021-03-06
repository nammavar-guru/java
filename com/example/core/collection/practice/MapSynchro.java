package com.example.core.collection.practice;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
 
public class MapSynchro implements Runnable{
    private Map<String, String> testMap;
    public MapSynchro(Map<String, String> testMap){
        this.testMap = testMap;
    }
 
    public static void main(String[] args) {
        Map<String, String> testMap = new ConcurrentHashMap<String, String>();
        /// 4 threads
        Thread t1 = new Thread(new MapSynchro(testMap));
        Thread t2 = new Thread(new MapSynchro(testMap));
        Thread t3 = new Thread(new MapSynchro(testMap));
        Thread t4 = new Thread(new MapSynchro(testMap));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            System.out.println("Output hash Map");
        } catch (InterruptedException e) {    
            e.printStackTrace();
        }
        System.out.println("Size of Map is " + testMap.size());
    }
    @Override
    public void run() {
        System.out.println("in run method" + Thread.currentThread().getName());
        String str = Thread.currentThread().getName();
        for(int i = 0; i < 100; i++){
            // adding thread name to make element unique
            testMap.put(str+i, str+i);
            try {
                // delay to verify thread interference
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
