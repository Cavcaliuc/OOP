package Lab6;

import java.util.Date;

public class Person  {
     String title;
     String givenName;
     String middleName;
     String familyName;
     FullName name;
     Date birthDate;
     Gender gender;
     Address homeAddress;
     Phone phone;


    // METODA CARE AFISEAJA PERSOASA X LUCREAZA IN DEPARTAMENTUL Y
    public void works(Person p, Department d){
        System.out.println(p.givenName + "works in" + d.name);
    }

    }

