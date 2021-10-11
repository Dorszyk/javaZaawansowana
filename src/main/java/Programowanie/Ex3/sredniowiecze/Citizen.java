package Programowanie.Ex3.sredniowiecze;

public abstract class Citizen {

    protected String name;

    public Citizen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canVote();
}
