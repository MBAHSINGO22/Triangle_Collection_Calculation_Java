# 📝 Triangle Collection Calculation Java

Sistem Segitiga di Java  
Proyek Java yang mengimplementasikan aplikasi untuk mengelola koleksi segitiga, menghitung rata-rata luas, serta menemukan segitiga terluas dan terkecil.  

---

## 📖 Deskripsi Proyek
Proyek pembelajaran Java yang mengimplementasikan sistem untuk mengelola koleksi segitiga berdasarkan koordinat titik-titiknya.  

Proyek ini berfokus pada:  
- 📊 **Segitiga.java**: Kelas untuk merepresentasikan segitiga dengan atribut koordinat titik `(x1, y1, x2, y2, x3, y3)` serta metode untuk menghitung panjang sisi, keliling, dan luas menggunakan **rumus Heron**.  
- 🔍 **KumpulanSegitiga.java**: Kelas untuk mengelola koleksi segitiga dalam array, dengan metode untuk menambah segitiga, menghitung rata-rata luas, serta mencari segitiga **terluas** dan **terkecil**.  
- 🛠️ **MainSegitiga.java**: Kelas utama untuk menguji sistem dengan membuat tiga segitiga dengan koordinat statis, menyimpannya dalam koleksi, dan menampilkan rata-rata luas serta status segitiga terluas/terkecil.    

---

## 🧠 Teknologi
- Java  

---

## 📂 Struktur File
```
Triangle_Collection_Calculation_Java/
├── src/Modul_6/
├── MainSegitiga.java       # 🛠️ Kelas utama untuk pengujian
├── Segitiga.java           # 📊 Kelas untuk data dan perhitungan segitiga
├── KumpulanSegitiga.java   # 🔍 Kelas untuk pengelolaan koleksi segitiga
```

---

## 🟢 Catatan
- Program menggunakan koordinat statis untuk tiga segitiga:  
  - `(0,0), (3,0), (0,4)`  
  - `(0,0), (4,0), (0,3)`  
  - `(0,0), (2,0), (0,2)`  
- Luas dihitung menggunakan **rumus Heron** berdasarkan panjang sisi yang dihitung dengan jarak Euclidean.  

---

## 📈 Contoh Output
**MainSegitiga.java**
```
Rata-rata Luas: 4.666666666666667
Segitiga Terluas: Ada
Segitiga Berukuran Paling Kecil: Ada
```

---

## 👨‍💻 Pengembang
**MBAHSINGO22**  
🔗 [GitHub](https://github.com/MBAHSINGO22)
