package bagian2.arraylist;

import java.util.ArrayList;

public class latihan3 {
    public static void main(String[] args) {

        ArrayList<String> kota = new ArrayList<>();

        kota.add("Banjarmasin");
        kota.add("Surabaya");
        kota.add("Jakarta");

        System.out.println("Isi list : " + kota);
        System.out.println("Jumlah   : " + kota.size());
        System.out.println("Index 1  : " + kota.get(1));
    }
}