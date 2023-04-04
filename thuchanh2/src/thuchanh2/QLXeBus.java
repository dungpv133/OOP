
package thuchanh2;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class QLXeBus implements IChucNang{
    private List <TuyenXe> ds = new ArrayList<>();
    private Scanner in = new Scanner(System.in);
    
    public QLXeBus()
    {
        
        ds.add(new NgoaiTuyen("hcm", 70, "NG22", "cccc"));
        
    }
     
    public int viTri(String ma){
        for(int i=0; i<ds.size(); i++){
            if(ds.get(i).getMa().toLowerCase().equals(ma.toLowerCase()))
                return i;
        }
        return -1;
    }
    public TuyenXe nhap()
    {
        String m;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            String chuoi = "^(NO|NG)\\d{2}$";
            System.out.print("Nhap ma: ");
            m = in.nextLine();
            if(m.matches(chuoi) )
            {
                break;
            }
            else
            {
                System.out.println("Nhap lai ma: ");
            }
        }
        System.out.print("Ho ten tai xe: ");
        String ten = in.nextLine();
        return new TuyenXe(m, ten);
    }
    
    
    @Override
    public void nhapNoiThanh() {
        TuyenXe tuyen = nhap();
        System.out.print("So hieu tuyen: ");
        String m = in.nextLine();
        System.out.print("So luot di duoc: ");
        int luot = Integer.parseInt(in.nextLine());
        ds.add(new NoiTuyen(tuyen.getMa(), luot, m, tuyen.getTaixe()));
    }

    @Override
    public void nhapNgoaiThanh() {
        TuyenXe tuyen = nhap();
        System.out.print("Noi den: ");
        String n = in.nextLine();
        System.out.print("So km di duoc: ");
        Long so = Long.parseLong(in.nextLine());
        ds.add(new NgoaiTuyen(n, so, tuyen.getMa(), tuyen.getTaixe()));
    }

    @Override
    public void dsTuyenXe() {
        for(TuyenXe t : ds)
        {
            System.out.println(t);
        }
    }

    @Override
    public void suaNoiThanhTheoMa() {
        System.out.print("Nhap ma noi thanh: ");
        String m = in.nextLine();
        System.out.print("Ho ten tai xe: ");
        String ten = in.nextLine();
        System.out.print("So hieu tuyen: ");
        String sh = in.nextLine();
        System.out.print("So luot di duoc: ");
        int luot = Integer.parseInt(in.nextLine());
    }

    @Override
    public void sxNgoaiThanh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void noiThanhMax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
