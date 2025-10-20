package Section53.Week9;

public class PrintFormat {
    public static void main(String[] args){
        double pi = 3.14159; //3.141592653
        double rando = 3561.65436278;

        //%f [float], %d[int] %s[String]
        System.out.printf("[%f] [%f]\n", pi, rando, pi);
        System.out.printf("[%.2f] [%.2f]%n", pi, rando);
        System.out.printf("[%20.2f] [%20.2f]%n", pi, rando);
        System.out.printf("[%-20f] [%-20f]%n", pi, rando);
        System.out.printf("[%-20.4f] [%-20.4f]%n", pi, rando);
        System.out.println();

        int num = 52;
        System.out.printf("[%d] [%7d] [%07d]%n", num, num, num);
        String text = String.format("[%d] [%7d] [%7d]", num, num, num);
        System.out.println(text);
    }
}
