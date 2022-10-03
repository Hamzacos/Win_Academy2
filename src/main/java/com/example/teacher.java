package com.example;

public class teacher extends User {

    private String startWork;
    private String subject;
    private String departement;


    public teacher() {}

    public teacher(int idUser, String fristName,String lastName,String phone,String email,String role,String startWork,String subject,String departement)
    {
            this.idUser = idUser;
            this.fristName = fristName;
            this.lastName = lastName;
            this.phone = phone;
            this.email = email;
            this.role = role;
            this.startWork = startWork;
            this.subject = subject;
            this.departement = departement;
    }

    public String getstartWork() {
        return startWork;
    }

    public void setstartWork(String startWork) {
        this.startWork = startWork;
    }

    public String getsubjectk() {
        return subject;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }

    public String getdepartement() {
        return departement;
    }

    public void setdepartement(String departement) {
        this.departement = departement;
    }


    @Override public String toString()
    {
        return "teacher{"
            + "idUser=" + idUser + "firstName=" + fristName + ", lastName=" + lastName
            + ", phone=" + phone + ", email=" + email 
            + ", role=" + role + ", startWorke=" + startWork + ", subject=" + subject + ", deparement=" + departement + '}';
    } 

    
}
