package com.example;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import javafx.print.Collation;

public class Mangment {

    LinkedList<student> list;
    LinkedList<teacher> listT;
    LinkedList<responsable> listR;
    LinkedList<departement> listDep;
    LinkedList<grade> listNote;

    public Mangment()
    {
        listT   = new LinkedList<>();
        list    = new LinkedList<>();
        listR   = new LinkedList<>();
        listDep = new LinkedList<>();
        listNote = new LinkedList<>();
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
        List<student> sortedNames = list.stream().filter(c -> c.getnameClass().equals(nameClasse)).collect(Collectors.toList());
        sortedNames.forEach(student -> System.out.println(student.getFristName()));
        }

        public void searchDepartement(String depName){
            List<teacher> sorted = listT.stream().filter( dep -> dep.getdepartement().equals(depName)).collect(Collectors.toList());
            sorted.forEach(dep -> System.out.println(dep));
        }

        public void addDepartement(departement record)
    {
            listDep.add(record);
    }

    public void displayAll(){
        if(listNote.isEmpty()) System.out.println("Acun note disponible");
            for(grade no : listNote){
                System.out.println(no.toString());
            }
    }

    public void displayDepartement(){
        if(listDep.isEmpty()) System.out.println("acun departement disponible");
        for(departement DEP : listDep){
            System.out.println(DEP.toString());
        }
    }

    public void searchByClass(String nameClass){
        list.stream().filter(student -> student.getnameClass().equals(nameClass))
        .map(
            boy -> 
            listNote.stream().filter(
            n -> n.getIdStudent() == boy.getIdUser()
            ).collect(Collectors.toList())).flatMap(Collection::stream).collect(Collectors.toList()).forEach(System.out::println);
    }

        public void delete(int recIdNumber)
        {
            departement recordDep = null;
            for (departement ll : listDep) {
                if (ll.getIdDEpartement() == recIdNumber) {
                    recordDep = ll;
                }
            }
            if (recordDep == null) {
                System.out.println("Departement Invalide");
            }
            else { 
                listDep.remove(recordDep);
                System.out.println("suppression avec succès");
                }
            }

            public void addNote(grade noteRecord){
                listNote.add(noteRecord);
            }
         
}

