package Lab6;

import java.util.List;

public class Department {
    String name;
    // AGREGARE
    private List<Staff> staff;

    //CONSTRUCTOR
    Department (String name, List<Staff> staff){
        this.name = name;
        this.staff = staff;
    }

    // METODA DE RETURNARE A LISTEI DE STAFURI DIN DEPARTAMENT
    public  List<Staff> getStaff(){
        return staff;
    }

}
