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
public class Constant {
    
    
    //tax that the product that are furniture has for create the price that this must have to stay in the system
    public static final double FURNITURE_SALES_TAX = 0.02;
    
    //tax that the product that are electrodomestic has for create the price that this must have to stay in the system
    public static final double ELECTRODOMESTICS_SALES_TAX = 0.07;
    
    //tax that the product that are clothe has for create the price that this must have to stay in the system
    public static final double CLOTHES_SALES_TAX = 0.04;
    
    //this constant represent the amount inicial of all the user that are buyer. this is the amount or quantity that
    //the person must to have in the beginning
    public static final int INITIAL_AMOUNT_PAID_USER = 0;
    
    //this constant represent the amount inicial of all the user that are buyer. this is the amount or quantity that
    //the person must to have, represent the amoun og purchases that the person make in all the time
    public static final int INITIAL_AMOUNT_PURCHASE_USER = 0;
    
     //this amount represent the value that the shooping car must to have in the beginning, when it is created
    public static final double INITIAL_AMOUNT_SHOOPING_CAR = 0;
    
    //this contant represent the value that the detail must to have when it is created, represent that the detail have
    //one product when is created
    public static final int INITIAL_AMOUNT_QUANTITY_PRODUCT_DETAIL = 1;
    
    //this contant represent the position of the prepurchase in the list that the user have to stock the prepurchase,
    //this ever is located is this position because the user only can have  prepurchase
    public static final int POSITION_ABSOLUTE_IN_LIST_OF_PREPURCHASE = 0;
    
     //this constant represent the letter A how type buyer, so if the review have a "A" in the atribute type
    // the review was made for a buyer
    public static final String TYPE_ESTABLISHED_FOR_DEFAULT_BUYER = "A";
    
    //this constant represent the letter B how type seller, so if int the review have a "B" in the atribute type
    // the review was made for a seller
    public static final String TYPE_ESTABLISHED_FOR_DEFAULT_SELLER = "B";
}   
