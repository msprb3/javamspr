/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javamspr;


 import java.util.*;
/**
 *
 * @author hp
 */
public class Generateur {
        public static void main(String [] args){
        //Parsing des fichier ===========================================================================
        
        parseFichierTxt lectureListeEquipement = new parseFichierTxt();
        List<equipements> listeEquipement = lectureListeEquipement.parseliste();

        for( int index = 0; index < listeEquipement.size(); index++)
        {
            listeEquipement.get(index).afficheEquipement();
        }
        
        parseFichierTxt lectureListAgents = new parseFichierTxt();
        List<agents> listeAgents = lectureListAgents.parsestaff();
       
        for( int index = 0; index < listeAgents.size(); index++)
        {
            listeAgents.get(index).afficheInfoAgents();
            listeAgents.get(index).verifFicheAgent();
        }
        
        //Verification de la présence des fiches agents
        
        
        
    }
}

