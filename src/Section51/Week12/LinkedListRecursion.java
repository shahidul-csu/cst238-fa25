package Section51.Week12;

//Outer Class
public class LinkedListRecursion <T> {
    private Node first;

    public LinkedListRecursion(){
        first = null;
    }

    //Recursively add new item at the end of the list
    public void append(T data){
        if(isEmpty()){
            first = new Node(data);
        } else{
            first.append(data);
        }
    }

    public boolean isEmpty(){
        return first == null;
    }

    public String toString(){
        if (isEmpty()){
            return "Empty List";
        } else{
            StringBuilder sb = new StringBuilder();

            Node n = first;
            while(n != null){
                sb.append(n.getData()).append(" -> ");
                n = n.getNext();
            }
            sb.append("null");
            return sb.toString();
        }
    }


    //Inner Class
    private class Node{
        //Payload
        private T data;

        //Reference
        private Node next;

        public Node(T data){
            this.data = data;
        }

        public void append(T data){
            if(!hasNext()){
                setNext(new Node(data));
            } else{
                getNext().append(data);
            }
        }

        public T getData(){
            return this.data;
        }

        public boolean hasNext(){
            return this.next != null;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public Node getNext(){
            return this.next;
        }

        public String toString(){
            return data.toString();
        }
    }
}


