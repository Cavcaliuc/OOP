package lab2;

import Lab5.B;

public class Box {
    double height = 1;
    double length = 1;
    double width = 1;

    Box(){
        System.out.println("1");
    }

    Box(double len ){
        height = length = width = len;
        System.out.println("2");
    }

    Box(double h, double l, double w ){
        height = h;
        length = l;
        width = w;
        System.out.println("3");
    }

    public void volume(double height, double length, double width) {
        double a = height * length * width;
        System.out.println("The volume of the box is: " + a);
    }

    public void surfArea(double height, double length, double width) {
        double s = 2 * height * length + 2 * length * width + 2 * height * width;
        System.out.println("The area of the box is:" + s);
    }

}
