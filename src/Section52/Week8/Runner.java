package Section52.Week8;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException{
        int[] data = {1, 7, 14, 22, 3, 5, 3};
        Arrays.sort(data);
        print(data);

        ArrayList<String> words = readDataFromFile();
        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);
        System.out.println();

        ArrayList<Person> personList = readPersonFromFile();
        printArrayList(personList);
        System.out.println();
        Collections.sort(personList);
        printArrayList(personList);
    }

    public static void printArrayList(ArrayList<Person> pl){
        for(Person p:pl){
            System.out.println(p);
        }
    }

    public static ArrayList<Person> readPersonFromFile() throws IOException{
        ArrayList<Person> personList = new ArrayList<>();
        FileReader fr = new FileReader("src/Section52/Week8/person.txt");
        Scanner fin = new Scanner(fr);
        while(fin.hasNext()){
            Person p = new Person(fin.next(), fin.nextInt(), fin.nextInt());
            personList.add(p);
        }
        fr.close();
        return personList;
    }

    public static ArrayList<String> readDataFromFile() throws IOException {
        ArrayList<String> words = new ArrayList<>();
        FileReader fr = new FileReader("src/Section52/Week8/data.txt");
        Scanner fin = new Scanner(fr);
        while (fin.hasNext()){
            words.add(fin.next());
        }

        fr.close();
        return words;
    }

    public static void print(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
