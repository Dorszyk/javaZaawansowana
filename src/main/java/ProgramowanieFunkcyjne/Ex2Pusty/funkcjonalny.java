package ProgramowanieFunkcyjne.Ex2Pusty;

@FunctionalInterface
public interface funkcjonalny {

    void execute();

    default void execute2(){
        System.out.println("ASASA");
    }
}
