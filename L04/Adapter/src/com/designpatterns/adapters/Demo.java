package com.designpatterns.adapters;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>() {{
            add(new Person("Nidhin Joseph"));
            add(new Person("Anju Jose"));
            add(new Person("Ryan N"));
        }};

        for (Person person : persons) {
            Customer customer = new PersonAdapter(person);
            System.out.printf("Last Name: %s, First Name: %s\n", customer.getLastName(), customer.getFirstName());
        }
    }
}