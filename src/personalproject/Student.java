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
public abstract class Student {
    private String fName, sName, gender, phoneNum, course, year;
    int age;
    
    Student(String fn, String sn, String gdr, int a, String phn, String crs, String yr) {
        fName = fn;
        sName = sn;
        gender = gdr;
        age = a;
        phoneNum = phn;
        course = crs;
        year = yr;
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
    
    public int getAge() {
        return age;
    }
    
    public String getNumber() {
        return phoneNum;
    }
    
    public String getCourse() {
        return course;
    }
    
    public String getYear() {
        return year;
    }
}
