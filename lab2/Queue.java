package lab2;

import java.util.ArrayList;

public class Queue {
    int maxel;
    ArrayList <Integer> queue = new ArrayList<>();
    ArrayList <Integer> Stack = new ArrayList<>();
    
    public void push(Integer a) {
        if (queue.size() < maxel){
            queue.add(0, a);
        }else{

        }
    }
    public Integer pop(){
        Integer stock = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        return stock;
    }
    
    boolean isEmpty(){
        if (queue.size()== 0){ 
            return true;  
        } else {
            return false;
        }
    }

    boolean isFull(){
        if (queue.size()== maxel){
            return true;
        } else {
            return false;
        }
    }
    
    public void showEl(){
        for (Integer el: queue
             ) {
            System.out.println(el);
        }
    }
    
    
    Queue(){
        
    }
    Queue(int me){
        maxel = me;
        
    }


    
    
}
//School s=new School(lasm);
//public class School{
//    String name;
//    int nrStudents;
//    School(name){
//        this.name=name;
//        System.out.println("school created!");
//    }
//
//}