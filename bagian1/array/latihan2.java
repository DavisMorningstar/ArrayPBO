package bagian1.array;

public class latihan2 {
    public static void main(String[] args) {

        int[] nilai = {10, 20, 30, 40, 50};

        // for biasa: bisa akses indeks
        System.out.println("== Pakai for ==");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks " + i + " = " + nilai[i]);
        }

        // for-each: lebih ringkas
        System.out.println("== Pakai for-each ==");
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        double rata = (double) total / nilai.length;
        System.out.println("Total    : " + total);
        System.out.println("Rata-rata: " + rata);
    }
}