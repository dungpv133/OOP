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
public class QLDK implements Serializable{
    
    private MonHoc mh;
    private SinhVien sv;
    private String tgian ;

    public QLDK() {
    }

    public QLDK(MonHoc mh, SinhVien sv, String tgian) {
        this.mh = mh;
        this.sv = sv;
        this.tgian = tgian;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public String getTgian() {
        return tgian;
    }

    public void setTgian(String tgian) {
        this.tgian = tgian;
    }
    
     public Object [] toObjects()
    {
      return new Object[]
      {
        mh.getId(), mh.getTen(), sv.getId(), sv.getTen(), tgian
      };
    };
}
