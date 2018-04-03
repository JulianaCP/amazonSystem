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
public class Review {
    
    
    private int ID;
    private double starsAmount;
    private String comment;
    private String BuyerName;
    private String sellerName;
    private String type;
    private String nameProduct;

    public Review(int ID, double starsAmount, String comment, String BuyerName, String sellerName, String type, String nameProduct) {
        this.ID = ID;
        this.starsAmount = starsAmount;
        this.comment = comment;
        this.BuyerName = BuyerName;
        this.sellerName = sellerName;
        this.type = type;
        this.nameProduct = nameProduct;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getStarsAmount() {
        return starsAmount;
    }

    public void setStarsAmount(double starsAmount) {
        this.starsAmount = starsAmount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBuyerName() {
        return BuyerName;
    }

    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

   
  
    
    
}
