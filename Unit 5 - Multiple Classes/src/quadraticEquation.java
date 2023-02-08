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

   public quadraticEquation(double a, double b, double c)
   {
       this.a = a;
       this.b = b;
       this.c = c;
   }
   // Getters
    public double getA()
    {
         return a;
    }
    public double getB()
    {
         return b;
    }
    public double getC()
    {
         return c;
    }
    public double getDiscriminant()
    {
        return (b * b) - (4 * a * c);
    }
    public double setA(double a)
    {
        return this.a = a;
    }
    public double setB(double b)
    {
        return this.b = b;
    }
    public double setC(double c)
    {
        return this.c = c;
    }
    public double getRoot1()
    {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRoot2()
    {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
