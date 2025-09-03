package Section53.Week2;

public class CoffeeTest {
    public static void main(String[] args){
        Coffee c1 = new Coffee(16);
        Coffee c2 = new Coffee();

        c1.addSyrup("Caramel");
        c1.addSyrup("Vanilla");

        c2.addSyrup("Mango");

        System.out.println(c1);
        System.out.println(c2);

        Coffee c3 = new Coffee();
        System.out.println(c3);
    }
}
