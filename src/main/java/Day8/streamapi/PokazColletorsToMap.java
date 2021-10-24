package Day8.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PokazColletorsToMap {

    public void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", 3.0, 12345l);
        Student student1 = new Student("Asia", "Kowalska", 4.0, 657456l);
        Student student2 = new Student("Piotrek", "Dorszyński", 5.0, 789456l);

        Map<Long, Student> longStudentMap = Arrays.asList(student, student1, student2)
                .stream().collect(Collectors.toMap(Student::getIndex, Function.identity()));

        longStudentMap.entrySet().stream()
                .collect(Collectors.toMap( entry -> entry.getValue(),entry -> entry.getKey()))
                .forEach((s,x) -> System.out.println(s + ",a x: " + x));
    }

    @Data
    @AllArgsConstructor
    class Student {
        private String name;
        private String surnname;
        private Double gpa;
        private Long index;
    }
}
