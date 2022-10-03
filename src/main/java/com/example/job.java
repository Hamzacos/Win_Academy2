package com.example;

public enum job {
    
    responsable,
    student,
    teacher;


    public String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

}
