/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.*;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class IOFile {
    
    public static <T> List <T> doc(String file)
    {
        List <T> list = new ArrayList<>();
        try {
            ObjectInputStream o = new ObjectInputStream(
            new FileInputStream(file));
            list = (List<T>) o.readObject();
            o.close();
        } catch (Exception e) {
        }
        return list;
    }
    
     public static <T> void viet(String file, List list)
    {
        try {
            ObjectOutputStream o = new ObjectOutputStream(
            new FileOutputStream(file));
            o.writeObject(list);
            o.close();
        } catch (Exception e) {
        }
    }
}
