
package dndcombathelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class DataShit {
    private int NumOfCharacters;

    
    public InitShit ini;
    public MathShit mat;
    public Logics logi;
    
    
    
   private ArrayList<Creature> characters;
   
   ArrayList creatures;
    
    public DataShit() {
        ini = new InitShit();
        logi = new Logics();
        mat = new MathShit();
        creatures = new ArrayList();
        
        characters = new ArrayList<Creature>();
        
        logi.setInitiative(this);
        
       // System.out.println(initiative.get(0));
    }

    
    public Object returnCreatures(){
        return creatures;
    }
    
    public void setCreatures(int initiative, String name){
        creatures.add(new Creature(initiative, name));
    }
    public void removeCreature(){
     //   creatures.remove(ini);
    }
    
    public Creature getCharacter(int i){
        return characters.get(i);
    }
    
    public Logics getLogi() {
        return logi;
    }
    public void addCharacter(Creature charName){
        characters.add(charName);
    }
    
    public void sortMyInitiative(){
        Collections.sort(creatures);
        Iterator it = creatures.iterator();
        
        while(it.hasNext()){
            Object element = it.next();
            System.out.println(element);
             
        }
      //  Collections.sort(characters, Collections.reverseOrder());
    }
    
    public void setNumOfCharacters(int _numOfCharacters){
        NumOfCharacters = _numOfCharacters;
    }
    public int getNumOfCharacters(){
        return NumOfCharacters;
    }

    public InitShit getIni() {
        return ini;
    }

    public void setIni(InitShit ini) {
        this.ini = ini;
    }

    public MathShit getMat() {
        return mat;
    }

    public void setMat(MathShit mat) {
        this.mat = mat;
    }
}
