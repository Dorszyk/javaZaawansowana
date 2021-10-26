package PodstawyRefleksji.Ex1;


import lombok.Data;

@Data

public class Student {

    private String name;
    private String lastName;
    private int index;
    private String typeOfStudents;


    public Student(String name, String lastName, int index, String typeOfStudents) {
        this.name = name;
        this.lastName = lastName;
        this.index = index;
        this.typeOfStudents = typeOfStudents;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", index=" + index +
                ", typeOfStudents='" + typeOfStudents + '\'' +
                '}';
    }
}
