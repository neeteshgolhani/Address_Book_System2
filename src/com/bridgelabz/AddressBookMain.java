package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Adding persons to the address book:");
        addressBook.addDetails();

        System.out.println("Contacts in the address book:");
        addressBook.displayContacts();
    }
}