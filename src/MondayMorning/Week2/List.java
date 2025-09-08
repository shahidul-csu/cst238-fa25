package MondayMorning.Week2;

//List is an Abstract Data Type (ADT): What?
//Ordered sequence of elements
//Operations: add an item, remove an item, find an item, etc.

// How to implement a list? -> Using Data Structure (Array, Linked List)

public class List {
    // Attributes
    private String[] data;
    private int size;
    public static final int DEFAULT_CAPACITY = 50;

    // Constructor(s)
    public List(){
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public List(int capacity){
        data = new String[capacity];
        size = 0;
    }

    //Other Methods
    public boolean isEmpty(){
        return size == 0;
//        if(size == 0){
//            return true;
//        } else{
//            return false;
//        }
    }

    //Add a new item at the end of the list
    public void append(String s){
        if(size < data.length) {
            data[size++] = s;
        } else{
            System.out.println("List is full");
        }
    }

    //Add a new item at a given position
    //0 1 2 3
    //O A B _
    //O O A B (Example to add an item at location 0)
    //K O A B
    public void insert(String s, int index){
        if(size >= data.length){
            System.out.println("List is full");
        } else if(index < 0 || index > size){
            System.out.println("Invalid index");
        } else{
            for(int i = size; i > index; i--){
                data[i] = data[i-1];
            }
            data[index] = s;
            size++;
        }
    }

    public String toString(){
        if (isEmpty()){
            return "Empty List";
        } else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < size; i++){
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }

    public static void main(String[] args){
        List list1 = new List();
        System.out.println(list1);
        List list2 = new List(10);
        System.out.println(list2);
        List list3 = new List(1000);
        System.out.println(list3);
        System.out.println(list1.isEmpty());

        list1.append("Orange");
        list1.append("Apple");
        list1.append("Banana");
        System.out.println(list1.isEmpty());
        System.out.println(list1);
        list1.insert("Kiwi", 0);
        System.out.println(list1);
    }
}
