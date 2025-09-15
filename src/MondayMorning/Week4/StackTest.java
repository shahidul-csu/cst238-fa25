package MondayMorning.Week4;

public class StackTest {
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push("A");
        s1.push("B");
        s1.push("C");
        s1.display();
        s1.pop();
        s1.push("D");
        s1.push("E");
        s1.display();
    }
}
