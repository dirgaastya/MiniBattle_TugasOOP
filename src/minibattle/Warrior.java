/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
        super.hp+=400;
        super.atk+=300;
        super.matk+=100;
        super.def+=60;
        super.mdef+=60;
    }
     
    public void swordSkill(Monster enemy){
        int damage;
        damage=(this.atk-enemy.getDef())+(this.matk-enemy.getMdef());
        enemy.setHp(damage);
        infoHybridAtk(enemy, damage);
        
        if (enemy.getHp()<=0) {
            System.out.println("Monster " + enemy.name + " telah dikalahkan");
        }
    }
    
    public void infoHybridAtk(Monster enemy, int damage){
        System.out.println("\n"+this.name + " Menyerang monster "+ enemy.name + " dengan Sword Skill");
        System.out.println("Damage yang diberikan " + this.name +" sebesar\t\t\t\t: " + (this.matk+this.atk));
        System.out.println("Damage yang diterima monster "+ enemy.name + " sebesar\t: " + damage);
        System.out.println("Sisa HP monster " + enemy.name +" sebesar\t\t\t: " + enemy.getHp()+"\n");
    }
}
