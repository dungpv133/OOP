
package model;

import controller.TrongException;
import java.io.Serializable;

public class ViTri implements Serializable{
    private int maViTri;
    private String tenViTri;
    private long heSoThuong;
    private static int sma = 100;

    public ViTri(String tenViTri, long heSoThuong) throws TrongException {
        if(tenViTri.isEmpty())
            throw  new TrongException();
        this.tenViTri = tenViTri;
        this.heSoThuong = heSoThuong;
        this.maViTri = sma++;
    }

    public ViTri(int maViTri, String tenViTri, long heSoThuong) {
        this.maViTri = maViTri;
        this.tenViTri = tenViTri;
        this.heSoThuong = heSoThuong;
    }

    public ViTri() {
    }

    public int getMaViTri() {
        return maViTri;
    }

    public void setMaViTri(int maViTri) {
        this.maViTri = maViTri;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public long getHeSoThuong() {
        return heSoThuong;
    }

    public void setHeSoThuong(long heSoThuong) {
        this.heSoThuong = heSoThuong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ViTri.sma = sma;
    }
    
    public Object [] toObject()
    {
        return new Object[]
        {
            maViTri, tenViTri, heSoThuong
        };
    }
}
