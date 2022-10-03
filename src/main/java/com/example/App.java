package com.example;

import java.util.Scanner;

public final class App {
    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       
        
        // student hr  = new student();
        Mangment hr = new Mangment();
        // Mangment tr = new Mangment();
        // User record = new User();

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

                    default:
                    System.out.println("\nInvalid input\n");
                    break;
                }
            
   }     
   while (option != 9);
        }

    }

    public static void menu()
    {
        System.out.println("============================= MENU Principale ============================");
        System.out.println("1: Ajouter des utilisateurs");
        System.out.println("2:Afficher des utilisateurs");
        System.out.println("==========================================================================");

        // System.out.println(": Exit program");
        System.out.print("Enter your selection : ");
    }



    public static void sous_menu()
    {
        System.out.println("******************************** SOUS-MENU ***************************************");
        System.out.println("1: Ajouter un etudiant");
        System.out.println("2: Ajouter un prof ");
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
}
