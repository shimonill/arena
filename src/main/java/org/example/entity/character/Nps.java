package org.example.entity.character;
import org.example.Equipment;
import java.util.ArrayList;
import java.util.List;
public class Nps {
    String nameNps;
    protected int balanceNps;
    protected Equipment[]product;
    protected List<Equipment>inventory;

    public Nps(){
        this.nameNps="Торговец";
        this.balanceNps=0;
        product = new Equipment[10];
        inventory=new ArrayList<>();

    }

    public void inventoryNPS(){

    }


}
