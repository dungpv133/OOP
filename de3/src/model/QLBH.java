
package model;

import java.io.Serializable;


public class QLBH implements Serializable{
    private MatHang m;
    private KhachHang k;
    private int soLuong;

    public QLBH() {
    }

    public QLBH(MatHang m, KhachHang k, int soLuong) {
        this.m = m;
        this.k = k;
        this.soLuong = soLuong;
    }

    public MatHang getM() {
        return m;
    }

    public void setM(MatHang m) {
        this.m = m;
    }

    public KhachHang getK() {
        return k;
    }

    public void setK(KhachHang k) {
        this.k = k;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public Object [] toObjects()
    {
        return new Object[]
        {
          k.getId(), k.getTen(), m.getTen(), soLuong
        };
    }
}
