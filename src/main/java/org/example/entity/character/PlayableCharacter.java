package org.example.entity.character;

import org.example.Ability;
import org.example.Weapon;

public class  PlayableCharacter {

    private String nameplayer;
    private int strengthplayer;
    private int dexterityplayer;
    private int staminaplayer;
    private int playerHP;
    private int energyplayer;
    private int expplayer;
    private int lvlplayer;
    private int playerbalance;
    private int defensplayer;
    private Ability[] abilities;
    private Weapon[] inventoryPle;

    public Weapon[] getInventoryPle() {
        return inventoryPle;
    }

    public void setInventoryPle(Weapon[] inventoryPle) {
        this.inventoryPle = inventoryPle;
    }

    public PlayableCharacter(String nameplayer){
        this.nameplayer=nameplayer;
        this.strengthplayer=10;
        this.dexterityplayer=10;
        this.staminaplayer=10;
        this.playerHP = (strengthplayer + staminaplayer) * 2;
        this.energyplayer = (strengthplayer + dexterityplayer) / 2;
        this.expplayer = 0;
        this.lvlplayer = 1;
        this.playerbalance = 0;
        this.defensplayer=10;
 }

    public String getNameplayer() {
        return nameplayer;
    }

    public void setNameplayer(String nameplayer) {
        this.nameplayer = nameplayer;
    }

    public int getStrengthplayer() {
        return strengthplayer;
    }

    public void setStrengthplayer(int strengthplayer) {
        this.strengthplayer = strengthplayer;
    }

    public int getDexterityplayer() {
        return dexterityplayer;
    }

    public void setDexterityplayer(int dexterityplayer) {
        this.dexterityplayer = dexterityplayer;
    }

    public int getStaminaplayer() {
        return staminaplayer;
    }

    public void setStaminaplayer(int staminaplayer) {
        this.staminaplayer = staminaplayer;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    public int getEnergyplayer() {
        return energyplayer;
    }

    public void setEnergyplayer(int energyplayer) {
        this.energyplayer = energyplayer;
    }

    public int getExpplayer() {
        return expplayer;
    }

    public void setExpplayer(int expplayer) {
        this.expplayer = expplayer;
    }

    public int getLvlplayer() {
        return lvlplayer;
    }

    public void setLvlplayer(int lvlplayer) {
        this.lvlplayer = lvlplayer;
    }

    public int getPlayerbalance() {
        return playerbalance;
    }

    public void setPlayerbalance(int playerbalance) {
        this.playerbalance = playerbalance;
    }
    public void damageCurrentHealth(int damage) {
        this.playerHP -= damage;
    }

    @Override
    public String toString() {
        return "PlayableCharacter{" +
                "nameplayer='" + nameplayer + '\'' +
                ", strengthplayer=" + strengthplayer +
                ", dexterityplayer=" + dexterityplayer +
                ", staminaplayer=" + staminaplayer +
                ", playerHP=" + playerHP +
                ", energyplayer=" + energyplayer +
                ", defensplaer=" + defensplayer +
                ", expplayer=" + expplayer +
                ", lvlplayer=" + lvlplayer +
                ", playerbalance=" + playerbalance +
                '}';
    }

}

