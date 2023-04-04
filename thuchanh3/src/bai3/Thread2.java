
package bai3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Thread2 extends Thread{

    Data d;

    public Thread2(Data d) {
        this.d = d;
    }
    
    @Override
    public void run() {
        while(true)
        {
            synchronized(d)
            {
                d.notifyAll();
                while(d.getIdx() != 2 && d.isRunning())
                {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(!d.isRunning())
                {
                    break;
                }
                System.out.println("San xuat tui, tong tien: " + d.getTien());
                d.setTien(d.getTien() + 10);
            }
        }
    }
    
}
