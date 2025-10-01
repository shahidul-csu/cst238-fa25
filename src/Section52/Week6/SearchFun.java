package Section52.Week6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SearchFun {
    public static void main(String[] args) throws IOException{
        //Indices: 0->11
//        int[] data = {1, 4, 4, 7, 9, 14, 15, 19, 24, 25, 30, 37};

        int[] data = new int[20];
        int count = readData(data);
//        Arrays.sort(data, 0, count);
        print(data, count);
        boolean isDataSorted = isSorted(data, count);

        int search = 6;

        if(isDataSorted) {
            System.out.println("Binary search applied");
            System.out.println("Location of " + search + ": " + binarySearch(data, count, search));
        } else {
            System.out.println("Linear search applied");
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
            if(key == data[mid]){
                return mid;
            } else if(key < data[mid]){
                //Go left
                high = mid - 1;
            } else{
                //Go right
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int linearSearch(int[] data, int count, int key){
        for(int i = 0; i < count; i++){
            if(key == data[i]){
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
        String filename = cin.next();
        FileReader fr = new FileReader(filename);
        Scanner fin = new Scanner(fr);

        int count = 0;
        while (fin.hasNextInt() && count < data.length){
            data[count++] = fin.nextInt();
        }

        fr.close();
        return count;
    }
}
