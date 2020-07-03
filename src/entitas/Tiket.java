package entitas;

import java.util.ArrayList;

public class Tiket {
    private Integer Kode_Tiket;
    private Pelanggan reg;
    private Integer Banyak;
    private ArrayList<Set_07056>arrHave;
    private String duduk;
    private Integer total;
    public Integer getKode_Tiket(){
        return Kode_Tiket;
    }

    public String getDuduk() {
        return duduk;
    }

    public void setDuduk(String duduk) {
        this.duduk = duduk;
    }
    public void setKode_Tiket(Integer Kode_Tiket){
        this.Kode_Tiket=Kode_Tiket;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    public Pelanggan getreg(){
        return reg;
    }
    public void setreg(Pelanggan reg){
        this.reg=reg;
    }
    public Integer getBanyak(){
        return Banyak;
    }
    public void setBanyak(Integer Banyak){
        this.Banyak=Banyak;
    }
    public void setarrHave(ArrayList<Set_07056>arrHave){
        this.arrHave=arrHave;
    }
    public ArrayList<Set_07056>getarrHave(){
        return arrHave;
    }
    

}
