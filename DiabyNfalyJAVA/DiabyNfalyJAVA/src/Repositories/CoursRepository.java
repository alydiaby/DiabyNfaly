package Repositories;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Entities.Cours;

public class CoursRepository {
    public  void insert(Cours cours){
        try {
             //1-Chargement du Driver
             Class.forName("com.mysql.cj.jdbc.Driver");
             //2-Se Connecter a une BD
             Connection conn = DriverManager.getConnection(""
                       , "root", "");
               //3-Execution et Recuperation
                Statement statement = (Statement) conn.createStatement();
               
                int nbreLigne=((java.sql.Statement) statement).executeUpdate("INSERT INTO `cours` ( `id_cours`) VALUES ('"+cours.getId()+"')");
                conn.close();
           } catch (ClassNotFoundException e) {
               System.out.println("Erreur de chargement de Driver");
           }
          catch (SQLException e) {
             System.out.println("Erreur de Connexion a la BD");
         }
        }
}
