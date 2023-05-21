package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook {
    private List<Person> entries;

    public AddressBook() {
        entries = new ArrayList<>();
    }

    public void addPerson(Person person) {
        entries.add(person);
    }

    public void sortEntriesByName() {
        Collections.sort(entries, (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
    }

    public void printEntries() {
        entries.forEach(System.out::println);
    }
}
