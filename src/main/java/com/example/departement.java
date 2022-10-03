package com.example;

public class departement {
    
   
    private int idDEpartement;
    private String Name;
    private String nameSchool;

    
    public departement() {}

    public departement(int idDEpartement, String name, String nameSchool) {
        this.idDEpartement = idDEpartement;
        Name = name;
        this.nameSchool = nameSchool;
    }
    
    public int getIdDEpartement() {
        return idDEpartement;
    }

    public void setIdDEpartement(int idDEpartement) {
        this.idDEpartement = idDEpartement;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getNameSchool() {
        return nameSchool;
    }
    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }
    
    public String toString()
    {
        return "departement {"
            + "Numero de Département = " + idDEpartement + ", Nom du departement = " + Name
            + ", College Name = " + nameSchool + '}';
    } 

}
