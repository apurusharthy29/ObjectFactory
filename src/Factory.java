public class Factory {

    public boolean isOpen = true; //data type is boolean
    public int yearFounded = 2026; //data type is int

    //string - holds words, punctuation, sentences
    //have to use quotes
    public String owner = "Anaya";

    public Pumpkin pumpkin1;
    public Pumpkin pumpkin2;
    public Pumpkin pumpkin3;
    public int randomSize;

    public Squash  squash1;

    public static void main(String[] args) {
    Factory a = new Factory();

    }

    //special method: constructor
    public Factory(){
    System.out.println("welcome to Anaya's Factory");
    System.out.println("the year founded is...");
    System.out.println(yearFounded);
    System.out.println("it is " + isOpen + " that the factory is open");
    System.out.println("the owner is " + owner);

    pumpkin1 = new Pumpkin(20,true, "blue");
    System.out.println("The pumpkin is " + pumpkin1.colour);
        System.out.println("The pumpkin has a radius " + pumpkin1.size + " feet");
        System.out.println("it is " + pumpkin1.isJackOLantern + " that the pumpkin is a jackolantern");

        randomSize = (int)(Math.random() * 30); //range 0-29
        pumpkin2 = new Pumpkin (randomSize, false, "Green");
        pumpkin2.colour = "red";
        pumpkin2.isJackOLantern = true;
        System.out.println("The pumpkin is " + pumpkin2.colour);
        System.out.println("The pumpkin weighs " + pumpkin2.size + " kilograms");
        System.out.println("it is " + pumpkin2.isJackOLantern + " that the pumpkin is a jackolantern");

        pumpkin3 = new Pumpkin(80, true, "purple");
        pumpkin3.printInfo();

        squash1 = new Squash (true, "green", 1000);
        squash1.printInfo();

    }

}
