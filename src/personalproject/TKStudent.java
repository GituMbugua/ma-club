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
public class TKStudent extends Student {
    String geup, belt;
    
    TKStudent(String fn, String sn, String gdr, int a, String phn, String crs, String yr, String gp, String blt) {
        super(fn, sn, gdr, a, phn, crs, yr);
        geup = gp;
        belt = blt;
    }
    
    public String getGeup() {
        return geup;
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
                + "\nGeup: " + getGeup()
                + "\nBelt: " + getBelt();
    }
}
