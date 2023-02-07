/**
 * This program tests the employee class
 * @author Spy_Gaming_TF2
 * 2/07/2023
 */
public class employeeTest
{
	public static void main(String[] args)
	{
		employee e1 = new employee("John Marson", 100000);
		employee e2 = new employee("Van Der Linde", 1000000);
        e2.raiseSalary(10);
		System.out.println(e1.toString() + "\n");
		System.out.println(e2.toString());
        
	}
}