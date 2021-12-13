/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class IbdMonster extends Monster {

    public IbdMonster() {
        super.name = "Indosiar Black Dragon";
        super.hp += 1000;
        super.atk += 200;
        super.matk += 400;
        super.def += 260;
        super.mdef += 260;
    }

    @Override
    void passiveMonster() {
        super.def += 1000000;
        super.mdef += 100;
        System.out.println(
                "Passive Monster Indosiar Black Dragon telah aktif! Indosiar Black Dragon Magical Def ++ & Physical Def +++++++++++++");
    }

    public void showAttribut() {
        System.out.println("\nAttribut Monster " + super.name);
        System.out.println("HP\t\t: " + super.hp);
        System.out.println("ATK\t\t: " + super.atk);
        System.out.println("MATK\t\t: " + super.matk);
        System.out.println("DEF\t\t: " + super.def);
        System.out.println("MDEF\t\t: " + super.mdef + "\n");
        System.out.println(
                "Passive\t\t: HP Indosiar Black Dragon diatas 1500 Magical Def naik 100 dan Physical Def 1000000 naik 300");
    }

}
