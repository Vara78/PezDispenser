package pack;
import java.util.Scanner;

/*
 * Author: Eric F. Vara
 * Date: 2/19/2020
 *
 * Description:
 *
 */

public class Main {
    public static void main(String[] args) {
        // declared new dispenser instance of the PezDispenser class
        PezDispenser dispenser = new PezDispenser();

        // Introduction
        System.out.println();
        System.out.println("Welcome user, we are making a new PEZ Dispenser.");
        System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser created %n", PezDispenser.MAX_PEZ);
        System.out.println(dispenser);

        // created new scanner for characterName
        Scanner input = new Scanner(System.in);
        System.out.println("what character would you like to create: ");
        dispenser.setCharacterName(input.next());
        System.out.printf("The dispenser we are creating is going to be %s%n", dispenser.getCharacterName());

        // checks if the created pez dispenser is empty. If the dispenser is empty, this statement will add pez into the dispenser
        if(dispenser.isEmpty()) {
            System.out.println("Currently, the dispenser is empty");
            System.out.println("Filling the dispenser with delicious PEZ...");
            dispenser.fill();
        } else if(!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }

        // created a while loop that will chomp through any remaining pez
        while(dispenser.dispense()) {
            if(dispenser.isEmpty()) {
                System.out.println("Ate all the PEZ");
            } else {
                System.out.println("Chomp!");
            }
        }

        dispenser.fill(4);
        dispenser.fill(2);
        while(dispenser.dispense()) {
            System.out.println("Chomp!!");
        }
        try {
            dispenser.fill(400);
            System.out.println("This will never happen");
        } catch(IllegalArgumentException iae) {
            System.out.println("Whoa there!");
            System.out.printf("The error was %s",
                    iae.getMessage());
        }
    }
}