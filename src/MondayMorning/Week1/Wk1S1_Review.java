package MondayMorning.Week1;

import java.util.Random;
import java.util.Scanner;

public class Wk1S1_Review {
    public static void main(String[] args){
        int range = 10;
        int[] data = new int[range];
        data[0] = 3;
        data[1] = 5;

        populateArray(data);

        for (int num:data){
            System.out.println(num);
        }
    }

    public static void populateArray(int[] data){
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < data.length; i++){
            if(i % 2 == 0) {
                System.out.print("Enter a number: ");
                data[i] = in.nextInt();
//                data[i] = i + 1;
            }
            else
//                data[i] = i * i;
                data[i] = r.nextInt(100);
        }
    }
}
