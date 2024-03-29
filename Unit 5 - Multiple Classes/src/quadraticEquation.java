/**
 * This program will calculate all real solutions to the quadratic equation
 * @author  Spy_Gaming_TF2
 * @version 2/08/2023
 */
public class quadraticEquation 
{
   private double a;
   private double b;
   private double c;
   private double discriminant;

   public quadraticEquation(double a, double b, double c)
   {
       this.a = a;
       this.b = b;
       this.c = c;
       discriminant = Math.pow(b, 2) - (4 * a * c);
   }
   // Getters
    public double getA()
    {
         return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }
    public void setB(double b)
    {
        this.b = b;
    }
    public void setC(double c)
    {
        this.c = c;
    }
    public double setDiscriminant(double discriminant) 
    {
    	return this.discriminant = discriminant;
    }
    //hasSolution method
    public boolean hasSolution()
    {
        return (getDiscriminant() < 0);
    }
    public double getDiscriminant()
    {
        return discriminant;
    }
    public double getRoot1()
    {
        return (-b + Math.sqrt(setDiscriminant(a))) / (2 * a);
    }
    public double getRoot2()
    {
        return (-b - Math.sqrt(setDiscriminant(a))) / (2 * a);
    }
    public String getEquation()
    {
        if(a == 1)
        {
            return "x^2 + " + b + "x + " + c;
        }
        else
        {
            return a + "x^2 + " + b + "x + " + c;
        }
    }
}