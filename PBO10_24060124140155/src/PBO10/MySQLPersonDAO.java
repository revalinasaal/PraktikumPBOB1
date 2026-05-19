package PBO10;

/* Nama File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
 * Pembuat   : Revalina Salwa Aliya W.P / 24060124140155
 * Tanggal   : 13-05-2026
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection
                ("jdbc:mysql://localhost/pbo","root","");
 
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
   
        con.close();
    }
}