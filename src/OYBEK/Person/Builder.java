package OYBEK.Person;

public class Builder extends Person {

    public Builder(String name, int age) {
        super(name, age);
    }

    @Override
    public void working() {
        System.out.println("Builder");
    }
}
