package PodstawyRefleksji.Ex2;


import lombok.Data;

@Data

public class StudentExt {

    private String name;
    private String lastName;
    private int index;
    private String typeOfStudents;

    public  StudentExt(){

    }


    public StudentExt(String name, String lastName, Integer index, String typeOfStudents) {
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
