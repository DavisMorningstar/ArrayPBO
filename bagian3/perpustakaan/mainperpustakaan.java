package bagian3.perpustakaan;

public class mainperpustakaan {
    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        perpus.tampilkanKoleksi();
        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        perpus.cariPenulis("Pramoedya");
    }
}