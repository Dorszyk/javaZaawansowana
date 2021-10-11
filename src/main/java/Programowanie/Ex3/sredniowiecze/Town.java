package Programowanie.Ex3.sredniowiecze;

public class Town {

    private Citizen[] citizens;

    public Town(Citizen[] citizens) {
        this.citizens = citizens;

    }

    public int howManyCanVote() {
        int count = 0;
        for (Citizen citizen : this.citizens) {
            if (citizen.canVote()) {
                count++;
            }

        }
        return count;
    }

    public void whoCanVote() {
        System.out.println("Głosować może : ");
        for (Citizen citizen : this.citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }

    }

    public Citizen[] whoCanVote2() {
        int eligibleToVote = howManyCanVote();

        int counter = 0;
        Citizen[] peopleWhoCanVote = new Citizen[eligibleToVote];
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                peopleWhoCanVote[counter] = citizen;
                counter++;
            }
        }
        return peopleWhoCanVote;
    }
}


