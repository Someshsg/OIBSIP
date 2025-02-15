/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationsytem;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;
    PreparedStatement pst;
   public conn() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/p1", "root", "Somesh@10");
            s = c.createStatement();
           
        } catch (SQLException e) {
        }
    }

   public PreparedStatement prepareStatement(String sql) throws Exception
           {
               return c.prepareStatement(sql);
           }
}
