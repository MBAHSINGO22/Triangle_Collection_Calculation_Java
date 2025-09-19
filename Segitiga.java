package Modul_6;

public class Segitiga {
    // Atribut x1, y1, x2, y2, x3, y3 digunakan untuk menyimpan koordinat titik-titik segitiga.
    public double x1, y1, x2, y2, x3, y3;

    // Metode hitungSisi digunakan untuk menghitung panjang sisi segitiga antara dua titik.
    public double hitungSisi(double xa, double ya, double xb, double yb) {
        // Menghitung jarak antara dua titik menggunakan rumus jarak antara dua titik.
        return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
    }

    // Metode hitungKeliling digunakan untuk menghitung keliling segitiga.
    public double hitungKeliling() {
        // Menghitung keliling segitiga dengan menjumlahkan panjang sisi-sisi segitiga.
        return hitungSisi(x1, y1, x2, y2) + hitungSisi(x2, y2, x3, y3) + hitungSisi(x3, y3, x1, y1);
    }

    // Metode hitungLuas digunakan untuk menghitung luas segitiga.
    public double hitungLuas() {
        // Menghitung sisi segitiga.
        double s = hitungKeliling() / 2;
        // Menghitung luas segitiga menggunakan rumus luas segitiga.
        return Math.sqrt(s * (s - hitungSisi(x1, y1, x2, y2)) * (s - hitungSisi(x2, y2, x3, y3)) * (s - hitungSisi(x3, y3, x1, y1)));
    }
}
