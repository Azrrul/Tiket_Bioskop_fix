package tiket.bioskop;
abstract class abstractionfilm 
{
     public abstract void insert(int kode_film,String nama,String genre,int harga);
     public abstract void del(int kode_film);
     public abstract void update(int update,int kode_film,String nama,String genre,int harga);
}
