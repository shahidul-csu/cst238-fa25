package Section53.Week5;

public class CoffeeRevisted {
    private int size;
    private Syrup[] syrups;
    private int syrupCount;
    //Static attribute belong to class, not an object
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

    //Static method belong to class, not an object
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
