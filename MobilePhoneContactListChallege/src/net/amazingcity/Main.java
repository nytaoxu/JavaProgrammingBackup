package net.amazingcity;

public class Main {

  public static void main(String[] args) {
    // write your code here
    MobilePhone mobilePhone = new MobilePhone();
    System.out.println(mobilePhone.getSize());
    mobilePhone.addContact("Tao", "9292907977");
    System.out.println(mobilePhone.getSize());
    mobilePhone.addContact("Tao", "9292907977");
    System.out.println(mobilePhone.getSize());
    mobilePhone.findAndUpdateContact("Tao", "9292907977", "Michael", "2129608027");
    System.out.println(mobilePhone.getSize());
    mobilePhone.removeContact("Michael", "2129608027");
    System.out.println(mobilePhone.getSize());

  }
}
