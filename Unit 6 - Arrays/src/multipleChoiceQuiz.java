/**
 * Program that contains parallel arrays that represent a multiple choice quiz on a topic.
 * The program stores questions and at least 3 possible answers for each question, and the answer key.
 * The program should ask the user a question and then display the 3 possible answers.
 * If they answer correctly, print out "Correct". If they are incorrect, print out "Incorrect. The right answer is: ".
 * Display the number of correct & incorrect answers at the end along with the percent correct.
 * @author Spy-Gaming-TF2
 * 4/25/2023
 */
import java.util.Random;
import java.util.Scanner;
public class multipleChoiceQuiz
{
    public static void main(String[] args)
    {
        //parallel arrays for the question and answers
        String[] questions = {"What year was the Declaration of Independence signed?", "Who was the 40th President of the US?",
                "What year was the \"Iron Curtain\" torn down?", "When was the PATRIOT Act passed?", "What is the youngest country?"};
        String[] aAns = {"1776", "Barack Obama", "1921", "February 2002", "Russian Federation"};
        String[] bAns = {"1863", "Richard Nixon", "1958", "October 2001", "United States"};
        String[] cAns = {"1791", "Ronald Regan", "1991", "June 2010", "Germany"};
        String[] dAns = {"1945", "George W. Bush", "1989", "November 2016", "South Sudan"};
        //answer key
        String[] ansKey = {"a", "c", "d", "b", "d"};
        boolean quizRun = true;
        Scanner scan = new Scanner(System.in);
        int correct = 0;
        int incorrect = 0;
        while(quizRun)
        {
            //randomly picks a question
            Random rand = new Random();
            int random = rand.nextInt(questions.length);
            System.out.println(questions[random]+"\nA: "+aAns[random]+"\nB: "+bAns[random]+"\nC: "+cAns[random]+"\nD: "+dAns[random]);
            System.out.print("Enter your answer: ");
            String ans = scan.nextLine();
            //checks if the answer is correct
            if(ans.equalsIgnoreCase(ansKey[random]))
            {
                System.out.println("Correct!");
                correct++;
            }
            else
            {
                System.out.println("Incorrect. The right answer is: "+ansKey[random]);
                incorrect++;
            }
            //end the quiz when all elements of the question array has been used
            if(correct+incorrect == questions.length)
            {
                System.out.println("You got "+correct+" correct and "+incorrect+" incorrect.");
                System.out.println("You got "+(correct*100/questions.length)+"% correct.");
                System.out.println("Thanks for playing!");
                quizRun = false;
            }
        }
        scan.close();
    }
}