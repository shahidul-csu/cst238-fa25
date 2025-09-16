package Section53.Week4;

public class QueueRunner {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(12);
        q.enqueue(7);
        q.enqueue(10);
        System.out.println("Array: " + q.arrayState());
        System.out.println("Queue: " + q);
        System.out.println();
        q.dequeue();
        q.enqueue(20);
        System.out.println("Array: " + q.arrayState());
        System.out.println("Queue: " + q);
        q.enqueue(25);
        q.dequeue();
        q.enqueue(13);
        System.out.println("Array: " + q.arrayState());
        System.out.println("Queue: " + q);
    }
}
