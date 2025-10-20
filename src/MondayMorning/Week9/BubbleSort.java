package MondayMorning.Week9;

public class BubbleSort {
    public static void main(String[] args){
        int[] test = {7, 2};
        print(test);
        swap(test, 0, 1);
        print(test);

        int a = 7, b = 2;
        System.out.println("a: " + a + ", b: " + b);
        badSwap(a, b);
        System.out.println("a: " + a + ", b: " + b);

        int[] data = {7, 2, 9, 1, 3, 4, 8 , 5, 3};
        print(data);
        bubbleSort(data);
    }

    public static void bubbleSort(int[] data){
        for (int i = 0; i < data.length - 1; i++) {
            //Enhancing the Basic Algorithm
            boolean isSwapped = false;
            for (int k = 0; k < data.length - i - 1; k++) {
                if (data[k] > data[k + 1]) { //Data is out of order?
                    swap(data, k, k + 1);
                    print(data);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
            System.out.println();
        }
    }

    public static void swap(int[] data, int index1, int index2){
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    public static void badSwap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void print(int[] data){
        for(int n: data){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
