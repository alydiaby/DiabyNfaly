import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import Entities.Cours;
import Services.CoursServices;
import Services.ModuleServices;
import Services.ProfesseurServices;

public class View {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        CoursServices coursService= new CoursServices();
        ModuleServices moduleService= new ModuleServices();
        ProfesseurServices professeurService=new ProfesseurServices();
        
        List<Cours> cours= coursService.listerCours();
        List<Module> modules=  moduleService.listerModule();
        int choix;
        do {
            System.out.println("Faites un choix");
            System.out.println("1-Ajouter un module");
            System.out.println("2-Lister les Modules");
            System.out.println("3-Créer un cours");
            System.out.println("4-Lister les  tous les cours");
            System.out.println("5-Lister les  les cours  d’un module et d’un professeur");
            System.out.println("6-Quitter");
            
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    System.out.println(" Id du module : ");
                    int idMod=sc.nextInt();
                    System.out.println(" Nom du module : ");
                    String nomModule =sc.nextLine();
                    
                    Module module=new Module();
                    module.setIdMod(idMod);
                    coursService.ajouterModule(module);
                break;


                case 2:
                    
                     module=  moduleService.listerModule();
                    for (Module module: modules) {
                        System.out.println("Libelle "+ module.getNomModule());

                    }
                break;

                case 3:
                    System.out.println("id du cours ");
                    int id=sc.nextInt();
                    System.out.println("date du cours");
                    LocalDate date =sc.nextLine();
                    System.out.println("heure debut :");
                    LocalTime heureDB  =sc.nextLine();
                    System.out.println("heure fin :");
                    LocalTime heureFin  =sc.nextLine();
                    Cours cours= new Cours();
                    coursService.ajouterCours(cours);
                break;
                case 4:
                cours=  (Cours) coursService.listerCours();
                for (Cours cours:cours) {
                    System.out.println("nom "+ cours.getId());
                }
                break;

                case 5:
                   

            }
        }while(choix!=5);
        sc.close();
    }
}