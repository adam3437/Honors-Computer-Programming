/**
 * Program to determine the volume and surface area of a soda can using height and radius
 * @author Spy_Gaming_TF2
 * 3/06/23
 */
public class sodaCan
{
    private final double height;
    private final double radius;

    public sodaCan(double height, double radius)
    {
        this.height = height;
        this.radius = radius;
    }

    //calculate volume
    public double getVolume()
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    //calculate surface area
    public double getSurfaceArea()
    {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

    //toString method
    public String toString()
    {
        return "Surface Area: " + getSurfaceArea() + "\nVolume: " + getVolume();
    }
}