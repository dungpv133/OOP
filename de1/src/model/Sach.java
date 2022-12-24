
package model;

import java.util.*;
import java.io.*;


public class Sach implements Serializable{
    private int id;
    private String ten, tgia, nganh;
    private int nam, soLuong;
    private static int ids = 10000;

    public Sach(int id, String ten, String tgia, String nganh, int nam, int soLuong) {
        this.id = id;
        this.ten = ten;
        this.tgia = tgia;
        this.nganh = nganh;
        this.nam = nam;
        this.soLuong = soLuong;
    }

    public Sach() {
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

    public String getTgia() {
        return tgia;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public static int getIds() {
        return ids;
    }

    public static void setIds(int ids) {
        Sach.ids = ids;
    }

    public Object [] toObject()
    {
        return new Object[] {
          id, ten, tgia, nganh, nam, soLuong
        };
    }
   
}
