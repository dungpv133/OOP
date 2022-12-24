/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
import java.io.*;
public class NhanVien implements Serializable{
    
     private int id;
    private String ten, diaChi , chuyenMon;
    private static int ids = 10000;

    public NhanVien() {
    }

    public NhanVien(int id, String ten, String diaChi, String chuyenMon) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.chuyenMon = chuyenMon;
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

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
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
          id, ten, diaChi, chuyenMon
        };
    }
}
