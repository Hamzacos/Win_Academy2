package com.example;

public class student extends User {

    private String startDate;
    private String nameClass;

    public student() {}

    // job jobs = job.responsable;
    
    public student(int idUser, String fristName,String lastName,String phone,String email,String role,String startDate,String nameClass)
    {
            this.idUser = idUser;
            this.fristName = fristName;
            this.lastName = lastName;
            this.phone = phone;
            this.email = email;
            this.role = role;
            this.startDate = startDate;
            this.nameClass = nameClass;        
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getnameClass() {
        return nameClass;
    }

    /**
     * @param startDate
     */
    public void setnameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override public String toString()
    {
 
        // Returning the record
        return "student{"
           + "idUser=" + idUser + "firstName=" + fristName + ", lastName=" + lastName
            + ", phone=" + phone + ", email=" + email 
            + ", role=" + role + ", startDate=" + startDate + ", nameClass=" + nameClass + '}';
    } 
    
}
