/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Slime extends Monster{
     public Slime(){
        super.name="Slime";
        super.hp+=300;
        super.atk+=100;
        super.matk+=300;
        super.def+=60;
        super.mdef+=60; 
     }

    @Override
    void passiveMonster() {
        super.hp+=500;
        System.out.println("Passive Monster Slime telah aktif! Slime HP++");
    }
        
}

