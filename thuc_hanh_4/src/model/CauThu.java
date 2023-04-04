
package model;

import controller.TrongException;
import java.io.Serializable;


public class CauThu implements Serializable{
    private int maCauThu, tuoi;
    private String hoTen, bangCap;
    private long luong;
    private static int sma = 100;

    public CauThu(int tuoi, String hoTen, String bangCap, long luong) throws TrongException {
        if(hoTen.isEmpty())
            throw new TrongException();
        this.tuoi = tuoi;
        this.hoTen = hoTen;
        this.bangCap = bangCap;
        this.luong = luong;
        this.maCauThu = sma++;
    }

    public CauThu(int maCauThu, int tuoi, String hoTen, String bangCap, long luong) {
        this.maCauThu = maCauThu;
        this.tuoi = tuoi;
        this.hoTen = hoTen;
        this.bangCap = bangCap;
        this.luong = luong;
    }

    public CauThu() {
    }

    public int getMaCauThu() {
        return maCauThu;
    }

    public void setMaCauThu(int maCauThu) {
        this.maCauThu = maCauThu;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CauThu.sma = sma;
    }
    
    public Object [] toObject()
    {
        return new Object[]
        {
            maCauThu, hoTen, tuoi, bangCap, luong
        };
    }
    
}
