/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Monster {
    public  String name;
    private int hp,atk,matk,def,mdef;

    public Monster(String name) {
        this.name = name;
        this.hp = 1500;
        this.atk = 200;
        this.matk = 350;
        this.def = 50;
        this.mdef = 50;
        
        System.out.println("Monster " + this.name + " Memasuki Arena");
    }

    public int getHp() {
        
        return hp;
    }

    public void setHp(int damage) {
        this.hp = hp - damage;
        if (hp<=0) {
            hp=0;
        }
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getMdef() {
        return mdef;
    }

    public void setMdef(int mdef) {
        this.mdef = mdef;
    }
    
    public void showAttribut(){
        System.out.println("\nAttribut Monster " + this.name);
        System.out.println("HP\t\t: " + this.hp);
        System.out.println("ATK\t\t: " + this.atk);
        System.out.println("MATK\t\t: " + this.matk);
        System.out.println("DEF\t\t: "+ this.def);
        System.out.println("MDEF\t\t: "+ this.mdef+"\n");
    }
    
   


    
    
    
}
