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
public class DefaultInformationAggregates {
    //
        /*inputs: 
        type Of Material of the new product, id of the Product, user Name: is the seller user name,
        name is the product name, price, quantity Available in the syatem, state (new old ect), String type
        and also the special attributes of each class were entered like: objective Public for a clothe, type Of Material
        if is a forniture or the size Appliance of the electrodomestic.
        output: there are none.
        restrictions: there are none
        functions: appends to the product list the items 
        */
    
    public static void DefaultInformationAggregatesProduct(){
        Clothe newProductClothes = new Clothe("Women", 1 , "Pablo" ,"Shirt", 200.25, 2, "New" ,"Clothe");
        Global.productList.add(newProductClothes);
        
        
        Furniture newProductFurniture = new Furniture("Wood",2,"Pablo","Table",450,1,"Used","Furniture");
        Global.productList.add(newProductFurniture);
   
        Electrodomestic newProductElectrodomestic = new Electrodomestic("Big",3,"Pablo","Refrigerator",1350,1,"New","Electrodomestic");
        Global.productList.add(newProductElectrodomestic);
        
        Clothe newProductClothes2 = new Clothe("Mean", 4 , "w" ,"Pant", 78, 2, "New", "Clothe" );
        Global.productList.add(newProductClothes2);
        
        
        Furniture newProductFurniture2 = new Furniture("Plastic",5,"a","Table",180.25,1,"Used","Furniture");
        Global.productList.add(newProductFurniture2);
   
        Electrodomestic newProductElectrodomestic2 = new Electrodomestic("Small",6,"a","Beater",1200,1,"New","Electrodomestic");
        Global.productList.add(newProductElectrodomestic2);
    }
    
    public static void DefaultInformationAggregatesUsers(){
      
                /*inputs: identification , name of the user , age of the user, user email, user Origin Country,
        the user password, the userName of the new person, type (Seller or Buyer).
        if is a Establisment, Company Registration Number, BusinessName and Commercial Reason of the company
        output: there are none.
        restrictions: there are none.
        functions: appends to the user list the items and create a new prepurchase (Shooping car) for the registered peroson
        */
        
        PrePurchase prePurchase = new PrePurchase("sara",Constant.INITIAL_AMOUNT_SHOOPING_CAR);
         Buyer buyer= new Buyer(0,0,12332,"Sara", 34,"Saritaa@gmail.com","Talamanca","sara","sara","Buyer");
         buyer.insertCarInList(prePurchase);
         
         PrePurchase prePurchase2 = new PrePurchase("raul",Constant.INITIAL_AMOUNT_SHOOPING_CAR);
         Buyer buyer1= new Buyer(0,0,12332,"Raul", 24,"Sarita66@gmail.com","San Jose","raul","raul","Buyer");
         buyer1.insertCarInList(prePurchase2);
         
         PrePurchase prePurchase3 = new PrePurchase("maria",Constant.INITIAL_AMOUNT_SHOOPING_CAR);
         Buyer buyer2= new Buyer(0,0,12332,"Maria", 38,"Sarittra@gmail.com","San Carlos","maria","maria","Buyer");
         buyer2.insertCarInList(prePurchase3);
          
         SellingPerson sellingPerson= new SellingPerson(123, "Pablo",23,"pablito@gmail.com", "San Jose","123", "Pablo","Seller"); 
         SellingPerson sellingPerson2= new SellingPerson(123, "Wilmer",21,"pablito12@gmail.com", "San Jose","12", "w","Seller"); 
         SellingPerson sellingPerson3= new SellingPerson(123, "Andrea",28,"pablito23@gmail.com", "San Jose","1", "a","Seller"); 
         Establishment establishment= new Establishment(123, "company", "company", 123, "company", 10, "company.com", "San Carlos", "company", "company", "Seller"); 
         
         Global.insertar(buyer);
         Global.insertar(buyer1);
         Global.insertar(buyer2);
         Global.insertar(sellingPerson);
         Global.insertar(sellingPerson2);
         Global.insertar(sellingPerson3);
         Global.insertar(establishment);
   
}
    
    
}
