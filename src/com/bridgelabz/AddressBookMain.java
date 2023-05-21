package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressOfPerson1 = new AddressBook();
        addressOfPerson1.addDetails();
        addressOfPerson1.displayContacts();
        System.out.println("Enter First Name for which you want to modify info: ");
        String fName = sc.nextLine();
        addressOfPerson1.editDetails(fName);
        System.out.println("Enter First Name for which you want to delete the person: ");
        String firstNameToDelete = sc.nextLine(); // Read the first name to delete from user input
        addressOfPerson1.deleteDetails(firstNameToDelete); // Delete the person based on the first name

        System.out.println("Updated Contacts: ");
        addressOfPerson1.displayContacts(); // Display the updated contacts

        System.out.println("Updated Details: ");
        addressOfPerson1.displayContacts();
    }
}

