/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Sword implements Weapon{

    @Override
    public void equipWeapon() {
        System.out.println("\nEquipment Sword dipasang");
    }

    @Override
    public void noWeapon() {
        System.out.println("\nEquipment Sword dilepas");
    }
    
}
