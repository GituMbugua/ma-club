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
public class SalaryCoach extends Coach implements Payment {
    private double salary;
    
    SalaryCoach(String fn, String sn, String gdr, String add, String phn, String disc, double sal) {
        super(fn, sn, gdr, add, phn, disc);
        salary = sal;
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public double getEarnings() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "First Name: " + super.getFname()
                + "\nSecond Name: " + super.getSname()
                + "\nGender: " + super.getGender()
                + "\nAddress: " + super.getAddress()
                + "\nPhone Number: " + super.getNumber()
                + "\nDiscipline: " + super.getDisc()
                + "\nSalary: " + getEarnings();
    }
}
