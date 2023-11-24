package org.example.entity.mob;

public class Beastmen extends Mob {
    String nameMob="Goblinoid";
    public Beastmen(int lvlMob) {
        this.lvlMob=lvlMob;
    }

    @Override
    public String toString() {
        return super.toString(nameMob);
    }
    public void puredamage(){
        strengthMob=getStrengthMob()+defenseMob;
    }
}
