package superheroes;

public class Bohaterowie {

    public static void main(String[] args) {

         SuperBohater spiderMan = new SuperBohater("CzłowiekPająk","skacze");
         SuperBohater superman = new SuperBohater("Batman","lata");
         SuperBohater bohater3 = new SuperBohater("Hulk","siła");

         spiderMan = superman;
         spiderMan = null;

        System.out.println(spiderMan==superman);



    }
}
