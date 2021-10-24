package Day8.streamapi;

@FunctionalInterface
public interface funkcjonalny {

    void execute();

    default void execute2(){
        System.out.println("ASASA");
    }
}
