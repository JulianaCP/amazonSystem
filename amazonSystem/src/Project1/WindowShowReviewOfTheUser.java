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
public class WindowShowReviewOfTheUser extends javax.swing.JFrame {

    /**
     * Creates new form WindowShowReviewOfTheUser
     */
    
    public void printReviewOfSeller(){
        
               //fuction: print the information of the review searching in th list of review, show all the information of
        //the review using squeare
        
        if(Global.reviewList.isEmpty()){
            textAreaPrintReviewInformation.append("Not exist Review");
        }
        else{
            for(Review review : Global.reviewList){
                if((review.getSellerName().equals(Global.userName) && (review.getType().equals(Constant.TYPE_ESTABLISHED_FOR_DEFAULT_BUYER)))){
                      textAreaPrintReviewInformation.append("Comment: " + review.getComment() +"     Rate: " + review.getStarsAmount() + "     Buyer: " + review.getBuyerName()  + "\n");
                }
            }
        }
        
    }
    
    public void printReviewBuyer(){
       //fuction: print the information of the review searching in th list of review, show all the information of
        //the review using squeare
        
        
        if(Global.reviewList.isEmpty()){
            textAreaPrintReviewInformation.append("Not exist Review");
        }
        else{
            for(Review review : Global.reviewList){
               
                if(review.getBuyerName().equals(Global.userName) && review.getType().equals(Constant.TYPE_ESTABLISHED_FOR_DEFAULT_SELLER)){
                      textAreaPrintReviewInformation.append("Comment: " + review.getComment() +"     Rate: " + review.getStarsAmount() + "     Seller: " + review.getSellerName()  + "\n");
                }
            }
        }
        
        
    }
    
    public WindowShowReviewOfTheUser() {
        initComponents();

 
        
        //function: obteain the type of user and realice call according the result
        this.setTitle("Review List");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        String typeOfUser = "";
        for(User user : Global.userList){
            if(user.getUserName().equals(Global.userName)){
                typeOfUser = user.getType();
                break;
            }
        }
        System.out.println("type: " + typeOfUser);
        if(typeOfUser.equals("Seller")){
            printReviewOfSeller();
        }
        else{
            printReviewBuyer();
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

        labelReview = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaPrintReviewInformation = new javax.swing.JTextArea();
        buttonBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelReview.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelReview.setForeground(new java.awt.Color(255, 255, 255));
        labelReview.setText("List of Reviews");
        getContentPane().add(labelReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 36, -1, -1));

        textAreaPrintReviewInformation.setColumns(20);
        textAreaPrintReviewInformation.setRows(5);
        jScrollPane1.setViewportView(textAreaPrintReviewInformation);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 71, 468, 152));

        buttonBack.setText("Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        getContentPane().add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 268, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/12055294_1007424805986273_1091806738_o.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        
        WindowProfileOfTheUser window = new WindowProfileOfTheUser();
        window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonBackActionPerformed

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
            java.util.logging.Logger.getLogger(WindowShowReviewOfTheUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowShowReviewOfTheUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowShowReviewOfTheUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowShowReviewOfTheUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowShowReviewOfTheUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelReview;
    private javax.swing.JTextArea textAreaPrintReviewInformation;
    // End of variables declaration//GEN-END:variables
}