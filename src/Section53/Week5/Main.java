package Section53.Week5;

public class Main {
    public static void main(String[] args){
        CoffeeRevisted c = new CoffeeRevisted();
        c.addSyrup(new Syrup("Caramel"));
        Syrup aSyrup = new Syrup("Cherry");
        c.addSyrup(aSyrup);

        System.out.println(c);

        System.out.println(c.getCoffeeCount());
        CoffeeRevisted c2 = new CoffeeRevisted(16);
        System.out.println(c2.getCoffeeCount());
        CoffeeRevisted c3 = new CoffeeRevisted();
        System.out.println(c3.getCoffeeCount());
        System.out.println(CoffeeRevisted.getCoffeeCount());
        c3.addSyrup(aSyrup);
        System.out.println(Math.pow(3,4));
    }
}
