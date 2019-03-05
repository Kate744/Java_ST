package stwtesting.autojava.model;

import com.google.common.collect.ForwardingList;

import java.util.*;

public class Contacts extends ForwardingList<NewContactData> {

    private List<NewContactData> delegate;

    public Contacts(Contacts contacts) {
        this.delegate = new ArrayList<NewContactData>(contacts.delegate);
    }

    public Contacts() {
        this.delegate = new ArrayList<NewContactData>();
    }


    @Override
    protected List<NewContactData> delegate() {
        return delegate;
    }

    public Contacts withAdded(NewContactData contact) {
        Contacts contacts = new Contacts(this);
        contacts.add(contact);
        return contacts;
    }

    public Contacts without(NewContactData contact) {
        Contacts contacts = new Contacts(this);
        contacts.remove(contact);
        return contacts;
    }

}
