package MondayMorning.Week10;

public class Recursion {
    public static void main(String[] args){
//        foo();
        counter(5);
        System.out.println();
        System.out.println("Sum: " + sum(3));
    }

    //sum(n) = n + sum(n-1)
    //sum(0) = 0
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void counter(int n){
        //Base Condition
        if(n <= 0){
            return;
        }

        System.out.print(n + " ");
        //Recursive Call
        counter(n-1);
        System.out.print (n + " ");
    }

    // [Warning!!!] Never Ending Method Call
    public static void foo(){
        System.out.println("In Foo");
        foo();
    }
}
