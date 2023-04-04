/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh2;

/**
 *
 * @author ADMIN
 */
public class NgoaiTuyen extends TuyenXe implements ITinhDThu{
    private String noiden;
    private long sokm;

    public NgoaiTuyen(String ma, String taixe) {
        super(ma, taixe);
    }

    @Override
    public String toString() {
        return "NgoaiTuyen{" + "noiden=" + noiden + ", sokm=" + sokm + '}';
    }

    public NgoaiTuyen() {
    }

    public NgoaiTuyen(String noiden, long sokm, String ma, String taixe) {
        super(ma, taixe);
        this.noiden = noiden;
        this.sokm = sokm;
    }

    public NgoaiTuyen(String noiden, long sokm) {
        this.noiden = noiden;
        this.sokm = sokm;
    }

    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public long getSokm() {
        return sokm;
    }

    public void setSokm(long sokm) {
        this.sokm = sokm;
    }

    @Override
    public double getDoanhThu() {
        if(sokm < 10)
        {
            super.setDoanhthu(sokm * 100000);
        }
        else
        {
            super.setDoanhthu(sokm * 100000 / 100 * 80);
        }
        return super.getDoanhthu();
    }
    
}
