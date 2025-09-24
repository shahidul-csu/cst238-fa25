package Section52.Week5;

public class CoffeeRevisited {
    private int size;
    private Syrup[] syrups;
    private int syrupCount;

    // A static field is shared by all objects (belong to the class)
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

    //A static method also belong to the class, not an individual object
    //You can call static method without creating an instance
    public static int getCoffeeCount(){
//        CoffeeRevisited c = new CoffeeRevisited();
//        c.addSyrup(new Syrup("Ice"));
        return coffeeCount;
    }

    public void addSyrup(Syrup aSyrup){
        if(syrupCount >= syrups.length){
            System.out.println("Too many syrups");
            return;
        }
        syrups[syrupCount++] = aSyrup;
//        getCoffeeCount();
    }

    public String toString(){
        if(syrupCount == 0){
            return "No Syrups";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < syrupCount; i++){
            sb.append(syrups[i]).append(" ");
        }
        return sb.toString();
    }
}
