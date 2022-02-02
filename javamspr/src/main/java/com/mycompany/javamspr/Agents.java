/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javamspr;

/**
 *
 * @author hp
 */
public class Agents {
     private String nom;
    private String prenom;
    private String fonction;
    private String pass;
    
    Agents(){
        this.nom = "null";
        this.prenom = "null";
        this.fonction = "null";
        this.pass = "null";
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
 //=============================================================================   
    
    public void setAgentByFile(){
        //Recupère les information du fichier agents
        //Initialise les variable de la class agents 
    }
  
    public void afficheInfoAgents(){
        //formate les informations 
        //affiche les informations dans un println
    }
}

