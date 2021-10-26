package PodstawyRefleksji.Ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jan", "Kowalski",1234,"Economy");
        Student student1 = new Student("Ula", "Brzydula",6543,"Finance");
        Student student2 = new Student("Kazik", "Frankowski",9874,"Mathematics");
        Student student3= new Student("Franek", "Kimono",1234,"Economy");

        List<Student> students = new ArrayList<>(Arrays.asList(student, student1, student2, student3));

        System.out.println(students);
        System.out.println(student1.getTypeOfStudents());
        System.out.println(student2.getLastName());


        System.out.println("Methods: ");

        Method[] methods = student.getClass().getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        System.out.println("Fields: ");
        Field[] fields = student.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        System.out.println("Constructor :");
        Constructor[] constructors = student.getClass().getDeclaredConstructors();
        System.out.println(Arrays.asList(constructors));


    }
}
