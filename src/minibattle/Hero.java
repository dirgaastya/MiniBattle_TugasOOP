/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Hero {
    public String name;
    protected int hp,atk,matk,def,mdef;

    Hero(String name) {
        this.name = name;
        this.hp = 500;
        this.atk = 50;
        this.matk = 50;
        this.def = 50;
        this.mdef = 50;
        
        System.out.println("Hero " + name + " Memasuki Battle");
    }
    
    public void attack(Monster enemy){
        int damage = this.atk-enemy.getDef();
        enemy.setHp(damage);
        infoAtk(enemy, damage);
        if (enemy.getHp()<=0) {
            System.out.println("Monster " + enemy.name + " telah dikalahkan");
        }
     }
    
      public void defend(Monster enemy, String attack){
        int damage; 
        if (attack=="basic") {
            damage=enemy.getAtk() - this.def;          
            if (damage<=0) {
                damage=0;
                infoDef(enemy, damage);
            }else{
                this.hp -= damage;
                infoDef(enemy, damage);
                }
            }else if (attack=="skill") {
            damage=enemy.getMatk()- this.mdef;
                if (damage<=0) {
                    damage=0;
                    infoDef(enemy, damage);
                }else{
                    this.hp -= damage;
                    infoDef(enemy, damage);
                }
            }
        
        if (this.hp<=0) {
            System.out.println(this.name + " telah dikalahkan\n");
        }
    }

   public void infoDef(Monster enemy,int damage){
        
        System.out.println("\nMonster "+ enemy.name  + (" Menyerang " + this.name ));
        System.out.println("Damage yang diberikan " + enemy.name +" sebesar\t\t: " + enemy.getAtk());
        System.out.println("Damage yang diterima " + this.name + " sebesar\t\t\t\t: " + damage);
        System.out.println("Sisa HP " + this.name + " sebesar\t\t\t\t\t\t: " + this.hp +"\n");
        
    }
    
    public void infoAtk(Monster enemy, int damage){
        System.out.println("\n"+this.name + " Menyerang monster "+ enemy.name);
        System.out.println("Damage yang diberikan " + this.name +" sebesar\t\t\t\t: " + this.atk);
        System.out.println("Damage yang diterima monster "+ enemy.name + " sebesar\t: " + damage);
        System.out.println("Sisa HP monster " + enemy.name +" sebesar\t\t\t: " + enemy.getHp()+"\n");
    }
    
    public void showAttribut(){
        System.out.println("Attribut Hero " + this.name);
        System.out.println("HP\t\t: " + this.hp);
        System.out.println("ATK\t\t: " + this.atk);
        System.out.println("MATK\t\t: " + this.matk);
        System.out.println("DEF\t\t: "+ this.def);
        System.out.println("MDEF\t\t: "+ this.mdef);
    }
    
    
    
        
}