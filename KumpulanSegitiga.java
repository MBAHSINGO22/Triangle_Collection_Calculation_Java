package Modul_6;

public class KumpulanSegitiga {
    // Atribut jumlahSegitiga digunakan untuk menyimpan jumlah segitiga dalam kumpulan.
    private int jumlahSegitiga;
    // Atribut daftarSegitiga digunakan untuk menyimpan array dari objek Segitiga.
    private Segitiga[] daftarSegitiga;

    // Konstruktor KumpulanSegitiga digunakan untuk membuat objek KumpulanSegitiga baru dengan
    // jumlah segitiga yang diberikan.
    public KumpulanSegitiga(int jumlahSegitiga) {
        this.jumlahSegitiga = jumlahSegitiga;
        // Membuat array daftarSegitiga dengan ukuran sesuai dengan jumlahSegitiga.
        this.daftarSegitiga = new Segitiga[jumlahSegitiga];
    }

    // Metode tambahSegitiga digunakan untuk menambahkan objek Segitiga ke dalam array
    // daftarSegitiga pada posisi yang ditentukan.
    public void tambahSegitiga(int index, Segitiga segitiga) {
        // Memeriksa apakah indeks yang diberikan valid.
        if (index >= 0 && index < jumlahSegitiga) {
            daftarSegitiga[index] = segitiga;
        } else {
            // Menampilkan pesan jika indeks tidak valid.
            System.out.println("Indeks tidak valid.");
        }
    }

    // Metode hitungRataRataLuas digunakan untuk menghitung rata-rata luas dari semua
    // segitiga dalam kumpulan.
    public double hitungRataRataLuas() {
        double totalLuas = 0;
        // Mengiterasi melalui semua segitiga dalam array.
        for (Segitiga segitiga : daftarSegitiga) {
            // Memeriksa apakah segitiga tidak null.
            if (segitiga != null) {
                // Menambahkan luas segitiga ke totalLuas.
                totalLuas += segitiga.hitungLuas();
            }
        }
        // Mengembalikan rata-rata luas.
        return totalLuas / jumlahSegitiga;
    }

    // Metode cariSegitigaTerluas digunakan untuk mencari segitiga dengan luas terluas
    // dalam kumpulan.
    public Segitiga cariSegitigaTerluas() {
        Segitiga terluas = null;
        double luasTerluas = 0;
        // Mengiterasi melalui semua segitiga dalam array.
        for (Segitiga segitiga : daftarSegitiga) {
            // Memeriksa apakah segitiga tidak null.
            if (segitiga != null) {
                double luas = segitiga.hitungLuas();
                // Memeriksa apakah luas segitiga lebih besar dari luasTerluas.
                if (luas > luasTerluas) {
                    luasTerluas = luas;
                    terluas = segitiga;
                }
            }
        }
        // Mengembalikan segitiga dengan luas terluas.
        return terluas;
    }

    // Metode cariSegitigaKecil digunakan untuk mencari segitiga dengan luas terkecil
    // dalam kumpulan.
    public Segitiga cariSegitigaKecil() {
        Segitiga kecil = null;
        double luasKecil = Double.MAX_VALUE;
        // Mengiterasi melalui semua segitiga dalam array.
        for (Segitiga segitiga : daftarSegitiga) {
            // Memeriksa apakah segitiga tidak null.
            if (segitiga != null) {
                double luas = segitiga.hitungLuas();
                // Memeriksa apakah luas segitiga lebih kecil dari luasKecil.
                if (luas < luasKecil) {
                    luasKecil = luas;
                    kecil = segitiga;
                }
            }
        }
        // Mengembalikan segitiga dengan luas terkecil.
        return kecil;
    }
}
