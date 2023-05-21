package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
public class AddressBookMain {
    public static void main(String[] args) {
        // Create multiple address books
        AddressBook addressBook1 = new AddressBook("Address Book 1");
        AddressBook addressBook2 = new AddressBook("Address Book 2");

        // Add contacts to address books
        addressBook1.addDetails();
        addressBook2.addDetails();

        // Search by city
        String searchCity = "City1";
        List<Contacts> cityResults = new ArrayList<>();
        cityResults.addAll(addressBook1.searchByCity(searchCity));
        cityResults.addAll(addressBook2.searchByCity(searchCity));
        if (cityResults.isEmpty()) {
            System.out.println("No contacts found in the city: " + searchCity);
        } else {
            System.out.println("Contacts in the city: " + searchCity);
            for (Contacts contact : cityResults) {
                System.out.println(contact);
            }
        }

        // Search by state
        String searchState = "State1";
        List<Contacts> stateResults = new ArrayList<>();
        stateResults.addAll(addressBook1.searchByState(searchState));
        stateResults.addAll(addressBook2.searchByState(searchState));
        if (stateResults.isEmpty()) {
            System.out.println("No contacts found in the state: " + searchState);
        } else {
            System.out.println("Contacts in the state: " + searchState);
            for (Contacts contact : stateResults) {
                System.out.println(contact);
            }
        }
    }
}