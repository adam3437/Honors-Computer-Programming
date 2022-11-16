import javax.swing.JOptionPane;

public class GradeCalc
{
	public static void main(String[] args)
	{
		String letterGrade = " ";
		double percent = Double.parseDouble(JOptionPane.showInputDialog("What is your grade %?"));
		if(percent > 100)
			letterGrade = "You know bribery is a crime...";
		if(percent >= 89.5)
			letterGrade= "A";
			if(percent >=97)
				letterGrade += "+";
			if(percent >=91)
			letterGrade += "-";
			if(percent >= 90)
			letterGrade +=  "-";
		else if(percent >=87)
			letterGrade = "B+";
		else if(percent >=81)
			letterGrade = "B";
		else if(percent >= 80)
			letterGrade =  "B-";
		else if(percent >=77)
			letterGrade = "C+";
		else if(percent >=71)
			letterGrade = "C";
		else if(percent >= 70)
			letterGrade =  "C-";
		else if(percent >=67)
			letterGrade = "D+";
		else if(percent >=66)
			letterGrade = "D";
		else if(percent >= 65.5)
			letterGrade =  "D-";
		else if(percent <= 65)
			letterGrade = "Dumbass";
		
		JOptionPane.showMessageDialog(null, letterGrade);		
	}
}