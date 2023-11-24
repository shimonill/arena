package org.example.entity.mob;
public class Humanoids extends Mob {
    String nameMob="Humanoids";
    public Humanoids(int lvlmob){
    this.lvlMob=lvlmob;
    }
    @Override
    public String toString() {
        return super.toString(nameMob);
    }

    public void puredamage(){
        strengthMob=getStrengthMob()+defenseMob;
    }
    public void superDamege(){
        strengthMob=getStrengthMob()*3;
    }
    public void healMob(){
        HPMob=getHPMob()*2;
    }

}
