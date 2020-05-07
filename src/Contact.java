import java.util.ArrayList;


public class Contact extends Person {

    private String contactLocation;
    private String contactDate;

    public Contact(){

    }

    public String getContactDate() {
        return contactDate;
    }

    public void setContactDate(String contactDate) {
        this.contactDate = contactDate;
    }

    public Contact(String contactLocation) {
        this.contactLocation = contactLocation;
    }


    public Contact(ArrayList<Symptom> symptom, String name, String address, String email, String phone, String contactLocation) {
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
