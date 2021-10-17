package Day6.Ex3.student;


import java.util.*;
import java.util.concurrent.Callable;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Student student0 = new Student("Dorsz", "Piotr", 35, 3.5);
        Student student1 = new Student("Dorszyk", "Alicja", 38, 5.0);
        Student student2 = new Student("Kowalski", "Andrzej", 22, 4.2);
        Student student3 = new Student("Frankowskiii", "Mirosław", 47, 6.0);

        List<Student> students = new ArrayList<>(Arrays.asList(student0, student1, student2, student3));
        System.out.println("Przed sortowaniem");
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -1 * Double.compare(o1.getAverage(), o2.getAverage());
            }
        });
        System.out.println(" Po sortowaniu");
        System.out.println(students);


        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getSurname().length(),o2.getSurname().length());
            }
        });

        System.out.println(" Po sortowaniu wedle długości nazwiska");
        System.out.println(students);
    }
}
