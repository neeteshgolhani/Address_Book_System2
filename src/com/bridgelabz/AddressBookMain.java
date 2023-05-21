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
        System.out.println("Updated Details: ");
        addressOfPerson1.displayContacts();
    }
}
