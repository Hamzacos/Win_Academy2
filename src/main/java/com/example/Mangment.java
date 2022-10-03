package com.example;

import java.util.LinkedList;

public class Mangment {

    LinkedList<student> list;
    LinkedList<teacher> listT;
    LinkedList<responsable> listR;

    public Mangment()
    {
        listT = new LinkedList<>();
        list = new LinkedList<>();
        listR = new LinkedList<>();
    }


    public void add(student record)
    {
        if (!finds(record.getIdUser())) {
            list.add(record);
        }
        else {
            System.out.println(
       "Record already exists in the Record list");
        }
    }

    public void addTeacher(teacher record)
    {
        if (!findP(record.getIdUser())) {
            listT.add(record);
        }
        else {
            System.out.println(
       "Record already exists in the Record list");
        }
    }

    public void addRespo(responsable record)
    {
        if (!findR(record.getIdUser())) {
            listR.add(record);
        }
        else {
            System.out.println(
       "Record already exists in the Record list");
        }
    }

    

    public boolean finds(int idNimber)
    {
        for (student l : list) {
            if (l.getIdUser() == idNimber) {
 
                System.out.println(l);
                return true;
            }else{
                System.out.println("Etudiant n'existe pas");
            }
        }
        return false;
    }

    public boolean findP(int idNimber)
    {
        for (teacher l : listT) {
            if (l.getIdUser() == idNimber) {
 
                System.out.println(l);
                return true;
            }else{
                System.out.println("Prof n'existe pas");
            }
        }
        return false;
    }

    public boolean findR(int idNimber)
    {
        for (responsable l : listR) {
            if (l.getIdUser() == idNimber) {
 
                System.out.println(l);
                return true;
            }else{
                System.out.println("Responsable n'existe pas");
            }
        }
        return false;
    }
    public void displayS()
    {
        if (list.isEmpty()) {
            System.out.println("The list has no records\n");
        }
        for (student record : list) {
            System.out.println(record.toString());
        }
    }

    public void displayT()
    {
        if (list.isEmpty()) {
            System.out.println("The list has no records\n");
        }
        for (teacher record : listT) {
            System.out.println(record.toString());
        }
    }

    public void displayR()
    {
        if (list.isEmpty()) {
            System.out.println("The list has no records\n");
        }
        for (responsable record : listR) {
            System.out.println(record.toString());
        }
    }
}
