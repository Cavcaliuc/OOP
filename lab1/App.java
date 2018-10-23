package lab1;

public class App {
    public static void main(String[] args)
    {
        Monitor first = new Monitor();
        first.name ="First";
        first.color = "Black";
        first.dimensions = 20;
        first.resolution = "32067x45637";

        first.printMonitor();
        System.out.println();
        Monitor second = new Monitor();
        second.name = "Second";
        second.color = "White";
        second.dimensions = 14;
        second.resolution = "183717x824782";

        second.printMonitor();
        System.out.println();
    Compare comparare = new Compare();
    comparare.comparedim(first, second);
    }


}








