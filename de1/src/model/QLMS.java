/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

public class QLMS implements Serializable{
    private BanDoc b;
    private Sach s;
    private int soLuong;
    private String tgian;

    public QLMS() {
    }

    public QLMS(BanDoc b, Sach s, int soLuong, String tgian) {
        this.b = b;
        this.s = s;
        this.soLuong = soLuong;
        this.tgian = tgian;
    }

    public BanDoc getB() {
        return b;
    }

    public void setB(BanDoc b) {
        this.b = b;
    }

    public Sach getS() {
        return s;
    }

    public void setS(Sach s) {
        this.s = s;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTgian() {
        return tgian;
    }

    public void setTgian(String tgian) {
        this.tgian = tgian;
    }
    
    public Object[] toObject()
    {
        return new Object[]
        {
          b.getId(), b.getTen(), s.getId(), soLuong, tgian
        };
    }
    
    public int getIdBanDoc()
    {
        return b.getId();
    }
    
    public String getThongTinBanDoc()
    {
        return b.getId() + " " + b.getTen();
    }
}
