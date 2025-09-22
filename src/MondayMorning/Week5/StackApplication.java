package MondayMorning.Week5;

import java.util.Scanner;

public class StackApplication {
    public static void main(String[] args){
        System.out.println(isBalanced("((()))"));
        System.out.println(isBalanced("((("));
        System.out.println(isBalanced(")))"));
        System.out.println(isBalanced("(()())(())()("));
        System.out.println(isBalanced(""));
//        System.out.println(isBalanced("{}{}{)"));
    }

    public static boolean isBalanced(String paren){
        StackChar s = new StackChar(30);
        Scanner cin = new Scanner(System.in);
        //(((
        for(int i = 0; i < paren.length(); i++){
//            cin.nextLine();
            char current = paren.charAt(i);
            if(current == '('){
                s.push(current);
//                System.out.println("Pushing (");
            } else if(current == ')'){
                if(s.isEmpty()){
                    return false;
                }
//                System.out.println("Popping (");
                s.pop();
            }
//            System.out.println("Stack:" + s);
        }
        if(!s.isEmpty()){
            return false;
        }

        return true;
    }
}
