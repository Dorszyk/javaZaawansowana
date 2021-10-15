package TypyGeneryczne.Ex2;

public class Main {
    public static void main(String[] args) {
        Integer[] tab = {10, 21, 33, 40, 50, 60};
        int counter = Utils.countIf(tab, new Validator<Integer>() {

            @Override
            public boolean validate(Integer value) {
                return value   %2 == 0;
            }
        });
        System.out.println(counter);
    }
}
