package Day7;

import Day6.Ex3.student.Student;

import java.util.*;

public class MainLambda {

    public static void main(String[] args) throws InterruptedException {

        Student student0 = new Student("Dorsz", "Piotr", 35, 3.5);
        Student student1 = new Student("Dorszyk", "Alicja", 38, 5.0);
        Student student2 = new Student("Kowalski", "Andrzej", 22, 4.2);
        Student student3 = new Student("Frankowskiii", "Mirosław", 47, 6.0);

        System.out.println("Przed sortowaniem");
        List<Student> students = new ArrayList<>(Arrays.asList(student0, student1, student2, student3));
        System.out.println(students);

        System.out.println(" Po sortowaniu");
        Collections.sort(students, Comparator.comparingDouble(o -> o.getAverage()));
        Collections.sort(students, Comparator.comparingDouble(Student::getAverage));
        System.out.println(students);

        System.out.println(" Po sortowaniu wedle długości nazwiska");
        Collections.sort(students, (Comparator.comparingInt(o -> o.getSurname().length())));
        System.out.println(students);

        System.out.println("Sortowanie od najwyższej średniej");
        Collections.sort(students, ((o1, o2) -> (int) o2.getAverage() - (int) o1.getAverage())
        );
        System.out.println(students);


    }
}
