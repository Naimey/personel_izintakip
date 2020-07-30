/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author geronimo
 */
public class baglanti {
    
    public final String URL="jdbc:mysql://localhost:3306/";
     public final String DB_NAME = "izintakipsistem";
    public final String ID = "root";
    public final String PW = "toor";
    public final String DRIVER = "com.mysql.jdbc.Driver";
    

    
    public Connection con;
    
    public Statement baglan() {
        
        try {
            
            //Driver yolunu belirtip örnek oluşturduk.
            Class.forName(DRIVER).newInstance();
            // Connection ile bağlantıyı sağladık.
            con = DriverManager.getConnection(URL + DB_NAME, ID, PW);
            
            //JOptionPane.showMessageDialog(null, "Veritabanına bağlantı başarılı.");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Veritabanına bağlantı başarısız!" + e);
        }// try-catch sonu
        
        return null;
    }
     public Statement baglanticik() {
        
        try {
            
          baglan().close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Veritabanına bağlantısı kapanmadı!" + e);
        }// try-catch sonu
        
        return null;
    }         
}
