
package linked.list.phonebook;

import java.util.Scanner;


public class Contact implements Comparable<String>{
    private String name;
    private String phoneNO;
    private String emailAddress;
    private String address;
    private String birthday;
    private String notes;
    
    
    
    public Contact() {
    }

   
    
    

    public Contact(String name, String phomeNO, String emailAddress, String address, String birthday, String notes) {
        this.name = name;
        this.phoneNO = phomeNO;
        this.emailAddress = emailAddress;
        this.address = address;
        this.birthday = birthday;
        this.notes = notes;
    }

    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhomeNO() {
        return phoneNO;
    }

    public void setPhomeNO(String phomeNO) {
        this.phoneNO = phomeNO;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
   
    
  /** public int compar(String x) {
       return this.name.compar(x);
   }**/
    
    public void read(){
     Scanner input = new Scanner(System.in)   ;
        
        System.out.print("Enter the contact's name: ");
        this.name = input.next();
        
        System.out.print("Enter the contact's phone number:");
        this.phoneNO= input.next();
        
        System.out.print("Enter the contact's email address:");
        this.emailAddress= input.next();
        
        System.out.print("Enter the contact's address:");
        this.address= input.next();
        
        System.out.print("Enter the contact's birthday:");
        this.birthday= input.next();
        
        System.out.print("Enter any notes for the contact:");
        this.notes= input.nextLine();

    }

    @Override
    public int compareTo(String n ) {
       return  this.name.compareTo(n);
    }

    
    
    
    
    
}
