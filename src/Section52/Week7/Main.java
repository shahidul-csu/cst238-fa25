package Section52.Week7;

public class Main {
    public static void main(String[] args){
        System.out.println("Foo Count: " + Foo.getFooCount());
        Foo f1 = new Foo();
        System.out.println("Bar: " + f1.getBar());

        Foo f2 = new Foo(50);
        System.out.println("Bar: " + f2.getBar());

        Foo f3 = new Foo(100, "Test State");
        System.out.println("Bar: " + f3.getBar());
        System.out.println("Foo Count: " + Foo.getFooCount());

        System.out.println(f1);
        System.out.println(f1.getMe());
        System.out.println(f3);
        System.out.println(f3.getMe());
        System.out.println(f3.getState());
        System.out.println(f3.getMe().getState());

        int a = 5;
        System.out.println(f1.getState());
        System.out.println("a: " + a);
        updateData(f1, a);
        System.out.println("After method call");
        System.out.println(f1.getState());
        System.out.println("a: " + a);
    }

    public static void updateData(Foo f, int a){
        System.out.println("Inside Method");
        f.setState("Updated State");
        a = 10;
        System.out.println(f.getState());
        System.out.println("a: " + a);
    }
}
