/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veritabani;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author geronimo
 */
public class giris {
    
    public boolean girisYapAdmin(String alinanAd, String alinanSifre) 
                                                          throws SQLException {
        
        //Sorguları işlemek ve gerekli ayarlamaları yapmak için
        PreparedStatement ps;
        // Sonuçları alıp kullanabilmek için
        ResultSet rs;
        
        //Veritabanına bağlantı sağlayalım.
        baglanti vb = new baglanti();
        try {
            vb.baglan();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantı Hatası!!"
                    + e);
        }
        // admin tablosundan sifre bilgisini kAdi bilgisi girilerek almaya 
        // çalışalım.
        String sql = "SELECT sifre FROM admin WHERE kadi=?";
        // sql i preparedStatement içerisine aktaralım.
        ps = vb.con.prepareStatement(sql);
      
        ps.setString(1, alinanAd);
        // sql i çalıştırıp resultSet e sonucu aktardım.
        rs = ps.executeQuery();
        // resultSet içerisinde bir sonuc dönüp dönmediğini kontrol edelim.
        while(rs.next()) {
            //resultSet ile gelen şifreyi alalım.
            String gercekSifre = rs.getString("sifre");
            // parametre olarak gelen sifre ile karşılaştırma yapalım.
            return gercekSifre.equals(alinanSifre);
        }

        // Desteklenmeyen işlem hatası için.
        throw new UnsupportedOperationException();
    }
    
       public boolean girisYapKullanıcı(String alinanAd, String alinanSifre) 
                                                          throws SQLException {
           PreparedStatement ps;
           ResultSet rs;
           baglanti vb=new baglanti();
           try {
               vb.baglan();
               
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "veritabanı baglantı hatası : "+e);
           }
           String sql="SELECT sifre FROM personel  WHERE k_adi=?";
                   //veri tabanına bağlandıktan sonra giren normal kullanıcının sifre ve kadi bilgilerini çekmek gerekecek bu sorguyla o bilgileri alamaya çalışıyoruz.
           ps=vb.con.prepareStatement(sql);
           ps.setString(1, alinanAd);
           rs=ps.executeQuery();
           
           while(rs.next()) {
            //resultSet ile gelen şifreyi alalım.
            String gercekSifre = rs.getString("sifre");
            // parametre olarak gelen sifre ile karşılaştırma yapalım.
            return gercekSifre.equals(alinanSifre);
        }

        // Desteklenmeyen işlem hatası için.
        throw new UnsupportedOperationException();
           
        
    }
}
