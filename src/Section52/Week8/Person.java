package Section52.Week8;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int heightInInches;

    public Person(String name, int age, int heightInInches){
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
    }

    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Height: " + heightInInches;
    }

    @Override
    //Compares two objets and return values to set their order
    //Returns 0 is both objects are equal
    //Returns a negative value if this object comes before the parameter object
    //Return a positive value if this object comes after the parameter object
    public int compareTo(Person p){
        if(this.age == p.age){
            return this.name.compareTo(p.name);
        }
        return this.age - p.age;
//        return this.name.compareTo(p.name);
//        return this.age - p.age;
    }
}
