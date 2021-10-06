package Day2.Zad2.Biblioteka;

import java.util.Objects;

public abstract class Czlowiek {

    protected String name;
    protected String surname;

    public Czlowiek(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Czlowiek{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Czlowiek czlowiek = (Czlowiek) o;
        return Objects.equals(name, czlowiek.name) && Objects.equals(surname, czlowiek.surname);
    }


}
