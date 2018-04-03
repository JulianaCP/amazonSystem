/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project1;

/**
 *
 * @author Johanna
 */
public class Seller extends User implements InterfacePrintActivityOfTheUser{

    public Seller(int identification, String name, int age, String email, String OriginCountry, String password, String userName, String type) {
        super(identification, name, age, email, OriginCountry, password, userName, type);
    }
  

    @Override
    
    public String printUserPersonalInformation(){

               
        //input:
        //output: return general information about a user
        //retriction:
        //function: call a method of the global class and this value through a variable,
        //obtanin the value of a information of a user , this function retorn personal information
  
        
        String generalInformation = Global.printGeneralInformationOfUser();

        return generalInformation;
    }
    
    @Override
    public double calculateNote(){

        
        //input:
        //output: return the note of a user that is seller
        //retriction:
        //function: realice a rout to obtain all the start won with th review and obtain the amount of review that the
        //person have, then divided the firt amount with the second and return the result , and obtain the value of a
        //other amount by the categorie of the sales made, sum both data and divices by 2, return the final amount
        
       double temporalNoteAccordindStarAmount =0;
       double finalNoteAccordingStarAmount =0;
       int amountOfReview = 0;
       double finalNote =0;  // puede que no necesite la inicializacion
       double temporalNoteAccordinAmountOfMoney = 0;
       double finalNoteAccordingAmountOfMoney = 0;
       boolean haveReview = false;
       boolean haveSales = false;
        
       if(Global.reviewList.isEmpty()){
           return finalNote;
        } 
        else{
            for(Review review : Global.reviewList){
                if((review.getSellerName().equals(Global.userName) && (review.getType().equals(Constant.TYPE_ESTABLISHED_FOR_DEFAULT_BUYER)))){
                   if(haveReview == false){
                       haveReview = true;
                   }
                   temporalNoteAccordindStarAmount = temporalNoteAccordindStarAmount +  review.getStarsAmount();
                   amountOfReview = amountOfReview + 1 ;
                }
                 
           }
            
            if(haveReview == true){
                finalNoteAccordingStarAmount = temporalNoteAccordindStarAmount / amountOfReview;
            }

         
           if(Global.purchaseList.isEmpty()){
               finalNoteAccordingAmountOfMoney = 1; // es uno o cero, cuantas estrellas obtiene cuando no vendio nada
            }
           
           else{
            for(Purchase purchase : Global.purchaseList){
                for(PurchaseDetail purchaseDetails : purchase.getListOfPurchaseDetails()){
                    if(purchaseDetails.getSellerUserName().equals(Global.userName)){
                       if(haveSales == false){
                           haveSales = true;
                       }
                        temporalNoteAccordinAmountOfMoney = temporalNoteAccordinAmountOfMoney + purchaseDetails.getTotalPrice();
                  }
                }
            }

            if(temporalNoteAccordinAmountOfMoney>=0 && temporalNoteAccordinAmountOfMoney<=1000){
                finalNoteAccordingAmountOfMoney = 1;
            }
            else if( temporalNoteAccordinAmountOfMoney>1000 && temporalNoteAccordinAmountOfMoney<=2000){
                finalNoteAccordingAmountOfMoney = 2;
            }
            else if((temporalNoteAccordinAmountOfMoney>2000) && (temporalNoteAccordinAmountOfMoney<=3000)){
                finalNoteAccordingAmountOfMoney = 3;
            }
            else if((temporalNoteAccordinAmountOfMoney>3000) && (temporalNoteAccordinAmountOfMoney<=4000)){
                finalNoteAccordingAmountOfMoney = 4;
            }
            else{
                finalNoteAccordingAmountOfMoney = 5;   
            }
                    
           }  
       }
  
       if(haveReview == true && haveSales ==true){
          finalNote = finalNoteAccordingAmountOfMoney + finalNoteAccordingStarAmount;
          finalNote = finalNote/2;
       }

       return finalNote;
    }
   
    @Override
    
    public void printActivityOfTheUser(){
        
        //input:
        //output: return information about the activity made the seller about sales.
        //retriction: the user must to have sales performed to return information about sales
        //function: the method introduced string to a ArrayList, this string correspond a information about sales and 
        //creation of a product made for the user that is seller, retorn informacion about amount of product
        //item added to the systema and product sold
        
        boolean addProduct = false;
        boolean sellProduct = false;
        Global.tempArrayToPrintActivityUser.clear();
        
        for(Product product : Global.productList){
            if(product.getUserName().equals(Global.userName)){
                if(addProduct == false){
                    addProduct = true;
                }
                Global.tempArrayToPrintActivityUser.add("Item added to the system: "+ product.getName()  + "          Amount: "+ product.getQuantityAvailable() + "\n");
            }
        }
        
        for(Purchase purchase : Global.purchaseList){
            for(PurchaseDetail purchaseDetails : purchase.getListOfPurchaseDetails()){
                if(purchaseDetails.getSellerUserName().equals(Global.userName)){
                    if(sellProduct == false){
                        sellProduct = true;
                    }
                  Global.tempArrayToPrintActivityUser.add("System product sold: "+ purchaseDetails.getNameProduct()  + "            Amount Sold: "+ purchaseDetails.getQuantity() + "           Price: " + purchaseDetails.getTotalPrice()  + "             Buyer: " + purchase.getUserName() + "\n");
                }
            }
        }
        if((addProduct == false) && (sellProduct == false)){
           Global.tempArrayToPrintActivityUser.add( "No Registered Activities");
 
        }
        
    }

    
        
}
