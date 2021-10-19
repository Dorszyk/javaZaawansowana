package Programowanie.Ex5.Robot;



public enum RuchRobota {
    KROK_LEWA(4),
    KROK_PRAWA(4),
    RUCH_REKA_LEWA(4),
    RUCH_REKA_PRAWA(4),
    SKOK(8);

    protected int zuzycieBaterii;

    RuchRobota(int zuzycieBaterii) {
        this.zuzycieBaterii = zuzycieBaterii;
    }

    public int getZuzycieBaterii() {
        return zuzycieBaterii;
    }

}
