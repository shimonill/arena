package org.example.entity.mob;
public class Goblinoid extends Mob {

    String nameMob="Goblinoid";
    public Goblinoid(int lvlMob) {
        this.lvlMob=lvlMob;

    }
    @Override
    public String toString() {
        return super.toString(nameMob);
    }
//    public void healMob(){
//        HPMob=getHPMob()*2;
//    }
}
