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
public class PurchaseDetail {
    
    private int quantity;
    private String nameProduct;
    private int idProduct;
    private double totalPrice;
    private String sellerUserName;
    private double individualPrice;
    private String state;

    public PurchaseDetail(int quantity, String nameProduct, int idProduct, double totalPrice, String sellerUserName, double individualPrice, String state) {
        this.quantity = quantity;
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.totalPrice = totalPrice;
        this.sellerUserName = sellerUserName;
        this.individualPrice = individualPrice;
        this.state = state;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getSellerUserName() {
        return sellerUserName;
    }

    public void setSellerUserName(String sellerUserName) {
        this.sellerUserName = sellerUserName;
    }

    public double getIndividualPrice() {
        return individualPrice;
    }

    public void setIndividualPrice(double individualPrice) {
        this.individualPrice = individualPrice;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

   
    
    
    
}
