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
//  Membuat Object Menu Aksi 
    ActionMenu actionMenu = new ActionMenu(); 
//  Membuat Object Aksi
    Action newAction = new Action();


//  Membuat Object User Input
    Scanner newObj = new Scanner(System.in);
    String input;
    String inputNamaHero = null;
    String heroValue = null;        //Nilai untuk menampung hero yang dipilih
    String monsterValue = null;     //Nilai untuk menampung lawan yang dipilih
    
      while(true){
            System.out.println("\n===========MiniBattle=============");
            System.out.println("1. Masukan Nama Hero");
            System.out.println("2. Tentukan Job Class Hero");
            System.out.println("3. Tentukan Senjata");
            System.out.println("4. Tentukan Monster Monster Lawan");
            System.out.println("5. Mulai Bertarung");
            System.out.println("0. Tentang MiniBattle");
            System.out.println("*  Keluar Program");
            System.out.println("==================================");
            System.out.print("Pilih\t\t: ");
//          Input untuk memilih menu
            input = newObj.nextLine();
//          Membuat nama Karakter hero
            if(input.equalsIgnoreCase("1")){
                System.out.print("\nMasukan Nama Hero Anda : ");
                inputNamaHero = newObj.nextLine();
                System.out.println("\nHallo " + inputNamaHero + " Selamat Datang!");
                actionMenu.backToMenu();
            }
//          Menentukan Job class Hero
            else if (input.equalsIgnoreCase("2")){
                String option = actionMenu.getHero();
                newAction.selectHero(option);
                heroValue = option;
                actionMenu.backToMenu();
            }
//          Menentukan memakai senjata atau tidak
            else if (input.equalsIgnoreCase("3")) {
                String option = actionMenu.getWeapon();
                switch(option){
                    case "1":
                        Weapon swordWeapon = new Sword();
                        String weaponOpt = actionMenu.weaponOption();
                        switch(weaponOpt){
                            case "1":
                                swordWeapon.equipWeapon();
                                break;
                            case "2":
                                swordWeapon.noWeapon();
                                break;
                        }
                        break;
                    case "2":  
                        Weapon magicWeapon = new MagicWand();
                        String magicOpt = actionMenu.weaponOption();
                        switch(magicOpt){
                            case "1":
                                magicWeapon.equipWeapon();
                                break;
                            case "2":
                                magicWeapon.noWeapon();
                                break;
                        }
                        break;
                    case "3":
                        Weapon axeWeapon = new Axe();
                        String axeOpt = actionMenu.weaponOption();
                        switch(axeOpt){
                            case "1":
                                axeWeapon.equipWeapon();
                                break;
                            case "2":
                                axeWeapon.noWeapon();
                                break;
                        }
                        break;
                }
                actionMenu.backToMenu();
            }
//          Menentukan Lawan
            else if (input.equalsIgnoreCase("4")){
                String option = actionMenu.getMonster();
                newAction.selectMonster(option);
                monsterValue = option;
                actionMenu.backToMenu();
            }
//          Bertarung
            else if (input.equalsIgnoreCase("5")){
                String option=heroValue;
                switch(option){
//                  Fungsi yang dipanngil apabila nilai hero = 1 / kita memilih basic hero 
                    case "1":
                        Hero newHero = new Hero(inputNamaHero);
                        newAction.basicFight(newHero,monsterValue);
                        break;
//                  Fungsi yang dipanngil apabila nilai hero = 2 / kita memilih mage                         
                    case "2":
                        Mage newMage = new Mage(inputNamaHero);
                        newAction.mageFight(newMage, monsterValue);
                        break;
//                  Fungsi yang dipanngil apabila nilai hero = 3 / kita memilih Warrior                   
                    case "3":
                        Warrior newWarrior = new Warrior(inputNamaHero);
                        newAction.warriorFight(newWarrior, monsterValue);
                        break;
                    default:
                        System.out.println("\nMaaf pilihan Anda tidak tersedia!");
                        break;
                }
            }else if (input.equalsIgnoreCase("*")) {
                System.exit(0);
            }else if (input.equalsIgnoreCase("0")) {
                actionMenu.miniBattleInfo();
          }
            else{
                System.out.println("\nMaaf pilihan Anda tidak tersedia!");
            }
        
        }
    }

}
