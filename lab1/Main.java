package lab1;


public class Main {
    public static void main (String[] args) {
    Employee e1 = new Employee();
        System.out.println(e1.name);

    SimpleEmployee s1 = new SimpleEmployee();
        System.out.println(s1.name);

        Employee s2 = new SimpleEmployee();
        System.out.println(s2.name);


        System.out.println(e1.calculateTaxes());
        System.out.println(s1.calculateTaxes());
        System.out.println(s2.calculateTaxes());
    }


}
class Employee {
   public String name = "Parinte";
   public double Salary ;
   public double calculateTaxes() {
       return 20;
   }

}
class SimpleEmployee extends Employee {
    public String name = "copil";

    public double calculateTaxes() {
        return 10;
    }
}
class ManagerEmployee extends Employee{
    public String name = "copil";

}

