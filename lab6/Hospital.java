package Lab6;

import java.util.List;

public class Hospital  {
    String name;
    Address address;
    Phone phone;

        //AGREGARE
        private List<Department> departments;

        //CONSTRUCTOR
        Hospital (String name, Address address,Phone phone , List<Department> departments){
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.departments = departments;

        }

        // METODA CARE AFISEAJA PERSOASA X care LUCREAZA IN DEPARTAMENTUL Y
    public void works(Person p, Department d){
        System.out.println(p.givenName + "works in" + d.name);
    }

}


