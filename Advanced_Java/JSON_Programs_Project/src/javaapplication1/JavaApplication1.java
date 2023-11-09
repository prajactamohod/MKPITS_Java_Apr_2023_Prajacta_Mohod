/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.json.simple.JSONObject;

/**
 *
 * @author ASUS
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JSONObject obj=new JSONObject();
        
        obj.put("name","Pallivi Samajwar");
        
        obj.put("age",new Integer(27));
        
        obj.put("salary",new Double(60000));
        
        System.out.print(obj);
        
        

        
        
        
        
        
        
    }
    
}
