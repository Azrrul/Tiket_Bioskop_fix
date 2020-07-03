package tiket.bioskop;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
public class modelfilm extends abstractionfilm
{
    film07065[] film = new film07065[100];
    int index=0;
            
    @Override
    public void insert(int kode_film, String nama, String genre, int harga) 
    {
        film[index] = new film07065(kode_film,nama,genre,harga);
        index++;
    }

    @Override
    public void del(int kode_film) 
    {     
        
    }

    @Override
    public void update(int update, int kode_film, String nama, String genre, int harga)
    {
        
    }
    
    public DefaultTableModel viewTabel()
    {
        DefaultTableModel modelpek = new DefaultTableModel();
        
        modelpek.addColumn("KODE FILM");
        modelpek.addColumn("NAMA FILM");
        modelpek.addColumn("GENRE");
        modelpek.addColumn("HARGA");
        for(int i=0; i<index; i++)
        {
            Object[] temp = new Object[4];
            temp[0] = film[i].getkodefilm();
            temp[1] = film[i].getnama();
            temp[2] = film[i].getgenre();
            temp[3] = film[i].getharga();
            modelpek.addRow(temp);
        }
        return modelpek;
    }
    
    public film07065 cari(int id)
    {
        film07065 temp = null;
        for (int i=0; i<index; i++)
        {
            if (id == film[i].kodefilm)
            {
                int a=film[i].kodefilm;
                String b=film[i].nama;
                String c=film[i].genre;
                int d=film[i].harga;
                temp=new film07065(a,b,c,d);
            }
        }
        return  temp;
    }  
}
