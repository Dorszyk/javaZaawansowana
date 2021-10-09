package Day3.Ex5;

public class Student implements Comparable {

    String imie;
    String nazwisko;
    String numeralbumu;

    public Student(String imie, String nazwisko, String numeralbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numeralbumu = numeralbumu;
    }

    @Override
    public int compareTo(Object o) {
        Student that = (Student) o;
        return numeralbumu.compareTo(that.numeralbumu);

    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numeralbumu='" + numeralbumu + '\'' +
                '}';
    }
}
