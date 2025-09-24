package Section51.Week5;

public class CoffeeRevisited {
    private int size;
    private Syrup[] syrups;
    private int syrupCount;

    //Static attributes belong to the class as a shared resource, can be accessed by any object
    public static final int DEFAULT_MAX_SYRUP = 3;
    private static int coffeeCount = 0;

    public CoffeeRevisited(){
        size = 12;
        syrups = new Syrup[DEFAULT_MAX_SYRUP];
        syrupCount = 0;
        coffeeCount++;
    }

    public CoffeeRevisited(int aSize){
        size = aSize;
        syrups = new Syrup[DEFAULT_MAX_SYRUP];
        syrupCount = 0;
        coffeeCount++;
    }

    //Static method belongs to the class, not any individual object
    //It can be called without creating an instance
    public static int getCoffeeCount(){
//        CoffeeRevisited c = new CoffeeRevisited();
//        c.addSyrup(new Syrup("Chocolate"));
        return coffeeCount;
    }

    public void addSyrup(Syrup aSyrup){
        if(syrupCount >= syrups.length){
            System.out.println("Too many syrups");
            return;
        }
        syrups[syrupCount++] = aSyrup;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(syrupCount == 0){
            return "No Syrups";
        }
        for(int i = 0; i < syrupCount; i++){
            sb.append(syrups[i]).append(" ");
        }
        return sb.toString();
    }
}
