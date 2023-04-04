
package thuchanh2;
import java.util.*;

public class Main {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLXeBus qlbus = new QLXeBus();
        while(true)
        {
            System.out.println("-----------");
            System.out.println("MENU");
            System.out.println("0. Thoat ");
            System.out.println("1. Nhap tuyen noi thanh ");
            System.out.println("2. Nhap tuyen ngoai thanh");
            System.out.println("3. Viet ra danh sach tuyen xe");
            System.out.println("4. Sua tuyen noi thanh voi ma tuyen");
            System.out.println("5. Sap xep ngoai thanh theo doanh thu");
            System.out.println("6. Tuyen noi thanh cao nhat voi so hieu");
            System.out.println("------------");
            System.out.print("Lua chon cua ban (0 - 6): ");
            int chon = Integer.parseInt(sc.nextLine());
            switch(chon)
            {
                case 0:
                    System.out.println("Tam biet");
                    System.out.println("--------");
                    System.exit(0);
                    break;
                case 1:
                    qlbus.nhapNoiThanh();
                    break;
                case 2:
                    qlbus.nhapNgoaiThanh();
                    break;
                case 3:
                    qlbus.dsTuyenXe();
                    break;
                case 4:
                    qlbus.suaNoiThanhTheoMa();
                    break;
                case 5:
                    qlbus.sxNgoaiThanh();
                    break;
                case 6:
                    qlbus.noiThanhMax();
                    break;
                default: 
                    System.out.println("Chon lai tu 0 den 6!!!");
                    break;
            }
             
        }
    }
    
}
