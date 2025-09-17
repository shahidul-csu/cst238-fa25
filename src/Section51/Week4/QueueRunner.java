package Section51.Week4;

public class QueueRunner {
    public static void main(String[] args){
        Queue q1 = new Queue();
        q1.enqueue(12);
        q1.enqueue(7);
        q1.enqueue(3);
        System.out.println("Array: " + q1.arrayState());
        System.out.println("Queue: " + q1);
        q1.dequeue();
        q1.enqueue(5);
        System.out.println("Array: " + q1.arrayState());
        System.out.println("Queue: " + q1);
        q1.dequeue();
        q1.enqueue(2);
        q1.enqueue(17);
        System.out.println("Array: " + q1.arrayState());
        System.out.println("Queue: " + q1);
    }
}
