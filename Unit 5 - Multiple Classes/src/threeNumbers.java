/**
 * Program that reads 3 numbers from "Numbers.dat" using fileReader and Scanner classes that prints in order from smallest to largest
 * @author S26600283 (Adam Chavez)
 * 2/17/23
 */
public class threeNumbers
{
	private double num1;
	private double num2;
	private double num3;

	public threeNumbers(double x, double y, double z) 
	{
		x = num1;
		y = num2;
		z = num3;
	}
	public double getSmallest() 
	{
		if (num1 < num2 && num1 < num3)
        {
            return num1;
        }
        else if (num2 < num1 && num2 < num3)
        {
            return num2;
        }
        else
        {
            return num3;
        }
	}
	public double getMid() 
	{
		return num1+num2+num3 - getLargest() - getSmallest();
	}
	public double getLargest() 
	{
		if (num1 > num2 && num1 > num3)
        {
            return num1;
        }
        else if (num2 > num1 && num2 > num3)
        {
            return num2;
        }
        else
        {
            return num3;
        }
	}
}