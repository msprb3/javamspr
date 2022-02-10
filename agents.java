/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javamspr;
import java.io.*;
/**
 *
 * @author hp
 */
public class agents {
     private String nom;
    private String prenom;
    private String fonction;
    private String pass;
    private String alias;
    
    agents(){
        this.nom = "null";
        this.prenom = "null";
        this.fonction = "null";
        this.pass = "null";
    }
    
    agents(String alias){
        this.nom = "null";
        this.prenom = "null";
        this.fonction = "null";
        this.pass = "null";
        this.alias = alias;
    }
    
//==============================[Geteur]========================================   
    public String getNom(){
        return this.nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    } 
    
    public String getFonction(){
        return this.fonction;
    }
    
    public String getPass(){
        return this.pass;
    }
    public String getAlias(){
        return this.alias;
    }
//============================[Seteur]==========================================
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setPrenom(String prenom){
        this.prenom = prenom;
    } 
    
    public void setFonction(String fonction){
        this.fonction = fonction;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    public void setAlias(String alias){
        this.alias = alias;
    }
    
 //=============================================================================   
    
    public void afficheInfoAgents(){
        System.out.println("|> Nom : "+this.getNom()+"|> Prenom : "+this.getPrenom()+"|> Status : "+this.getFonction()+"|> Alias : "+this.getAlias());
    }
    
    public boolean verifFicheAgent(){
        String pathFicheAgent = "C:\\Users\\ADAOUDI\\OneDrive - Groupe CRYSTAL\\Documents\\NetBeansProjects\\javamspr\\javamspr\\src\\main\\java\\com\\mycompany\\javamspr\\FicheAgent\\txt\\"+this.alias+".txt";
        
        File fiche = new File(pathFicheAgent);
        
        if(fiche.isFile())
        { 
            return true;
        }else{    
            
            return false;
        }
    }
}

