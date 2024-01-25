package mat335Labs.Lab5;


public class Aquarium {
    private int numberFish;

    public Aquarium(int numberFish) {
    	this.numberFish = numberFish;
    }

    public void addFish() {
    	setNumberFish(++this.numberFish);
        System.out.println("A fish added to the aquarium.");
    }

    public boolean removeFish(int number) {
        if (number <= this.numberFish) {
            setNumberFish(this.numberFish-number);
            System.out.println(number+" fish was removed from the aquarium.");
            return true;
        } else {
        	System.out.println("Removing process was denied.");
            return false;
        }
    }
    
    public boolean removeFish() {
        if (1 <= this.numberFish) {
            setNumberFish(--this.numberFish);
            System.out.println("1 fish was removed from the aquarium.");
            return true;
        } else {
        	System.out.println("Removing process was denied.");
            return false;
        }
    }

    
    public void setNumberFish(int numberFish) {
    	this.numberFish = numberFish;
    }
    
    public int getNumberFish() {
    	return numberFish;
    }
}
