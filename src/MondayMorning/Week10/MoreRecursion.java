package MondayMorning.Week10;

public class MoreRecursion {
    public static void main(String[] args){
        int[] data = {5, 7, 3, 1};
        print(data);
        System.out.println();
        System.out.println("Sum: " + sumOfArray(data, 0));
        System.out.println("Max: " + maxInArray(data, 0));
        recur(5, 2);
    }

    public static void recur(int a, int b){
        if(a <= 0){
            return;
        }
        System.out.println(a + ", " + b);
        recur(a - 2, b + 1);
    }


    //maxInArray(data, 3) -> Return 1
    //maxInArray(data, 2) -> max(3, 1) -> 3
    //maxInArray(data, 1) -> max(7, 3) -> 7
    //maxInArray(data, 0) -> max(5, 7) -> 7
    public static int maxInArray(int[] data, int start){
        if(start == data.length - 1){
            return data[data.length - 1];
        }
        int currentMax = maxInArray(data, start + 1);
        System.out.println("Current Max: " + currentMax);
        if(data[start] > currentMax){
            return data[start];
        } else{
            return currentMax;
        }
//        return Math.max(data[start], currentMax);
    }

    public static int sumOfArray(int[] data, int start){
        if(start == data.length - 1){
            return data[data.length - 1];
        }
        int sum = sumOfArray(data, start + 1);
//        System.out.println("Sum: " + sum);
        return data[start] + sum;
    }

    // Helper Method
    public static void print(int[] data){
        print(data, 7);
    }

    // Recursive Method
    public static void print(int[] data, int size){
        if(size >= data.length){
            System.out.println("Size is out of bound");
            return;
        }
        if(size == 0){
            return;
        }
//        System.out.print(data[size - 1] + " ");
        print(data, size - 1);
        System.out.print(data[size - 1] + " ");
    }
}
