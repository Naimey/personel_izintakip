/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullaniciislemleri;

import java.sql.PreparedStatement;

/**
 *
 * @author geronimo
 */
public class girenbilgigörüntüleme {
    private final String personelAd;
    private final String personelSoyad;
    private final String personelTcNo;
    private final String personelSicilNo;
    private final String personelCinsiyet;
    private final String personelDogumTarihi;
    private final String personelSehir;
    private final String kadi;
    PreparedStatement ps;
    
    public girenbilgigörüntüleme(String personelAd, String personelSoyad, 
            String personelTcNo, String personelSicilNo, String personelCinsiyet,
            String personelDogumTarihi, String personelSehir,String kadi) {
        
        
        this.personelAd = personelAd;
        this.personelSoyad = personelSoyad;
        this.personelTcNo = personelTcNo;
        this.personelSicilNo = personelSicilNo;
        this.personelCinsiyet = personelCinsiyet;
        this.personelDogumTarihi = personelDogumTarihi;
        this.personelSehir = personelSehir;
        this.kadi=kadi;
    }//Constructor Sonu
    
    
}
