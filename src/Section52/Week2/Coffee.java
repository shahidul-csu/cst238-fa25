package Section52.Week2;

public class Coffee {
    //Attributes
    private int size;
    private String[] syrups;
    private int syrupCount;

    //Constant
    public static final int LIMIT = 3;


    //Constructor
    public Coffee(){
        size = 12;
        syrups = new String[LIMIT];
        syrupCount = 0;
    }

    public Coffee(int sz){
        size = sz;
        syrups = new String[LIMIT];
        syrupCount = 0;
    }

    //Methods

    public void addSyrup(String aSyrup){
        if(syrupCount < syrups.length){
            syrups[syrupCount++] = aSyrup;
        } else{
            System.out.println("Too Many Syrups");
        }
    }

    public int getSize(){
        return size;
    }

    public void setSize(int newSize){
        size = newSize;
    }

    //Returns a string to represent the object
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Coffee Syrups: ");
        if(syrupCount == 0){
            sb.append("No Syrups");
        }
        for(int i = 0; i < syrupCount; i++){
            sb.append(syrups[i]).append(" ");
        }
        return sb.toString();
    }

//    public String toString(){
//        StringBuilder sb = new StringBuilder();
//        sb.append("The Coffee Build: ");
//        for (int i = 1; i <= size; i++){
//            sb.append(i).append(".");
//        }
//        return sb.toString();
////        return "The coffee size " + size;
//    }
}
