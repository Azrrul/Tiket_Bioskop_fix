package entitas;
public class Register {
    private Integer noktp;
    private Pelanggan pelanggan;
    public String Nama;
    private String Alamat;
    private Integer Telp;
    private Integer idregister;
    

    public Pelanggan getpel(){
        return pelanggan;
    }
    public void setpel(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }
    public String getNama(){
        return Nama;
    }
    public void setNama(String Nama){
        this.Nama=Nama;
    }

    public Integer getNoktp() {
        return noktp;
    }

    public void setNoktp(Integer noktp) {
        this.noktp = noktp;
    }
    public String getAlamat(){
        return Alamat;
    }
    public void setAlamat(String Alamat){
        this.Alamat=Alamat;
    }
    public Integer getTelp(){
        return Telp;
    }
    public void setTelp(Integer Telp){
        this.Telp=Telp;
    }      

    public Integer getIdregister() {
        return idregister;
    }

    public void setIdregister(Integer idregister) {
        this.idregister = idregister;
    }
    
}
