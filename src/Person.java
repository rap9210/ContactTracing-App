import java.util.ArrayList;

public class Person {
    private Symptom symptom = new Symptom();
    private String name;
    private String address;
    private String email;
    private String phone;

    public Person(){}

    public Person(Symptom symptom, String name, String address, String email, String phone) {
        this.symptom = symptom;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }


    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {

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
