package org.example.entity.mob;

public class Undead extends Mob{
    String nameMob="Undead";
    public Undead(int lvlMob) {
    this.lvlMob=lvlMob;
    }
    @Override
    public String toString() {
        return super.toString(nameMob);
    }
    public void superDamege(){
        strengthMob=getStrengthMob()*3;
    } 
}


