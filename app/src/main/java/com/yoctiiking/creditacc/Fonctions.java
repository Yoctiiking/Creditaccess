package com.yoctiiking.creditacc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Fonctions {
    public static String url = "jdbc:mysql//mysql-yoctiiking.alwaysdata.net:3306/yoctiiking_db1";
    public static String user = "271646";
    public static String pass = "Azertyy12";
    public static Statement connexionSQLBDD(){

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement st = conn.createStatement();
            return st;
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
