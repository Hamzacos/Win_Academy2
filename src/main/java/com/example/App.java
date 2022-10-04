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

            do {
                menu();
                option = input.nextInt();
 
                switch (option) {
                case 1:
                 int secondOption = 0;
                        sous_menu();
                        secondOption = input.nextInt();

                        switch(secondOption){
                             case 1:
                                System.out.print("Entrer le numero de User : ");
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
                                System.out.print("Entrer le numero de User ? ");
                                int id = input.nextInt();

                                System.out.print("Entrez le prenom d'etudiant : ");
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

                                System.out.println("la matire de prof : ");
                                String subject = input.next();

                                System.out.println("Nom du dupartement appartient : ");
                                String departement = input.next();

                                info = new teacher(id,Name,sName,phoneN,mail,roleT,startWork,subject,departement);
                                hr.addTeacher(info);
                                System.out.println(info.toString());
                    break;
                             case 3:
                                // System.out.println("Hello world");
                                System.out.print("Entrer le numero de User ? ");
                                int idRe = input.nextInt();

                                System.out.print("Entrez le prenom d'etudiant : ");
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

                                System.out.println("Nom du dupartement appartient : ");
                                String dep = input.next();

                                DA = new responsable(idRe,NameRE,LName,phoneRe,mailRe,roleRe,subjectRE,dep);
                                hr.addRespo(DA);
                                System.out.println(DA.toString());
                             break;
                 }          
                break;
                case 2:
                int DisplayOption = 0;
                display_menu();
                DisplayOption = input.nextInt();

                switch(DisplayOption){
                    case 1:
                         hr.displayS();
                    break;
                    case 2:
                        hr.displayT();
                    break;
                    case 3:
                        hr.displayR();
                    break;
                }
                break;
                case 3:
                        int searchOption = 0;
                        search_Dispaly();
                        searchOption = input.nextInt();
                        switch(searchOption){
                            case 1:
                            System.out.print(
                                " Merci de saisir le Numero d'etudiant : ");
                            int id = input.nextInt();
                             hr.finds(id);
                            break;
                            case 2:
                            System.out.print(
                                " Merci de saisir le Numero du prof : ");
                            int idteacher = input.nextInt();
                             hr.findP(idteacher);
                            break;
                            case 3:
                            System.out.print(
                                " Merci de saisir le Numero du Respo : ");
                            int idrespo = input.nextInt();
                             hr.findR(idrespo);
                            break;
                            case 4:
                            System.out.print( " Merci de saisir le Nom du Group : ");
                            String nameClasse = input.next();
                            hr.searchbyGroup(nameClasse);
                            break;
                        }
                break;
                case 4:
                        int optionDepartement = 0;
                        Departement_menu();
                        optionDepartement = input.nextInt();
                        switch(optionDepartement){
                            case 1:
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
                            case 2:
                            hr.displayDepartement();
                            break;
                            case 3:
                                int id_dep;
                                System.out.print("merci de rendrer le numero de departement : ");
                                id_dep = input.nextInt();
                                hr.delete(id_dep);
                            break;
                            case 4:
                            System.out.print( " Merci de saisir le Nom du departement : ");
                            String depName = input.next();
                            hr.searchDepartement(depName);
                            break;
                        }     
                break;
                case 5:
                        int optionGrade = 0;
                        menu_Note();
                        optionGrade = input.nextInt();
                        switch(optionGrade){
                            case 1:
                                System.out.print("merci d'entrer le numero d'exame : ");
                                int idNoteExame = input.nextInt();
                                System.out.print("Merci d'entrer le nom de matiere : ");
                                String subject = input.next();
                                System.out.print("Merci d'entrer le numero d'etudiant : ");
                                int idStudent = input.nextInt();
                                System.out.print("Merci d'entrer la note d'exame : ");
                                float exameGrade = input.nextFloat();
                                System.out.print("Merci de rentrer la date d'exame YYYY-MM-DD : ");
                                String exameDate = input.next();
                                exameinfo = new grade(idNoteExame,exameGrade,idStudent,subject,exameDate);
                                hr.addNote(exameinfo);
                                System.out.println(exameinfo.toString());
                            break;
                            case 2:
                                hr.displayAll();
                            break;
                            case 3:
                            System.out.println("merci d'entre le nom du class");
                            String nomGroup = input.next();
                            hr.searchByClass(nomGroup);
                            break;
                        }
                break;
                    default:
                    System.out.println("\nInvalid input\n");
                    break;
                }
            
   }while (option != 9);   
    }
}

    public static void menu()
    {
        System.out.println("============================= MENU ============================");
        System.out.println("1: Ajouter des utilisateurs");
        System.out.println("2:Afficher des utilisateurs");
        System.out.println("3:Search un utilisateur");
        System.out.println("4:Departement");
        System.out.println("5:Note");
        System.out.println("==========================================================================");

        // System.out.println(": Exit program");
        System.out.print("Enter your selection : ");
    }



    public static void sous_menu()
    {
        System.out.println("******************************** SOUS-MENU ***************************************");
        System.out.println("1: Ajouter un etudiant");
        System.out.println("2: Ajouter un Enseignant ");
        System.out.println("3: Ajouter un responsable");
        System.out.println("**********************************************************************************");
        System.out.print("Enter your selection : ");
    }


    public static void  display_menu(){
        System.out.println("******************************** Affichage menu ***************************************");
        System.out.println("1: Afficher tous les etudiants");
        System.out.println("2: Afficher tous les professeur");
        System.out.println("3: Afficher tous les responsables");
        System.out.println("**********************************************************************************");
        System.out.print("Enter your selection : ");
    }


    public static void  search_Dispaly(){
        System.out.println("******************************** Search menu ***************************************");
        System.out.println("1: chercher un etudiant");
        System.out.println("2: Chercher Un professeur");
        System.out.println("3: Chercher un responsables");
        System.out.println("4:Sélectionner tous les étudiants dans le même groupe");
        System.out.println("**********************************************************************************");
        System.out.print("Enter your selection : ");
    }


    private static void Departement_menu() {
        System.out.println("******************************** Departement menu ***************************************");
        System.out.println("1: Ajouter Un departement");
        System.out.println("2: Afficher tous les départements");
        System.out.println("3: Suprimer un departement");
        System.out.println("4: Aficher tous les prof dans un departement");
        System.out.println("*****************************************************************************************");
        System.out.print("Enter your selection : ");
    }

    private static void menu_Note() {
        System.out.println("******************************** Departement menu ***************************************");
        System.out.println("1: Ajouter Une Note");
        System.out.println("2: Afficher tous les note");
        System.out.println("3: chercher");
        // System.out.println("4: Aficher tous les prof dans un departement");
        System.out.println("*****************************************************************************************");
        System.out.print("Enter your selection : ");
    }
}
