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
3.  XAMPP Control Panel.
4.  MySQL Connector/J (file .jar).

## Cara Instalasi

#### 1. Persiapan Awal
- **Jalankan XAMPP:** Buka XAMPP Control Panel, lalu klik **Start** pada modul **Apache** dan **MySQL**.
- **Clone Repositori:** Gunakan aplikasi GitHub Desktop atau `git clone` untuk mengunduh proyek ini ke komputer Anda.

#### 2. Buka Proyek & Tambahkan Library
- Buka NetBeans IDE.
- Klik `File` -> `Open Project`. Arahkan ke folder proyek yang sudah di-clone dan klik `Open Project`.
- Di panel "Projects" NetBeans, klik kanan pada folder **"Libraries"** di dalam proyek Anda.
- Pilih **"Add JAR/Folder..."**.
- Cari dan pilih file **MySQL Connector/J** (`mysql-connector-java-x.x.x.jar`) di komputer Anda. Klik **Open**.

#### 3. Konfigurasi Koneksi Database
- Buka file `dbkoneksi.java` yang ada di dalam package `koneksi`.
- Cari baris berikut: `String url = "jdbc:mysql://localhost:3307/db_pemesanan_makanan";`
- **Sesuaikan port** (misalnya `3307`) dengan port MySQL yang berjalan di XAMPP Anda. Jika Anda menggunakan port default, biasanya adalah `3306`.

#### 4. Impor Database
- Buka `phpmyadmin` di browser (`http://localhost/phpmyadmin`).
- Buat database baru dengan nama `db_pemesanan_makanan`.
- Pilih database yang baru dibuat, lalu klik tab `Import`.
- Pilih file `db_pemesanan_makanan.sql` yang ada di repositori ini dan klik `Go`.

#### 5. Buat Akun Admin Pertama
- Setelah database berhasil diimpor, **Anda belum bisa login** karena tabel `users` masih kosong.
- Di NetBeans, cari file `FormUsers.java` di dalam package `view`.
- **Jalankan file `FormUsers.java` ini secara langsung** (Klik kanan -> Run File).
- Gunakan form yang muncul untuk **menambahkan pengguna baru** dengan hak akses **"Admin"**.
- Setelah akun Admin berhasil dibuat, tutup `FormUsers`.

#### 6. Jalankan Aplikasi Utama
- Sekarang, cari file `FormLogin.java` di dalam package `view`.
- Klik kanan pada file tersebut dan pilih `Run File`.
- Login menggunakan akun Admin yang baru saja Anda buat.
- Setelah berhasil masuk ke Dashboard Admin, Anda bisa mulai menggunakan semua fitur. Jika Anda ingin menambahkan pengguna lain (misalnya akun untuk "Pegawai" atau Admin lainnya), Anda bisa menjalankan kembali file `FormUsers.java` secara langsung.
