package com.example;

import java.security.Principal;
import java.util.Scanner;

public final class App {
    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       
        
        Mangment hr = new Mangment();

        student record  = new student();       
            record.setIdUser(1);
            record.setFristName("Hamza");
            record.setLastName("Laqraa");
            record.setphone("0612345678");
            record.setemail("hamza@hotmail.com");
            record.setRole("Student");
            record.setStartDate("2022-04-12");
            record.setnameClass("JAVA");
            hr.add(record);

        teacher info = new teacher();
        info.setIdUser(2);
        info.setFristName("Omar");
        info.setLastName("Kazoum");
        info.setphone("0612345678");
        info.setemail("omar@hotmail.com");
        info.setRole("Prof");
        info.setstartWork("2018-12-04");
        info.setsubject("JAVA");
        info.setdepartement("IT");
        hr.addTeacher(info);
            
        responsable DA = new responsable();
            DA.setIdUser(3);
            DA.setFristName("hamid");
            DA.setLastName("bassou");
            DA.setphone("0612345678");
            DA.setemail("B.hamid@hotmail.com");
            DA.setRole("Prof");
            DA.setSubject("JAVA");
            DA.setDep("IT");
            hr.addRespo(DA);

            departement DE = new departement();
            DE.setIdDEpartement(1);
            DE.setName("IT");
            DE.setNameSchool("Youcode");
            hr.addDepartement(DE);

            grade exameinfo = new grade();
            exameinfo.setIdNote(1);
            exameinfo.setExameGrade(13);
            exameinfo.setIdStudent(1);
            exameinfo.setSubject("JAVA");
            exameinfo.setExameDate("2022-03-12");
            hr.addNote(exameinfo);
        try (
        Scanner input = new Scanner(System.in)) {
           
            int option = 0;
            do{
                role();
                option = input.nextInt();
                switch (option){
                    case 1:
                        int optionAdmin = 0;
                        menu_admin();
                        optionAdmin = input.nextInt();
                        switch(optionAdmin){
                            case 1:
                                System.out.print("Entrer le numero d'enseignant' ? ");
                                int id = input.nextInt();

                                System.out.print("Entrez le prenom  : ");
                                String Name = input.next();

                                System.out.print("Entrez le nom de famille : ");
                                String sName = input.next();
                     
                                System.out.print("Entrez le numero de telephone : ");
                                String phoneN = input.next();

                                System.out.print("Entrez l'email' : ");
                                String mail = input.next();

                                System.out.print("Confirmer le role : ");
                                String roleT = input.next();

                                System.out.print("Date de debut de travaille YYYY-MM-DD : ");
                                String startWork = input.next();

                                System.out.print("la matire de prof : ");
                                String subject = input.next();

                                System.out.print("Nom du dupartement appartient : ");
                                String departement = input.next();

                                info = new teacher(id,Name,sName,phoneN,mail,roleT,startWork,subject,departement);
                                hr.addTeacher(info);
                                System.out.println(info.toString());
                    break;
                            case 2:
                                // System.out.println("Hello world");
                                System.out.print("Entrer le numero de Responsable ? ");
                                int idRe = input.nextInt();

                                System.out.print("Entrez le prenom : ");
                                String NameRE = input.next();

                                System.out.print("Entrez le nom de famille : ");
                                String LName = input.next();
                     
                                System.out.print("Entrez le numero de telephone : ");
                                String phoneRe = input.next();

                                System.out.print("Entrez l'email' : ");
                                String mailRe = input.next();

                                System.out.print("Confirmer le role : ");
                                String roleRe = input.next();

                                System.out.println("la matire de prof : ");
                                String subjectRE = input.next();

                                System.out.println("Nom du dupartement Responsable : ");
                                String dep = input.next();

                                DA = new responsable(idRe,NameRE,LName,phoneRe,mailRe,roleRe,subjectRE,dep);
                                hr.addRespo(DA);
                                System.out.println(DA.toString());
                            break;
                            case 3:
                                System.out.print("Entre le numero du departement : ");
                                int idDEpartement = input.nextInt();
                                System.out.print("Entre le nom du departement : ");
                                String nameDepartement = input.next();
                                System.out.print("Entre le nom du college : ");
                                String nameCollege = input.next();
                                
                                DE = new departement(idDEpartement, nameDepartement, nameCollege);
                                hr.addDepartement(DE);
                                System.out.println(DE.toString());
                            break;
                            case 4:
                                hr.displayDepartement();
                            break;
                            case 5:
                              int id_dep;
                              System.out.print("merci de rentrer le numero de departement : ");
                              id_dep = input.nextInt();
                              hr.delete(id_dep);
                            break;
                            case 6:
                                hr.getAvrege();
                            break;
                            case 7:
                                hr.displayT();
                            break;
                            case 8:
                                hr.displayR();
                            break;
                            case 9:
                               System.out.print(  " Merci de saisir le Numero du Responsable : ");
                               int idrespo = input.nextInt();
                               hr.findR(idrespo);
                            break;
                        }
                    break;
                    case 2:
                    int optionTeacher = 0;
                    menu_teacher();
                    optionTeacher = input.nextInt();
                    switch(optionTeacher){
                        case 1:
                            System.out.print("Entrer le numero d'etudiant' : ");
                            int idUser = input.nextInt();
    
                            System.out.print("Entrez le prenom d'etudiant : ");
                            String firstName = input.next();
                            System.out.print("Entrez le nom de famille : ");
                            String lastName = input.next();
                            System.out.print("Entrez le numero de telephone : ");
                            String phone = input.next();
                            System.out.print("Entrez l'email' : ");
                            String email = input.next();
                            System.out.print("Confirmer le role : ");
                            String role = input.next();
                            System.out.print("Date d'entree YYYY-MM-DD : ");
                            String startDate = input.next();
                            System.out.print("Nom du classe : ");
                            String nameClass = input.next();

                            record  = new student(idUser,firstName,lastName,phone,email,role,startDate,nameClass);
                            hr.add(record);
                            System.out.println(record.toString());
                        break;
                        case 2:
                            hr.getAvrege();
                        break;
                        case 3:
                            hr.displayS();
                        break;
                        case 4:
                            hr.displayT();
                        break;
                        case 5:
                            hr.displayR();
                        break;
                        case 6:
                          System.out.print( " Merci de saisir le Nom du Group : ");
                          String nameClasse = input.next();
                          hr.searchbyGroup(nameClasse);
                        break;
                        case 7:
                          System.out.println("merci d'entre le nom du class pour voir tous les notes");
                          String nomGroup = input.next();
                          hr.searchByClass(nomGroup);
                        break;
                    }
                    break;
                    case 3:
                            int optionStudent = 0;
                            menu_student();
                            optionStudent = input.nextInt();
                            switch(optionStudent){
                                case 1:
                                hr.displayS();
                                break;
                                case 2:
                                System.out.print(" Merci de saisir le Numero d'etudiant : ");
                                    int id = input.nextInt();
                                    hr.finds(id);
                                break;
                                case 3 : 
                                System.out.print("merci de saisir le numero d'etudiant :");
                                int idetudiant = input.nextInt();
                                hr.findNote(idetudiant);
                            }
                    break;
                }

            }while(option != 4);
        }

}

