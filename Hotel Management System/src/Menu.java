/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
/**
 *
 * @author ABEL
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        ManageRoom = new javax.swing.JLabel();
        CheckIn = new javax.swing.JLabel();
        CheckOut = new javax.swing.JLabel();
        CustomerBill = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Manage Room.png"))); // NOI18N
        ManageRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageRoomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageRoomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageRoomMouseExited(evt);
            }
        });
        getContentPane().add(ManageRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, -1, -1));

        CheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Check In.png"))); // NOI18N
        CheckIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CheckInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CheckInMouseExited(evt);
            }
        });
        getContentPane().add(CheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        CheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Check Out.png"))); // NOI18N
        CheckOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CheckOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CheckOutMouseExited(evt);
            }
        });
        getContentPane().add(CheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, -1, -1));

        CustomerBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Customer Bill.png"))); // NOI18N
        CustomerBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerBillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CustomerBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CustomerBillMouseExited(evt);
            }
        });
        getContentPane().add(CustomerBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, -1, -1));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Exit Button.png"))); // NOI18N
        Close.setText(" ");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 30, 30));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Menu.png"))); // NOI18N
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageRoomMouseClicked
        // TODO add your handling code here:
        dispose();
        ManageRoom mng = new ManageRoom();
        mng.setLocationRelativeTo(null);
        mng.setVisible(true);
    }//GEN-LAST:event_ManageRoomMouseClicked

    private void ManageRoomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageRoomMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(255, 225, 255));
        ManageRoom.setBorder(IconBorder);
        ManageRoom.setForeground(new Color(255, 225, 255));
    }//GEN-LAST:event_ManageRoomMouseEntered

    private void ManageRoomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageRoomMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        ManageRoom.setBorder(IconBorder);
        ManageRoom.setForeground(Color.white);
    }//GEN-LAST:event_ManageRoomMouseExited

    private void CheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckInMouseClicked

    private void CheckInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckInMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(255, 225, 255));
        CheckIn.setBorder(IconBorder);
        CheckIn.setForeground(new Color(255, 225, 255));
    }//GEN-LAST:event_CheckInMouseEntered

    private void CheckInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckInMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        CheckIn.setBorder(IconBorder);
        CheckIn.setForeground(Color.white);
    }//GEN-LAST:event_CheckInMouseExited

    private void CheckOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckOutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckOutMouseClicked

    private void CheckOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckOutMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(255, 225, 255));
        CheckOut.setBorder(IconBorder);
        CheckOut.setForeground(new Color(255, 225, 255));
    }//GEN-LAST:event_CheckOutMouseEntered

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        int out=JOptionPane.showConfirmDialog(null, "Do you really want to logout from this section?", "Select", JOptionPane.YES_NO_CANCEL_OPTION);
        if(out==0){
            dispose();
                LandingPage Land = new LandingPage();
                Land.setLocationRelativeTo(null);
                Land.setVisible(true);
        }
        else if(out==1){
                Menu menu = new Menu();
                menu.setLocationRelativeTo(null);
                menu.setVisible(true);
        }
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(255, 225, 255));
        Close.setBorder(IconBorder);
        Close.setForeground(new Color(255, 225, 255));
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        Close.setBorder(IconBorder);
        Close.setForeground(Color.white);
    }//GEN-LAST:event_CloseMouseExited

    private void CustomerBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerBillMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerBillMouseClicked

    private void CustomerBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerBillMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(255, 225, 255));
        CustomerBill.setBorder(IconBorder);
        CustomerBill.setForeground(new Color(255, 225, 255));
    }//GEN-LAST:event_CustomerBillMouseEntered

    private void CustomerBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerBillMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        CustomerBill.setBorder(IconBorder);
        CustomerBill.setForeground(Color.white);
    }//GEN-LAST:event_CustomerBillMouseExited

    private void CheckOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckOutMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        CheckOut.setBorder(IconBorder);
        CheckOut.setForeground(Color.white);
    }//GEN-LAST:event_CheckOutMouseExited

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CheckIn;
    private javax.swing.JLabel CheckOut;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel CustomerBill;
    private javax.swing.JLabel ManageRoom;
    private javax.swing.JLabel Menu;
    // End of variables declaration//GEN-END:variables
}
