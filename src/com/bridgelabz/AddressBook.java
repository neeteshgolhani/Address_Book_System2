package com.bridgelabz;
import java.util.*;

public class AddressBook {

    private String addressBookName;
    private ArrayList<Contacts> contactDetails = new ArrayList<>();
    static ArrayList<AddressBook> addressBooks = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public AddressBook(String s) {
        this.addressBookName = addressBookName;
    }

    public String getAddressBookName() {
        return addressBookName;
    }

    public void addDetails() {
        Contacts info = new Contacts();
        System.out.println("Enter first name: ");
        info.setFirstName(sc.nextLine());
        System.out.println("Enter last name: ");
        info.setLastName(sc.nextLine());
        System.out.println("Enter address: ");
        info.setAddress(sc.nextLine());
        System.out.println("Enter city name: ");
        info.setCity(sc.nextLine());
        System.out.println("Enter state name: ");
        info.setState(sc.nextLine());
        System.out.println("Enter zip code: ");
        info.setZipCode(sc.nextLine());
        System.out.println("Enter contact no.: ");
        info.setContactNo(sc.nextLine());
        System.out.println("Enter email: ");
        info.setEmail(sc.nextLine());

        // Check for duplicate entry based on person's name
        if (contactDetails.stream().anyMatch(contact -> contact.getFullName().equalsIgnoreCase(info.getFullName()))) {
            System.out.println("Duplicate entry! Person with the same name already exists.");
        } else {
            contactDetails.add(info);
            System.out.println("Person added successfully.");
        }
    }
    public List<Contacts> searchByCity(String city) {
        List<Contacts> results = new ArrayList<>();

        for (Contacts contact : contactDetails) {
            if (contact.getCity().equalsIgnoreCase(city)) {
                results.add(contact);
            }
        }

        return results;
    }

    public List<Contacts> searchByState(String state) {
        List<Contacts> results = new ArrayList<>();

        for (Contacts contact : contactDetails) {
            if (contact.getState().equalsIgnoreCase(state)) {
                results.add(contact);
            }
        }

        return results;
    }


    public void displayContacts() {
        System.out.println(contactDetails);
    }
}