package com.example;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;

public class Mangment {

    // LinkedList<student> list;
    List<student> list = new LinkedList<>();
    LinkedList<teacher> listT;
    LinkedList<responsable> listR;
    LinkedList<departement> listDep;

    public Mangment()
    {
        listT = new LinkedList<>();
        list = new LinkedList<>();
        listR = new LinkedList<>();
        listDep = new LinkedList<>();
    }


    public void add(student record)
    {
        if (!finds(record.getIdUser())) {
            list.add(record);
        }
        else {
            System.out.println(
       "Etudiant existe");
        }
    }

    public void addTeacher(teacher record)
    {
        if (!findP(record.getIdUser())) {
            listT.add(record);
        }
        else {
            System.out.println(
       " Prof existe");
        }
    }

    public void addRespo(responsable record)
    {
        if (!findR(record.getIdUser())) {
            listR.add(record);
        }
        else {
            System.out.println(
       "Responsable existe");
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


    public void searchbyGroup(String nameClasse){
        List<student> sortedNames = list.stream().filter(student -> student.getnameClass().equals(nameClasse)).collect(Collectors.toList());
        sortedNames.forEach(student -> System.out.println(student.getFristName()));
        }

        public void addDepartement(departement record)
    {
            listDep.add(record);
    }

    

    }

