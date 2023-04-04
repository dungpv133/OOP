
package thuchanh1;
import java.util.*;

public class MaTran {
    int [][] a;
    int hang, cot;

    public MaTran() {
    }
    public MaTran(Scanner in)
    {
        System.out.print("Nhap so hang: ");
        hang = in.nextInt();
        in.nextLine();
        System.out.print("Nhap so cot: ");
        cot = in.nextInt();
        in.nextLine();
        a = new int [hang + 9][cot + 9];
        System.out.println("Nhap ma tran: ");
        for(int i = 0; i < hang; i++)
        {
            for(int j = 0; j < cot; j++)
            {
                System.out.print("Nhap phan tu hang " + i + " cot " + j + ": ");
                a[i][j] = in.nextInt();
            }
            in.nextLine();
        }
    }
    public void mtChuyenvi()
    {
        System.out.println("Ma tran chuyen vi la: ");
        for(int i = 0; i < cot; i++)
        {
            for(int j = 0; j < hang; j++)
            {
                System.out.print(a[j][i] + " ");
            }
            System.out.println("");
        }
    }
    public boolean snt(int n)
    {
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public void hangSNT()
    {
        ArrayList <Integer> res = new ArrayList<>();
        for(int i = 0; i < hang; i++)
        {
            boolean kt = true;
            for(int j = 0; j < cot; j++)
            {
                if(!snt(a[i][j]))
                {
                    kt = false;
                    break;
                }
            }
            if(kt)
            {
                res.add(i);
            }
        }
        if(res.size() == 0)
        {
            System.out.println("Khong co hang nao toan so nguyen to");
            return;
        }
        System.out.println("Cac hang co chua so nguyen to");
        for(int i : res)
        {
            for(int j = 0; j < cot; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
