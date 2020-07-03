package tiket.bioskop;
import formpembeli.struck;
import javax.swing.table.DefaultTableModel;

public class modeltrans 
{
     public transaksi07065[] trans = new transaksi07065[100];
     public int index=0,simpan;

    
       public void insert_trans(int kodetrans, int banyak, String duduk)
       {
           trans[index] = new transaksi07065( kodetrans, banyak, duduk);
       }
       public void insert_jdwl(jadwal07065 jdwl)
       {
           trans[index].jadwal=jdwl;
       }    
       public void insert_user(register07065 user)
       {
           trans[index].reg=user;
           index++;
       }
       public void view(int save)
       {
           simpan=save;
       }
       
       
              
       public DefaultTableModel viewTabel()
       {
            DefaultTableModel modeljdwl = new DefaultTableModel();

            modeljdwl.addColumn("KODE TRANSAKSI");
            modeljdwl.addColumn("DUDUK");
            modeljdwl.addColumn("TOTAL");
            for(int i=0; i<index; i++)
            {
                Object[] temp = new Object[5];
                temp[0] = trans[i].getkodetrans();
                temp[1] = trans[i].getduduk();
                temp[2] = (trans[i].getbanyak()*trans[i].jadwal.relasi.harga);
                modeljdwl.addRow(temp);
            }
            return modeljdwl;
       }


}
