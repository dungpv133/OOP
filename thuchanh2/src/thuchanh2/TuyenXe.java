
package thuchanh2;
import java.util.*;


public class TuyenXe implements  Comparable<TuyenXe>{
    private String ma, taixe;
    private double doanhthu; 

    public TuyenXe(String ma, String taixe) {
        this.ma = ma;
        this.taixe = taixe;
    }

    public TuyenXe() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTaixe() {
        return taixe;
    }

    public void setTaixe(String taixe) {
        this.taixe = taixe;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }
    
    

    @Override
    public int compareTo(TuyenXe o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
