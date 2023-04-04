
package bai3;


public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        Thread1 t1 = new Thread1(d);
        Thread2 t2 = new Thread2(d);
        Thread3 t3 = new Thread3(d);
        t1.start();
        t2.start();
        t3.start();
    }
}
