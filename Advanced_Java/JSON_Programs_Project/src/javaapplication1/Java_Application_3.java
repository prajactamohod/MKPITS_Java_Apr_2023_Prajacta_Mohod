/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.json.simple.JSONArray;

/**
 *
 * @author ASUS
 */
public class Java_Application_3 {
    
    
    public static void main(String []args){
    
        JSONArray arr=new JSONArray();
        
        arr.add("Shalini");
        
        arr.add(new Integer(27));
        
        arr.add(new Double(700000));
        
        System.out.print(arr);
    }
    }
    

