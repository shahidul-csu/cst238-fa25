package Section51.Week5;

public class Main {
    public static void main(String[] args){
        CoffeeRevisited c1 = new CoffeeRevisited();
        System.out.println(c1);
        Syrup s = new Syrup("Ice");
        c1.addSyrup(s);
        c1.addSyrup(new Syrup("Vanilla"));
        System.out.println(c1);

        System.out.println(c1.getCoffeeCount());
        CoffeeRevisited c2 = new CoffeeRevisited(16);
        System.out.println(c2.getCoffeeCount());
        CoffeeRevisited c3 = new CoffeeRevisited();
        System.out.println(c3.getCoffeeCount());
        System.out.println(CoffeeRevisited.getCoffeeCount());

        System.out.println(Math.pow(3,4));
    }
}
