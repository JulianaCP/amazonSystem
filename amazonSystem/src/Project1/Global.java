/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Juliana
 */
public class Global {
   
    // arrayList that stores all the product of all the application, its a principal list
    public static ArrayList<Product> productList = new ArrayList();
    
    // arrayList that stores all the user of all the application, its a principal list
    public static ArrayList<User> userList = new ArrayList();
    
    // arrayList that stores all the purchases made for a user that is buyer, its a principal list
    public static ArrayList<Purchase> purchaseList = new ArrayList<>(); 
    
    // arrayList that stores purchases, its a copy of the principal list of puchases
    public static ArrayList<Purchase> copyListOfPurchase = new ArrayList<>(); 
    
    // arrayList that stores all the review of all the application created by a user, its a principal list
    public static ArrayList<Review> reviewList = new ArrayList<>(); 
    
    // variable that store the username of the login person in the moment of execute the program
    public static String userName;
    
    // variable that store the identification of the login person in the moment of execute the program
    public static int idUser;
    
    // variable that store the age of the login person in the moment of execute the program
    public static int ageUser;
    
    // variable that store the email of the login person in the moment of execute the program
    public static String emailUser;
    
    // variable that store the homwtown of the login person in the moment of execute the program
    public static String hometownUser;
    
    // variable that store the password of the login person in the moment of execute the program
    public static String userPassword;
    
    // variable that store the name of the login person in the moment of execute the program
    public static String personName;
   
    // variable that store the position of the user, contain the user localication in the principal of user
    public static int positionOfTheUser;
    
    // arrayList that stores string,  store information that is important in a method and this have
    //difficult to obtain 
    public static ArrayList<String> tempArrayToPrintActivityUser = new ArrayList<>();
    
    // variable that store the identification obtain in a jlist and need pass a other window to print the information
    public static int identificationOfTheProductToSeeDetails;

    public static void setCopyListOfPurchase() {
        
        //input: 
        //output:
        //retriction: 
        //function: this method reset the list located in the global and then add one by one all the element
        //located in the principal list to the copy list
             
        Global.copyListOfPurchase.clear();
        
        for(Purchase purchase : Global.purchaseList){
            
            Purchase item = new Purchase(purchase.getIdPurchase(), purchase.getUserName(),purchase.getDate(),purchase.getTotalQuantity());
            
            for (PurchaseDetail list : purchase.getListOfPurchaseDetails()){
                
                PurchaseDetail purchaseItem = new PurchaseDetail(list.getQuantity(),list.getNameProduct(),list.getIdProduct(),
                list.getTotalPrice(),list.getSellerUserName(),list.getIndividualPrice(),list.getState());
                
                item.insertDetailsInListOfPurchaseDetails(purchaseItem);
                        
            }
            
            System.out.println("largo de la lista interna: "+ purchase.getListOfPurchaseDetails().size());
            
            Global.copyListOfPurchase.add(item);
        }
        
    }  
    
    
    

    
    public Global(){
        
    }
    
    public static void insertar(User user){
        userList.add(user);
    }
    
    
    public static String printGeneralInformationOfUser(){
        //input: 
        //output: return all the general information that have a user
        //retriction: 
        //function: the method seach in the list until find the user, then return all the information of this user 
        // all his attribuites
     
        
        for(User user : Global.userList){
            if(user.getUserName().equals(Global.userName)){
                
                return "Nombre: " + user.getName() +"\n"+
                       "Age: " + user.getAge() + "\n" + 
                       "Identification: " + user.getIdentification() + "\n" + 
                       "Email: " + user.getEmail() + "\n" +
                       "Country: " + user.getOriginCountry()+ "\n" +
                       "Password: " + user.getPassword() + "\n" +
                       "User Name: " + user.getUserName() + "\n" + 
                       "Type of User: " + user.getType() + "\n";
                
            }
        }         
        return "Not exist";
    }
    
    public static double setPurchaseAmount(){
    
        /*inputs: none
        output: total amount
        restrictions: none
        functions: through the list of purchase details and adds up each time the user name 
    is in the buyer's name Cart
        */
        
        double totalAmount=0;
        for(Purchase purchase : Global.purchaseList){
            if(purchase.getUserName().equals(Global.userName)){
                for(PurchaseDetail purchaseDetail : purchase.getListOfPurchaseDetails()){
                    totalAmount = totalAmount + purchaseDetail.getTotalPrice();
                }
            }
        }
        return totalAmount;
    }
    
    public static int setQuantityOfPurchases(){
        
        //input: 
        //output: return a int result
        //retriction: 
        //function: search in the principal list of purchase and verificate what purchases in the list belogs to the user
        //return the quantity of purchases that the persona made
        
        int totalAmount=0;
        for(Purchase purchase : Global.purchaseList){
            if(purchase.getUserName().equals(Global.userName)){
                 totalAmount = totalAmount + 1;
            }
        }
        return totalAmount; 
    }
    
    public static int searchUser(){
 
        //input: 
        //output: return a int result
        //retriction: 
        //function: search in the principal list of user if the username located in the global exist in the list or not
        //return the result of the search
          
        if(Global.userList != null){
                for(User user : Global.userList){
                    if(user.getUserName().equals(Global.userName)){
                        return 1;
                    }
                }
            }
            return 0;
    } 
    
    public static boolean verificateIdentificationProductExistInList(int identification){

        //input: identificacion of a product
        //output: return a boolean result
        //retriction: 
        //function: search in the principal list of product if the identification obtainde exist in the list or not
        //return the result of the search
          
        boolean exist=false;
        
        for(Product product : Global.productList){
            if(product.getIdProduct() == identification){
                exist = true;
            }
        }
        return exist;
        
    }
    
