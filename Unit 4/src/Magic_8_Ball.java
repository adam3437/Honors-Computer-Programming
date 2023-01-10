import javax.swing.JOptionPane;
/*
    Magic 8 Ball
    needs little explination
 */
public class Magic_8_Ball 
{
    public static void main(String[] args)
    {
        boolean keepAsking = true;
        while (keepAsking)
        {
            // random number generator
            int random = (int)(Math.random() * 5);
            String question = JOptionPane.showInputDialog("Ask a question");
            if (question == null){keepAsking = false;}
            //response chosen based on random number that was generated earlier
            else if (random == 0){JOptionPane.showMessageDialog(null, "It is certain");}
            else if (random == 1){JOptionPane.showMessageDialog(null, "It is decidedly so");}
            else if (random == 2){JOptionPane.showMessageDialog(null, "Without a doubt");}
            else if (random == 3){JOptionPane.showMessageDialog(null, "Yes definitely");}
            else if (random == 4){JOptionPane.showMessageDialog(null, "Outlook not so good");}
            else if (random == 5){JOptionPane.showMessageDialog(null, "My sources say no");}
            else if (random == 6) {JOptionPane.showMessageDialog(null, "Don't count on it");}
            // ask if they want to continue
            int cont = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
            if(cont == 1) {keepAsking = false;}
        }
    }    
}