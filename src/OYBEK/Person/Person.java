package OYBEK.Person;

public abstract class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
    public abstract void working();
}
