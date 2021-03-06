import Project.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABEL
 */
public class ManageRoom extends javax.swing.JFrame {

    /**
     * Creates new form ManageRoom
     */
    public ManageRoom() {
        initComponents();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        Calendar cal = Calendar.getInstance();
        
        StartDateField.setText(format.format(cal.getTime()));
        StartDateField.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
        
        FinishDateField.setText(format.format(cal.getTime()));
        FinishDateField.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
    }
        //Method Untuk Validasi Inputan User Berupa Angka
    public void filterAngka (KeyEvent b){
        if(Character.isAlphabetic(b.getKeyChar())){
            b.consume();
            //Tampilan peringatan jika user memasukkan karakter yang bukan angka
            JOptionPane.showMessageDialog(null, "Numeric Only!", "Warning!", JOptionPane.WARNING_MESSAGE);       
        }
    }
    
    //method untuk memfilter spasi
    public void filterSpace (KeyEvent c){
        if(Character.isWhitespace(c.getKeyChar())){
            c.consume();
            //Tampilan peringatan jika user menginputkan spasi
            JOptionPane.showMessageDialog(null, "No Spacing", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RoomType = new javax.swing.JComboBox<>();
        Bed = new javax.swing.JComboBox<>();
        Status = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        UpdateButton = new javax.swing.JLabel();
        AddButton1 = new javax.swing.JLabel();
        AddButton = new javax.swing.JLabel();
        RoomNumber1 = new javax.swing.JTextField();
        RoomNumber = new javax.swing.JTextField();
        Feature = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        StartDateField = new javax.swing.JTextField();
        FinishDateField = new javax.swing.JTextField();
        Back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoomType.setBackground(new java.awt.Color(242, 218, 218));
        RoomType.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        RoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "VVIP", "Connected" }));
        RoomType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 218, 219), 5));
        RoomType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(RoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 360, 50));

        Bed.setBackground(new java.awt.Color(242, 218, 218));
        Bed.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        Bed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));
        Bed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 218, 219), 5));
        Bed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 360, 50));

        Status.setBackground(new java.awt.Color(242, 218, 218));
        Status.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Booked", "Under Maintenance" }));
        Status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 218, 219), 5));
        Status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 360, 50));

        jScrollPane1.setBackground(new java.awt.Color(229, 155, 132));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(229, 155, 132)));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        jTable1.setBackground(new java.awt.Color(229, 155, 132));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Bed", "Price", "Feature", "Status", "Start Date", "Finish Date"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(229, 155, 132));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 150, 810, 340));

        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Update Button.png"))); // NOI18N
        UpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseExited(evt);
            }
        });
        getContentPane().add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 670, 180, -1));

        AddButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Add Button.png"))); // NOI18N
        AddButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButton1MouseExited(evt);
            }
        });
        getContentPane().add(AddButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 190, -1));

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Add Button.png"))); // NOI18N
        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButtonMouseExited(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 670, 170, -1));

        RoomNumber1.setBackground(new java.awt.Color(229, 155, 132));
        RoomNumber1.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        RoomNumber1.setBorder(null);
        RoomNumber1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(RoomNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 180, 30));

        RoomNumber.setBackground(new java.awt.Color(229, 155, 132));
        RoomNumber.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        RoomNumber.setBorder(null);
        getContentPane().add(RoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 340, 30));

        Feature.setBackground(new java.awt.Color(229, 155, 132));
        Feature.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        Feature.setBorder(null);
        getContentPane().add(Feature, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 340, 30));

        Price.setBackground(new java.awt.Color(229, 155, 132));
        Price.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        Price.setBorder(null);
        getContentPane().add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 467, 340, 30));

        StartDateField.setBackground(new java.awt.Color(229, 155, 132));
        StartDateField.setBorder(null);
        StartDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartDateFieldMouseClicked(evt);
            }
        });
        StartDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StartDateFieldKeyTyped(evt);
            }
        });
        getContentPane().add(StartDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 150, 30));

        FinishDateField.setBackground(new java.awt.Color(229, 155, 132));
        FinishDateField.setBorder(null);
        FinishDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinishDateFieldMouseClicked(evt);
            }
        });
        FinishDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FinishDateFieldKeyTyped(evt);
            }
        });
        getContentPane().add(FinishDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, 180, 30));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Back Button.png"))); // NOI18N
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 30, 30));

        jLabel1.setBackground(new java.awt.Color(229, 155, 132));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Manage Room Frame.png"))); // NOI18N
        jLabel1.setRequestFocusEnabled(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButton1MouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(3,3,3,3, new Color(229, 155, 132));
        AddButton1.setBorder(IconBorder);
        AddButton1.setForeground(new Color(229, 155, 132));
    }//GEN-LAST:event_AddButton1MouseEntered

    private void AddButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButton1MouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        AddButton1.setBorder(IconBorder);
        AddButton1.setForeground(Color.white);
    }//GEN-LAST:event_AddButton1MouseExited

    private void AddButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButton1MouseClicked
        // TODO add your handling code here:
        String RoomNum = RoomNumber1.getText();
        String StartDate = StartDateField.getText();
        String FinishDate = FinishDateField.getText();
        if(RoomNum.equals("")||StartDate.equals("")){
            JOptionPane.showMessageDialog(null, "Start Date Or Room Number is required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        String Query;
        Query = "update room set maintenance_start='"+StartDate+"', maintenance_end='"+FinishDate+"' where status= 'Under Maintenance' and roomNumber='"+RoomNum+"'";
        InsertUpdateDelete.setData(Query, "Insert Succesfully");
        setVisible(false);
        new ManageRoom().setVisible(true);
        }
    }//GEN-LAST:event_AddButton1MouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        dispose();
        Menu menu = new Menu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(255, 225, 255));
        Back.setBorder(IconBorder);
        Back.setForeground(new Color(255, 225, 255));
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        Back.setBorder(IconBorder);
        Back.setForeground(Color.white);
    }//GEN-LAST:event_BackMouseExited

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs=Select.getData("select *from room where status = 'Available' or status = 'Under Maintenance'");
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        try
        {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        String RoomNum = RoomNumber.getText();
        String RoomTypes = (String)RoomType.getSelectedItem();
        String BedType = (String)Bed.getSelectedItem();
        String RoomPrice = Price.getText();
        String RoomStatus = (String)Status.getSelectedItem();
        String RoomFeature = Feature.getText();
        if(RoomNum.equals("")||RoomTypes.equals("")||BedType.equals("")||RoomPrice.equals("")||RoomStatus.equals("")||RoomFeature.equals("")){
            JOptionPane.showMessageDialog(null, "All Field is Required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String Query;
            Query = "insert into room values('"+RoomNum+"', '"+RoomTypes+"', '"+BedType+"', '"+RoomPrice+"', '"+RoomFeature+"', '"+RoomStatus+"')";
            InsertUpdateDelete.setData(Query, "Inserted Succcesfully");
            setVisible(false);
            new ManageRoom().setVisible(true);
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void AddButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(3,3,3,3, new Color(229, 155, 132));
        AddButton.setBorder(IconBorder);
        AddButton.setForeground(new Color(229, 155, 132));
    }//GEN-LAST:event_AddButtonMouseEntered

    private void AddButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        AddButton.setBorder(IconBorder);
        AddButton.setForeground(Color.white);
    }//GEN-LAST:event_AddButtonMouseExited

    private void FinishDateFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinishDateFieldMouseClicked
        // TODO add your handling code here:
        FinishDateField.setText("");
    }//GEN-LAST:event_FinishDateFieldMouseClicked

    private void FinishDateFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FinishDateFieldKeyTyped
        // TODO add your handling code here:
        filterAngka(evt);
        filterSpace(evt);
    }//GEN-LAST:event_FinishDateFieldKeyTyped

    private void StartDateFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartDateFieldMouseClicked
        // TODO add your handling code here:
        StartDateField.setText("");
    }//GEN-LAST:event_StartDateFieldMouseClicked

    private void StartDateFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StartDateFieldKeyTyped
        // TODO add your handling code here:
        filterAngka(evt);
        filterSpace(evt);
    }//GEN-LAST:event_StartDateFieldKeyTyped

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
        // TODO add your handling code here:
        String RoomNum = RoomNumber.getText();
        String RoomTypes = (String)RoomType.getSelectedItem();
        String BedType = (String)Bed.getSelectedItem();
        String RoomPrice = Price.getText();
        String RoomStatus = (String)Status.getSelectedItem();
        String RoomFeature = Feature.getText();
            String Query;
            Query = "Update room set  roomType='"+RoomTypes+"', bed='"+BedType+"', price='"+RoomPrice+"', feature='"+RoomFeature+"', status='"+RoomStatus+"' where roomNumber='"+RoomNum+"'";
            InsertUpdateDelete.setData(Query, "Update Succcesfully");
            Query = "Update room set maintenance_start = null, maintenance_end = null where status = 'Available'";
            InsertUpdateDelete.setData(Query, "");
            setVisible(false);
            new ManageRoom().setVisible(true);
    }//GEN-LAST:event_UpdateButtonMouseClicked

    private void UpdateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(3,3,3,3, new Color(229, 155, 132));
        UpdateButton.setBorder(IconBorder);
        UpdateButton.setForeground(new Color(229, 155, 132));
    }//GEN-LAST:event_UpdateButtonMouseEntered

    private void UpdateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        UpdateButton.setBorder(IconBorder);
        UpdateButton.setForeground(Color.white);
    }//GEN-LAST:event_UpdateButtonMouseExited

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddButton;
    private javax.swing.JLabel AddButton1;
    private javax.swing.JLabel Back;
    private javax.swing.JComboBox<String> Bed;
    private javax.swing.JTextField Feature;
    private javax.swing.JTextField FinishDateField;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField RoomNumber;
    private javax.swing.JTextField RoomNumber1;
    private javax.swing.JComboBox<String> RoomType;
    private javax.swing.JTextField StartDateField;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JLabel UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
