package Lab6;

import java.util.Date;

public class Patient extends Person {
    String id;
    //FullName name;
    //Gender gender;
    //Date birthDate;
    Integer age;
    Date accepted;
    History sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;


    // METODA CARE AFISEAJA PATIENTUL X care efectuiaza o operatie Y IN OperationsStaff
    public void works(Patient p, OperationsStaff o){
        System.out.println(p.givenName + "works in" + o.name);
    }
}

