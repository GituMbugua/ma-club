/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personalproject;

/**
 *
 * @author Gitu
 */
public class KarStudent extends Student {
    String style, kyu, belt;
    
    KarStudent(String fn, String sn, String gdr, int a, String phn, String crs, String yr, String st, String ky, String blt) {
        super(fn, sn, gdr, a, phn, crs, yr);
        style = st;
        kyu = ky;
        belt = blt;
    }
    
    public String getStyle() {
        return style;
    }
    
    public String getKyu() {
        return kyu;
    }
    
    public String getBelt() {
        return belt;
    }
    
    @Override
    public String toString() {
        return "First Name: " + super.getFname()
                + "\nSecond Name: " + super.getSname()
                + "\nGender: " + super.getGender()
                + "\nAge: " + super.getAge()
                + "\nPhone Number: " + super.getNumber()
                + "\nCourse: " + super.getCourse()
                + "\nYear: " + getYear()
                + "\nStyle: " + getStyle()
                + "\nKyu: " + getKyu()
                + "\nBelt: " + getBelt();
    }
}
