package Section51.Week6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SearchFun {
    public static void main(String[] args) throws IOException{
        //Indices: 0->11
//        int[] data = {1, 5, 5, 7, 9, 13, 18, 20, 24, 26, 30, 35};
        int[] data = new int[20];
        int count = readData(data);
        boolean isDataSorted = isSorted(data, count);
//        Arrays.sort(data, 0, count);
        int search = 6;
        print(data, count);
        if(isDataSorted){
            System.out.println("Binary Search Applied");
            System.out.println("Location of " + search + ": " + binarySearch(data, count, search));
        } else {
            System.out.println("Linear Search Applied");
            System.out.println("Location of " + search + ": " + linearSearch(data, count, search));
        }
    }

    public static boolean isSorted(int[] data, int count){
        for(int i = 0; i < count - 1; i++){
            if(data[i] > data[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static int binarySearch(int[] data, int count, int key){
        int low = 0;
        int high = count - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(data[mid] == key){
                return mid;
            } else if(key < data[mid]){
                //Left
                high = mid - 1;
            } else{
                //Right
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int linearSearch(int[] data, int count, int key){
        for(int i = 0; i < count; i++){
            if(data[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void print(int[] data, int count){
        for(int i = 0; i < count; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static int readData(int[] data) throws IOException {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String fileName = cin.next();
        FileReader fr = new FileReader(fileName);
        Scanner fin = new Scanner(fr);
        int count = 0;
        while(fin.hasNextInt() && count < data.length){
            data[count++] = fin.nextInt();
        }

        fr.close();
        return count;
    }
}
