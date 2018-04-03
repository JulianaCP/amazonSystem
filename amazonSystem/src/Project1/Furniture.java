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
public class Furniture extends Product implements InterfacePrintEspecialInformationOfProducts{
    
    private String typeOfMaterial;

    public Furniture(String typeOfMaterial, int idProduct, String userName, String name, double price, int quantityAvailable, String state, String type) {
        super(idProduct, userName, name, price, quantityAvailable, state, Constant.FURNITURE_SALES_TAX, type);
        this.typeOfMaterial = typeOfMaterial;
    }

    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }


@Override
public String PrintEspecialInformationOfProducts(){

       //input:
        //output: return information about the product, only a caracteristic to furniture
        //retriction: 
        //function: the method return a especific information about the furniture, information that only this class has
     
    return"Type of material:  "+ this.typeOfMaterial+"\n";
}
    
    @Override
    
    public double calulatePriceOfProduct(double price){

       //input: obtain the price of the product (price that the seller asign)
        //output: return the price of the product, price of sale
        //retriction: 
        //function: the method return the last one price of the product, the price of the seller more tax that the 
        //categorie has
        
        double total;
        double tax;
        
        tax= price * Constant.FURNITURE_SALES_TAX;
        total = price + tax;
        
        return total;

    }


}
