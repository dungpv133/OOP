
package thuchanh1;

import java.util.*;
public class Xau {
    String s;

    public Xau() {
    }
    public Xau(Scanner in)
    {
        System.out.print("Nhap vao 1 xau: ");
        s = in.nextLine();
    }
    public void ktmasv()
    {
        boolean kt = true;
        s = s.toUpperCase();
        if(s.charAt(0) != 'B')
        {
            kt = false;
        }
        if((s.charAt(1) < '0' && s.charAt(1) > '9') || (s.charAt(2) < '0' && s.charAt(2) > '9'))
        {
            kt = false;
        }
        if(s.charAt(3) != 'D' || s.charAt(4) != 'C')
        {
            kt = false;
        }
        if(!s.substring(5, 7).equals("CN") && !s.substring(5, 7).equals("DT") && !s.substring(5, 7).equals("VT") && !s.substring(5, 7).equals("KT") && !s.substring(5, 7).equals("PT"))
        {
            kt = false;
        }
        if((s.charAt(7) < '0' && s.charAt(7) > '9') || (s.charAt(8) < '0' && s.charAt(8) > '9') || (s.charAt(9) < '0' && s.charAt(9) > '9') )
        {
            kt = false;
        }
        System.out.println("Day " + (kt == true ? "co" : "khong") + " la ma sinh vien");
    }
    public void tachtu()
    {
        String temp = s.trim().replaceAll("\\s\\s+", "\\s");
        String copy = s;
        System.out.println("Cac tu trong xau: ");
        String [] res = copy.split("\\s+");
        for(String i : res)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void demsolan()
    {
        String temp = s.trim().replaceAll("\\s\\s+", " ");
        String [] tu = temp.split("\\s");
        Set a = new LinkedHashSet();
        for(String i : tu)
        {
            a.add(i);
        }
        for(Object i : a)
        {
            int dem = 0;
            for(String j : tu)
            {
                if(i.equals(j))
                {
                    dem++;
                }
            }
            System.out.println("Tu " + i + " xuat hien: " + dem + " lan");
        }
    }
}
