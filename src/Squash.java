public class Squash {

    public boolean isRotten;
    public String Colour;
    public int mass;

    public Squash(boolean pRotten, String pColour, int pMass) {
        isRotten = pRotten;
        Colour = pColour;
        mass = pMass;
    }

    public void printInfo() {
        System.out.println("The squash is " + Colour);
        System.out.println("The squash has a mass of " + mass + " Kg");
        System.out.println("It is " + isRotten + " that the squash is rotten and slimy");

    }
}
