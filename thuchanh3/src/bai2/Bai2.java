package bai2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


/**
 *
 * @author ADMIN
 */
public class Bai2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("src/src/bai2/In.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("src/src/bai2/Out.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        String line = null;
        while((line = br.readLine()) != null)
        {
            boolean sodep = true;
            for(int i = 0; i < line.length() / 2; i++)
            {
                if(line.charAt(i) != line.charAt(line.length() - 1 - i))
                {
                    sodep = false;
                    break;
                }
                int temp1 = line.charAt(i) - '0';
                int temp2 = line.charAt(line.length() - i - 1) - '0';
                if(temp1 % 2 != 0 || temp2 % 2 != 0)
                {
                    sodep = false;
                    break;
                }
            }
            if(sodep)
            {
                bw.write("dep\n");
            }
            else
            {
                bw.write("Khong dep\n");
            }
        }
        br.close();
        bw.close();
    }
}
