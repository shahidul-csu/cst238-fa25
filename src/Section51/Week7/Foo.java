package Section51.Week7;

public class Foo {
    private int bar;
    private String state;
    private static int fooCount = 0;

    public Foo(){
        this(10);
        System.out.println("Constructor 1 Called");
    }

    public Foo(int bar){
        this(bar, "Initial State");
        System.out.println("Constructor 2 Called");
    }

    public Foo(int bar, String state){
        this.bar = bar;
        this.state = state;
        fooCount++;
        System.out.println("Constructor 3 Called");
    }

    public Foo getMe(){
        return this;
    }

    public static int getFooCount(){
        return fooCount;
    }

    public int getBar(){
        return this.bar;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }
}
