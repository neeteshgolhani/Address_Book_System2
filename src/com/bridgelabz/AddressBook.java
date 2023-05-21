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
    // Method to create the city dictionary
    public HashMap<String, List<Contacts>> createCityDictionary() {
        // Create a new HashMap to store the city dictionary
        HashMap<String, List<Contacts>> cityDictionary = new HashMap<>();

        // Iterate over the contactDetails list
        for (Contacts contact : contactDetails) {
            // Get the city of the contact
            String city = contact.getCity();

            // Get the list of contacts for the current city
            List<Contacts> cityContacts = cityDictionary.getOrDefault(city, new ArrayList<>());

            // Add the current contact to the cityContacts list
            cityContacts.add(contact);

            // Update the city dictionary with the updated cityContacts list
            cityDictionary.put(city, cityContacts);
        }

        // Return the city dictionary
        return cityDictionary;
    }

    // Method to create the state dictionary
    public HashMap<String, List<Contacts>> createStateDictionary() {
        // Create a new HashMap to store the state dictionary
        HashMap<String, List<Contacts>> stateDictionary = new HashMap<>();

        // Iterate over the contactDetails list
        for (Contacts contact : contactDetails) {
            // Get the state of the contact
            String state = contact.getState();

            // Get the list of contacts for the current state
            List<Contacts> stateContacts = stateDictionary.getOrDefault(state, new ArrayList<>());

            // Add the current contact to the stateContacts list
            stateContacts.add(contact);

            // Update the state dictionary with the updated stateContacts list
            stateDictionary.put(state, stateContacts);
        }

        // Return the state dictionary
        return stateDictionary;
    }

}