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
public class Establishment extends Seller implements InterfacePrintEspecificInformation{
    private int CompanyRegistrationNumber;
    private String BusinessName;
    private String CommercialReason;

    public Establishment(int CompanyRegistrationNumber, String BusinessName, String CommercialReason, int identification, String name, int age, String email, String OriginCountry, String password, String userName, String type) {
        super(identification, name, age, email, OriginCountry, password, userName, type);
        this.CompanyRegistrationNumber = CompanyRegistrationNumber;
        this.BusinessName = BusinessName;
        this.CommercialReason = CommercialReason;
    }


 
    public int getCompanyRegistrationNumber() {
        return CompanyRegistrationNumber;
    }

    public void setCompanyRegistrationNumber(int CompanyRegistrationNumber) {
        this.CompanyRegistrationNumber = CompanyRegistrationNumber;
    }

    public String getBusinessName() {
        return BusinessName;
    }

    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    public String getCommercialReason() {
        return CommercialReason;
    }

    public void setCommercialReason(String CommercialReason) {
        this.CommercialReason = CommercialReason;
    }
    
    @Override
    public String printEspecificInformation(){
   
         //input:
        //output: return information about a user, more the specific information of the seller that is establishment
        //retriction:
        //function: obtain the especific information of a user that is establisment and return the information that only
        //this type of user has, to the method that call
         
        return "Businnes Name: " + this.getBusinessName()+ "\n" + 
                "Commercial Reason: " + this.getCommercialReason()+ "\n" + 
                "Company Registration Number: "+ this.getCompanyRegistrationNumber() + "\n";
    }
    
    
}
