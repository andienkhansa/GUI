/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Andien
 */
public class Latihan2 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan2
     */
    public Latihan2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Kelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        OKE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Formulir");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 80, 14);
        getContentPane().add(Nama);
        Nama.setBounds(130, 30, 180, 20);

        Absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsenActionPerformed(evt);
            }
        });
        getContentPane().add(Absen);
        Absen.setBounds(130, 60, 180, 20);

        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 60, 80, 14);

        Kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelasActionPerformed(evt);
            }
        });
        getContentPane().add(Kelas);
        Kelas.setBounds(130, 90, 180, 20);

        jLabel4.setText("Kelas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 90, 80, 14);
        getContentPane().add(Alamat);
        Alamat.setBounds(130, 120, 180, 20);

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 120, 80, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 30, 80, 14);

        OKE.setText("OKE");
        OKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKEActionPerformed(evt);
            }
        });
        getContentPane().add(OKE);
        OKE.setBounds(160, 150, 90, 23);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 190, 310, 100);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void AbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbsenActionPerformed

    private void OKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKEActionPerformed
        String nama = Nama.getText();
        String absen = Absen.getText();
        String kelas = Kelas.getText();
        String alamat = Alamat.getText();
        
        TA.setText("Nama siswa :"+nama+"\n"+"Absen :"+absen+"\n"+"Kelas :"+kelas+"\n"+"Alamat siswa :"+alamat);
    }//GEN-LAST:event_OKEActionPerformed

    private void KelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KelasActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Kelas;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton OKE;
    private javax.swing.JTextArea TA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}