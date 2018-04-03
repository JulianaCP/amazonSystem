/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project1;

import java.util.ArrayList;

/**
 *
 * @author Johanna
 */
public class Purchase {
    
   private ArrayList<PurchaseDetail> listOfPurchaseDetails= new ArrayList<>();
   private int idPurchase;
   private String userName;
   private String date;
   private double totalQuantity;

    public Purchase(int idPurchase, String userName, String date, double totalQuantity) {
        this.idPurchase = idPurchase;
        this.userName = userName;
        this.date = date;
        this.totalQuantity = totalQuantity;
    }

   

    public ArrayList<PurchaseDetail> getListOfPurchaseDetails() {
        return listOfPurchaseDetails;
    }

    public void setListOfPurchaseDetails(ArrayList<PurchaseDetail> listOfPurchaseDetails) {
        this.listOfPurchaseDetails = listOfPurchaseDetails;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
   
    public void insertDetailsInListOfPurchaseDetails(PurchaseDetail purchaseDetails){
        this.listOfPurchaseDetails.add(purchaseDetails);
    }
   
  
}
