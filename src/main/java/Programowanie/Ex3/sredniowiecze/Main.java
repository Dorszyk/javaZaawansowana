package Programowanie.Ex3.sredniowiecze;

public class Main {
    public static void main(String[] args) {
        King king = new King("Dorszyk III ");
        Peasant peasant = new Peasant("Wiesiek");
        Soldier soldier = new Soldier("Ostra laga");
        Townsman townsman = new Townsman("Pajacynka");

        Town town = new Town(new Citizen[]{king, peasant, soldier, townsman});
        System.out.println("Ilość osób mogących głosować: " + town.howManyCanVote());

        Citizen[] peopleWhoCanVote = town.whoCanVote2();
        System.out.println("W mieście ludzie którzy mogą głosować: ");
        for (Citizen citizen : peopleWhoCanVote) {
            System.out.println(citizen.getName());

        }
    }
}
