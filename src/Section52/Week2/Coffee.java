package Section52.Week2;

public class Coffee {
    //Attributes
    private int size;

    //Constructor
    public Coffee(){
        size = 12;
    }

    public Coffee(int sz){
        size = sz;
    }

    //Methods
    public int getSize(){
        return size;
    }

    public void setSize(int newSize){
        size = newSize;
    }

    //Returns a string to represent the object
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("The Coffee Build: ");
        for (int i = 1; i <= size; i++){
            sb.append(i).append(".");
        }
        return sb.toString();
//        return "The coffee size " + size;
    }
}
