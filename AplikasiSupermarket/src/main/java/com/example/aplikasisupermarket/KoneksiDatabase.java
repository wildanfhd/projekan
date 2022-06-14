package com.example.aplikasisupermarket;

import java.sql.*;

public class KoneksiDatabase {

    private Connection conn;
    private Statement st;

    // Sebuah Method yang berfungsi untuk menghubungkan database dengan port 3306
    public KoneksiDatabase() {
        try {
            String user = "root";
            String password = "";
            String urldb = "jdbc:mysql://localhost:3306/db_supermarket";
            conn = DriverManager.getConnection(urldb, user, password);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e);
        } catch (Exception e) {
            System.out.println("Terjadi error yang tidak diketahui!" + e);
        }
    }
}