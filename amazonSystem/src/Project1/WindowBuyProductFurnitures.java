/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juliana
 */
public class WindowBuyProductFurnitures extends javax.swing.JFrame {

    /**
     * Creates new form WindowBuyProductFurnitures
     */
    public WindowBuyProductFurnitures() {
        initComponents();
        
                /*inputs: none
        output: Items for Sale will become visible above the screen
        restrictions: none
        functions: DefaultListModel name is sent to and the type of product (Clothe, Establisment or Furniture)
        is sending to the printInSquareListAvailableProduct funtion
        */  
        
        this.setTitle("Items for sale");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        DefaultListModel name = (DefaultListModel) squareListOfProduct.getModel();
        Global.printInSquareListAvailableProduct(name,"Furniture");
        
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
        bottonAddProductToCar = new javax.swing.JButton();
        bottonBackWindowBuyProductToWindowOption = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        squareListOfProduct = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Items For Sale");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 39, -1, -1));

        bottonAddProductToCar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bottonAddProductToCar.setText("Add To Car");
        bottonAddProductToCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonAddProductToCarActionPerformed(evt);
            }
        });
        getContentPane().add(bottonAddProductToCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        bottonBackWindowBuyProductToWindowOption.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bottonBackWindowBuyProductToWindowOption.setText("Back");
        bottonBackWindowBuyProductToWindowOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonBackWindowBuyProductToWindowOptionActionPerformed(evt);
            }
        });
        getContentPane().add(bottonBackWindowBuyProductToWindowOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 276, -1, -1));

        squareListOfProduct.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(squareListOfProduct);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, 227, 182));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/12055294_1007424805986273_1091806738_o.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottonAddProductToCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonAddProductToCarActionPerformed
        
        
                /*inputs: the user element selected
        output: a notice announcing the user that a problem exists or that the process was successful
        restrictions: there must be more products in the list of products than the the pre-purchase for the 
        process is carried out successfully
        functions: get the product identification of the choose element byb the user compare if amountProductAvailableInListOfPrePurchase is more or the same than
        amountProductAvailableInListOfProduct if it is.. is because not exist enough inventory for the purchase
        else send the amountProductAvailableInListOfPrePurchase and the  amountProductAvailableInListOfProduct to
        the funtion insertProductsInShoopingCar and says to the user that the product has been added correctly
        */  
        
        if(squareListOfProduct.getSelectedValue() == null){
              return;
          }  
               
        String elementSelected = squareListOfProduct.getSelectedValue().toString();
        
        String [] chain = elementSelected.split(":");
        int identificationOfTheProduct=  Integer.parseInt(chain[5]);
        
      
        int amountProductAvailableInListOfPrePurchase = Global.getAmountOfProductsListOfPrePurchase(identificationOfTheProduct);

        
        int amountProductAvailableInListOfProduct = Global.getAmountOfProductsListOfProduct(identificationOfTheProduct);

        if(amountProductAvailableInListOfPrePurchase >= amountProductAvailableInListOfProduct){
            JOptionPane.showMessageDialog(this,"There is not enough inventory for the purchase");
        }
        else{
            Global.insertProductsInShoopingCar(amountProductAvailableInListOfPrePurchase, identificationOfTheProduct);
            JOptionPane.showMessageDialog(this,"It has been added to the product correctly");
           
        
        }
    }//GEN-LAST:event_bottonAddProductToCarActionPerformed

    private void bottonBackWindowBuyProductToWindowOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonBackWindowBuyProductToWindowOptionActionPerformed
        
               /*
        functions: the current screen is closed after sending the user to the screen WindowBuyProduct
        */

        WindowBuyProduct window = new WindowBuyProduct();
        window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bottonBackWindowBuyProductToWindowOptionActionPerformed

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
            java.util.logging.Logger.getLogger(WindowBuyProductFurnitures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowBuyProductFurnitures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowBuyProductFurnitures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowBuyProductFurnitures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowBuyProductFurnitures().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottonAddProductToCar;
    private javax.swing.JButton bottonBackWindowBuyProductToWindowOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList squareListOfProduct;
    // End of variables declaration//GEN-END:variables
}