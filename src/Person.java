import java.awt.*;
import java.util.ArrayList;

public class Person {
    Symptom symptom1 = new Symptom();

    //added Symptom Arraylist and Contact Arraylist
    //now the contacts and the symptoms are attached to
    //each individual patient
    private ArrayList<Symptom> symptom = new ArrayList<>();
    private ArrayList<Contact> contacts = new ArrayList<>();

    private String name;
    private String address;
    private String email;
    private String phone;

    public Person(){}



    public Person(ArrayList<Symptom> symptom, String name, String address, String email, String phone) {
        this.symptom = symptom;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public ArrayList<Contact> personContacts (){return contacts;}

    public ArrayList<Symptom> patientSymptoms (){return symptom;}



    public ArrayList<String> getSymptom() {
        return symptom1.SymptomList();
    }

    public void setSymptom(ArrayList<Symptom> symptom) {

        this.symptom = symptom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
