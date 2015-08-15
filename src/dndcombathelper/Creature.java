/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndcombathelper;

public class Creature implements Comparable{
    int initiative;
    String name;
    
    public Creature(int _in, String _name){
        initiative = _in;
        name = _name;
    }

    public int getIniciative() {
        return initiative;
    }

    public void setPosition(int position) {
        this.initiative = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return "Name: " + name + "\n";
    }

    @Override
    public int compareTo(Object o1) {
        if (this.initiative == ((Creature) o1).initiative) {
            return 0;
        } else if (this.initiative < ((Creature) o1).initiative) {
            return 1;
        } else {
            return -1;
        }
    }
    
    
}
