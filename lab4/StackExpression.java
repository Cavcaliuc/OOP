package lab4;

public class StackExpression {

    char[] stack = new char[1];
    int capacity = 0;

    public StackExpression() {
    }

    public boolean isEmpty() {
        return this.capacity == 0;
    }

    public void push(char token) {
        if (capacity == 0) {
            stack[0] = token;
        }  else {
            char[] newStack = new char[capacity + 1];
            System.arraycopy(stack, 0, newStack, 0, capacity);
            newStack[capacity] = token;
            stack = newStack;
        }
        capacity++;
    }

    public void pop() {
        if(capacity == 1){
            stack[0] = 0;
            capacity --;
        }else{
            char[] newStack = new char[capacity -1];
            capacity--;
            System.arraycopy(stack, 0, newStack, 0, capacity);
            stack = newStack;
        }
    }

    public char getLastElement(){

        return stack[capacity-1];
    }

}