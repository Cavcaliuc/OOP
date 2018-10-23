package Lab5;

public class C extends B{
    protected String c;
    C(String y) {
        super("blabla");
        c = y;
    }

//    C(){
//
//    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}
