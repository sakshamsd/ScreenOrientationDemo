package com.example.cksya.orientationdemo;

/**
 * Created by CKSYA on 5/23/2017.
 */

class Contact {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    String name;
    String contact;

    public Contact(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }
}
