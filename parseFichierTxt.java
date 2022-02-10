/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javamspr;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author adaoudi
 */
public class parseFichierTxt {
    public List<equipements> parseliste()    {
        
    String fileListEquipement = "C:\\Users\\ADAOUDI\\OneDrive - Groupe CRYSTAL\\Documents\\NetBeansProjects\\javamspr\\javamspr\\src\\main\\java\\com\\mycompany\\javamspr\\Materiel\\liste.txt"; 
    List<equipements> listEquipement = new ArrayList<>();
    
    try(BufferedReader BufferEquipements = new BufferedReader(new FileReader(fileListEquipement))) 
        {
            String line;
            String [] mot;
            
            /* à chaque itération du while :  - lire la ligne courante  
                                              - deffinition d'un separateur par tabulation 
                                              - stock le premier mot dans la première case du tbaleau et le deuxième mot dans la deuxième case
                                              - initialise une nouvel instance de la classe equipement
                                              - ajoute le nouvel objet dans la liste d'objet dequipement*/
            
            while ((line = BufferEquipements.readLine()) != null) {
                    mot = line.split("\t");
                    
                    equipements equipement = new equipements(mot[0],mot[1]);
                
                    listEquipement.add(equipement);           
            }
        }
        catch (IOException e) {
            
            System.out.println(e);
            
            e.printStackTrace();
        }
    return(listEquipement);
 }
    
    
    
    public List<agents> parsestaff(){
        
    String fileListEquipement = "C:\\Users\\ADAOUDI\\OneDrive - Groupe CRYSTAL\\Documents\\NetBeansProjects\\javamspr\\javamspr\\src\\main\\java\\com\\mycompany\\javamspr\\Agents\\staff.txt"; 
    List<agents> listagents = new ArrayList<>();
    
    try(BufferedReader BufferEquipements = new BufferedReader(new FileReader(fileListEquipement))) 
        {
            String line;
            
            /* à chaque itération du while :  - lire la ligne courante  
                                              - initialise une nouvel instance de la classe agent avec l'alias de l'agent
                                              - ajoute le nouvel objet dans la liste d'objet agent*/
            
            while ((line = BufferEquipements.readLine()) != null) {
                 agents agent = new agents(line);             
                    listagents.add(agent);           
            }
        }
        catch (IOException e) {
            
            System.out.println(e);
            
            e.printStackTrace();
        }
    return(listagents);
 }
}
