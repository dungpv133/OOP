/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


public class KhachHang implements Serializable{
    private int id;
    private String ten, diaChi, sdt;
    private static int ids = 1000;

    public KhachHang() {
        id = ids++;
    }

    public KhachHang(int id, String ten, String diaChi, String sdt) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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
        KhachHang.ids = ids;
    }
    
    public Object [] toObjects()
    {
        return new Object[]
        {
          id, ten, diaChi, sdt
        };
    }
    
}
