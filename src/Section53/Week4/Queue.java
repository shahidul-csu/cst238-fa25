package Section53.Week4;

public class Queue {
    private int[] data;
    public static final int DEFAULT_CAPACITY = 5;
    //Front will point to the first item in the Queue
    private int front;
    //Back will point to the next available spot
    private int back;

    public Queue(){
        data = new int[DEFAULT_CAPACITY];
        front = 0;
        back = 0;
    }

    public boolean isEmpty(){
        return front == back;
    }

    //7 3 4
    //f = 1, b = 0
    public void enqueue(int value){
        int newBack = (back + 1) % data.length; //3 % 3 = 0
        if(newBack == front){
            System.out.println("Queue is full, cannot add " + value);
            return;
        }
        data[back] = value;
        back = newBack;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else{
            front = (front + 1) % data.length;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = front; i != back; i = (i + 1) % data.length){
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }

    public String arrayState(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < data.length; i++){
            sb.append(data[i]).append(" ");
        }
        sb.append(", f: ").append(front).append(", b: ").append(back);
        return sb.toString();
    }
}
