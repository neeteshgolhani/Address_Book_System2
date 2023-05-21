package com.bridgelabz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBookMain {
    public static void main(String[] args) {
        // Create multiple address books
        AddressBook addressBook1 = new AddressBook("Address Book 1");
        AddressBook addressBook2 = new AddressBook("Address Book 2");

        // Add contacts to address books
        addressBook1.addDetails();
        addressBook2.addDetails();

        // Create and display city dictionary
        HashMap<String, List<Contacts>> cityDictionary = new HashMap<>();
        cityDictionary.putAll(addressBook1.createCityDictionary());
        cityDictionary.putAll(addressBook2.createCityDictionary());

        System.out.println("City Dictionary:");
        // Iterate over the city dictionary entries
        for (Map.Entry<String, List<Contacts>> entry : cityDictionary.entrySet()) {
            // Get the city key
            String city = entry.getKey();
            // Get the list of contacts for the current city
            List<Contacts> contacts = entry.getValue();

            // Display the city
            System.out.println("City: " + city);
            // Iterate over the contacts in the current city
            for (Contacts contact : contacts) {
                // Display each contact
                System.out.println(contact);
            }
        }

        // Create and display state dictionary
        HashMap<String, List<Contacts>> stateDictionary = new HashMap<>();
        stateDictionary.putAll(addressBook1.createStateDictionary());
        stateDictionary.putAll(addressBook2.createStateDictionary());

        System.out.println("State Dictionary:");
        // Iterate over the state dictionary entries
        for (Map.Entry<String, List<Contacts>> entry : stateDictionary.entrySet()) {
            // Get the state key
            String state = entry.getKey();
            // Get the list of contacts for the current state
            List<Contacts> contacts = entry.getValue();
        }
        // Get the count of contact persons by city
        Map<String, Long> countByCity = addressBook1.getCountByCity();
        countByCity.putAll(addressBook2.getCountByCity());

        System.out.println("Count by City:");
        // Iterate over the countByCity map entries
        for (Map.Entry<String, Long> entry : countByCity.entrySet()) {
            // Get the city key and count value
            String city = entry.getKey();
            Long count = entry.getValue();

            // Display the city and count
            System.out.println("City: " + city + ", Count: " + count);
        }

        // Get the count of contact persons by state
        Map<String, Long> countByState = addressBook1.getCountByState();
        countByState.putAll(addressBook2.getCountByState());

        System.out.println("Count by State:");
        // Iterate over the countByState map entries
        for (Map.Entry<String, Long> entry : countByState.entrySet()) {
            // Get the state key and count value
            String state = entry.getKey();
            Long count = entry.getValue();

            // Display the state and count
            System.out.println("State: " + state + ", Count: " + count);
        }
    }
}