package Section53.Week7;

public class Foo {
    private int bar;
    private String state;

    private static int objectCount = 0;

    public Foo(){
        this(10);
        System.out.println("Constructor 1 called");
    }

    public Foo(int bar){
        this(bar, "Initial State");
        System.out.println("Constructor 2 called");
    }

    public Foo(int bar, String state){
        this.bar = bar;
        this.state = state;
        objectCount++;
        System.out.println("Constructor 3 called");
    }

    public Foo getMe(){
        return this;
    }

//    public Foo(String state, int bar){
//        this(bar, state);
//    }

    public static int getObjectCount() {
        return objectCount;
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
