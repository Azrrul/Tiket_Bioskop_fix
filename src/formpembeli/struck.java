/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formpembeli;

import controller.*;
import entitas.*;
import formadmin.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import tiket.bioskop.COVER;
 
/**
 *
 * @author Ilham Bayu Sabdani
 */
public class struck extends javax.swing.JFrame {

    /**
     * Creates new form MANAGEFILM
     */
    private modelpembeli beli;
    private Integer spn;
    int dragx,dragy;
    
    public struck()
    {
        
    }
    
    public struck(Integer x) throws SQLException {
        initComponents();
        this.beli = new modelpembeli();
        this.spn=x;
        this.view();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        cetak = new javax.swing.JTextPane();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(cetak);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 100, 300, 420);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/EXIT.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(370, 0, 50, 50);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Struk");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 0, 170, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/luke-chesser-B_oL3jEt5L4-unsplash_1.jpg"))); // NOI18N
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 420, 650);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/FORM REG.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 650);

        setSize(new java.awt.Dimension(417, 651));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - dragx,y - dragy);
    }//GEN-LAST:event_jLabel7MouseDragged

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        dragx = evt.getX();
        dragy = evt.getY();
    }//GEN-LAST:event_jLabel7MousePressed

    private void view()
    {
        try {
            Tiket transaksi = this.beli.getDataTransaksi().get(spn);
            String teks = "" + "========================TIKET========================" + "\n"
                    + "No Tiket     : " + transaksi.getKode_Tiket() + "\n"
                    + "Nama         : " + transaksi.getreg().getRegister().getNama() + "\n"
                    + "Kode reg     : " + transaksi.getreg().getKode_Reg() + "\n"
                    + "Banyak Tiket : " + transaksi.getBanyak() + "\n";

            ArrayList<Set_07056> hv = transaksi.getarrHave();
            for (int i = 0; i < hv.size(); i++) {
                teks += "\n\n" + (i + 1) + ". "
                        + "Cinema : " + hv.get(i).getjdwl().getFilm().getNama_Film() + "\n"
                        + "Genre : " + hv.get(i).getjdwl().getFilm().getGenre() + "\n"
                        + "Studio : " + hv.get(i).getjdwl().getRuang() + "\n"
                        + "Showtimes : " + hv.get(i).getjdwl().getTgl_Tayang() + " " + hv.get(i).getjdwl().getWktu_Tayang() + "\n"
                        + "Total : " + hv.get(i).getTkt().getTotal() + "Duduk : " + hv.get(i).getTkt().getDuduk() + "\n";
            }
            this.cetak.setText(teks);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        COVER a = new COVER();
     a.setVisible(true);
     setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(struck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(struck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(struck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(struck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new struck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane cetak;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}