
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection()
            throws SQLException {

        String url =
                "jdbc:mysql://localhost:3306/library_db";

        String username = "root";

        // Replace with your actual MySQL password
        String password = "Library@2026New";

        return DriverManager.getConnection(
                url, username, password);
    }
}
