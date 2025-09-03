package Section53.Week1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("abcd1234", "John Doe");
        System.out.println(s1);

        Student s2 = new Student("pqrs5678");
        System.out.println(s2);

        Student s3 = new Student("qwer1678", "Jane Doe", "02/04/2006", 15);
        System.out.println(s3);

        System.out.println(s3.getName() + " " + s3.getDOB());
        s3.setName("Jerry Burns");
        System.out.println(s3.getName() + " " + s3.getDOB());

//        int [] data = new int[10];
//        System.out.println(data);

//        Scanner cin = new Scanner(System.in);

//        System.out.print("Enter a filename: ");
//        String fileName = cin.next();
//        loadData(fileName);
    }

    public static void loadData(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner fin = new Scanner(fr);

        while(fin.hasNextInt()){
            int num = fin.nextInt();
            System.out.println(num);
        }

        fr.close();
    }
}