    public static void printInSquareListAvailableProduct(DefaultListModel name,String typeOfProduct){

        //input: string with the type of product (clothe, electrodomestic, furniture)
        //output: 
        //retriction: the type of product of the principal list has to be the same of the sttring obtain for parameter
        //function: search in the principal list of product all the product with the same type of product, and add all
        //the product that past the restrincion in a square and then show it to th user, show all the available 
        //product of one type
          
        if(Global.productList .isEmpty()){
            name.addElement("Products are not available in the system");
        }
        else{
        
             for(Product product : Global.productList){
                 if(product.getType().equals(typeOfProduct)){
                      name.addElement("Name"+": "+product.getName() + ":     "+"Price"+": "+ product.getPrice() +":   " +"ID"+ ":" + product.getIdProduct());
                 
                 }
             } 
        }
    }
    
    public static double printInSquareListProductOfPrePurchase(DefaultListModel name,PrePurchase prePurchase){
      
        //input: object the type prepurchase
        //output: 
        //retriction:
        //function: search in the list of pre purchase that all the user hava, and introduce all the element of this
        //list in a square to show it to the user.
 
        
        double totalAmount=0;
        if(prePurchase.getListDetails().isEmpty()){
            name.addElement("Products are not available in the system");
        }
        else{
            
            for(Detail detail : prePurchase.getListDetails()){
                
                  totalAmount = totalAmount + detail.getTotalPrice();
                  
                  
                  name.addElement(detail.getNameProduct() + "        :         "+ detail.getIndividualPrice() +  "      :          "+ detail.getQuantity()+"                :"+ detail.getIdProduct());
                  
        
            }
            
            
        }
        
        return totalAmount;
 
    }
    
    
    
    public static int getAmountOfProductsListOfPrePurchase(int identification){
  
        //input: identification of a product
        //output: amount of product that exist in the list of pre prepurchase with the same identifification
        //retriction: 
        //function: call a function that its responable to send the amount o poduct that exist in the list of repurchase 
        //that have all the user that are buyer, this method return the amount of poduct that the person want to buy
 
        
        int amount = 0;
        int cont=0;
      
        for(User user : Global.userList){
            if(user.getUserName().equals(Global.userName)){
                Buyer var = (Buyer) Global.userList.get(cont);
                ArrayList list = var.getCarOfTheUser();
                PrePurchase var2 = (PrePurchase) list.get(Constant.POSITION_ABSOLUTE_IN_LIST_OF_PREPURCHASE);
                amount= var2.sendQuantityOfProduct(identification,var2);                
               
            }
            cont=cont+1;
        }
        
        return amount;
    }
    
    public static int getAmountOfProductsListOfProduct(int identification){
        
        //input: identification of a product
        //output: amount of product that exist in the list of product
        //retriction: 
        //function: obtanin the amount of poduct that exist in the list of product using a counter, so every time
        //that the identification are the same the counter increase
         
        
        
        int amount = 0;
        
        for(Product product : Global.productList){
            if(product.getIdProduct() == identification){
                amount = product.getQuantityAvailable();
            }
        }
        return amount;
    }
    
    public static Product sendObjectProduct(int identification){

        //input: identification of a product
        //output: return all the object the belong to the product
        //retriction: 
        //function: search in the prncipal list of product, if the product is found return all the object,  if not
        //return null
         
    
        
        for(Product product : Global.productList){
            if(product.getIdProduct() == identification){
                return product;
            }
        }
        return null;
            
    }
    
    public static void insertProductsInShoopingCar(int amountProductAvailableInListOfPrePurchase,int identificationOfTheProduct){
       
        //input: identification of a product ,  amount of the product that exist in the shopping car 
        //output: 
        //retriction: 
        //function: insert of the product wanted in the purchase car, if the product not exist previusly in the list, the method created
        //a new object detail and add this to the list with all his characteristics, if not if the product exist previusly,
        //the method increase the quantity of the product located in the purchase car
              
         if(amountProductAvailableInListOfPrePurchase == 0){
             
                
                Product varProduct = Global.sendObjectProduct(identificationOfTheProduct);
                String namePoductToDetail = varProduct.getName();
                double priceToDetail = varProduct.getPrice();
                String sellerNameToDetail = varProduct.getUserName();
                
                Detail detail = new Detail(Constant.INITIAL_AMOUNT_QUANTITY_PRODUCT_DETAIL,namePoductToDetail,identificationOfTheProduct,priceToDetail,sellerNameToDetail,priceToDetail);
                
            
                Buyer buyer = (Buyer) Global.userList.get(Global.positionOfTheUser);
                ArrayList list = buyer.getCarOfTheUser(); 
                
                PrePurchase prePurchase = (PrePurchase) list.get(Constant.POSITION_ABSOLUTE_IN_LIST_OF_PREPURCHASE);               
               
                double total = prePurchase.getTotalQuantity();
                total = total + priceToDetail;
                
                prePurchase.setTotalQuantity(total);
               
                prePurchase.insertDetailInListOfPrePurchase(detail);
                
                              
            }
            else{ 
              
                Buyer buyer = (Buyer) Global.userList.get(Global.positionOfTheUser);
                ArrayList list = buyer.getCarOfTheUser();    
                PrePurchase prePurchase = (PrePurchase) list.get(Constant.POSITION_ABSOLUTE_IN_LIST_OF_PREPURCHASE);
                
                prePurchase.changeInformationDetailPrePurchase(identificationOfTheProduct, prePurchase);
               
            }
        
    }
    
    
}
