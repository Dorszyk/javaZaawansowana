package Wyjatki.Ex1;

import lombok.Data;

@Data
public class CannotDivideByException extends Exception{

    public CannotDivideByException(){
        super("Can't divide by 0!");
    }
}
