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
public class SellingPerson extends Seller implements InterfacePrintEspecificInformation{
    

    
    public SellingPerson(int identification, String name, int age, String email, String OriginCountry, String password, String userName, String type) {
        super(identification, name, age, email, OriginCountry, password, userName, type);
    }
    

   @Override
   public String printEspecificInformation(){
    
              /*inputs: none
        output: "You are Selling Person"
        restrictions: none
        functions:  returns the label confirming that a person selling
        */ 
       
       return "You are Selling Person";
   }
   
}
