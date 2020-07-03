package controller;
import entitas.*;
import formpembeli.*;
import database.Koneksi;
import formpembeli.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class modelpembeli {
    Koneksi koneksi;
    ArrayList<Pelanggan> arrReg; 
    ArrayList<Tiket>arrtrans;
    ArrayList<Set_07056>arrSet;
    
    
    
    public modelpembeli() throws SQLException {
        this.koneksi = new Koneksi();
        this.arrReg = new ArrayList<>();
        this.arrtrans = new ArrayList<>();
        this.arrSet = new ArrayList<>();
    }
    
    public ArrayList<Tiket> getDataTransaksi() throws SQLException {
        this.arrtrans.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM PELANGGAN_07056 JOIN REGISTER_07056"
                + " ON PELANGGAN_07056.NOKTP = REGISTER_07056.NOKTP"
                + " JOIN TIKET_07056"
                + " ON TIKET_07056.IDREGISTER = REGISTER_07056.IDREGISTER"
                + " ORDER BY TIKET_07056.KODETIKET");
        while (rs.next()) {
            Register regst = new Register();
            
            regst.setNoktp(rs.getInt("NOKTP"));
            regst.setNama(rs.getString("NAMAUSER"));
            regst.setAlamat(rs.getString("ALAMAT"));
            regst.setTelp(rs.getInt("NO_TELP"));
            regst.setIdregister(rs.getInt("IDREGISTER"));

            Pelanggan plg = new Pelanggan();
            plg.setKode_Reg(rs.getInt("KODE_REG"));
            plg.setRegister(regst);
            plg.setPassword(rs.getString("PASSWORD"));
            
            regst.setpel(plg);
            
            Tiket trans = new Tiket();
            trans.setreg(plg);
            trans.setKode_Tiket(rs.getInt("KODETIKET"));
            trans.setBanyak(rs.getInt("JUMLAH"));

            ResultSet rsHave = this.koneksi.GetData("SELECT * FROM SET_07056 JOIN JADWAL_07056 "
                    + "ON SET_07056.KODEJADWAL = JADWAL_07056.KODEJADWAL "
                    + "JOIN TIKET_07056 "
                    + "ON JADWAL_07056.KODEFILM = TIKET_07056.KODEFILM "
                    + "WHERE SET_07056.KODETIKET = " + rs.getString("KODETIKET")
                    + " ORDER BY SET_07056.KODETIKET");
            ArrayList<Set_07056> hv = new ArrayList<>();

            while (rsHave.next()) {
                Film film = new Film();
                film.setKode_Film(rsHave.getString("KODEFILM"));
                film.setNama_Film(rsHave.getString("NAMAFILM"));
                film.setGenre(rsHave.getString("GENRE"));
                film.setRating(rs.getString("RATING"));
                film.setHarga(rsHave.getInt("HARGA"));

                Jadwal jdwl = new Jadwal();
                jdwl.setKode_Jadwal(rsHave.getString("KODEJADWAL"));
                jdwl.setfilm(film);
                jdwl.setTgl_Tayang(new Date(rsHave.getString("TANGGALTAYANG")));
                jdwl.setWktu_Tayang(rsHave.getString("JAMTAYANG"));
                jdwl.setRuang(rsHave.getString("RUANG"));

                Set_07056 have = new Set_07056();
                have.setjdwl(jdwl);
                hv.add(have);
            }
            trans.setarrHave(hv);
            
            this.arrtrans.add(trans);
        }
        return this.arrtrans;
    }

    




    public ArrayList<Set_07056> getDatacinema() throws SQLException {
            ResultSet rs = this.koneksi.GetData("SELECT * FROM SET_07056 JOIN JADWAL_07056 "
                    + "ON SET_07056.KODEJADWAL = JADWAL_07056.KODEJADWAL "
                    + "JOIN TIKET_07056 "
                    + "ON JADWAL_07056.KODEFILM = TIKET_07056.KODEFILM "
                    + " ORDER BY SET_07056.KODETIKET");
        while (rs.next()) {
                Film film = new Film();
                film.setKode_Film(rs.getString("KODEFILM"));
                film.setNama_Film(rs.getString("NAMAFILM"));
                film.setGenre(rs.getString("GENRE"));
                film.setRating(rs.getString("RATING"));
                film.setHarga(rs.getInt("HARGA"));

                Jadwal jdwl = new Jadwal();
                jdwl.setKode_Jadwal(rs.getString("KODEJADWAL"));
                jdwl.setfilm(film);
                jdwl.setTgl_Tayang(new Date(rs.getString("TANGGALTAYANG")));
                jdwl.setWktu_Tayang(rs.getString("JAMTAYANG"));
                jdwl.setRuang(rs.getString("RUANG"));

                Set_07056 have = new Set_07056();
                have.setjdwl(jdwl);
            this.arrSet.add(have);
        }
        return this.arrSet;
    }

    
    public ArrayList<Pelanggan> getDataReg() throws SQLException {
        this.arrReg.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM REGISTER_07056 JOIN PEMBELI_07056 ON REGISTER_07056.IDREGISTER = PEMBELI_07056.IDREGISTER ORDER BY REGISTER_07056.NOKTP");
        while (rs.next()) {
                Register pem = new Register();
                pem.setNoktp(rs.getInt("NOKTP"));
                pem.setIdregister(rs.getInt("IDREGISET"));
                pem.setNama(rs.getString("NAMAUSER"));
                pem.setTelp(rs.getInt("NO_TELP"));
                pem.setAlamat(rs.getString("ALAMAT"));
           
                Pelanggan reg = new Pelanggan();
                reg.setKode_Reg(rs.getInt("KODE_REG"));
                reg.setRegister(pem);
                reg.setPassword(rs.getString("PASSWORD"));

                pem.setpel(reg);
                reg.setRegister(pem);
            
            this.arrReg.add(reg);
        }
        return this.arrReg;
    }

    
    public void login(String user, String pass) throws SQLException
    {
        try {
        ResultSet rs0 = this.koneksi.GetData("CREATE VIEW LOGIN AS"
                + " SELECT a.IDREGISTER, b.NAMAUSER, a.PASSWORD, b.NO_TELP, b.ALAMAT, b.NOKTP"
                + " FROM REGISTER_07056 b JOIN PELANGGAN_07056 a"
                + " ON b.NOKTP = a.NOKTP");
        
        ResultSet rs = this.koneksi.GetData("SELECT * FROM LOGIN"
                + " WHERE IDREGISTER = " + user + " AND PASSWORD = '" + pass + "'");
        int baris = 0;

     
            while (rs.next()) {
                baris = rs.getRow();
           
            if (baris ==1) {
                Register pem = new Register();
                pem.setNoktp(rs.getInt("NOKTP"));
                pem.setNama(rs.getString("NAMAUSER"));
                pem.setTelp(rs.getInt("NO_TELP"));
                pem.setAlamat(rs.getString("ALAMAT"));
                pem.setIdregister(rs.getInt("IDREGISTER"));
           
                Pelanggan reg = new Pelanggan();
                reg.setKode_Reg(rs.getInt("IDREGISTER"));
                reg.setRegister(pem);
                reg.setPassword(rs.getString("PASSWORD"));

                pem.setpel(reg);
                reg.setRegister(pem);
                new transaksi(reg.getRegister().getNama(), reg.getKode_Reg()).setVisible(true);
                
            }else {
                
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelpembeli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void caridatareg(String cari) throws SQLException
    {
        
        ResultSet rs = this.koneksi.GetData("SELECT * FROM REGISTER_07056 JOIN PEMBELI_07056 "
                + "ON REGISTER_07056.IDREGISTER = PEMBELI_07056.IDREGISTER ORDER BY REGISTER_07056.NOKTP "
                + "WHERE PEMBELI_07056.NAMAUSER = " + "'" + cari + "'" );
        while (rs.next()) {
                Register pem = new Register();
                pem.setNoktp(rs.getInt("NOKTP"));
                pem.setNama(rs.getString("NAMAUSER"));
                pem.setTelp(rs.getInt("NO_TELP"));
                pem.setAlamat(rs.getString("ALAMAT"));
                pem.setIdregister(rs.getInt("IDREGISTER"));
           
                Pelanggan reg = new Pelanggan();
                reg.setKode_Reg(rs.getInt("IDREGISTER"));
                reg.setRegister(pem);
                reg.setPassword(rs.getString("PASSWORD"));

                pem.setpel(reg);
                reg.setRegister(pem);
        }
    }
    
    
    public void insertuser(Register pem, String nama) throws SQLException {
this.koneksi.ManipulasiData("INSERT INTO REGISTER_07056 VALUES ("+pem.getNoktp()+","+"'"+
                        pem.getNama()+"'"+","+"'"+pem.getAlamat()+"'"+","
                        +"'"+pem.getTelp().toString()+"'"+","+null+")");
    
                this.koneksi.ManipulasiData("INSERT INTO PELANGGAN_07056 VALUES (" + 
                        pem.getpel().getKode_Reg()+ 
                        ",'"  + pem.getNoktp()+ 
                        "'," + "'" + pem.getpel().getPassword() + "'" + ")");
                this.koneksi.ManipulasiData("UPDATE register_07056 SET IDREGISTER = " + 
                        pem.getpel().getKode_Reg()+ " WHERE NAMAUSER='"+ nama+"'");
    }
    
     public void inserttrans(Tiket trans) throws SQLException {
            
        this.koneksi.ManipulasiData("INSERT INTO TIKET_07056 VALUES (" + trans.getKode_Tiket() + 
                ",'" + trans.getDuduk()+  
                "'," + "'" + trans.getBanyak() + "'" +",'"+trans.getreg().getRegister()+"','"+trans.getTotal()+ "')");
                    
        for (Set_07056 seet : trans.getarrHave()) {
                this.koneksi.ManipulasiData("INSERT INTO SET_07056 VALUES ('"+trans.getKode_Tiket()+"'"+",'"+seet.getjdwl().getKode_Jadwal()+"'"+")");
            }
    }   
    
//    public void insertDuduk(String s, Integer i) throws SQLException {
//            
//        
//                this.koneksi.ManipulasiData("INSERT INTO PILIH_07056 VALUES (" + 
//                        "'" + i + "'" +  
//                        "," + "'" + s + "'" +")");
//            
//        
//    }

}
