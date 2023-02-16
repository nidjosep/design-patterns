package com.designpatterns.adapters;

public class PersonAdapter extends Customer {
    private final Person person;

    public PersonAdapter(Person person) {
        this.person = person;
    }

    @Override
    public String getFirstName() {
        return person.getFullName()
                .substring(0, person.getFullName().indexOf(" "));
    }

    @Override
    public String getLastName() {
        return person.getFullName()
                .substring(person.getFullName().indexOf(" ") + 1);
    }
}
