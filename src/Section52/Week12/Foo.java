package Section52.Week12;

public class Foo {
    int num;
    String value;

    public Foo(int num, String value){
        this.num = num;
        this.value = value;
    }

    public String toString(){
        return this.num + "," + this.value;
    }
}
