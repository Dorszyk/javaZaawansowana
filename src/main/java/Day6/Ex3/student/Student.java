package Day6.Ex3.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {


    private final String surname;
    private String name;
    private int age;
    private double average;

}

