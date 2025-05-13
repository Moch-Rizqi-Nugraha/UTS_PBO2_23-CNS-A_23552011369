
package com.mycompany.uts_pbo_2;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
public class databases {
    
    private static final String URL = "jdbc:mysql://localhost:3306/kasir_asuransi";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

