/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
import java.io.*;

public class DuAn implements Serializable{
    
    private int id;
    private String ten, kieu;
    private long phi;
    private static int ids = 10000;

    public DuAn() {
        id = ids++;
    }

    public DuAn(int id, String ten, String kieu, long phi) {
        this.id = id;
        this.ten = ten;
        this.kieu = kieu;
        this.phi = phi;
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

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public long getPhi() {
        return phi;
    }

    public void setPhi(long phi) {
        this.phi = phi;
    }

    public static int getIds() {
        return ids;
    }

    public static void setIds(int ids) {
        DuAn.ids = ids;
    }
    
    public Object [] toObjects()
    {
        return new Object[]
        {
          id, ten, kieu, phi
        };
    }
    
}
