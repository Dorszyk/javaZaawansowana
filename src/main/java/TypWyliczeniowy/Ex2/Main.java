package TypWyliczeniowy.Ex2;

public class Main {
    public static void main(String[] args) {

        PackageSize packageSize = PackageSize.getPackageSize(5,5);
        PackageSize packageSize1 = PackageSize.getPackageSize(5,18);
        PackageSize packageSize2 = PackageSize.getPackageSize(14,15);
        PackageSize packageSize3 = PackageSize.getPackageSize(15,18);
        System.out.println(packageSize);
        System.out.println(packageSize1);
        System.out.println(packageSize2);
        System.out.println(packageSize3);
    }
}
