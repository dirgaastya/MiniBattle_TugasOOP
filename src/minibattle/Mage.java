/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Mage extends Hero{

    public Mage(String name) {
        super(name);
        super.hp+=300;
        super.atk+=100;
        super.matk+=300;
        super.def+=60;
        super.mdef+=60;
    }

     
    public void magicSkill(Monster enemy){
        int damage;
        damage=this.matk*2 - enemy.getDef();
        enemy.setHp(damage);
        infoMatk(enemy, damage);
        if (enemy.getHp()<=0) {
            System.out.println("Monster " + enemy.name + " telah dikalahkan");
        }
    }
    
    public void infoMatk(Monster enemy, int damage){
        System.out.println("\n"+this.name + " Menyerang monster "+ enemy.name + " dengan Magic Skill");
        System.out.println("Damage yang diberikan " + this.name +" sebesar\t\t\t: " + (this.matk*2));
        System.out.println("Damage yang diterima monster "+ enemy.name + " sebesar\t\t: " + damage);
        System.out.println("Sisa HP monster " + enemy.name +" sebesar\t\t\t\t: " + enemy.getHp()+"\n");
    }

    
    
}
