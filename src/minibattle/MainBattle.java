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
            System.out.println("0. Tentang MiniBattle");
            System.out.println("1. Masukan Nama Hero");
            System.out.println("2. Tentukan Job Class Hero");
            System.out.println("3. Tentukan Monster Monster Lawan");
            System.out.println("4. Mulai Bertarung");
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
                String option = actionMenu.getHero(inputNamaHero);
                newAction.selectHero(option, inputNamaHero);
                heroValue = option;
                actionMenu.backToMenu();
            } 
//          Menentukan Lawan
            else if (input.equalsIgnoreCase("3")){
                String option = actionMenu.getMonster();
                newAction.selectMonster(option);
                monsterValue = option;
                actionMenu.backToMenu();
            }
//          Bertarung
            else if (input.equalsIgnoreCase("4")){
                String option=heroValue;
                switch(option){
//                  Fungsi yang dipanngil apabila nilai hero = 1 / kita memilih basic hero 
                    case "1":
                        newAction.basicFight(inputNamaHero,monsterValue);
                        break;
//                  Fungsi yang dipanngil apabila nilai hero = 2 / kita memilih mage                         
                    case "2":
                        newAction.mageFight(inputNamaHero, monsterValue);
                        break;
//                  Fungsi yang dipanngil apabila nilai hero = 3 / kita memilih Warrior                   
                    case "3":
                        newAction.warriorFight(inputNamaHero, monsterValue);
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
