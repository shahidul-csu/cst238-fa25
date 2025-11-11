package Section53.Week12;

public class LinkedListRecursionRunner {
    public static void main(String[] args){
        LinkedListRecursion<Integer> ll1 = new LinkedListRecursion<>();
        System.out.println(ll1);
        ll1.append(5);
        System.out.println(ll1);
        ll1.append(3);
        System.out.println(ll1);
        ll1.append(8);
        System.out.println(ll1);

        LinkedListRecursion<String> ls1 = new LinkedListRecursion<>();
        ls1.append("hello");
        System.out.println(ls1);
        ls1.append("hola");
        ls1.append("ciao");
        System.out.println(ls1);

        LinkedListRecursion<Double> ld1 = new LinkedListRecursion<>();
        ld1.append(3.14159);
        ld1.append(0.915);
        ld1.append(0.9999999999999);
        System.out.println(ld1);

        LinkedListRecursion<Foo> lf1 = new LinkedListRecursion<>();
        lf1.append(new Foo(1, "Dog"));
        lf1.append(new Foo(2, "Cat"));
        lf1.append(new Foo(3, "Fish"));
        System.out.println(lf1);
    }
}
