package Bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Studentt {
    
   private String Roll_no;

    
 private String NAme;
 private String Address;
 private String City;

    public Studentt() {
    }

    public Studentt(String Roll_no, String NAme, String Address, String City) {
        this.Roll_no = Roll_no;
        this.NAme = NAme;
        this.Address = Address;
        this.City = City;
    }

    public String getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(String Roll_no) {
        this.Roll_no = Roll_no;
    }

    public String getNAme() {
        return NAme;
    }

    public void setNAme(String NAme) {
        this.NAme = NAme;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    
}
