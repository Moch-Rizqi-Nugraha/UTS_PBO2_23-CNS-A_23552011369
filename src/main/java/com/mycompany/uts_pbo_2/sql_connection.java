
package com.mycompany.uts_pbo_2;

import java.sql.Connection;
public class sql_connection {
    public static void main(String[] args) {
        try {
            Connection conn = databases.connect();
            System.out.println("Koneksi ke database berhasil!");
        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
}

