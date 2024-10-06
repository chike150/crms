 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crms;

/**
 *
 * @author Da Silva
 */
class user {
  private String criminal_id;
  
  private String last_name;
  
  private String first_name;
  private String middle_name;
  private byte[] image;
  private String dob;
  private String gender;
  private String address;
  private String soor;
  private String lga;
  private String statement;
  
   private String crime;
  
 

  
  public user(String ucriminal_id, String ulast_name, String ufirst_name, String umiddle_name, byte[] uimage, String udob, String ugender, String uaddress, String usoor, String ulga, String ustatement, String ucrime) {
    this.criminal_id = ucriminal_id;
    this.last_name = ulast_name;
    this.first_name = ufirst_name;
    this.middle_name = umiddle_name;
    this.image = uimage;
    this.dob = udob;
    this.gender = ugender;
    this.address = uaddress;
    this.soor = usoor;
    this.lga = ulga;
    this.statement = ustatement;
    this.crime = ucrime;
  

  }
  
  public String getcriminal_id() {
    return this.criminal_id;
  }
  
  public String getlast_name() {
    return this.last_name;
  }
  
  public String getfirst_name() {
    return this.first_name;
  }
  
  public String getmiddle_name() {
    return this.middle_name;
  }
  
  public byte[] getimage() {
    return this.image;
  }
  
  public String getdob() {
    return this.dob;
  }
  
  public String getgender() {
    return this.gender;
  }
  
  public String getaddress() {
    return this.address;
  }
  
  public String getsoor() {
    return this.soor;
  }
  
  public String getlga() {
    return this.lga;
  }
  
  public String getstatement() {
    return this.statement;
  }
  
  public String getcrime() {
    return this.crime;
  }
  
}
