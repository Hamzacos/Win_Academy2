package com.example;

public class grade {
    
    private int idNoteExame;
    private float exameGrade;
    private int idStudent;
    private String subject;
    private String exameDate;


public grade(){}

public grade(int idNoteExame, float exameGrade, int idStudent,String subject,String exameDate){
        this.idNoteExame = idNoteExame;
        this.exameGrade = exameGrade;
        this.idStudent = idStudent;
        this.subject  = subject;
        this.exameDate = exameDate;
}

    
    public int getIdNote() {
        return idNoteExame;
    }
    
    public void setIdNote(int idNoteExame) {
        this.idNoteExame = idNoteExame;
    }

    public float getExameGrade() {
        return exameGrade;
    }
    public void setExameGrade(float exameGrade) {
        this.exameGrade = exameGrade;
    }

    public int getIdStudent() {
        return idStudent;
    }
    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExameDate() {
        return exameDate;
    }
    public void setExameDate(String exameDate) {
        this.exameDate = exameDate;
    }

    public String toString()
    {
        return "Examen Info {"
            + "numero d'exame = " + idNoteExame + ", numero d'etudiant = " + idStudent
            + ", matiere = " + subject + ", Note d'exame = " + exameGrade 
            + ", Date d'exame = " + exameDate + '}';
    } 
}
