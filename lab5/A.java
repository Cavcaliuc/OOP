package Lab5;

public class A {
//   protected String a = null;
//
//   A() {
//      a = "dorin";
////       System.out.println("c");
//   }
//
//   A(String f) {
//       a = f;
//       System.out.println("constructor");
//   }

    protected String a;
    A(String z) {
        super();
        a = z;
    }
    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                '}';
    }
}
