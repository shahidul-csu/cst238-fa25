package Section51.Week8;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int heightInInches;

    public Person(String name, int age, int heightInInches){
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
    }

    @Override
    //Compare two objects return values to set their order
    //Returns 0 is two objects are equal
    //Returns a negative value if this object comes before the argument object
    //Returns a positive value if this object comes after the argument object
    public int compareTo(Person p){
        if(this.age == p.age){
            return this.name.compareTo(p.name);
        }
        return this.age - p.age;
//        return this.name.compareTo(p.name);
//        return this.age - p.age;
    }

    public String toString(){
        return "Name: " + name + ", age: " + age + ", height: " + heightInInches;
    }
}
