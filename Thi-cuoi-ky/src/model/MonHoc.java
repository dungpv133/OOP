/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author ADMIN
 */
public class MonHoc implements Serializable{
    
    private int id;
    private String ten;
    private int soTin;
    private String loai;
    private static int ids = 100;

    public MonHoc() {
        id = ids++;
    }

    public MonHoc(int id, String ten, int soTin, String loai) {
        this.id = id;
        this.ten = ten;
        this.soTin = soTin;
        this.loai = loai;
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

    public int getSoTin() {
        return soTin;
    }

    public void setSoTin(int soTin) {
        this.soTin = soTin;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getIds() {
        return ids;
    }

    public static void setIds(int ids) {
        MonHoc.ids = ids;
    }
    
    public Object [] toObjects()
    {
      return new Object[]
      {
        id, ten, soTin, loai
      };
    };
}
