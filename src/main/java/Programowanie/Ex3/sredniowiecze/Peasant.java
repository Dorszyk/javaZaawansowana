package Programowanie.Ex3.sredniowiecze;

public class Peasant extends Citizen{

    public Peasant(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
