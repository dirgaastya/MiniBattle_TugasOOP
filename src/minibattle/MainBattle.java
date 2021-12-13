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
    String heroValue = null;
    String monsterValue = null;
    
      while(true){
            System.out.println("Welcome to the MiniBattle Program");
            System.out.println("===================================");
            System.out.println("1. Atur Nama Hero");
            System.out.println("2. Pilih Class Hero");
            System.out.println("2. Tentukan Monster");
            System.out.println("3. Mulai Bertarung");
            System.out.println("*. Akhiri Program");
            System.out.println("===================================");
            System.out.print("Pilih\t\t: ");
            input = newObj.nextLine();
            
            if(input.equalsIgnoreCase("1")){
                System.out.print("Masukan Nama Hero Anda : ");
                inputNamaHero = newObj.nextLine();
                System.out.println("Hallo " + inputNamaHero + " Selamat Datang!");
            }else if (input.equalsIgnoreCase("2")){
                String option = actionMenu.getHero(inputNamaHero);
                newAction.selectHero(option, inputNamaHero);
                heroValue = option;
            } else if (input.equalsIgnoreCase("3")){
                String option = actionMenu.getMonster();
                newAction.selectMonster(option);
                 
                 monsterValue = option;
            } else if (input.equalsIgnoreCase("4")){
                String option=heroValue;
                switch(option){
                    case "1":
                        newAction.basicFight(inputNamaHero,monsterValue);
                        break;
                    case "2":
                        newAction.mageFight(inputNamaHero, monsterValue);
                        break;
                    case "3":
                        newAction.warriorFight(inputNamaHero, monsterValue);
                        break;
                    default:
                        System.out.println("\nMaaf pilihan adan tidak tersedia!");
                        break;
                }
                
                 }
                
      }
        
    

    }

}
