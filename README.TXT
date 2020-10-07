Constructor for objects of type Car
public Car(String inputMake,
           String inputModel,
           int inputYear,
           int inputMiles)
Parameters:
inputMake - a String representing the car's company
inputModel - a String representing the car's make
inputYear - an integer representing the car's manufacture date
inputMiles - an integer representing the car's milage


public String getMake()
An accessor method to return the car's manufacturer
Returns:
the car's make as a String


public int getMileage()
An accessor method to return the car's mileage
Returns:
the car's mileage as an integer


public String getModel()
An accessor method to return the car's model
Returns:
the car's model as a String


public int getPrice()
An accessor method to calculate and return the car's price
Returns:
the car's price as an integer


public int getYear()
An accessor method to return the car's year of manufacture
Returns:
the car's year as an integer


public void rollBackMiles(int r)
An Mutator method to change the car's mileage
Parameters:
r - the number of miles deducted as an integer


public void setYear(int y)
An Mutator method to change the car's year of manufacture
Parameters:
r - the number of years deducted as an integer


public String toString()
Returns:
a String showing year, make and model