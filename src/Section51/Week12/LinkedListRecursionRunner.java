package Section51.Week12;

public class LinkedListRecursionRunner {
    public static void main(String[] args){
        LinkedListRecursion<Integer> ll1 = new LinkedListRecursion<>();
        System.out.println(ll1);
        ll1.append(5);
        System.out.println(ll1);
        ll1.append(8);
        System.out.println(ll1);
        ll1.append(3);
        System.out.println(ll1);
        ll1.append(6);
        System.out.println(ll1);

        LinkedListRecursion<String> ls1 = new LinkedListRecursion<>();
        ls1.append("Hello");
        ls1.append("Hola");
        ls1.append("Ciao");
        System.out.println(ls1);

        LinkedListRecursion<Double> ld1 = new LinkedListRecursion<>();
        ld1.append(3.14159);
        ld1.append(3.7);
        ld1.append(6.28);
        System.out.println(ld1);

        LinkedListRecursion<Foo> lf1 = new LinkedListRecursion<>();
        lf1.append(new Foo(1, "Dog"));
        lf1.append(new Foo(2, "Cat"));
        lf1.append(new Foo(3, "Parrot"));
        System.out.println(lf1);
    }
}
