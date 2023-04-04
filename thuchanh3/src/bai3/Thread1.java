/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Thread1 extends Thread{

    Data d;
    private int dem;

    public Thread1(Data d) {
        dem = 0;
        this.d = d;
    }
    
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("ss");
        synchronized(d)
        {
                while(true)
            {
                    try {
                        String t = sdf.format(new Date());
                        int temp = Integer.parseInt(t);
                        if(temp % 2 == 0)
                        {
                            System.out.println("San xuat tui");
                            d.setTui(d.getTui() + 1);
                            dem++;
                        }
                        else
                        {
                            System.out.println("San xuat giay");
                            d.setGiay((d.getGiay() + 1));
                            dem++;
                        }
                        if(d.getGiay() > 0 || d.getTui() > 0)
                        {
                            if(d.getTui() > 0)
                            {
                                d.setIdx(2);
                            }
                            if(d.getGiay() > 0)
                            {
                                d.setIdx(3);
                            }
                        }
                        
                        d.notifyAll();
                        if(dem == 20)
                        {
                            System.out.println("San xuat du 20 san pham\n");
                            System.out.println("Tong tien: " + d.getTien());
                            d.setRunning(false);
                            break;
                        }
                        d.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
               synchronized(d)
               {
                   d.notifyAll();
                   stop();
               }
        }
    }

    public Data getD() {
        return d;
    }

    public void setD(Data d) {
        this.d = d;
    }

    public int getDem() {
        return dem;
    }

    public void setDem(int dem) {
        this.dem = dem;
    }
    
}
