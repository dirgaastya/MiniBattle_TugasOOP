/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minibattle;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainBattle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Spawn Monster
        Monster indosiarDragon = new Monster("Indosiar Black Dragon");
        indosiarDragon.showAttribut();
        
//      Spawn Hero
//      Jika ingin melihat attribut hero dapat memanggil method showAttribut();
        Hero newHero = new Hero ("Trainer");
        newHero.attack(indosiarDragon);
        newHero.defend(indosiarDragon, "basic"); //Parameter dapat diisi
        newHero.defend(indosiarDragon, "skill");//hanya dengan basic dan skill
        newHero.defend(indosiarDragon, "basic");


       
   
//       Spawn Mage
        Mage newMage = new Mage("Wizard");
        newMage.attack(indosiarDragon);
        newMage.magicSkill(indosiarDragon);
        newMage.defend(indosiarDragon, "basic");
        newMage.defend(indosiarDragon, "skill");
        
//      Spawn Warrior
        Warrior newWarrior = new Warrior("Knight");
        newWarrior.attack(indosiarDragon);
        newWarrior.defend(indosiarDragon, "basic");
        newWarrior.defend(indosiarDragon, "skill");
        newWarrior.swordSkill(indosiarDragon);
        
        
    }
    
}
