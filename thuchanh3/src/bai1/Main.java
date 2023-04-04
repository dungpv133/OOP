

package bai1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColorThread t1 = new ColorThread();
        GaMai t2 = new GaMai();
        t2.setDaemon(true);
        int num;
        t1.start();
        t2.start();
        while(sc.hasNext())
        {
            num = sc.nextInt();
            if(num == 1)
            {
                t1.suspend();
            }
            if(num == 2)
            {
                t1.resume();
            }
            if(num == 0)
            {
                t1.stop();
                break;
            }
                }
//        return;
    }
}
