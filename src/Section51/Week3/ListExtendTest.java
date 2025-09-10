package Section51.Week3;

public class ListExtendTest {
    public static void main(String[] args){
        ListExtend list1 = new ListExtend();
        System.out.println(list1);
        ListExtend list2 = new ListExtend(10);
        System.out.println(list2);
        ListExtend list3 = new ListExtend(1000);
        System.out.println(list3);
        System.out.println(list1.isEmpty());

        list1.append("Orange");
        list1.append("Apple");
        list1.append("Banana");
        System.out.println(list1.isEmpty());
        System.out.println(list1);
        list1.insert("Kiwi", 0);
        System.out.println(list1);
        list1.delete(1);
        System.out.println(list1);
        list1.insert("Mango", 1);
        System.out.println(list1);
        System.out.println(list1.countChar());
        System.out.println(list1.firstLetters());

        ListExtend[] listArray = new ListExtend[20];
        listArray[0] = new ListExtend(100);
        System.out.println(listArray[0].isEmpty());
        System.out.println(listArray[0]);
        listArray[0].append("Dog");
        listArray[0].append("Cat");
        System.out.println(listArray[0]);
    }
}
