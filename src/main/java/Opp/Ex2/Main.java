package Opp.Ex2;

public class Main {

    public static void main(String[] args) {

        Person student = new Student("Piotr", "BC 43", "IT", 1, 2000);
        Person staff = new Staff("Programowanie", 6500f);
        System.out.println(student);
        System.out.println(staff);

    }
}
