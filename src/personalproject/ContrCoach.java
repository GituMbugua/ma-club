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
public class ContrCoach extends Coach implements Payment {
    private double hours;
    private double rate;
   
    ContrCoach(String fn, String sn, String gdr, String add, String phn, String disc, double h, double rt) {
        super(fn, sn, gdr, add, phn, disc);
        hours = h;
        rate = rt;
    }
    
    public double getRate() {
        return rate;
    }
    
    public double getHours() {
        return hours;
    }
    
    @Override
    public double getEarnings() {
        return rate*hours;
    }
    
    @Override
    public String toString() {
        return "First Name: " + super.getFname()
                + "\nSecond Name: " + super.getSname()
                + "\nGender: " + super.getGender()
                + "\nAddress: " + super.getAddress()
                + "\nPhone Number: " + super.getNumber()
                + "\nDiscipline: " + super.getDisc()
                + "\nSalary: KSH" + getEarnings();
    }
}
