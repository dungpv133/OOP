/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ColorThread extends Thread{

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try {
                
                System.out.println("\033[33m" + "Vàng");
                System.out.println("\033[31m" + "Đỏ");
                
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ColorThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
