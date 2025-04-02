package students;

public class Person {
    String name;
    int age;
    String address;

    public Person() {}


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
