package tiket.bioskop;
public class transaksi07065 {
    
    public int kodetrans,banyak;
    public String duduk;
    public jadwal07065 jadwal;
    public register07065 reg;
    public modeljadwal jdwl;
        
    public transaksi07065(int kodetrans, int banyak, String duduk)
    {
        this.kodetrans = kodetrans;
        this.banyak = banyak;
        this.duduk = duduk;
    }   
    
    public int getkodetrans()
    {
        return kodetrans;
    }
    
    public int getbanyak()
    {
        return banyak;
    }
    
    public String getduduk()
    {
        return duduk;
    }
    
}
