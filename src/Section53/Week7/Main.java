package Section53.Week7;

public class Main {
    public static void main(String[] args){
        System.out.println("Object Count: " + Foo.getObjectCount());
        Foo f1 = new Foo();
        Foo fn = f1;
        System.out.println(f1);
        System.out.println(fn);
        System.out.println(f1.getMe());
        System.out.println(f1.getState());
        System.out.println(f1.getMe().getState());

        int a = 5;
        System.out.println(f1.getState());
        System.out.println(a);
        updateData(a, f1);
        System.out.println("After method call");
        System.out.println(f1.getState());
        System.out.println(a);

        Foo f2 = new Foo(50);
        System.out.println(f2);
        System.out.println(f2.getMe());
        System.out.println("Bar: " + f2.getBar());
        System.out.println("Object Count: " + Foo.getObjectCount());

        Foo f3 = new Foo(100, "Test State");
        System.out.println(f3.getState());
        System.out.println("Object Count: " + Foo.getObjectCount());
    }

    public static void updateData(int a, Foo f){
        System.out.println("Inside method call:");
//        f = new Foo();
        f.setState("Updated State");
        a = 10;
        System.out.println(f.getState());
        System.out.println(a);
    }
}
