package net.amazingcity;

import java.util.ArrayList;

public class MobilePhone {
  private ArrayList<Contact> contactList;

  public MobilePhone() {
    this.contactList = new ArrayList<Contact>();
  }

  public int getSize() {
    return contactList.size();
  }

  public boolean addContact(String name, String phoneNumber) {
    int position = findContact(name, phoneNumber);
    if(position == -1) {
      contactList.add(new Contact(name, phoneNumber));
      return true;
    }
    System.out.println("This contact already exists.");
    return false;
  }

  public int findContact(String name, String phoneNumber) {
    for(int i = 0; i < contactList.size(); i++) {
      if(contactList.get(i).getName() == name && contactList.get(i).getPhoneNumber() == phoneNumber) {
        return i;
      }
    }
//    System.out.println("This contact cannot be found.");
    return -1;
  }

  public boolean findAndUpdateContact(String name, String phoneNumber, String newName, String newPhoneNumber) {
    int position = findContact(name, phoneNumber);
    if(position == -1) {
      System.out.println("The contact cannot be found and updated.");
      return false;
    }
    contactList.set(position, new Contact(newName, newPhoneNumber));
    return true;
  }

  public boolean removeContact(String name, String phoneNumber) {
    int position = findContact(name, phoneNumber);
    if(position == -1) {
      System.out.println("This contact cannot be found and removed.");
      return false;
    }
    contactList.remove(position);
    return true;
  }
}
