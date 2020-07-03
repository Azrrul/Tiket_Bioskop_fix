package tiket.bioskop;
import javax.swing.table.DefaultTableModel;
public class modeljadwal 
{
    public jadwal07065[] jdwl = new jadwal07065[100];
    public int index=0;
    
       public void insert_jadwal(int kodejadwal,String tgl, String wkt, String ruang)
       {
           jdwl[index] = new jadwal07065(kodejadwal,tgl,wkt,ruang);
       }
       public void insert_film(film07065 film)
       {
           jdwl[index].relasi=film;
           index++;
       }    
       
       public DefaultTableModel viewTabel()
       {
            DefaultTableModel modeljdwl = new DefaultTableModel();

            modeljdwl.addColumn("KODE JADWAL");
            modeljdwl.addColumn("NAMA FILM");
            modeljdwl.addColumn("TANGGAL TAYANG");
            modeljdwl.addColumn("WAKTU TAYANG");
            modeljdwl.addColumn("RUANG");
            for(int i=0; i<index; i++)
            {
                Object[] temp = new Object[5];
                temp[0] = jdwl[i].getkodejadwal();
                temp[1] = jdwl[i].relasi.nama;
                temp[2] = jdwl[i].gettgl();
                temp[3] = jdwl[i].getwkt();
                temp[4] = jdwl[i].getruang();
                modeljdwl.addRow(temp);
            }
            return modeljdwl;
       }
    
       public jadwal07065 cari(int id)
       {
            jadwal07065 temp = null;
            for (int i=0; i<index; i++)
            {
                if (id == jdwl[i].kodejadwal)
                {
                    int a=jdwl[i].kodejadwal;
                    String b=jdwl[i].tgl;
                    String c=jdwl[i].wkt;
                    String d=jdwl[i].ruang;
                    temp=new jadwal07065(a,b,c,d);
                }
            }
            return  temp;
       }  
}
