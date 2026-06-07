package bagian1.array;

public class latihan1 {
    public static void main(String[] args) {

        // Cara 1: deklarasi dulu, isi per indeks
        int[] nilai = new int[5];
        nilai[0] = 10;
        nilai[1] = 20;
        nilai[2] = 30;
        nilai[3] = 40;
        nilai[4] = 50;

        // Cara 2: langsung diisi saat dibuat
        String[] kota = {"Banjarmasin", "Jakarta", "Surabaya"};

        System.out.println("Nilai pertama  : " + nilai[0]);
        System.out.println("Nilai ketiga   : " + nilai[2]);
        System.out.println("Kota ke-2      : " + kota[1]);
        System.out.println("Jumlah nilai   : " + nilai.length);
    }
}