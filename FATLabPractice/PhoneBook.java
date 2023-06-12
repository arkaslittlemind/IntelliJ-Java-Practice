package FATLabPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
public class PhoneBook {

    private Map<String, Contact> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContacts(String name, String phoneNumber, String emailAddress) {
        Contact contact = new Contact(name, phoneNumber, emailAddress);
        contacts.put(name, contact);
        System.out.println("Contact Added: " + name);
    }

    public void removeContact(String name) {
        if(contacts.containsKey(name)){
            contacts.remove(name);
            System.out.println("Contact Removed: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void searchContact(String name) {
        if(contacts.containsKey(name)) {
            Contact contact = contacts.get(name);
            System.out.println("Contact Found: " + name);
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("Email Address: " + contact.getEmailAddress());
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Phone Book Application");
            System.out.println("1 -> Add Contact");
            System.out.println("1 -> Remove Contact");
            System.out.println("3 -> Search Contact");
            System.out.println("4 -> Exit");

            System.out.println("Please enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Enter email address: ");
                    String emailAddress = sc.nextLine();
                    phoneBook.addContacts(name, phoneNumber, emailAddress);
                }

                case 2 -> {
                    System.out.print("Enter name: ");
                    String removeName = sc.nextLine();
                    phoneBook.removeContact(removeName);
                }

                case 3 -> {
                    System.out.print("Enter name: ");
                    String searchName = sc.nextLine();
                    phoneBook.searchContact(searchName);
                }

                case 4 -> {
                    System.out.println("Exiting Phone Book Application!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again!");
            }
            System.out.println();
        }
    }

}
