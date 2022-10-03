package com.example;

import java.util.LinkedList;

public class User {

    LinkedList<User> list;
    
    protected   int  idUser;
    protected  String fristName;
    protected  String lastName;
    protected  String phone;
    protected  String email;
    protected  String role;
   
    public User() {}


    public User(int idUser, String fristName,String lastName,String phone,String email,String role)
    {
            this.idUser = idUser;
            this.fristName = fristName;
            this.lastName = lastName;
            this.phone = phone;
            this.email = email;
            this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }


    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getphone(){
        return phone;
    }
   
    public void setphone(String phone){
        this.phone = phone;
    }

    public String getemail(){
        return email;
    }
     public void setemail(String email){
        this.email = email;
     }

     public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }

     @Override public String toString()
     {
  
         // Returning the record
         return "User{"
             + "idUser=" + idUser + "firstName=" + fristName + ", lastName=" + lastName
             + ", phone=" + phone + ", email=" + email 
             + ", role=" + role + '}';
     } 
}
