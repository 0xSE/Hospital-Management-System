
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xsame
 */
public class DiagonsisF extends javax.swing.JFrame {

    /**
     * Creates new form DiagonsisF
     */
    public DiagonsisF() {
        initComponents();
    }
// 
    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searsh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        symptomFiled = new javax.swing.JTextField();
        diagnosisField = new javax.swing.JTextField();
        medicinesField = new javax.swing.JTextField();
        idValue = new javax.swing.JTextField();
        messageError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showDataInTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        searsh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searsh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searsh.setText("Searsh");
        searsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searshActionPerformed(evt);
            }
        });
        jPanel1.add(searsh);
        searsh.setBounds(397, 28, 140, 29);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(530, 370, 118, 29);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon--1.png"))); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(80, 370, 113, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Symptom`s");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 180, 103, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Diagnosis");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 240, 87, 27);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Medicines");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 290, 90, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Patient ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 30, 93, 22);
        jPanel1.add(symptomFiled);
        symptomFiled.setBounds(210, 180, 370, 22);
        jPanel1.add(diagnosisField);
        diagnosisField.setBounds(210, 240, 370, 22);
        jPanel1.add(medicinesField);
        medicinesField.setBounds(210, 290, 370, 22);

        idValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idValueActionPerformed(evt);
            }
        });
        jPanel1.add(idValue);
        idValue.setBounds(240, 30, 119, 22);
        jPanel1.add(messageError);
        messageError.setBounds(240, 60, 157, 20);

        showDataInTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Contact"
            }
        ));
        jScrollPane1.setViewportView(showDataInTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 90, 630, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new patient background.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(727, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idValueActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_idValueActionPerformed

    private void searshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searshActionPerformed
                try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS", "root", "samehpop");
 
        PreparedStatement stmt= con.prepareStatement("select *from patient");
        ResultSet set =  stmt.executeQuery();
        DefaultTableModel dm= new DefaultTableModel();
        String id="";
        while(set.next() && true){
            if (set.getString(1).equals(idValue.getText())){
                id=set.getString(1);
                break;
            }
        }
        if(id.equals("")){
            idValue.setText("");
            JOptionPane.showMessageDialog(this,"ID Not Found");
        }else{
        dm.addColumn("ID");
        dm.addColumn("Name");
        dm.addColumn("Age");
        dm.addColumn("Gender");
        dm.addColumn("Address");
        dm.addColumn("Contact No.");
        stmt= con.prepareStatement("select *from patient where id= ?");
        
        int intId=Integer.parseInt(id);
        stmt.setInt(1,intId);
        set =  stmt.executeQuery();
        while(set.next() && true){
        String r[]={ set.getString(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5), set.getString(6)} ;
        dm.addRow(r);
        }
        showDataInTable.setModel(dm);
        
        }
        } catch (SQLException ex) {
                System.out.println("Error");
        }
                

        // TODO add your handling code here:
    }//GEN-LAST:event_searshActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            
        try {
             
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS", "root", "samehpop");
            PreparedStatement stmt = con.prepareStatement("insert into patient_details( id_connector , symptom , diagnosis, medicines  ) values (?,?,?,?) ");
            String symptom= symptomFiled.getText();
            String diagnosis = diagnosisField.getText();
            String medicines = medicinesField.getText();
            int intID= Integer.parseInt(idValue.getText());
            stmt.setInt(1,intID);
            stmt.setString(2,symptom);
            stmt.setString(3,diagnosis);
            stmt.setString(4,medicines);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "insertion successful");
            diagnosisField.setText("");
            medicinesField.setText("");
            symptomFiled.setText("");
        } catch (SQLException ex) {
                System.out.println("Error");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(DiagonsisF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagonsisF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagonsisF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagonsisF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagonsisF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diagnosisField;
    private javax.swing.JTextField idValue;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medicinesField;
    private javax.swing.JLabel messageError;
    private javax.swing.JButton searsh;
    private javax.swing.JTable showDataInTable;
    private javax.swing.JTextField symptomFiled;
    // End of variables declaration//GEN-END:variables
}
