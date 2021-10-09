package Day3.Ex5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student0 = new Student("Piotr","Dorszyński","123");
        Student student1 = new Student("Adam","Farelka","456" );
        Student student2 = new Student("Alicja","Dorszyńska","789");
        Student student3 = new Student("Katarzyna","Kowalska","101");

        Student[] studenci = new Student[]{student0,student1,student2,student3};

        for (Student student:studenci){
            System.out.println(student.toString());

        }
        System.out.println("###############");

        System.out.println("Sortowanie po indeksie");
        Arrays.sort(studenci);
        for (Student student:studenci){
            System.out.println(student.toString());

        }
    }


}
