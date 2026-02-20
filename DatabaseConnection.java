/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.databaseconnection;

/**
 *
 * @author Admin
 */

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {
        try {
            // Use UCanAccess driver for Access DB
            String url = "jdbc:ucanaccess://VUE_Exhibition.accdb";
            Connection con = DriverManager.getConnection(url);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Participants");

            while (rs.next()) {
                System.out.println(
                    rs.getString("RegistrationID") + " " +
                    rs.getString("StudentName") + " " +
                    rs.getString("ProjectTitle")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}