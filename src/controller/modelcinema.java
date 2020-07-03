package controller;
    import entitas.*;
    import database.Koneksi;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.text.SimpleDateFormat;
    import java.util.ArrayList;
    import java.util.Date;

public class modelcinema {
    Koneksi koneksi;
    ArrayList<Film> arrFilm;
    ArrayList<Jadwal> arrJadwal;
    
    public modelcinema() throws SQLException {
        this.koneksi = new Koneksi();
        this.arrFilm = new ArrayList<>();
        this.arrJadwal = new ArrayList<>();
    }

    public ArrayList<Film> getDataFilm() throws SQLException {
        this.arrFilm.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM FILM_07056 ORDER BY KODEFILM ASC");
        while (rs.next()) {
            Film film = new Film();
            film.setKode_Film(rs.getString("KODEFILM"));
            film.setNama_Film(rs.getString("NAMAFILM"));
            film.setGenre(rs.getString("GENRE"));
            film.setRating(rs.getString("RATING"));
            film.setHarga(rs.getInt("HARGA"));
            this.arrFilm.add(film);
        }
        return this.arrFilm;
    }

    public ArrayList<Jadwal> getDataJadwal() throws SQLException {
        this.arrJadwal.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM JADWAL_07056 JOIN FILM_07056 "
                + "ON JADWAL_07056.KODEFILM = FILM_07056.KODEFILM");
        while (rs.next()) {
            Film film = new Film();
            film.setKode_Film(rs.getString("KODEFILM"));
            film.setNama_Film(rs.getString("NAMAFILM"));
            film.setGenre(rs.getString("GENRE"));
            film.setRating(rs.getString("RATING"));
            film.setHarga(rs.getInt("HARGA"));
            
            Jadwal jadwal = new Jadwal();
            jadwal.setKode_Jadwal(rs.getString("KODEJADWAL"));
            jadwal.setfilm(film);
            jadwal.setTgl_Tayang(new Date(rs.getString("TANGGALTAYANG")));
            jadwal.setWktu_Tayang(rs.getString("JAMTAYANG"));
            jadwal.setRuang(rs.getString("RUANG"));
            
            this.arrJadwal.add(jadwal);
        }
        return this.arrJadwal;
    }
//======================================FILM INSERT==================================================================
    public void insertfilm(Film film) throws SQLException {
        
            this.koneksi.ManipulasiData("INSERT INTO FILM_07056 VALUES("+"'"+film.getKode_Film()+"'"+","+"'"+film.getNama_Film()+"'"+","+"'"+film.getGenre()+"'"+","+"'"+film.getRating()+"'"+","+film.getHarga()+")");
    }
    public void deletefilm(Integer i) throws SQLException {
        
            this.koneksi.ManipulasiData("DELETE FROM FILM_07056 WHERE KODEFILM = '"+i+"'");
    }
    public void updatefilm(Integer harga, String x) throws SQLException {
        
            this.koneksi.ManipulasiData("UPDATE FILM_07056 SET HARGA ="+harga.toString()+" WHERE KODEFILM = "+"'"+x+"'");
    }
//==============================================jadwal INSERT=======================================================
    public void insertjdwl(Jadwal jdwl) throws SQLException {
            String tgl = new SimpleDateFormat("dd/MM/yyyy").format(jdwl.getTgl_Tayang());
            this.koneksi.ManipulasiData("INSERT INTO JADWAL_07056 VALUES("+jdwl.getKode_Jadwal()+","+"'"+jdwl.getFilm().getKode_Film()+"'"+",TO_DATE('" + tgl + "','dd/MM/yyyy'),"+"'"+jdwl.getWktu_Tayang()+"'"+","+"'"+jdwl.getRuang()+"'"+")");
    }
    public void deletejdwl(Integer i) throws SQLException {
       this.koneksi.ManipulasiData("DELETE FROM jadwal_07056 WHERE KODEJADWAL = "+i);
    }
    public void updatejdwl(String kode, String ruang, String jam) throws SQLException {
        this.koneksi.ManipulasiData("UPDATE JADWAL_07056 SET JAMTAYANG ='"+jam+"',"+"RUANG = '"+ruang+"' WHERE KODEJADWAL = '"+kode+"'");
    }

}