public static void role(){
    System.out.println("============================= MENU ============================");
    System.out.println("1:Admin d'un college");
    System.out.println("2:Responsable / Enseignant");
    System.out.println("3:etudiant");
    System.out.println("===============================================================");
    System.out.println(": Exit program");
    System.out.print("Enter your selection : ");
}

public static void menu_admin(){
    System.out.println("============================= MENU ADMIN ======================");
    System.out.println("1:Ajouter un Enseignant");
    System.out.println("2:Ajouter un responsable");
    System.out.println("3:Ajouter un Departement");
    System.out.println("4:Afficher tous les départements");
    System.out.println("5:Suprimer un departement");
    System.out.println("6:La moyen d'un departement");
    System.out.println("7:Afficher liste des enseignant ");
    System.out.println("8:Afficher liste des Responsable ");
    System.out.println("9:Imprimer la fiche signalétique de Responsable du departement");
    System.out.println("===============================================================");
    System.out.print("Enter your selection : ");
}

public static void menu_teacher(){
    System.out.println("============================= MENU Responsable / Enseignant ============================");
    System.out.println("1:Ajouter un etudiant");
    System.out.println("2:La moyen d'un departement");
    System.out.println("3:Afficher la liste des etudiant");
    System.out.println("4:Afficher liste des enseignant ");
    System.out.println("5:Afficher liste des Responsable ");
    System.out.println("6:Sélectionner tous les étudiants dans le même groupe ");
    System.out.println("7: voir tous les notes d'un group");
    System.out.println("===============================================================");
    System.out.print("Enter your selection : ");
}



public static void  menu_student(){
    System.out.println("============================= MENU Etudiante ============================");
    System.out.println("1:afficher tous les etudiant");
    System.out.println("2:Imprimer la fiche signalétique d'un etudiant");
    System.out.println("3:Chercher votre note");
    System.out.println("===============================================================");
    System.out.print("Enter your selection : ");
}
}
   