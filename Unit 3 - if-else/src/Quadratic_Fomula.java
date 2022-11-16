import javax.swing.JOptionPane;

public class Quadratic_Fomula
{
	public static void main(String[] args) 
	{
		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a number"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Enter another number"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Enter the last number"));
		
		double discriminant = Math.sqrt((b*b)-4*(a)*(c));
		
		if(Double.isNaN(discriminant)) 
		{
			JOptionPane.showMessageDialog(null, "No real solutions");
			return;
		}
		double top1 = ((b)*-1+discriminant);
		double root1 = top1/(a*2);
		double top2 = ((b)*-1) - discriminant;
		double root2 = top2/((a)*2);
		
		JOptionPane.showMessageDialog(null,"Coefficients"+a+" "+b+" "+c+" \n Equation: "+a+"x^2 + "+b+"x + "+c+"\n Roots: " +root1+ ", "+root2);
	}
}
