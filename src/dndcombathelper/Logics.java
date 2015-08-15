/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndcombathelper;

import javax.swing.JOptionPane;

/**
 *
 * @author John
 */
public class Logics {
    
    public Logics(){
        
    }
    
    
    //Gets the number of characters, their initiative and sorts it
    public void setInitiative(DataShit dat){
        
        int initiative;
        String name;
        
        dat.setNumOfCharacters(Integer.parseInt(
                JOptionPane.showInputDialog("Enter the number of characters")));
        int totalChars = dat.getNumOfCharacters();
        for(int i = 1; i<=totalChars; i++){
            name = JOptionPane.showInputDialog("Who rolled?");
            initiative = (Integer.parseInt(
                    JOptionPane.showInputDialog("Enter their initiative")));
            dat.setCreatures(initiative, name);
        }
        dat.sortMyInitiative();
    }
    
    public void addCharacter(DataShit dat){
        int initiative;
        String name;
        
        name = JOptionPane.showInputDialog("Who rolled?");
        initiative = Integer.parseInt(
                JOptionPane.showInputDialog("Enter their initiative"));
    
        dat.setCreatures(initiative, name);
    }

}
