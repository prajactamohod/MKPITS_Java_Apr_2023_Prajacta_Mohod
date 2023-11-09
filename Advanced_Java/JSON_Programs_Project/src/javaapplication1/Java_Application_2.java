/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONValue;

/**
 *
 * @author ASUS
 */
public class Java_Application_2 {
    
   public static void main(String args[]){
    
   Map obj=new HashMap();
   
   obj.put("name","Prajacta Mohod");
   
   obj.put("age",new Integer(27));
   
   obj.put("salary",new Double(60000));
   
   String jsonText=JSONValue.toJSONString(obj);
   
   System.out.print(jsonText);
   
   }  
} 
    
    

    

