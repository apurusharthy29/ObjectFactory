public class Pumpkin {
    //class is like a blueprint that will make things

    //instance variables
    //colour
    //size
    //is a jackolantern

    public boolean isJackOLantern;
    public String colour;
    public int size;

    public Pumpkin (int pSize, boolean pJackOLantern, String pColour) {
        colour = pColour;
        size = pSize;
        isJackOLantern = pJackOLantern;
    }


    public void printInfo(){
        System.out.println("The pumpkin is " + colour);
        System.out.println("The size is " + size + "meters tall");
        System.out.println("It is " + isJackOLantern + " that the pumpkin is a JackOLantern" );

    }


}
