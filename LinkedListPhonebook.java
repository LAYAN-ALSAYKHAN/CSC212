
package linked.list.phonebook;


import java.util.Scanner;

public class LinkedListPhonebook {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the Linked Tree Phonebook!");
        
        
        String ch="";
        
        do
        {
            System.out.println("Please choose an option:");
            System.out.println("1.Add a contact");
            System.out.println("2.Search for a contact");
            System.out.println("3.delet a contact");
            System.out.println("4.Schedule an event");
            System.out.println("5.Print event details");
            System.out.println("6.Print contacts by first name");
            System.out.println("7.Print all events alphabetically");
            System.out.println("8.Exit");
            System.out.println();
            System.out.print("Enter choice:"); ch=input.next();
            
            
            switch(ch){
                    
                case"1":  
                    Contact c = new Contact();
                    c.read();
                    break;
                 case"8":
                     System.out.println("Goodbay!");
            }
                
            }while(!ch.equalsIgnoreCase("8"));
            
                }}
     
     
        
    
    

