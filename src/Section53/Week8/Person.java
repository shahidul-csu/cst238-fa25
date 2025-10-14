package Section53.Week8;

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
    //Compares two object and returns their order
    //Return 0 if two objects are equal
    //Returns negative value is this object comes before the argument object
    //Returns positive value is this object comes after the argument object
    public int compareTo(Person o) {
        if(this.age == o.age) {
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }

    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Height: " + heightInInches;
    }
}
