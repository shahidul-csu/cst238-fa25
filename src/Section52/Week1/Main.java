package Section52.Week1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = cin.next();
        loadData(fileName);
    }

    public static void loadData(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        Scanner fin = new Scanner(fr);

        while(fin.hasNextInt()){
            int num = fin.nextInt();
            System.out.println(num);
        }

        fr.close();
    }
}
