/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author Juliana
 */



public class WindowShowAllTheDetailsOfTheProduct extends javax.swing.JFrame {

    /**
     * Creates new form WindowShowAllTheDetailsOfTheProduct
     */
    
   
    public void showAllProductInformation(){
        
        
        //input: identification of the product , and quantity product that have the product required 
        //output:
        //restriction:
        //fuction: this method obtain the information of the user and add the informacion in square to show the 
        //information
        
        
        for(Product product : Global.productList){
            if(product.getIdProduct() == Global.identificationOfTheProductToSeeDetails){
                InterfacePrintEspecialInformationOfProducts specialInformation= (InterfacePrintEspecialInformationOfProducts)product;
                textAreaPrintProductInformation.append(
                                                        "Name: " + product.getName() +"\n" + 
                                                        "State: " + product.getState() + "\n" + 
                                                        "Quantity Available: " + product.getQuantityAvailable() + "\n" + 
                                                        "Price: " + product.getPrice() + "\n" +
                                                        "Identification: "+  product.getIdProduct()+ "\n" +
                                                        specialInformation.PrintEspecialInformationOfProducts()+
                                                        "Seller: " + product.getUserName());
                                                        
            }
        }
    }
    
    public WindowShowAllTheDetailsOfTheProduct() {
        initComponents();
        this.setTitle("Show details of the product");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        showAllProductInformation();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitleOfWindowPersonalInformation = new javax.swing.JLabel();
        bottonBackWindowProfileOfTheUserToWindowOption = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaPrintProductInformation = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitleOfWindowPersonalInformation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTitleOfWindowPersonalInformation.setForeground(new java.awt.Color(255, 255, 255));
        labelTitleOfWindowPersonalInformation.setText("Details Of The Product");
        getContentPane().add(labelTitleOfWindowPersonalInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 28, -1, -1));

        bottonBackWindowProfileOfTheUserToWindowOption.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bottonBackWindowProfileOfTheUserToWindowOption.setText("Back");
        bottonBackWindowProfileOfTheUserToWindowOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonBackWindowProfileOfTheUserToWindowOptionActionPerformed(evt);
            }
        });
        getContentPane().add(bottonBackWindowProfileOfTheUserToWindowOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 249, -1, -1));

        textAreaPrintProductInformation.setColumns(20);
        textAreaPrintProductInformation.setRows(5);
        jScrollPane1.setViewportView(textAreaPrintProductInformation);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 324, 168));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 470, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/12055294_1007424805986273_1091806738_o.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottonBackWindowProfileOfTheUserToWindowOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonBackWindowProfileOfTheUserToWindowOptionActionPerformed
        // TODO add your handling code here:
        WindowAvailableProductInSystem window = new WindowAvailableProductInSystem();
        window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bottonBackWindowProfileOfTheUserToWindowOptionActionPerformed

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
            java.util.logging.Logger.getLogger(WindowShowAllTheDetailsOfTheProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowShowAllTheDetailsOfTheProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowShowAllTheDetailsOfTheProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowShowAllTheDetailsOfTheProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowShowAllTheDetailsOfTheProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottonBackWindowProfileOfTheUserToWindowOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitleOfWindowPersonalInformation;
    private javax.swing.JTextArea textAreaPrintProductInformation;
    // End of variables declaration//GEN-END:variables
}
