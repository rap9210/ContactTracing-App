import java.util.ArrayList;

public class Symptom {

    private String name;
    private String days;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public ArrayList<String> SymptomList() {

        ArrayList<String> symptomList = new ArrayList<>();


        symptomList.add("Fever");
        symptomList.add("Cough");
        symptomList.add("Shortness of breath or difficulty breathing");
        symptomList.add("Tiredness");
        symptomList.add("Aches");
        symptomList.add("Chills");
        symptomList.add("Sore throat");
        symptomList.add("Loss of smell");
        symptomList.add("Loss of taste");
        symptomList.add("Headache");
        symptomList.add("Diarrhea");
        symptomList.add("Sever Vomiting");

        return symptomList;}

}
