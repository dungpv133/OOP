/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
import java.io.*;
import java.io.Serializable;


public class MatHang implements Serializable{
    private int id;
    private String ten, nhom;
    private int gia;
    private static int ids = 1000;

    public MatHang() {
        id = ids++;
    }

    public MatHang(int id, String ten, String nhom, int gia) {
        this.id = id;
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public static int getIds() {
        return ids;
    }

    public static void setIds(int ids) {
        MatHang.ids = ids;
    }
    
    public Object [] toObjects()
    {
        return new Object[]
        {
          id, ten, nhom, gia
        };
    }
}
