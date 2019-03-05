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
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<NewContactData> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(NewContactData newContactData) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends NewContactData> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends NewContactData> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public NewContactData get(int index) {
                return null;
            }

            @Override
            public NewContactData set(int index, NewContactData element) {
                return null;
            }

            @Override
            public void add(int index, NewContactData element) {

            }

            @Override
            public NewContactData remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<NewContactData> listIterator() {
                return null;
            }

            @Override
            public ListIterator<NewContactData> listIterator(int index) {
                return null;
            }

            @Override
            public List<NewContactData> subList(int fromIndex, int toIndex) {
                return null;
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
