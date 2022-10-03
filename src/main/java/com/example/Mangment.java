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
        if (!find(record.getIdUser())) {
            list.add(record);
        }
        else {
            System.out.println(
       "Record already exists in the Record list");
        }
    }

    public void addTeacher(teacher record)
    {
        if (!find(record.getIdUser())) {
            listT.add(record);
        }
        else {
            System.out.println(
       "Record already exists in the Record list");
        }
    }

    public void addRespo(responsable record)
    {
        if (!find(record.getIdUser())) {
            listR.add(record);
        }
        else {
            System.out.println(
       "Record already exists in the Record list");
        }
    }

    

    public boolean find(int idNimber)
    {
        for (User l : list) {
            if (l.getIdUser() == idNimber) {
 
                System.out.println(l);
                return true;
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
