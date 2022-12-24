
package model;

import java.util.*;
import java.io.*;


public class BanDoc implements Serializable{
    private int id;
    private String ten, dChi, sdt;
    private static int ids = 10000;

    public BanDoc(int id, String ten, String dChi, String sdt) {
        this.id = id;
        this.ten = ten;
        this.dChi = dChi;
        this.sdt = sdt;
    }


    public BanDoc() {
        id = ids++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getdChi() {
        return dChi;
    }

    public void setdChi(String dChi) {
        this.dChi = dChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    

    public static int getIds() {
        return ids;
    }

    public static void setIds(int ids) {
        BanDoc.ids = ids;
    }

    public Object [] toObject()
    {
        return new Object[] {
          id, ten, dChi, sdt
        };
    }
   
}
