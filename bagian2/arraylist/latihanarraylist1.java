package bagian2.arraylist;

import java.util.ArrayList;

public class latihanarraylist1 {
    public static void main(String[] args) {

        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Beras");
        belanja.add("Minyak");
        belanja.add("Gula");
        belanja.add("Garam");

        belanja.remove(1);

        System.out.println("Isi list : " + belanja);
        System.out.println("Jumlah   : " + belanja.size());
    }
}