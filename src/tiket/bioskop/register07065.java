package tiket.bioskop;
public class register07065 extends induk07065
{
   public int kodereg,id; 
   public String alamat,telp,username,pass,gender;
    
    
    public register07065()
    {
        
    }
    
    public register07065(int id,int kodereg,String nama,String alamat,String telp,String gender,String username,String pass)
    {
        this.id=id;
        this.kodereg=kodereg;
        super.nama=nama;
        this.alamat=alamat;
        this.telp=telp;
        this.gender=gender;
        this.username=username;
        this.pass=pass;
    }
}
