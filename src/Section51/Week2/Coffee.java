package Section51.Week2;

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

    public void setSize(int sz){
        size = sz;
    }

    //Return a string that would represent the object
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("The coffee build: ");
        for(int i = 1; i <= size; i++){
            sb.append(i).append(".");
        }
        return sb.toString();
    }
}
