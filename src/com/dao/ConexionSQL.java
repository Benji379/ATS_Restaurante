package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {

    public Connection conexion() {
        Connection conectar = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_ats", "root", "");
//            conectar = DriverManager.getConnection("jdbc:mysql://ba1mehzfifxfkmftb2zd-mysql.services.clever-cloud.com/ba1mehzfifxfkmftb2zd", "utap8rxvpxiooc4h", "1xiEqmB17KLFGxqSLYCH");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return conectar;
    }

}
