import java.util.ArrayList;

public class Contact extends Person {
    private ArrayList<Contact> contactList = new ArrayList<>();
    private String contactLocation;

    public Contact(){}
    public Contact(String contactLocation) {
        this.contactLocation = contactLocation;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public Contact(Symptom symptom, String name, String address, String email, String phone, String contactLocation) {
        super(symptom, name, address, email, phone);
        this.contactLocation = contactLocation;
    }

    public String getContactLocation() {
        return contactLocation;
    }

    public void setContactLocation(String contactLocation) {
        this.contactLocation = contactLocation;
    }


}
