package com.bridgelabz;
import java.util.ArrayList;
public class AddressBook {
        // Declare an instance variable called 'contacts' that holds an ArrayList of Contact objects
        private ArrayList<Contact> contacts;

        // Create a constructor for AddressBook that initializes the 'contacts' ArrayList
        public AddressBook() {
            this.contacts = new ArrayList<Contact>();
        }

        // Define a method called 'addContact' that takes a Contact object as a parameter
        // and adds it to the 'contacts' ArrayList
        public void addContact(Contact contact) {
            this.contacts.add(contact);
        }

        // Define a method called 'getContacts' that returns the 'contacts' ArrayList
        public ArrayList<Contact> getContacts() {
            return this.contacts;
        }
    }