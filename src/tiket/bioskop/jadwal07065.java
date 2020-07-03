package tiket.bioskop;
public class jadwal07065 
{
    int kodejadwal;
    public String tgl,wkt,ruang;
    public film07065 relasi;
        
    public jadwal07065(int kodejadwal,String tgl, String wkt, String ruang)
    {
        this.kodejadwal=kodejadwal;
        this.tgl=tgl;
        this.wkt=wkt;
        this.ruang=ruang;
    }   
    
    public int getkodejadwal()
    {
        return kodejadwal;
    }
    
    public String gettgl()
    {
        return tgl;
    }
    
    public String getwkt()
    {
        return wkt;
    }
    
    public String getruang()
    {
        return ruang;
    }
}
