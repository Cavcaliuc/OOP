package lab2;

public class Main {
    public static void main (String[]args){

        Box box1 = new Box();
        box1.volume(box1.height,box1.length,box1.width);
        box1.surfArea(box1.height,box1.length,box1.width);

        Box box2 = new Box( 4 );
        box2.volume(box2.height,box2.width,box2.length);
        box2.surfArea(box2.height,box2.width,box2.length);

        Box box3 = new Box( 2,  4,  6 );
        box3.volume(box3.height,box3.width,box3.length);
        box3.surfArea(box3.height,box3.width,box3.length);

        Queue q1 = new Queue(100);
        q1.push(  5);
        q1.push(  3);
        q1.push(  9);
        q1.pop( );
        q1.showEl();

//        Stack s1 = new Stack ();
//



    }

}
