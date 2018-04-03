/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.util.ArrayList;

/**
 *
 * @author Juliana
 */
public class PrePurchase {
    
    private String userName;
    private double totalQuantity;
    private ArrayList<Detail> listDetails = new ArrayList<>();
    

    public PrePurchase(String userName, double totalQuantity) {
        this.userName = userName;
        this.totalQuantity = totalQuantity;
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public ArrayList<Detail> getListDetails() {
        return listDetails;
    }

    public void setListDetails(ArrayList<Detail> listDetails) {
        this.listDetails = listDetails;
    }
    
    public int sendQuantityOfProduct(int identification,PrePurchase pre){
        
            /*inputs: identification of the product and the user pre purchase
        output: the amount of the quantity of product
        restrictions: none
        functions: is the item with the same identification which is sent and sends the amount of this
        */
        
        int amount=0;
        for(Detail detail : pre.listDetails){
            if(detail.getIdProduct() == identification){
                amount= detail.getQuantity();
                
        
            }
        }
        return amount;
    }
    

    public void changeInformationDetailPrePurchase(int identification, PrePurchase pre){
        
                /*inputs: identification of the product and the user pre purchase
        output: none
        restrictions: the product identification detail must be the same as the product sent by parameter
        functions: is the item with the same identification which is sent and sends the amount of this
        */ 
        
        for(Detail detail : pre.listDetails){
            if(detail.getIdProduct() == identification){
    
                double totalPrice = detail.getTotalPrice();
                totalPrice=totalPrice+detail.getIndividualPrice();
                detail.setTotalPrice(totalPrice);
                
                int temp= detail.getQuantity();
                temp= temp+1;
                detail.setQuantity(temp);
                
            }
        }
    }
    
    
    public void insertDetailInListOfPrePurchase(Detail detail){
        
                /*inputs: a Detail object
        output: none
        restrictions: none
        functions: add a new detail to the listDetails
        */  
        
        this.listDetails.add(detail);
        
    }
 
    
}
