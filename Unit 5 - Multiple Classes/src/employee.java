/**
 * Blueprint for an employee
 * @author Spy_Gaming_TF2
 * 2/07/2023
 */
public class employee
{
	private String name;
	private double salary;
	
	public employee(String theName, double theSalary)
	{
		name = theName;
		salary = theSalary;
	}
	public String getName() 
	{
		return name;
	}
	public double getSalary() 
	{
		return salary;
	}
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
	public String toString()
	{
		return "Employee: " + name + "\n" + "Salary: $s" + salary;
	} 
}
