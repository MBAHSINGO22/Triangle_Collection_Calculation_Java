package Modul_6;

public class MainSegitiga {
    public static void main(String[] args) {
        // Membuat objek segitiga baru dengan koordinat titik-titik yang diberikan.
        Segitiga segitiga1 = new Segitiga();
        segitiga1.x1 = 0; segitiga1.y1 = 0;
        segitiga1.x2 = 3; segitiga1.y2 = 0;
        segitiga1.x3 = 0; segitiga1.y3 = 4;

        Segitiga segitiga2 = new Segitiga();
        segitiga2.x1 = 0; segitiga2.y1 = 0;
        segitiga2.x2 = 4; segitiga2.y2 = 0;
        segitiga2.x3 = 0; segitiga2.y3 = 3;

        Segitiga segitiga3 = new Segitiga();
        segitiga3.x1 = 0; segitiga3.y1 = 0;
        segitiga3.x2 = 2; segitiga3.y2 = 0;
        segitiga3.x3 = 0; segitiga3.y3 = 2;

        // Membuat objek KumpulanSegitiga baru dengan jumlah segitiga yang diberikan.
        KumpulanSegitiga kumpulanSegitiga = new KumpulanSegitiga(3);
        // Menambahkan segitiga ke dalam kumpulan segitiga.
        kumpulanSegitiga.tambahSegitiga(0, segitiga1);
        kumpulanSegitiga.tambahSegitiga(1, segitiga2);
        kumpulanSegitiga.tambahSegitiga(2, segitiga3);

        // Menghitung dan mencetak rata-rata luas dari semua segitiga dalam kumpulan.
        double rataRataLuas = kumpulanSegitiga.hitungRataRataLuas();
        System.out.println("Rata-rata Luas: " + rataRataLuas);

        // Mencari dan mencetak segitiga dengan luas terluas dalam kumpulan.
        Segitiga terluas = kumpulanSegitiga.cariSegitigaTerluas();
        System.out.println("Segitiga Terluas: " + (terluas != null ? "Ada" : "Tidak ada"));

        // Mencari dan mencetak segitiga dengan luas terkecil dalam kumpulan.
        Segitiga kecil = kumpulanSegitiga.cariSegitigaKecil();
        System.out.println("Segitiga Berukuran Paling Kecil: " + (kecil != null ? "Ada" : "Tidak ada"));
    }
}

