public class Factory {

    public boolean isOpen = true; //data type is boolean
    public int yearFounded = 2026; //data type is int

    //string - holds words, punctuation, sentences
    //have to use quotes
    public String owner = "Anaya";

    public Pumpkin pumpkin1;
    public Pumpkin pumpkin2;
    public Pumpkin pumpkin3;

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

    pumpkin1 = new Pumpkin();
    System.out.println("The pumpkin is " + pumpkin1.colour);
        System.out.println("The pumpkin has a radius " + pumpkin1.size + " feet");
        System.out.println("it is " + pumpkin1.isJackOLantern + " that the pumpkin is a jackolantern");

        pumpkin2 = new Pumpkin ();
        pumpkin2.colour = "red";
        pumpkin2.size = 50;
        pumpkin2.isJackOLantern = true;
        System.out.println("The pumpkin is " + pumpkin2.colour);
        System.out.println("The pumpkin weighs " + pumpkin2.size + " kilograms");
        System.out.println("it is " + pumpkin2.isJackOLantern + " that the pumpkin is a jackolantern");

        pumpkin3 = new Pumpkin();
        pumpkin3.colour = "brown";
        pumpkin3.size = pumpkin2.size + pumpkin1.size;
        pumpkin3.isJackOLantern = false;
        System.out.println("The pumpkin is " + pumpkin3.colour);
        System.out.println("This pumpkin has a radius of " + pumpkin3.size + " feet");
        System.out.println("it is " + pumpkin3.isJackOLantern + " that the pumpkin is a jackolantern");



    }

}
