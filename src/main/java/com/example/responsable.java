package com.example;

public class responsable extends User {

    private String subject;
    private String dep;

    public responsable(){}

    public responsable(int idUser, String fristName,String lastName,String phone,String email,String role,String subject,String dep){

        this.idUser = idUser;
        this.fristName = fristName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.role = role;
        this.subject = subject;
        this.dep = dep;
    }


    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getDep(){
        return dep;
    }

    public void setDep(String dep){
        this.dep = dep;
    }


    @Override public String toString()
    {
        return "Resposable {"
            + "Prenom = " + fristName + ", Nom = " + lastName
            + ", Numero telephone = " + phone + ", E-mail = " + email 
            + ", Mission = " + role + ", Matière = " + subject + ", Departement = " + dep + '}';
    } 
    
}
