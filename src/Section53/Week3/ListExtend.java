package Section53.Week3;

//List is an Abstract Data Type (ADT): What?
//Ordered sequence of elements
//Operations: add an item, remove an item, iterate through the list, etc.

// How to implement a list? -> Using Data Structure (Array, Linked List)

public class ListExtend {
    // Attributes
    private String[] data;
    private int size;
    public static final int DEFAULT_CAPACITY = 50;

    // Constructor(s)
    public ListExtend(){
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public ListExtend(int capacity){
        data = new String[capacity];
        size = 0;
    }

    //Other Methods
    //Count the total number of characters in all the strings of the list
    public int countChar(){
        int chCount = 0;
        for(int i = 0; i < size; i++){
            chCount += data[i].length();
        }
        return chCount;
    }

    //Return a string with all the first letter of each element
    public String firstLetter(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++){
            sb.append(data[i].charAt(0));
        }
        return sb.toString();
    }

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

    //Add a new item at a given position [0 to size]
    //0 1 2 3 [Array Index]
    //O A B _
    //O O A B (Example to add an item at location 0)
    //K O A B
    public void insert(String s, int index){
        if(size >= data.length){
            System.out.println("List is full");
        } else if(index < 0 || index > size){
            System.out.println("Invalid index");
        } else{
            //Right shift
            for(int i = size; i > index; i--){
                data[i] = data[i-1];
            }
            data[index] = s;
            size++;
        }
    }

    //Remove an item, given a location
    public void delete(int index) {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (index < 0 || index >= size){ //Invalid Index
            System.out.println("Invalid Index");
        } else{
            //Left Shift
            for(int i = index; i < size - 1; i++){
                data[i] = data[i + 1];
            }
            //Assign null when you are not using a reference to an object
            data[size - 1] = null;
            size--;
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
}
