package Lab5;

public class B extends A{
    protected String b;
    B(String x) {
        super("Misaaa");
        b = x;
    }

//    B(){
//        System.out.println("b fara params e apelat");
//    }

    @Override
    public String toString() {
        return "B{" +
                "a='" + a + '\'' +
                "b='" + b + '\'' +

                '}';
    }
}
