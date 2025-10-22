package Section52.Week9;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InsertionSortString {
    public static void main(String[] args) throws IOException {
        String[] data = loadDataFromFile();
        printData(data);
        swap(data, 0, 1);
        printData(data);
//        insertionSort(data);
    }

    public static void insertionSort(String[] data){
        //To be implemented in the next class
    }

    public static void swap(String[] data, int index1, int index2){
        String temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    public static String[] loadDataFromFile() throws IOException{
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String fileName = cin.next();
        FileReader fr = new FileReader(fileName);
        Scanner fin = new Scanner(fr);
        int count = fin.nextInt();
        String[] data = new String[count];

        for(int i = 0; i < count; i++){
            data[i] = fin.next();
        }

        fr.close();

        return data;
    }

    public static void printData(String[] data){
        for(String item:data){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
