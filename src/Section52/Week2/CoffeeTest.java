package Section52.Week2;

import java.util.Random;

public class CoffeeTest {
    public static void main(String[] args){
        Random r = new Random();
        Coffee c1 = new Coffee(16);
        Coffee c2 = new Coffee();
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getSize());
        c1.setSize(15);
        System.out.println(c1.getSize());
    }
}
