import java.util.Scanner;

import characters.Bojovnik;
import characters.Character;
import characters.Troll;
import characters.Trpaslik;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vítejte ve hre");
        System.out.println("Vyberte: \n1. Načíst postavu ze souboru \n2. Vytvoř postavu");
        int odpoved = sc.nextInt();
        switch (odpoved) {
            case 1:
                //import character
                break;
            case 2:
                //create character
                sc.nextLine();
                System.out.println("Vyber Třídu,\n 1. Bojovnik\n 2. Průzkumník\n 3. Mág");
                int trida = sc.nextInt();
                System.out.println("Zadej Jméno");
                String jmeno = sc.next();
                System.out.println("Zadej hodnotu síly");
                int sila = sc.nextInt();
                System.out.println("Zadej hodnotu inteligence");
                int inteligence = sc.nextInt();
                System.out.println("Zadej hodnotu obratnosti");
                int obratnost = sc.nextInt();
                System.out.println("Zadej hodnotu odolnosti");
                int odolnost = sc.nextInt();
                sc.close();
                Character hrac =  Character.vytvorPostavu(trida,jmeno,sila,inteligence,obratnost,odolnost);


                System.out.println(hrac);
                try {
                    FileSystem.save(hrac);
                } catch (Exception e){
                    System.out.println(e);
                }
                break;
        }
    }
}