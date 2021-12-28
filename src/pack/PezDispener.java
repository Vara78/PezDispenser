package pack;

// PezDispenser class with some functions fill(), dispense(), isEmpty(),
class PezDispenser {

    // declared data fields
    String characterName;
    public static final int MAX_PEZ = 12;
    public static final int MIN_PEZ = 0;
    private int pezCount;

    // toString description
    public String toString() {
        return "Pez is the brand name of an Austrian candy and associated manual candy dispensers.\n" +
                "The candy is a pressed, dry, straight-edged, curved-corner block 15mm long, 8mm\n" +
                "wide and 5mm high, with each Pez dispenser holding 12 candy pieces.";
    }

    // PezDispenser constructor
    public PezDispenser() {
        pezCount = 0;
    }

    // fill() method that fills PezDispensers
    public void fill() {
        fill(MAX_PEZ);
    }

    // fill() method that takes in a parameter with specified pez amount to fill PezDispensers
    public void fill(int pezAmount) {
        int newAmount = pezCount + pezAmount;
        if(newAmount > MAX_PEZ){
            throw new IllegalArgumentException("Too many PEZ!!!");
        }
        pezCount = newAmount;
    }

    // dispense() method that removes all remaining pez
    public boolean dispense() {
        boolean wasDispensed = false;
        if(!isEmpty()){
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    // isEmpty() method that checks for an empty pez dispenser
    public boolean isEmpty() {
        return pezCount == MIN_PEZ;
    }

    // setter method
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    // getter method
    public String getCharacterName() {
        return characterName;
    }
}