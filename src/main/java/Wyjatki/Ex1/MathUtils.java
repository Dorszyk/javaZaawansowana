package Wyjatki.Ex1;

import lombok.Data;

@Data
public class MathUtils {


    public static float divide(int a, int b) throws CannotDivideByException {
        if (b == 0) {
            throw new CannotDivideByException();
        }
        return a / b;

    }
}
