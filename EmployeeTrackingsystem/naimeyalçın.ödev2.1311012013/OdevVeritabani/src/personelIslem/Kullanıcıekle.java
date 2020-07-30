package personelIslem;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import veritabani.baglanti;

/**
 *
 * @author byporti
 */
public class Kullanıcıekle {
    
    private final String kullanıcıAd;
    private final String kullanıcıSoyad;
    private final String kullanıcıTcNo;
    private final String kullanıcıSicilNo;
    private final String kullanıcıCinsiyet;
    private final String kullanıcıDogumTarihi;
    private final String kullanıcıSehir;
    private final String kullanıcıadi;
    private final String sifre;
    
    //Sorguyu işlemek için.
    PreparedStatement ps;
    
        public  boolean kullanıcıEkle(Kullanıcıekle p) {
        
        try {
            
            baglanti vb = new baglanti();
            vb.baglan();
            
            String sql = "INSERT INTO personel(sicil_no,ad, soyad, tc_no, "
                    + " cinsiyet, dogum_tarihi, sehir,k_adi,sifre) VALUES "
                    + "(?, ?, ?, ?, ?, ?, ?,?,?)";
            
            ps = vb.con.prepareStatement(sql);
            ps.setString(2,p.kullanıcıAd );
            ps.setString(3, p.kullanıcıSoyad);
            ps.setString(4, p.kullanıcıTcNo);
            ps.setString(1, p.kullanıcıSicilNo);
            ps.setString(5, p.kullanıcıCinsiyet);
            ps.setString(6, p.kullanıcıDogumTarihi);
            ps.setString(7, p.kullanıcıSehir);
            ps.setString(8, p.kullanıcıadi);
            ps.setString(9, p.sifre);
            
            // executeQuery demememizin sebebi resultSete aktarma yapmayacağımız için.
            // Sadece sorguyu çalıştırıpma işlemi yapıp çalışma sonucunda true or false
            // değerlerini kontrol ediceğimiz için.
            ps.execute();
            
            //kontrol için sql çıktısını alalım.
            //System.out.println(ps);
            vb.con.close();
            return true;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA\n" + e);
            return false;
        }// try-catch block sonu
        
    }//personel ekle metodu sonu
    public Kullanıcıekle(String personelAd, String personelSoyad, 
            String personelTcNo, String personelSicilNo, String personelCinsiyet,
            String personelDogumTarihi, String personelSehir,String kadi,String sifre) {
        
        
        this.kullanıcıAd=personelAd;
        this.kullanıcıSoyad = personelSoyad;
        this.kullanıcıTcNo = personelTcNo;
        this.kullanıcıSicilNo = personelSicilNo;
        this.kullanıcıCinsiyet = personelCinsiyet;
        this.kullanıcıDogumTarihi = personelDogumTarihi;
        this.kullanıcıSehir = personelSehir;
        this.kullanıcıadi = kadi;
        this.sifre = sifre;
    }//Constructor Sonu
    

    
}// Class Sonu
