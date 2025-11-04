package Section53.Week11;

public class LinkedListRunner {
    public static void main(String[] args){
//        Node n1 = new Node(2);
//        System.out.println(n1.getData());
//        System.out.println(n1.getNext());
//        System.out.println(n1.hasNext());
//
//        Node n2 = new Node(5);
//        n1.setNext(n2);
//        System.out.println("n1 hasNext? " + n1.hasNext());
//        System.out.println("n2 hasNext? " + n2.hasNext());

        LinkedList ll = new LinkedList();
        System.out.println(ll);
        ll.append(4);
        System.out.println(ll);
        ll.append(7);
        System.out.println(ll);
        ll.append(2);
        System.out.println(ll);
        ll.append(5);
        System.out.println(ll);
        System.out.println("Even Count: " + ll.countEven());
    }
}
