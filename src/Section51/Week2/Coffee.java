package Section51.Week2;

public class Coffee {
    //Attributes
    private int size;
    private String[] syrups;
    private int syrupCount;
    //Constant
    public static final int LIMIT = 5;

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
    public int getSize(){
        return size;
    }

    public void setSize(int sz){
        size = sz;
    }

    public void addSyrup(String aSyrup){
        if(syrupCount < syrups.length){
            syrups[syrupCount++] = aSyrup;
        } else{
            System.out.println("Too many syrups!");
        }
    }

    //Return a string that would represent the object
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Coffee Syrups: ");
        if(syrupCount == 0){
            sb.append("No Syrups");
        }
        for (int i = 0; i < syrupCount; i++){
            sb.append(syrups[i]).append(" ");
        }
        return sb.toString();
    }

//    public String toString(){
//        StringBuilder sb = new StringBuilder();
//        sb.append("The coffee build: ");
//        for(int i = 1; i <= size; i++){
//            sb.append(i).append(".");
//        }
//        return sb.toString();
//    }
}
