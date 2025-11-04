package Section53.Week11;

public class LinkedList {
    private Node head;

    public LinkedList(){
        head = null;
    }

    //Return the number of even in the list
    public int countEven(){
        if(isEmpty()){
            return 0;
        } else{
            int count = 0;
            Node n = head;
            //Stop the loop at the END of the list
            while(n != null){
                if(n.getData() % 2 == 0){
                    count++;
                }
                n = n.getNext();
            }
            return count;
        }
    }

    //Add new item at the end of the list
    public void append(int data){
        if(isEmpty()){
            head = new Node(data);
        } else{
            //Thi block of code (including the loop) find the last item in the list
            Node current = head;
            //Stop the loop at the last item
            while(current.hasNext()){
                current = current.getNext();
            }
            current.setNext(new Node(data));
        }
    }

    public String toString(){
        if(isEmpty()){
            return "Empty list";
        } else{
            StringBuilder sb = new StringBuilder();

            Node current = head;
//            while (current.hasNext()){ //Wrong
            while(current != null){
                sb.append(current.getData()).append(" -> ");
                current = current.getNext();
            }
            sb.append("null");
            return sb.toString();
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
}

class Node{
    //Payload
    private int data;
    //private String test;

    //Reference to the next node in the Linked List
    private Node next;

    public Node(int num){
        data = num;
        next = null;
    }

    public boolean hasNext(){
        return next != null;
    }

    public void setNext(Node n){
        next = n;
    }

    public Node getNext(){
        return next;
    }

    public int getData(){
        return data;
    }

    public String toString(){
//        return "" + data;
        return Integer.toString(data);
    }
}
