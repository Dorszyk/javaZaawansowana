package Programowanie.Ex3.sredniowiecze;

public class Townsman extends Citizen{

    public Townsman(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
