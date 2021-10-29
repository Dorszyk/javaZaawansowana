package KlasyIinterfejsy.Ex1;

public class Main {
    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();
        String[] results = userValidator.validateEmails("piotrek@wp.pl","as_+asa@gmail.cm");

        System.out.println(results[0]);
        System.out.println(results[1]);
    }
}
