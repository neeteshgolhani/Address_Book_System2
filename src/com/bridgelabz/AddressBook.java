package com.bridgelabz;

import java.io.*;
import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contacts> contactDetails = new ArrayList<>();

    public void addDetails(Contacts info) {
        contactDetails.add(info);
    }

    public void displayContacts() {
        for (Contacts contact : contactDetails) {
            System.out.println(contact);
        }
    }

    public void writeToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Contacts contact : contactDetails) {
                writer.println(contact.getFirstName());
                writer.println(contact.getLastName());
                writer.println(contact.getAddress());
                writer.println(contact.getCity());
                writer.println(contact.getState());
                writer.println(contact.getZipCode());
                writer.println(contact.getContactNo());
                writer.println(contact.getEmail());
            }
            System.out.println("Address Book has been written to the file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    public void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Contacts contact = new Contacts();
                contact.setFirstName(line);
                contact.setLastName(reader.readLine());
                contact.setAddress(reader.readLine());
                contact.setCity(reader.readLine());
                contact.setState(reader.readLine());
                contact.setZipCode(reader.readLine());
                contact.setContactNo(reader.readLine());
                contact.setEmail(reader.readLine());
                contactDetails.add(contact);
            }
            System.out.println("Address Book has been read from the file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }
    }
}