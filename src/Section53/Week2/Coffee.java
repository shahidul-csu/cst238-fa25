package Section53.Week2;

public class Coffee {
    //Attributes
    private int sizeInOunces;
    private String[] syrups;
    private int count;

    //Constructors
    public Coffee(){
        sizeInOunces = 12;
        syrups = new String[5];
        count = 0;
    }

    public Coffee(int size){
        sizeInOunces = size;
        syrups = new String[5];
        count = 0;
    }

    //Methods
    public int getSize(){
        return sizeInOunces;
    }

    public void setSize(int newSize){
        sizeInOunces = newSize;
    }

    public void addSyrup(String aSyrup){
        if(count < syrups.length){
            syrups[count++] = aSyrup;
        } else{
            System.out.println("Too many syrups");
        }
    }

    //Returns a string to represent an object
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Coffee Size: ").append(sizeInOunces).append(", Syrups: ");

        if(count == 0){
            sb.append("No Syrups");
        } else {
            for (int i = 0; i < count; i++){
                sb.append(syrups[i]).append(" ");
            }
        }
        return sb.toString();
//        return "Coffee Size: " + sizeInOunces;
    }
}
