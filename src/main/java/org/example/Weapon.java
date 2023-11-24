package org.example;

public class Weapon extends Equipment {
    protected String nameWeapon;
    protected int weaponDamage;


    public Weapon(String nameWeapon){
        this.nameWeapon=nameWeapon;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }


}
