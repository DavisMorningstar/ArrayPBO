// Nama : Ahmad Davis Nazifa Subarja
// NPM  : 2410010217
package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // Array mata kuliah (ukuran tetap)
        String[] mataKuliah = {"Pemrograman", "Basis Data", "Jaringan Komputer"};
        System.out.println("== Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // Buat objek KelasKuliah dan isi mahasiswa
        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2021001", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2021002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2021003", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Dani", "2021004", 45));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "2021005", 70));

        kelas.tampilkanSemua();
        System.out.println();

        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
        System.out.println();

        // Tambah mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "2021006", 78));
        System.out.println("Setelah tambah mahasiswa baru:");
        kelas.tampilkanSemua();
    }
}