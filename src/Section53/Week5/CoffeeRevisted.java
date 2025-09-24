package Section53.Week5;

public class CoffeeRevisted {
    private int size;
    private Syrup[] syrups;
    private int syrupCount;
    // A static field is shared by all objects of this class (belongs to the class itself)
    public static final int DEFAULT_MAX_SYRUP = 3;
    private static int coffeeCount = 0;

    public CoffeeRevisted(){
        size = 12;
        syrups = new Syrup[DEFAULT_MAX_SYRUP];
        syrupCount = 0;
        coffeeCount++;
    }

    public CoffeeRevisted(int aSize){
        size = aSize;
        syrups = new Syrup[DEFAULT_MAX_SYRUP];
        syrupCount = 0;
        coffeeCount++;
        getCoffeeCount();
    }

    // A static method belongs to the class, not to individual objects.
    // It can be called without creating an instance.
    public static int getCoffeeCount(){
//        CoffeeRevisted c1 = new CoffeeRevisted();
//        c1.addSyrup(new Syrup("Caramel"));
        return coffeeCount;
    }

    public void addSyrup(Syrup aSyrup){
        if(syrupCount >= syrups.length){
            System.out.println("Too many syrups");
            return;
        }
        syrups[syrupCount++] = aSyrup;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < syrupCount; i++){
            sb.append(syrups[i]).append(" ");
        }
        return sb.toString();
    }
}
