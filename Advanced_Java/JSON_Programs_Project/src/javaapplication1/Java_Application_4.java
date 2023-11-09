/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONValue;

/**
 *
 * @author ASUS
 */
public class Java_Application_4 {
    
     public static void main(String[]args){
    
         List arr=new ArrayList();
    
         arr.add("Saloni Pachmiya");
 
         arr.add(new Integer(27));
    
         arr.add(new Double(600000));
    
         String jsonText=JSONValue.toJSONString(arr);
    
         System.out.print(jsonText);
            }
    
}
