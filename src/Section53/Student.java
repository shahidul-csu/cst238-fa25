package Section53;

public class Student {
    private String id;
    private String name;
    private String DOB;
    private int credit;

    public Student(String i){
        id = i;
    }

    public Student(String i, String n){
        id = i;
        name = n;
    }

    public Student(String i, String n, String d, int c){
        id = i;
        name = n;
        DOB = d;
        credit = c;
    }

    //Getter Method
    public String getName(){
        return name;
    }

    public String getDOB(){
        return DOB;
    }

    //Setter Method
    public void setName(String newName){
        name = newName;
    }

}