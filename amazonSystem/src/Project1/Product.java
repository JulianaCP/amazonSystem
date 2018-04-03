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
public abstract class Product {
    
    private int idProduct;
    private String userName;
    private String name;
    private double price;
    private int quantityAvailable;
    private String state;
    private double surcharge;
    private String type;

    public Product(int idProduct, String userName, String name, double price, int quantityAvailable, String state, double surcharge, String type) {
        this.idProduct = idProduct;
        this.userName = userName;
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.state = state;
        this.surcharge = surcharge;
        this.type = type;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


   
   public abstract double calulatePriceOfProduct(double price);
    
    
}
