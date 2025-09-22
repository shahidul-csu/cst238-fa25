package MondayMorning.Week5;

public class StackChar {
    //Attributes
    private char[] data;
    public static final int INTIAL_CAPACITY = 10;
    private int top;

    //Constructor(s)
    public StackChar(){
        data = new char[INTIAL_CAPACITY];
        top = -1;
    }

    public StackChar(int capacity){
        data = new char[capacity];
        top = -1;
    }

    //Other methods
    public boolean isEmpty(){
        return top == -1;
    }

    public boolean push(char value){
        if(top == data.length - 1){
            System.out.println("Stack full");
            return false;
        }
        data[++top] = value;
        return true;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
        } else{
            //data[top] = null //needed is storing a object
            top--;
        }
    }

    public char top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0; // Return a garbage value
        }
        return data[top];
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();

        //Go from top to bottom
        for(int i = top; i >= 0; i--){
            sb.append(data[i]).append(" ");
        }

        return sb.toString();
    }

}
