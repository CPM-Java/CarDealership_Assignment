
/**
 * This driver is supplied as part of the CarDealership Project
 * 
 * DO NOT MODIFY THIS CLASS
 * 
 * @author gk
 * @version 9/20/16
 */
public class UsedCarSalesman
{
    //Cars for sale are all null until fully instantiated in the constructor
    private Car myCar1, myCar2, myCar3;

    /**
     * Constructor for objects of class UsedCarSalesman
     */
    public UsedCarSalesman()
    {
        // initialize instance variables
        myCar1 = new Car("Toyota", "Sienna", 1999, 225000);
        myCar2 = new Car("Toyota", "Rav 4", 2004, 115000);
        myCar3 = new Car("Porsche", "Boxter S", 2002, 70000);
    }


    public void sneakyMethod()
    {
        System.out.println("That old " + myCar1.getModel() + " is worth $" + myCar1.getPrice() + 
                           " but if I subract 100,000 miles from the odometer..." );
        myCar1.rollBackMiles(100000);
        System.out.println("Now I can get $" + myCar1.getPrice() + " for it. Heh heh heh.");
        
        System.out.println("That little " + myCar2.getModel() + " is worth $" + myCar2.getPrice() + 
                           " but if I subtract 50,000 miles from the odometer..." );
        myCar2.rollBackMiles(50000);
        System.out.println("Now I can get $" + myCar2.getPrice() + " for it. Heh heh heh.");
        
        System.out.println("That sporty little " + myCar3.getYear() + " " + myCar3.getModel() + " is worth $" + myCar3.getPrice() + 
                           " but if I call it a 2006 model instead ..." );
        myCar3.setYear(2006);
        System.out.println("Now I can get $" + myCar3.getPrice() + " for it. Heh heh heh.");
    }
    
    public void showRoomFloor(){
        System.out.println(
        "\n\nThis one previous owner " + myCar1 + " can be yours for only $" + myCar1.getPrice() + "\n\n" +
        "Easy highway miles only on this " + myCar2 + ".\nTake it home TODAY for just $" + myCar2.getPrice() + "\n\n" +
        "Look at this little gem. A " + myCar3 + ".\nToo many options to list! Only $" + myCar3.getPrice() + "!!\n\n");
    }
}
