/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;

/**
 *
 * @author Andien
 */
public class Kuis1 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis1
     */
    public Kuis1() {
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
        jLabel2 = new javax.swing.JLabel();
        Absen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Matpel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Nilai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        OKE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 40, 80, 14);
        getContentPane().add(Nama);
        Nama.setBounds(130, 40, 120, 20);

        jLabel2.setText("Penilaian Siswa");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 10, 110, 14);

        Absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsenActionPerformed(evt);
            }
        });
        getContentPane().add(Absen);
        Absen.setBounds(130, 70, 120, 20);

        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 70, 80, 14);
        getContentPane().add(Matpel);
        Matpel.setBounds(130, 100, 120, 20);

        jLabel4.setText("Matpel");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 100, 80, 14);
        getContentPane().add(Nilai);
        Nilai.setBounds(130, 130, 120, 20);

        jLabel5.setText("Nilai");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 130, 80, 14);

        OKE.setText("Proses");
        OKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKEActionPerformed(evt);
            }
        });
        getContentPane().add(OKE);
        OKE.setBounds(110, 160, 90, 23);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 200, 240, 100);

        setBounds(0, 0, 319, 357);
    }// </editor-fold>//GEN-END:initComponents

    private void AbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbsenActionPerformed

    private void OKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKEActionPerformed
        String nama = Nama.getText();
        String absen = Absen.getText();
        String mapel = Matpel.getText();
        int nilai = Integer.parseInt(Nilai.getText());
        String Ket = "";
        
        if(nilai <75)
            Ket="Tidak lulus";
        else if (nilai >= 75 && nilai <100)
            Ket="Lulus";
        else if (nilai == 100)
            Ket="Sempurna";
        else if (nilai > 100)
            Ket="Amazing";
        
        TA.setText("Nama : "+nama+"\nAbsen : "+absen+"\nMapel :"+mapel+"\nNilai :"+nilai+"\nKeterangan :"+Ket);
    }//GEN-LAST:event_OKEActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Matpel;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai;
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
