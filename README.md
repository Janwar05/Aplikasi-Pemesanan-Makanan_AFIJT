# Aplikasi-Pemesanan-Makanan_AFIJT

# Aplikasi Pemesanan Makanan (Kasir)

Aplikasi desktop untuk manajemen pemesanan makanan, dibuat menggunakan Java Swing dan MySQL.

## Fitur
- Manajemen User oleh Admin (Tambah, Edit, Hapus akun Pegawai).
- Login dengan hak akses yang dibedakan (Admin dan Pegawai), di mana akun harus dibuat oleh Admin terlebih dahulu.
- CRUD (Create, Read, Update, Delete) untuk data Menu dan Pelanggan oleh Admin.
- Proses transaksi pemesanan dengan keranjang belanja.
- Manajemen stok otomatis (stok berkurang setelah transaksi).
- Laporan transaksi dengan detail pemesanan interaktif (double-click).

## Kebutuhan Sistem
1.  JDK (Java Development Kit) 8 atau yang lebih baru.
2.  NetBeans IDE 8.2 atau yang lebih baru.
3.  XAMPP dengan server database MySQL.

## Cara Instalasi
1.  **Clone Repositori:**
    - Gunakan aplikasi GitHub Desktop atau `git clone` untuk mengunduh proyek ini.
2.  **Impor Database:**
    - Buka XAMPP dan jalankan Apache & MySQL.
    - Buka `phpmyadmin` di browser.
    - Buat database baru dengan nama `db_pemesanan_makanan`.
    - Pilih database yang baru dibuat, lalu klik tab `Import`.
    - Pilih file `db_pemesanan_makanan.sql` yang ada di repositori ini dan klik `Go`.
3.  **Buka Proyek di NetBeans:**
    - Buka NetBeans IDE.
    - Klik `File` -> `Open Project`.
    - Arahkan ke folder proyek yang sudah di-clone dan klik `Open Project`.
4.  **Jalankan Aplikasi:**
    - Cari file `FormLogin.java` di dalam package `view`.
    - Klik kanan pada file tersebut dan pilih `Run File`.
    - Login dengan akun yang tersedia di database (misal: username `admin`, password `admin`).
