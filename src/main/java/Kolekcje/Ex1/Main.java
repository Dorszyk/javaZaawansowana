package Kolekcje.Ex1;

public class Main {
    public static void main(String[] args) {

        SDAArrayList<Integer> arrayList = new SDAArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.remove(0);
        System.out.println(arrayList.get(0));
        arrayList.display();

    }
}
