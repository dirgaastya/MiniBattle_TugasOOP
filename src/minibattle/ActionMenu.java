/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ActionMenu {
    Scanner newObj = new Scanner(System.in);
    
   
    public int getMenu(){
        int input;
        System.out.println("Welcome to the MiniBattle Program");
        System.out.println("===================================");
        System.out.println("1. Atur Nama Hero");
        System.out.println("2. Pilih Class Hero");
        System.out.println("2. Tentukan Nama Monster Lawan");
        System.out.println("3. Mulai Bertarung");
        System.out.println("4. Akhiri Program");
        System.out.println("===================================");
        System.out.print("Pilih\t\t: ");
        input = newObj.nextInt();
        return input;
       
    }
    
    public String getHero(String nama){
        String input;
        System.out.println("\nSelamat Datang " + nama + " Silahkan Pilih Job Anda");
        System.out.println("===================================");
        System.out.println("1. Basic Hero");
        System.out.println("2. Mage");
        System.out.println("3. Warrior");
        System.out.println("===================================");    
        System.out.print("Pilih Class Hero\t: ");
        input = newObj.nextLine();
        return input;
    }
    
    
    public void getMonster(String nama){
        System.out.println("\n===================================");
        System.out.println("Anda akan Melawan Monster " + nama);
        System.out.println("===================================");
    }
    
    public int getFightMenu(){
        int input;
        System.out.println("Pilih Tindakan ");
        System.out.println("===================================");
        System.out.println("1. Serang");
        System.out.println("2. Skill");
        System.out.println("===================================");
        System.out.print("Pilih\t\t: ");
        input = newObj.nextInt();
        return input;
    }
    
    public String inputName(){
        
        return input;
    }
        
}
    

