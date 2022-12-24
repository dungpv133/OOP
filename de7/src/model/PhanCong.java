/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


public class PhanCong implements Serializable{
    private DuAn d;
    private NhanVien n;
    private int ngay;
    private String viTri;

    public PhanCong() {
    }

    public PhanCong(DuAn d, NhanVien n, int ngay, String viTri) {
        this.d = d;
        this.n = n;
        this.ngay = ngay;
        this.viTri = viTri;
    }

    public DuAn getD() {
        return d;
    }

    public void setD(DuAn d) {
        this.d = d;
    }

    public NhanVien getN() {
        return n;
    }

    public void setN(NhanVien n) {
        this.n = n;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    
     public Object [] toObjects()
    {
        return new Object[]
        {
          n.getId(), n.getTen(), d.getId(), ngay, viTri
        };
    }
}
