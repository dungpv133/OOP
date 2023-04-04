
package thuchanh1;
import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Xau x = null;
        MaTran mt = null;
        SoThuc s = null;
        while(true)
        {
            System.out.println("------------");
        System.out.println("MENU:  ");
        System.out.println("1. Nhap vao 1 xau");
        System.out.println("2. Kiem tra xem day co phai ma sinh vien khong");
        System.out.println("3. Tach cac tu trong xau");
        System.out.println("4. Dua ra cac tu va so lan xuat hien");
        System.out.println("5. Nhap vao ma tran chu nhat A");
        System.out.println("6. Viet ra ma tran chuyen vi cua A");
        System.out.println("7. Dua ra hang chi co cac so nguyen to");
        System.out.println("8. Nhap x va epsilon");
        System.out.println("9. Tinh cos khi n vo cung lon");
            System.out.print("Lua chon cua ban: ");
            int n = sc.nextInt();
            sc.nextLine();
            switch(n)
            {
                case 0:
                    System.out.println("Xin tam biet");
                    System.exit(0);
                case 1:
                    x = new Xau(sc);
                    break;
                case 2:
                    x.ktmasv();
                    break;
                case 3:
                    x = new Xau(sc);
                    x.tachtu();
                    break;
                case 4:
                    x = new Xau(sc);
                    x.demsolan();
                    break;
                case 5:
                    mt = new MaTran(sc);
                    break;
                case 6:
                    mt.mtChuyenvi();
                    break;
                case 7:
                    mt.hangSNT();
                    break;
                case 8:
                    s = new SoThuc(sc);
                default:
                    System.out.println("Xin nhap lai");
                    break;
            }
                    
        }
    }
    
}
