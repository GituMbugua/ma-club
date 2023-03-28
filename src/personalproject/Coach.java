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
public abstract class Coach {
    // private String fName, sName, address, phoneNum, discipline, belt, year, course, gender;
    private String fName, sName, gender, address, phoneNum, discipline;
    
    Coach(String fn, String sn, String gdr, String add, String phn, String disc) {
        fName = fn;
        sName = sn;
        gender = gdr;
        address = add;
        phoneNum = phn;
        discipline = disc;
    }
    
    public String getFname() {
        return fName;
    }
    
    public String getSname() {
        return sName;
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getNumber() {
        return phoneNum;
    }
        
    public String getDisc() {
        return discipline;
    }
   
}
