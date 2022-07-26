package OYBEK.Person;

import OYBEK.Person.Person;

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void working() {
        System.out.println("Teacher");
    }
}
