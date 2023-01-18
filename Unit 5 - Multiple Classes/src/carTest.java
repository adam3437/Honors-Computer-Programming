public class carTest
{
	public static void main(String[] args) 
	{
		car myHonda = new car(2007, "Honda", 152000.0, 22.0);
		
		System.out.println(myHonda.getMake() + "\t" + myHonda.getMileage() +"\n");
		myHonda.drive(71);
		System.out.println(myHonda.getMake() + "\t" + myHonda.getMileage());
		
		car GTO = new car(1969, "Pontiac", 500000.0, 15.0);
		System.out.println(GTO.getMake() + "\t" + GTO.getMileage());
		GTO.drive(96);
		System.out.println(GTO.getMake() + "\t" + GTO.getMileage());
	}
}
