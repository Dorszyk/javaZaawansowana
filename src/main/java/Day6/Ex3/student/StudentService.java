package Day6.Ex3.student;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public List<Student> getAll() {
        return students;
    }

    public List<Student> findBySurname(String surname) {
        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (student.getSurname() == surname) {
                results.add(student);
            }
        }
        return results;
    }

    public List<Student> sortBySurname() {
        Collections.reverse(students);
        return students;
    }

}
