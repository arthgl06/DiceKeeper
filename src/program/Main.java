package program;

import entities.*;
import entities.Character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("How many characters will be created?");
    System.out.print("=> ");
    int n = sc.nextInt();

    SheetKeeper sheetKeeper = new SheetKeeper();
    Sheet sheet = new Sheet();

        for (int i = 0; i < n; i++) {
            System.out.println("Create the character " + (i+1) + ":");
            System.out.println();
            sc.nextLine();
            System.out.print("Name: ");
            String charName = sc.nextLine();
            System.out.print("Race: ");
            String charRace = sc.nextLine();
            System.out.print("Initial life: ");
            double charLife = sc.nextDouble();
            System.out.print("Initial money: ");
            double charMoney = sc.nextDouble();
            System.out.print("Initial mana: ");
            double charMana = sc.nextDouble();

            Item item = new Item();
            Inventory inventory = new Inventory(charMoney);
            System.out.println("Want to add items in char " + (i+1) + " inventory?");
            System.out.println("0 -> No | 1 -> Yes");
            System.out.print("=> ");
            int hasItems = sc.nextInt();
               if(hasItems == 1){
                   int adding = 1;
                   while(adding == 1){
                       System.out.println();
                       sc.nextLine();
                       System.out.print("Enter the item name: ");
                       String addedItem = sc.nextLine();
                       item = new Item(addedItem);
                       inventory.addItem(item);
                       System.out.println(addedItem + " added with success!");
                       System.out.println("Want to add more items?");
                       System.out.println("0 -> No | 1 -> Yes");
                       System.out.print("=> ");
                       adding = sc.nextInt();
                   }
               }

               Attributes attributes = new Attributes(charLife, charMana);
               Character character = new Character(charName, charRace, attributes, inventory);
               sheet.addChar(i, character);
               sheetKeeper.addSheet(i, sheet);

        }

            System.out.println(sheetKeeper);
    }
}