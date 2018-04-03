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
public class Buyer extends User implements InterfacePrintActivityOfTheUser{
    
    private ArrayList<PrePurchase> carOfTheUser = new ArrayList<>();
    private int FullAmount;
    private int AmountOfPurchases;

    public Buyer(int FullAmount, int AmountOfPurchases, int identification, String name, int age, String email, String OriginCountry, String password, String userName, String type) {
        super(identification, name, age, email, OriginCountry, password, userName, type);
        this.FullAmount = FullAmount;
        this.AmountOfPurchases = AmountOfPurchases;
    }

    public void setCarOfTheUser(ArrayList<PrePurchase> carOfTheUser) {
        this.carOfTheUser = carOfTheUser;
    }

    public ArrayList<PrePurchase> getCarOfTheUser() {
        return carOfTheUser;
    }


    public int getFullAmount() {
        return FullAmount;
    }

    public void setFullAmount(int FullAmount) {
        this.FullAmount = FullAmount;
    }

    public int getAmountOfPurchases() {
        return AmountOfPurchases;
    }

    public void setAmountOfPurchases(int AmountOfPurchases) {
        this.AmountOfPurchases = AmountOfPurchases;
    }

    public void insertCarInList(PrePurchase prePurchase){
        carOfTheUser.add(prePurchase);
    }
    
    
    @Override
    
    public String printUserPersonalInformation(){
        
        //input:
        //output: return general information about a user, more the specific information of the buyer
        //retriction:
        //function: call a method of the global class and this value through a variable,
        //obtanin the value of a specific information of a buyer and return both value to method call, this function
        //retorn personal information
        
        String generalInformation = Global.printGeneralInformationOfUser();
        
        double fullAmount = Global.setPurchaseAmount();
        int purchaseAmount = Global.setQuantityOfPurchases();
        
        return generalInformation + "Paid Amount: " + fullAmount+ "\n" + 
                                    "Purchase Amunt: " + purchaseAmount+ "\n";
    }
    
    @Override
    public double calculateNote(){

        //input:
        //output: return the note of a user that is buyer
        //retriction:
        //function: realice a rout to obtain all the start won with th review and obtain the amount of review that the
        //person have, then divided the firt amount with the second and return the result to the method to call
        
        
       boolean haveReview = false;
       double temporalNote = 0;
       int amountOfReview = 0;
       double finalNote=0;
      
       if(Global.reviewList.isEmpty()){
           return finalNote;
       } 
 
        for(Review review : Global.reviewList){
            if(review.getBuyerName().equals(Global.userName) && review.getType().equals(Constant.TYPE_ESTABLISHED_FOR_DEFAULT_SELLER)){
               if(haveReview == false){
                   haveReview = true; 
               }
               
               amountOfReview = amountOfReview + 1;
               temporalNote = temporalNote + review.getStarsAmount();
           }
       }
       
       
       if(haveReview == false){
           return finalNote;
       }
       
       
       finalNote = temporalNote / amountOfReview;
       
       return finalNote;
    }
    
    @Override
    public void printActivityOfTheUser(){
        
        //input:
        //output: return information about the activity made the buyer about purchases.
        //retriction: the user must to have purchases performed to return informatio about purchases
        //function: the method introduced string to a ArrayList, this string correspond a information about purchases
        //made for the user that is buyer, retorn informacion abut prices, person , and product were purchased
        
        boolean hasBought = false;
        Global.tempArrayToPrintActivityUser.clear();
        
        
        for(Purchase purchase : Global.purchaseList){
            double totalAmountOfThePurchase = 0;
            if(purchase.getUserName().equals(Global.userName)){
                if(hasBought == false){
                    hasBought = true;
                }
                Global.tempArrayToPrintActivityUser.add("///////purchase made///////// " + "'\n\n" + "Identification Purchase: "+ purchase.getIdPurchase());
                
                Global.tempArrayToPrintActivityUser.add("\n List Of Product: " + "'\n");
   
                int id = purchase.getListOfPurchaseDetails().size();
                
                        
                for(PurchaseDetail purchaseDetails : purchase.getListOfPurchaseDetails()){
                    totalAmountOfThePurchase = totalAmountOfThePurchase + purchaseDetails.getTotalPrice();
                    Global.tempArrayToPrintActivityUser.add("Name: " + purchaseDetails.getNameProduct() +  "         Amount: " + purchaseDetails.getQuantity() + "          Total Price Of all Product: " + purchaseDetails.getTotalPrice()+"       Individual Price: "+ purchaseDetails.getIndividualPrice() + "           Seller: " + purchaseDetails.getSellerUserName() +"\n");
   
                }
                 Global.tempArrayToPrintActivityUser.add("Total Price of the Purchase: "+totalAmountOfThePurchase + "\n\n\n");
   
            }
        }
        if(hasBought == false){
            Global.tempArrayToPrintActivityUser.add( "No Registered Activities");
        }
        
        
        
    }
}
