/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh1;

import java.util.*;

public class SoThuc {
    float x, e;
    public SoThuc() {
    }
    SoThuc (Scanner in)
    {
        System.out.print("Nhap vao so x: ");
        x = in.nextFloat();
        in.nextLine();
        System.out.print("Nhap vao so epsilon: ");
        e = in.nextFloat();
        in.nextLine();
    }
}
