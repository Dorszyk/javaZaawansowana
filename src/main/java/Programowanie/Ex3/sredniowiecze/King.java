package Programowanie.Ex3.sredniowiecze;

public class King extends Citizen{


    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
