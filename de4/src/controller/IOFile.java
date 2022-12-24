
package controller;
import java.io.*;
import java.util.*;


/**
 *
 * @author ADMIN
 */
public class IOFile {
    
    public static <T> List<T> doc(String file) throws FileNotFoundException
    {
        List <T> list = new ArrayList();
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
            list = (List<T>) o.readObject();
            o.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static <T> void viet(String file, List list) throws FileNotFoundException
    {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(list);
            o.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
