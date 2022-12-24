/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class NhanVien implements Serializable{
    
    private int id;
    private String ten, dChi, sdt ;
    private static int ids = 1000;

    public NhanVien() {
        id = ids++;
    }

    public NhanVien(int id, String ten, String dChi, String sdt) {
        this.id = id;
        this.ten = ten;
        this.dChi = dChi;
        this.sdt = sdt;
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
        NhanVien.ids = ids;
    }
    
    public Object [] toObjects()
    {
        return new Object[]
        {
          id, ten, dChi, sdt
        };
    }
    
}
