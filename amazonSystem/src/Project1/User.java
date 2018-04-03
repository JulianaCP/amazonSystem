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
public abstract class User {
    
    private ArrayList<Review> listReviews = new ArrayList<>();
    private int identification;
    private String name;
    private int age;
    private String email;
    private String OriginCountry;
    private String password;
    private String userName;
    private String type;

    public User(int identification, String name, int age, String email, String OriginCountry, String password, String userName, String type) {
        this.identification = identification;
        this.name = name;
        this.age = age;
        this.type= type;
        this.email = email;
        this.OriginCountry = OriginCountry;
        this.password = password;
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOriginCountry() {
        return OriginCountry;
    }

    public void setOriginCountry(String OriginCountry) {
        this.OriginCountry = OriginCountry;
    }

    public ArrayList<Review> getListReviews() {
        return listReviews;
    }

    public void setListReviews(ArrayList<Review> listReviews) {
        this.listReviews = listReviews;
    }
    
    
    public abstract String printUserPersonalInformation();
    
    
    public abstract double calculateNote();
}
