package bagian2.arraylist;

import java.util.ArrayList;

public class latihanarraylist2 {
    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(40);
        angka.add(85);
        angka.add(60);
        angka.add(95);
        angka.add(72);

        int max = angka.get(0);
        for (int n : angka) {
            if (n > max) max = n;
        }
        System.out.println("Nilai terbesar: " + max);
    }
}