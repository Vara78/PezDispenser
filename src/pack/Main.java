package pack;

public class Main {
    public static void main(String[] args) {
        // Instance of the PezDispenser class
        PezDispenser dispenser = new PezDispenser("Yoda");

        // System output
        System.out.println("We are making a new PEZ Dispenser");
        System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser %n",
                PezDispenser.MAX_PEZ);
        System.out.printf("The dispenser is %s%n",
                dispenser.getCharacterName());
        if(dispenser.isEmpty()){
            System.out.println("Dispenser is empty");
        }

        System.out.println("Filling the dispenser with delicious PEZ...");
        dispenser.fill();

        if(!dispenser.isEmpty()){
            System.out.println("Dispenser is full");
        }
        while(dispenser.dispense()){
            System.out.println("Chomp!");
        }
        if(dispenser.isEmpty()){
            System.out.println("Ate all the PEZ");
        }
        dispenser.fill(4);
        dispenser.fill(2);
        while(dispenser.dispense()){
            System.out.println("Chomp!!");
        }
        try{
            dispenser.fill(400);
            System.out.println("This will never happen");
        } catch(IllegalArgumentException iae){
            System.out.println("Whoa there!");
            System.out.printf("The error was %s",
                    iae.getMessage());
        }
    }
}