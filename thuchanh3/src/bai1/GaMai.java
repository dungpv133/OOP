
package bai1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GaMai extends Thread{

    @Override
    public void run() {
        while(true)
        {
            try {
                sleep(500);
                System.out.println("thoc thoc an an");
            } catch (InterruptedException ex) {
                Logger.getLogger(GaMai.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
