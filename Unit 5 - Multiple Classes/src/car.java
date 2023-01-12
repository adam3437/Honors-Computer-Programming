/**
 * 
 * @author Spy_Gaming_TF2
 * 1/12/2022
 * Class is blueprint template for creating car objects
 * Mostly a demonstration of OOP (Object Oriented Programming) rather than a practical program
 * Car Features: Year, make, mileage, mpg, tankLevel (Instance Variables)
 * Car Functionality: drive fillUp (Method)
 */
public class car
{
	//declare instance variables (attributes or features of car object)
	private int year;
	private String make;
	private double mileage;
	private double mpg;
	//create a constructor to initialize instance variables
	public car(int theYear, String theMake, double theMileage, double theMpg) 
	{
		year = theYear;
		make = theMake;
		mileage = theMileage;
		mpg = theMpg;
		
	}
	//define methods to get info about the object
	public int getYear() 
	{
		return year;
	}
	public String getMake() 
	{
		return make;
	}
	public double getMileage() 
	{
		return mileage;
	}
	public double getMpg() 
	{
		return mpg;
	}
	
	public void drive(double miles) 
	{
		mileage = mileage + miles;
	}
	
	
	
}
