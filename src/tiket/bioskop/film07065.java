package tiket.bioskop;
public class film07065 extends induk07065
{
    public int kodefilm,harga;
    String genre;
    
    public film07065 (int kode_film, String nama, String genre, int harga)
    {
        this.kodefilm=kode_film;
        super.nama=nama;
        this.genre=genre;
        this.harga=harga;
    }
    
    protected int getkodefilm()
    {
        return kodefilm;
    }
    
    protected String getnama()
    {
        return nama;
    }
    
    protected String getgenre()
    {
        return genre;
    }
    
    protected int getharga()
    {
        return harga;
    }
    
}
