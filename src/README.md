# Deskripsi Proyek

Project *ShoppingCalculator2* adalah aplikasi java sederhana yang memungkinkan pengguna menghitung total biaya dari item makanan dan minuman yang dipilih. Aplikasi ini menyediakan menu dengan berbagai pilihan makanan dan minuman beserta harganya, serta memungkinkan pengguna memasukkan jumlah item yang ingin dibeli. Aplikasi ini menghitung total biaya, memberikan diskon jika total biaya mencapai ambang batas tertentu, dan menampilkan ringkasan pesanan pengguna.


# Cara Menjalankan Project
## Prasyarat
1. Java Development Kit (JDK) 8 atau lebih tinggi: Pastikan JDK sudah terpasang dan dikonfigurasi di sistem Anda.
2. IDE atau Teks Editor: Anda dapat menggunakan IDE seperti IntelliJ IDEA, Eclipse, atau teks editor dengan akses terminal.

## Langkah Menjalankan

1. Klonning atau unduh Project
    -Kloning Repository menggunakan;
        git clone <repository-url>
2. Masukkan ke Direktory Project
        cd <path-to-project-directory>
3. Kompilasi Kode Dalam Project 
    - Buka terminal di direktori proyek dan jalankan:
        javac -d bin src/org/example/ShoppingCalculator.java
4. jalankan Aplikasi
    - Eksekusi Aplikasi menggunkan :
        java -cp bin org.example.ShoppingCalculator


# Cara Menggunakan Project

1. Pilih Makanan: Pilih item makanan dari menu (opsi 1 sampai 3) dan masukkan jumlahnya.
2. Pilih Minuman: Pilih item minuman dari menu (opsi 1 sampai 3) dan masukkan jumlahnya.
3. Lihat Total Biaya: Aplikasi akan menghitung dan menampilkan total biaya untuk setiap kategori.
4. Diskon: Jika total pengeluaran melebihi Rp. 100,000, diskon sebesar 10% akan diterapkan.


# Informasi Penting

1. Harga Item:
    - Item Makanan:
        - Mie Instan: Rp. 5000
        - Ayam Krispi: Rp. 10000
        - Bakso: Rp. 15000 
    - Item Minuman:
       - Teh Manis: Rp. 5000
       - Coklat Milk: Rp. 10000
       - Vanila Milk: Rp. 8000  
2. Kebijakan Diskon: Diskon 10% akan otomatis diterapkan jika total biaya mencapai Rp. 100,000 atau lebih.

