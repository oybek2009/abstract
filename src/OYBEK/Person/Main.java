package OYBEK.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher teacher = new Teacher("Ali",23);
        teacher.print();
        teacher.working();
        System.out.println("------------");
        Builder builder = new Builder("Yuli",31);
        builder.print();
        builder.working();
        System.out.println("------------");
        Driver driver = new Driver("Tim",30);
        driver.print();
        driver.working();
    }
}
