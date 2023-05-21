package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddressBook {
    private List<Person> entries;

    public AddressBook() {
        entries = new ArrayList<>();
    }

    public void addPerson(Person person) {
        entries.add(person);
    }

    public void sortEntriesByCity() {
        Collections.sort(entries, Comparator.comparing(Person::getCity));
    }

    public void sortEntriesByState() {
        Collections.sort(entries, Comparator.comparing(Person::getState));
    }

    public void sortEntriesByZip() {
        Collections.sort(entries, Comparator.comparing(Person::getZip));
    }
    public void printEntries() {
        entries.stream().forEach(System.out::println);
    }
}