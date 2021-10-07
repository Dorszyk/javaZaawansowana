package Opp.Ex2;

class Student extends Person{

    private String typStudiow;
    private int rokStudiow;
    private float kosztStudiow;


    public Student(String name, String address, String typStudiow, int rokStudiow, float kosztStudiow) {
        super(name, address);
        this.typStudiow = typStudiow;
        this.rokStudiow = rokStudiow;
        this.kosztStudiow = kosztStudiow;
    }

    public Student() {

    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public float getKosztStudiow() {
        return kosztStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public void setKosztStudiow(float kosztStudiow) {
        this.kosztStudiow = kosztStudiow;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typStudiow='" + typStudiow + '\'' +
                ", rokStudiow=" + rokStudiow +
                ", kosztStudiow=" + kosztStudiow +
                '}';
    }
}

