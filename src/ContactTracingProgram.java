import java.util.ArrayList;
import java.util.Scanner;

public class ContactTracingProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String userInput;
        Person person1 = new Person();
        ArrayList<Contact> contactList = new ArrayList<>();
        ArrayList<String> symptomList = new ArrayList<>();



        System.out.println("\n\t\t\t\t\tCONTACT TRACING APP\n____________________________________________________________");
        System.out.println("To help contain the spread of the virus, it's important that \n" +
            "you fill out this form to provide some information regarding \nany symptoms you may " +
            "be experiencing or have experienced in \nthe last few days.");
        System.out.println("____________________________________________________________");

        System.out.println("\n\t\t\t\t\tPATIENT INFO");
        System.out.println("NAME: ");
        userInput = scn.nextLine();
        person1.setName(userInput);
        System.out.println("EMAIL address: ");
        userInput = scn.nextLine();
        person1.setEmail(userInput);
        System.out.println("HOME address: (St/House Number, City, State, ZipCode)");
        userInput = scn.nextLine();
        person1.setAddress(userInput);
        System.out.println("PHONE NUMBER: ");
        userInput = scn.nextLine();
        person1.setPhone(userInput);
        System.out.println("____________________________________________________________");

        System.out.println("\n\t\t\t\t\tSYMPTOMS INFO");

        //Go through list of symptoms in Symptom class. If they have it, ask how many
        //days and add that info to another list
        for(String element: person1.getSymptom().SymptomList()){
            System.out.println("Have you experienced "+element+"? y/n");
            userInput = scn.nextLine();
            if(userInput.equalsIgnoreCase("y")){
                System.out.println("How many days did you experience it?");
                userInput = scn.nextLine();
                symptomList.add(element+" for "+userInput+" days");
            }
        }
        System.out.println("____________________________________________________________");

        System.out.println("\n\t\t\t\t\tRECENT ENCOUNTERS INFO");
        System.out.println("Have you met or run into anybody from 2 weeks \nprior to the first symptom up until today? y/n");
        userInput = scn.nextLine();
        while(userInput.equalsIgnoreCase("y")){
            Contact contact1 = new Contact();
            contactList.add(contact1);
            System.out.println("Their NAME:");
            userInput = scn.nextLine();
            contact1.setName(userInput);
            System.out.println("Their EMAIL: ");
            userInput = scn.nextLine();
            contact1.setEmail(userInput);
            System.out.println("Their PHONE NUMBER");
            userInput = scn.nextLine();
            contact1.setPhone(userInput);
            System.out.println("Where did you meet or run into this person? ");
            userInput = scn.nextLine();
            contact1.setContactLocation(userInput);
            System.out.println("In which city and state? ");
            userInput = scn.nextLine();
            contact1.setAddress(userInput);

            System.out.println("Have you met or run into anybody else from 2 weeks \nprior to the first symptom up until today? y/n");
            userInput = scn.nextLine();
        }

        System.out.println("____________________________________________________________");

        System.out.println("\n\t\t\t\t\tPATIENT INFO");

        System.out.println("\nPatient Name: "+person1.getName()+"\nPatient Email: "+person1.getEmail()+"\nPatient Address: "+person1.getAddress()+"\nPatient Phone: "+person1.getPhone());
        System.out.println("\nList of symptoms: ");
        for (String i: symptomList){
            System.out.println(i);
        }

        System.out.println("\n***                                                    ***");

        System.out.println("\n\t\t\t\t\tCONTACTS LIST");
        for (Contact i: contactList){
            System.out.println("\nContact Name: "+ i.getName()+"\nContact Email: "+i.getEmail()+"\nContact Phone: "+i.getPhone()+
                    "\nMeeting Location: "+i.getContactLocation()+"\nCity and State: "+i.getAddress());
        }

        System.out.println("____________________________________________________________");
    }
}
