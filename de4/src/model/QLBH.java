/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class QLBH implements Serializable{
    
    private MatHang m;
    private NhanVien n;

    public QLBH() {
    }

    public QLBH(MatHang m, NhanVien n) {
        this.m = m;
        this.n = n;
    }

    public MatHang getM() {
        return m;
    }

    public void setM(MatHang m) {
        this.m = m;
    }

    public NhanVien getN() {
        return n;
    }

    public void setN(NhanVien n) {
        this.n = n;
    }
    
    public int getIdMatHang()
    {
        return m.getId();
    }
    
    public int getIdNhanVien()
    {
        return n.getId();
    }
    public Object [] toObjects()
    {
        return new Object[]
        {
          n.getId(), n.getTen(), m.getId(), m.getTen(), m.getNhom()
        };
    }
    
}
