package Section53.Week9;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InsertionSortString {
    public static void main(String[] args) throws IOException {
        String[] data = loadDataFromFile();
        printData(data);
        insertionSort(data);
        printData(data);
    }

    //0 + 1 + 2 + 3 + 4 + ..... + (n-1) = n(n-1)/2 = (n^2)/2-n/2
    //Big O time complexity: O(n^2)
    public static void insertionSort(String[] data){
        for(int i = 0; i < data.length; i++){
            int k = i;
//            while(k > 0 && data[k].compareTo(data[k-1]) < 0){ // "< 0" or "> 0"
            while(k > 0 && data[k].length() < data[k-1].length()){
                swap(data, k, k - 1);
                k--;
            }
            printData(data);
        }
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
            System.out.println(item + " (" + item.length()+ ")");
        }
        System.out.println();
    }
}
