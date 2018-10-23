package lab1;

public class Universities {
    String name;
    int foundationYear;
    Students[] lista;
   // Students s;

    public void printUniversity() {
        System.out.println("                "+name);
        System.out.println("_______________________________________");
        System.out.println("Year of foundation:" + foundationYear);
        System.out.println();
        System.out.println("Students enrolled in "+ name+":");
        System.out.println();
        for(Students s: lista){
            s.printStudents();
            System.out.println();
        }
        //System.out.println("First student:" + lista[0]);
        //System.out.println("Second student:" + lista[1]);
    }
}
