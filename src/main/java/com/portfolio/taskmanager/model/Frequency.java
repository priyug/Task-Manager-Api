package com.portfolio.taskmanager.model;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String para = "Java is easy and java is power";
        String [] words= para.toLowerCase().split("");


        HashMap<String, Integer> map = new HashMap<>();
        for(String word :words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int max= 0;
        String result="";
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                result= entry.getKey();
            }
        }

        System.out.println(result);

    }
}


