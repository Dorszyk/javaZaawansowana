package Day4.Ex1;

import java.util.Arrays;

public class MojaLista<E> {

    private int n;

    private E[] table;

    public MojaLista(int n) {
        this.n = n;
        this.table = (E[]) new Object[n];
    }

    public boolean zawiera(E poszukiwany) {
        for (int i = 0; i < table.length; i++) {
            if (poszukiwany.equals(table[i])) ;
            return true;
        }
        return false;
    }

    public int rozmiar() {
        int counter = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                counter++;
            }
        }
        return counter;
    }


    public boolean dodaj(E dodaj) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                table[i] = dodaj;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return  Arrays.toString(table);
    }
}


