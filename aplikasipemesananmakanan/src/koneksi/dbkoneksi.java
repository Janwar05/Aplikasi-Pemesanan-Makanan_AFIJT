/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane; // Import JOptionPane untuk pesan pop-up

/**
 *
 * @author ASUS
 */
public class dbkoneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) { // Hanya buat koneksi jika belum ada
            try {
                String url = "jdbc:mysql://localhost:3307/db_pemesanan_makanan"; // URL database Anda
                String user = "root";     // Username MySQL Anda
                String password = "";     // Password MySQL Anda (biasanya kosong jika tidak diset)

                // Register driver (penting untuk versi MySQL Connector yang lebih baru)
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
                
                koneksi = DriverManager.getConnection(url, user, password);
                // JOptionPane.showMessageDialog(null, "Koneksi Berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE); // Opsional: uncomment untuk cek koneksi awal
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace(); // Cetak stack trace untuk debugging lebih lanjut
            }
        }
        return koneksi;
    }
    
    // Metode untuk menutup koneksi (opsional, tapi bagus untuk praktik baik)
    public static void closeKoneksi() {
        if (koneksi != null) {
            try {
                koneksi.close();
                koneksi = null; // Set kembali ke null setelah ditutup
                System.out.println("Koneksi database ditutup.");
            } catch (SQLException e) {
                System.err.println("Error saat menutup koneksi: " + e.getMessage());
            }
        }
    }
}