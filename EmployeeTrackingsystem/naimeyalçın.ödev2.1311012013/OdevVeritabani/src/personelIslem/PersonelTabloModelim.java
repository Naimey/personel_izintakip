package personelIslem;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class PersonelTabloModelim extends AbstractTableModel {
    
    // Tabloda bulunan satır ve sutun sayıları için.
    private int satirSayisi;
    private int sutunSayisi;
    // Tablo içeriğinin gözükmesi için gerekli olan resultset
    private ResultSet rs;
    // Tablo içerisinde gösterilecek olan verilerin saklanması için.
    private ArrayList veriler = new ArrayList();
    
    //Constructor Metod
    
    // Tablo modeli çağrıldığı anda tabloda verilerin gözükmesi istiyoruz.
    // Verilerin gözükmesini ayarlamak için model çağrıldığı anda ResultSet ile
    // verilerinde gelmesi ve ayarlanmasını istiyoruz.Bunun içinde constructor içerisinde
    // parametre olarak ResultSet'i gönderdik.
    public PersonelTabloModelim(ResultSet rs) throws SQLException {
        
        this.rs = rs;
        
        ResultSetMetaData rsmd = rs.getMetaData();
        
        satirSayisi = 0;
        
        sutunSayisi = rsmd.getColumnCount();
        
        while(rs.next()) {
            
            Object[] satirBilgi = new Object[sutunSayisi];
            
            for(int i = 0; i < sutunSayisi; i++) {
                satirBilgi[i] = rs.getObject(i + 1);
            }
            
            veriler.add(satirBilgi);
            
            satirSayisi++;
        }
    }
    
    @Override
    public int getRowCount() {
        return satirSayisi;
    }

    @Override
    public int getColumnCount() {
        return sutunSayisi;
    }

    //Bu metod tablo üzerinde tıklanan veriyi geri döndürür.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Verileri arraylist içerisinde satır satır kaydettiğimiz için.s
        Object[] satirBilgi = (Object[]) veriler.get(rowIndex);
        
        // Sutun index seçerekte satırBilgi üzerinden veriye ulaştık.
        return satirBilgi[columnIndex];
    }
    
    public String[] sutunIsimleri = {"SicilNo", "AD", "soyad", "TC NO", "Cinsiyet", "Doğum Tarihi", "Şehir","kadi","sifre"};
    @Override
    public String getColumnName(int sutunIndex) {
        
        return sutunIsimleri[sutunIndex];
    }
}
