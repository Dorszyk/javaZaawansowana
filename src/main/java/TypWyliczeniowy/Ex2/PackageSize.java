package TypWyliczeniowy.Ex2;

public enum PackageSize {

    SMALL(2,5),
    MEDIUM(5,12),
    LARGE(12,18),
    UNKNOW(0,0);

    int minRozmiarPaczkki;
    int maxRmiarPaczkki;

    PackageSize(int minRozmiarPaczkki, int maxRmiarPaczkki) {
        this.minRozmiarPaczkki = minRozmiarPaczkki;
        this.maxRmiarPaczkki = maxRmiarPaczkki;
    }

    public static PackageSize getPackageSize(int minRozmiarPaczkki, int maxRmiarPaczkki){
        for (PackageSize pacageSize: values()) {
            if(minRozmiarPaczkki >= pacageSize.minRozmiarPaczkki && maxRmiarPaczkki <= pacageSize.maxRmiarPaczkki){
                return pacageSize;
            }
        }
        return UNKNOW;
    }
}
