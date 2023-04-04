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
public class NoiTuyen extends TuyenXe implements  ITinhDThu{
    private String maTuyen;
    private int soluot;

    public NoiTuyen() {
        super();
    }

    public String getMaTuyen() {
        return maTuyen;
    }

    public void setMaTuyen(String maTuyen) {
        this.maTuyen = maTuyen;
    }

    public int getSoluot() {
        return soluot;
    }

    public void setSoluot(int soluot) {
        this.soluot = soluot;
    }

    public NoiTuyen(String maTuyen, int soluot, String ma, String taixe) {
        super(ma, taixe);
        this.maTuyen = maTuyen;
        this.soluot = soluot;
    }

    public NoiTuyen(String maTuyen, int soluot) {
        this.maTuyen = maTuyen;
        this.soluot = soluot;
    }

    @Override
    public double getDoanhThu() {
        if(soluot < 5)
        {
            super.setDoanhthu(soluot * 800);
        }
        else
        {
            super.setDoanhthu(soluot * 800 / 100 * 90);
        }
        return super.getDoanhthu();
    }
    
    @Override
    public String toString() {
        return "NoiTuyen{" + "ma tuyen=" + maTuyen + ", so luot =" + soluot + '}';
    }
}
