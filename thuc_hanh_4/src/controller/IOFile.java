
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class IOFile {
    public static <T> List <T> doc(String file)
    {
        List<T> lst = new ArrayList<>();
        try {
            {
                ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
                lst = (List<T>) o.readObject();
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return lst;
    }
    
    public static <T> void viet(String file, List<T> arr)
    {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(arr);
            o.close();
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
