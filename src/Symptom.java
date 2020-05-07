import java.util.ArrayList;

public class Symptom {



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

//        public String printSymptomList (){
//
//        String tempString = "";
//        for(String i: SymptomList()){
//            tempString += i+"\n";
//        }
//
//        return tempString;}


}
