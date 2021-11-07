package Day10.Builder.Ex1;

public class Main {
    public static void main(String[] args) {

        Fish goldfish = new Fish.FishBuilder()
                .age(15)
                .color("")
                .flying(true).build();

    }
}
