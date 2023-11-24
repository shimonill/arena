package org.example;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import org.example.entity.character.Nps;
import org.example.entity.character.PlayableCharacter;
import org.example.entity.mob.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра началась");
        System.out.println("Введите имя персонажа");
        PlayableCharacter player = new PlayableCharacter(input.next());
        System.out.println("Игровой персонаж создан:" + player);


        while (true) {
            System.out.println("Начался первый этап: БОЙ");
            System.out.println("Фаза 1: Подбор противника ");
            System.out.println("Выберите противника:" + "\n" + "1)на уровень ниже" + "\n" + "2)того же уровня" + "\n" + "3)на уровень выше");

            int commend = input.nextInt();
            int lvlDifference;
            if (commend == 1) lvlDifference = -1;
            else if (commend == 2) lvlDifference = 0;
            else if (commend == 3) lvlDifference = 1;
            else {
                System.out.println("Error");
                return;
            }
            Random rand = new Random();
            int typeOfMob = rand.nextInt(4);
            Mob[] types = new Mob[4];
            types[0] = new Goblinoid(player.getLvlplayer() + lvlDifference);
            types[1] = new Humanoids(player.getLvlplayer() + lvlDifference);
            types[2] = new Undead(player.getLvlplayer() + lvlDifference);
            types[3] = new Beastmen(player.getLvlplayer() + lvlDifference);
            Mob mob = types[typeOfMob];
            System.out.println("Найден противник");
            System.out.println(mob.toString());
            System.out.println("Бой начался!");
            boolean playerTurn = true;
            while (player.getPlayerHP() > 0 && mob.getHPMob() > 0){
                if (playerTurn){
                    System.out.println("Ход за вами, выберите действие:" + "\n" + "1)Атаковать" + "\n" + "2)Использовать навык" + "\n" + "3)использовать раходник");
                    int move = input.nextInt();
                    if (move == 1) {
                        mob.damageCurrentHealth(player.getStrengthplayer());
                        System.out.println(player.getNameplayer() + " атаковал с силой " + player.getStrengthplayer() + " здоровье монстра упало до " + mob.getHPMob());
                    }
                    playerTurn=false;
                }
                else{
                    playerTurn = true;
                    System.out.println("Монстр контратакует!");
                    player.damageCurrentHealth(mob.getStrengthMob());
                    System.out.println("Монстр атаковал с силой " + mob.getStrengthMob() + " здоровье героя упало до " + player.getPlayerHP());
                }
                if(player.getPlayerHP()<=0){
                    System.out.println("Игрок умер!");
                    // получет опыт но не золото и идет в торговлю
                    break;
                } else if (mob.getHPMob()<=0) {
                    System.out.println("Противник умер!");
                    System.out.println("Ваша награда:");
                    player.setPlayerbalance(mob.getLvlMob()*50);
                    System.out.println(player.getPlayerbalance()+"золото");
                    // плюшки

                }
                while (player.getPlayerbalance()>0){
                    System.out.println("Второй этап:ТОРГОВЛЯ");
                    Nps nps = new Nps();
                    System.out.println(nps);
                    System.out.println("Вас приветствует торговец!");
                    System.out.println("Доступные предметы торговца:");
                    System.out.println("Тут ты должен прописать торговлю чудик");
                    break;
                }
            }



        }







//          есть ли у противников итемы, магазин, тор







//        if (commend == 1) {
//            Goblinoid goblinoid = new Goblinoid(player.getLvlplayer() - 1);
//            System.out.println("Найден противник");
//            System.out.println(goblinoid.toString());
//            System.out.println("Бой начался!");
//            while (player.getPlayerHP() > 0 && goblinoid.getHPMob() > 0) {
//                System.out.println("Ход за вами, выберите действие:" + "\n" + "1)Атаковать" + "\n" + "2)Использовать навык" + "\n" + "3)использовать раходник");
//                int move = input.nextInt();
//                if (move == 1) {
//                    goblinoid.damageCurrentHealth(player.getStrengthplayer());
//                    System.out.println(player.getNameplayer() + " атаковал с силой " + player.getStrengthplayer() + " здоровье монстра упало до " + goblinoid.getHPMob());
//                    System.out.println("Гоблиноид контратакует!");
//
//                    player.damageCurrentHealth(goblinoid.getStrengthMob());
//                    System.out.println("Монстр атаковал с силой" + goblinoid.getStrengthMob() + " здоровье героя упало до " + player.getPlayerHP());
//                } else if (move == 2) {
//                } else if (move == 3) {
//                }
//            }
//
//
//
//
//        } else if (commend == 2) {
//            Humanoids humanoids = new Humanoids(player.getLvlplayer());
//            System.out.println("Найден противник");
//            System.out.println(humanoids.toString());
//            System.out.println("Бой начался!");
//            while (player.getPlayerHP() > 0 && humanoids.getHPMob() > 0) {
//                System.out.println("Ход за вами, выберите действие:" + "\n" + "1)Атаковать" + "\n" + "2)Использовать навык" + "\n" + "3)использовать раходник");
//                int move = input.nextInt();
//                if (move == 1) {
//                    humanoids.damageCurrentHealth(player.getStrengthplayer());
//                    System.out.println(player.getNameplayer() + " атаковал с силой " + player.getStrengthplayer() + " здоровье монстра упало до " + humanoids.getHPMob());
//                    System.out.println("Гоблиноид контратакует!");
//                    player.damageCurrentHealth(humanoids.getStrengthMob());
//                    System.out.println("Монстр атаковал с силой " + humanoids.getStrengthMob() + " здоровье героя упало до " + player.getPlayerHP());
//                } else if (move == 2) {
//                } else if (move == 3) {
//                }
//            }
//        }
//
//
//
//        else if (commend == 3) {
//            Beastmen beastmen = new Beastmen( player.getLvlplayer() + 1);
//            System.out.println("Найден противник");
//            System.out.println(beastmen.toString());
//            System.out.println("Бой начался!");
//            while (player.getPlayerHP() > 0 && beastmen.getHPMob() > 0) {
//                System.out.println("Ход за вами, выберите действие:" + "\n" + "1)Атаковать" + "\n" + "2)Использовать навык" + "\n" + "3)использовать раходник");
//                int move = input.nextInt();
//                if (move == 1) {
//                    beastmen.damageCurrentHealth(player.getStrengthplayer());
//                    System.out.println(player.getNameplayer() + " атаковал с силой " + player.getStrengthplayer() + " здоровье монстра упало до " + beastmen.getHPMob());
//                    System.out.println("Гоблиноид контратакует!");
//                    player.damageCurrentHealth(beastmen.getStrengthMob());
//                    System.out.println("Монстр атаковал с силой " + beastmen.getStrengthMob() + " здоровье героя упало до " + player.getPlayerHP());
//                } else if (move == 2) {
//                } else if (move == 3) {
//                }
//            }
//        }
    }
}
