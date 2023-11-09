/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author ASUS
 */
public class Java_Application_5 {
    
    
  
    
    
    public static void main(String[]args){
        
       String s="{\"name\":\"Ana\",\"Salary\":600000.0,\"age\":25}";
    
    Object obj=JSONValue.parse(s);
    
    JSONObject jsonObject=(JSONObject)obj;
    
    String name=(String) jsonObject.get("Name");
    
    double salary=(Double) jsonObject.get("salary");
    
    long age=(Long) jsonObject.get("age");
    
   System.out.println(name+" " +salary+" " +age);
    
  
    }
            
    }

    

