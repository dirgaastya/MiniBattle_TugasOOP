/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Action extends ActionMenu{
   
    private  String inputName;
    
    public void selectHero(String input,String name){
        if(input.equalsIgnoreCase("1")){
            Hero newHero = new Hero(name);
            System.out.println("Anda Memilih Job Basic Hero");
        }else if (input.equalsIgnoreCase("2")){
            Mage newMage = new Mage(name);
            System.out.println("Anda Memilih Job Mage Hero");   
        } else if (input.equalsIgnoreCase("3")){
            Warrior newWarrior = new Warrior(name);
            System.out.println("Anda Memilih Job Warior Hero");  
        }
    }
    
    
    
//        
//    public void play(){
//        System.out.print("Masukan Nama Hero\t: ");
//        String namaHero = newObj.nextLine();
//        System.out.print("Masukan Nama Monster\t: ");
//        String namaMonster = newObj.nextLine();
//        Monster newMonster = new Monster(namaMonster);       
//        boolean status = false;
//        
//        int heroClass = getHero(namaHero);
//        switch (heroClass) {
//            case 1:
//                Hero newHero = new Hero(namaHero);
//                newHero.showAttribut();
//                getMonster(namaMonster);
//                int fight = getFightMenu();
//                
//                while (status != true) {                    
//                    switch (fight) {
//                        case 1:
//                            newHero.attack(newMonster);
//                            newHero.defend(newMonster, "basic");
//                            if (newHero.getHp()==0) {
//                                status=true;
//                                break;
//                            }
//                            break;
//                        case 2:
//                            System.out.println("Job ini belu mempelajari Skill apapun");
//                            break;
//                        default:
//                            System.out.println("Maaf Pilihan Anda kurang tepat");
//                            break;
//                    }
//                    
//                     if (newMonster.getHp()== 0 ) {
//                        status = true;
//                        break;
//                    }
//                     getFightMenu();
//                }
//                    
//                break;
//
//            case 2:
//                Mage newMage = new Mage(namaHero);
//                newMage.showAttribut();
//                getMonster(namaMonster);
//                int fightMage = getFightMenu();
//                while (status != true) {                    
//                    switch (fightMage) {
//                        case 1:
//                            newMage.attack(newMonster);
//                            newMage.defend(newMonster, "basic");
//                            if (newMage.getHp()==0) {
//                                status = true;
//                                break;
//                            }
//                            break;     
//                        case 2:
//                            newMage.magicSkill(newMonster);
//                            newMage.defend(newMonster, "skill");
//                            if (newMage.getHp()==0) {
//                                status = true;
//                                break;
//                            }
//                            break;
//                        default:
//                            System.out.println("Maaf Pilihan Anda kurang tepat");
//                            break;
//                    }
//                    
//                     if (newMonster.getHp()== 0 ) {
//                        status = true;
//                        break;
//                    }
//                     fightMage=getFightMenu();
//                }
//                    
//                break;
//            case 3:               
//                Warrior newWarrior = new Warrior(namaHero);
//                newWarrior.showAttribut();
//                getMonster(namaMonster);
//                int fightWarrior = getFightMenu();
//                while (status != true) {                    
//                    switch (fightWarrior) {
//                        case 1:
//                            newWarrior.attack(newMonster);
//                            newWarrior.defend(newMonster, "basic");
//                            if (newWarrior.getHp()==0) {
//                                status = true;
//                                break;
//                            }
//                            break;     
//                        case 2:
//                            newWarrior.swordSkill(newMonster);
//                            newWarrior.defend(newMonster, "skill");
//                            if (newWarrior.getHp()==0) {
//                                status = true;
//                                break;
//                            }
//                            break;
//                        default:
//                            System.out.println("Maaf Pilihan Anda tidak tersedia");
//                            break;
//                    }
//                    
//                     if (newMonster.getHp()!= 0) {
//                        fightWarrior=getFightMenu();
//                        
//                    }else{
//                        status = true;
//                        break;
//                     }
//                     
//                }
//                break;
//            default:
//                break;   
//        }
//        System.out.println("Program Telah Selesai ");   
//    }

    

   
    
    
    
    
}
