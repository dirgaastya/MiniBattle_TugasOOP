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
        super.hp+=1000;
        super.atk+=250;
        super.matk+=90;
        super.def+=120;
        super.mdef+=70;
    }
     
    public void swordSkill(Monster enemy){
        int damage;
        damage=(this.atk-enemy.getDef())+(this.matk-enemy.getMdef());
        if (damage<=0){
            damage=0;
        }
        enemy.setHp(damage);
        infoHybridAtk(enemy, damage);
        
        if (enemy.getHp()<=0) {
            System.out.println("Monster " + enemy.name + " telah dikalahkan");
        }
    }
    
    public void infoHybridAtk(Monster enemy, int damage){
        System.out.println("\n"+this.name + " Menyerang monster "+ enemy.name + " dengan Sword Skill"); 
        System.out.println("Damage yang diberikan " + this.name +" sebesar" );
        System.out.println("==> " + (this.matk+this.atk));
        System.out.println("Damage yang diterima monster "+ enemy.name + " sebesar " );
        System.out.println("==> " + damage);
        System.out.println("Sisa HP monster " + enemy.name +" sebesar ");
        System.out.println("==> "+ enemy.getHp() + "\n");
        
    }
}
