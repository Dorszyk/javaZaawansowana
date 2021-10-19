package Programowanie.Ex5.Robot;

import lombok.Data;

import java.util.InputMismatchException;
import java.util.Scanner;

@Data
public class Robot {

    protected int poziomBaterii = 100;
    protected String nazwaRobot;
    boolean czyWlaczony = false;

    public Robot(String nazwaRobot) {
        this.nazwaRobot = nazwaRobot;
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextInt();

            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Podano niepoprawny znać, proszę podać liczbę ");
                System.out.println("Aby wyświetlić listę dostępnych poleceń wpisz na konsoli [0]");
            }
        }
    }

    public void przedstawRobota() {
        System.out.println("Oto robot " + this.nazwaRobot + ". Ten Robot posiada następujące funckje: \n");
        wypiszlistePolecen();
    }

    public void wypiszlistePolecen() {
        System.out.println("Krok lewą nogą.Aby wykonac ten ruch wpisz na konsoli [1]");
        System.out.println("Krok prawą nogą.Aby wykonac ten ruch wpisz na konsoli [2]");
        System.out.println("Ruch prawą ręką.Aby wykonac ten ruch wpisz na konsoli [3]");
        System.out.println("Ruch lewą ręką.Aby wykonac ten ruch wpisz na konsoli [4]");
        System.out.println("Podskok.Aby wykonac ten ruch wpisz na konsoli [5]");
        System.out.println("Włącz robota.Aby wykonac to polecenie wpisz na konsoli [6]");
        System.out.println("Wyłącz robota.Aby wykonac to polecenie wpisz na konsoli [7]");
        System.out.println("Naładuj robota.Aby wykonac to polecenie wpisz na konsoli [8]");
        System.out.println("Podaj poziom naładowania baterii.Aby wykonac to polecenie wpisz na konsoli [9]");
        getInput();
    }

    public void getInput() {
        System.out.println("Aby wyświetlić listę dostępnych poleceń wpisz na konsoli [0]");
        System.out.println("Podaj komendę : ");
        RuchRobota ruchRobota = null;
        switch (getUserInput()) {
            case 1:
                ruchRobota = RuchRobota.KROK_LEWA;
                poruszRobotem(ruchRobota);
            case 2:
                ruchRobota = RuchRobota.KROK_PRAWA;
                poruszRobotem(ruchRobota);
            case 3:
                ruchRobota = RuchRobota.RUCH_REKA_LEWA;
                poruszRobotem(ruchRobota);
            case 4:
                ruchRobota = RuchRobota.RUCH_REKA_PRAWA;
                poruszRobotem(ruchRobota);
            case 5:
                ruchRobota = RuchRobota.SKOK;
                poruszRobotem(ruchRobota);
            case 6:
                wlaczRobota();
            case 7:
                wylaczRobota();
            case 8:
                naladujRobota();
            case 9:
                poziomBaterii();
            case 0:
                wypiszlistePolecen();
            default:
                System.out.println("Podałeś nieprawidlłową komendę");
                wypiszlistePolecen();
        }
    }

    public void poruszRobotem(RuchRobota ruchRobota) {
        if (this.czyWlaczony) {
            if (this.poziomBaterii > ruchRobota.getZuzycieBaterii()) {
                switch (ruchRobota) {
                    case KROK_LEWA:
                        System.out.println("Robot zrobił krok lewą nogą ");
                        break;
                    case KROK_PRAWA:
                        System.out.println("Robot zrobił krok prawą nogą ");
                        break;
                    case RUCH_REKA_LEWA:
                        System.out.println("Robot ruszy; lewą ręką. ");
                        break;
                    case RUCH_REKA_PRAWA:
                        System.out.println("Robot ruszy; prawą ręką. ");
                        break;
                    case SKOK:
                        System.out.println("Robot podskoczył  ");
                        break;
                }
                this.poziomBaterii -= ruchRobota.getZuzycieBaterii();
            } else {
                System.out.println("Robot nie ma dość baterii aby wykonać ten ruch" + ruchRobota + "!");
            }
        } else {
            System.out.println("Zanim wykonasz "
                    + ruchRobota.toString().toLowerCase().replaceAll("_", " ") + "musisz włączyć Robota!");
        }
        getInput();

        }

        public void naladujRobota () {
            if (czyWlaczony == false) {
                if (poziomBaterii < 100) {
                    System.out.println("Bateria naładowana do 100%");
                    setPoziomBaterii(100);
                } else {
                    System.out.println("Bateria jest już pełna");
                }
            } else {
                System.out.println("Przed ładowaniem musisz wyłączyć Robota");
            }
            wypiszlistePolecen();
        }

        public void wlaczRobota () {
            if (czyWlaczony) {
                System.out.println("Robot jest włączony");
            } else {
                setCzyWlaczony(true);
                System.out.println("Robot " + nazwaRobot + " został Włączony");
            }
            getInput();
        }

        public void wylaczRobota () {
            if (!czyWlaczony) {
                System.out.println("Robot jest wyłączony");
            } else {
                setCzyWlaczony(false);
                System.out.println("Robot został wyłączony");
            }
        }

        public void poziomBaterii () {
            System.out.println("Aktualny poziom baterii robota to :" + getPoziomBaterii() + "%");
            getInput();
        }

    }
