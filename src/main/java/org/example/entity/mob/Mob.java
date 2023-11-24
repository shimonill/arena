package org.example.entity.mob;

 public class Mob {
     protected String nameMob;
     protected int strengthMob=10;
     protected int dexterityMob=10;
     protected int staminaMob=10;
     protected int HPMob=(strengthMob+staminaMob)*2;
     protected int energyMob=((staminaMob+dexterityMob)/2);
     protected int lvlMob;
     protected int defenseMob=10;

     public int getStrengthMob() {
         return strengthMob;
     }
     public void setStrengthMob(int strengthMob) {
         this.strengthMob = strengthMob;
     }

     public String getNameMob() {
         return nameMob;
     }

     public void setNameMob(String nameMob) {
         this.nameMob = nameMob;
     }

     public int getDexterityMob() {
         return dexterityMob;
     }

     public void setDexterityMob(int dexterityMob) {
         this.dexterityMob = dexterityMob;
     }

     public int getStaminaMob() {
         return staminaMob;
     }

     public void setStaminaMob(int staminaMob) {
         this.staminaMob = staminaMob;
     }

     public int getHPMob() {
         return HPMob;
     }

     public void setHPMob(int HPMob) {
         this.HPMob = HPMob;
     }

     public int getEnergyMob() {
         return energyMob;
     }

     public void setEnergyMob(int energyMob) {
         this.energyMob = energyMob;
     }

     public int getLvlMob() {
         return lvlMob;
     }

     public void setLvlMob(int lvlMob) {
         this.lvlMob = lvlMob;
     }

     public int getDefenseMob() {
         return defenseMob;
     }

     public void setDefenseMob(int defenseMob) {
         this.defenseMob = defenseMob;
     }
     public void damageCurrentHealth(int damage){
         this.HPMob-=damage;
     }
     public String toString(String nameMob) {
         return "Mob{" +
                 "nameMob='" + nameMob + '\'' +
                 ", strengthMob=" + strengthMob +
                 ", dexterityMob=" + dexterityMob +
                 ", staminaMob=" + staminaMob +
                 ", HPMob=" + HPMob +
                 ", energyMob=" + energyMob +
                 ", lvlMob=" + lvlMob +
                 ", defenseMob=" + defenseMob +
                 '}';
     }
 }
