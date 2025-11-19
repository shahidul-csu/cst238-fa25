package Section51.Week13;

public class BSTRunner {
    public static void main(String[] args){
        BST b1 = new BST();
        System.out.println(b1.isEmpty());
        b1.add(5);
        b1.add(2);
        b1.add(3);
        b1.add(7);
        b1.add(1);
//        b1.add(9);
//        b1.add(4);
        System.out.println(b1.isEmpty());
        b1.preOrder();
        b1.inOrder();
        b1.postOrder();
    }
}
