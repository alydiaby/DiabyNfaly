package Entities;

public class Professeur {
    private int idProf;
    private String nom;
    private String prenom;
    private String tel;
    
    public Professeur() {
    }
    

    public int getIdProf() {
        return idProf;
    }
    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    };
}

