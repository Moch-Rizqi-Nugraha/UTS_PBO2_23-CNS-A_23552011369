
package com.mycompany.uts_pbo_2;
import java.sql.*;
import java.util.Scanner;
public class Kasir_ansuransi {
    public static void main(String[] args) {
         try (Connection conn = databases.connect();
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Masukkan ID Nasabah: ");
            int idNasabah = scanner.nextInt();

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM nasabah WHERE id = ?");
            stmt.setInt(1, idNasabah);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nama = rs.getString("nama");
                int umur = rs.getInt("umur");
                System.out.println("Nama: " + nama + ", Umur: " + umur);

                System.out.print("Jenis Asuransi (kesehatan/jiwa): ");
                String jenis = scanner.next();

                Ansuransi Ansuransi;
                if (jenis.equalsIgnoreCase("kesehatan")) {
                    Ansuransi = new Ansuransi_Kesehatan(idNasabah, umur);
                } else {
                    Ansuransi = new Ansuransi_jiwa(idNasabah, umur);
                }

                double premi = Ansuransi.hitungPremi();
                System.out.println("Premi: " + premi);

                PreparedStatement insertPolis = conn.prepareStatement(
                    "INSERT INTO polis(nasabah_id, jenis, premi) VALUES (?, ?, ?)"
                );
                insertPolis.setInt(1, idNasabah);
                insertPolis.setString(2, jenis);
                insertPolis.setDouble(3, premi);
                insertPolis.executeUpdate();
                System.out.println("Data polis disimpan.");
            } else {
                System.out.println("Nasabah tidak ditemukan.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


