package Lab6;

public class OperationsStaff extends Staff {
    // METODA CARE AFISEAJA PATIENTUL X care efectuiaza o operatie Y IN OperationsStaff
    public void works(Patient p, OperationsStaff o){
        System.out.println(p.givenName + "works in" + o.name);
    }

}
