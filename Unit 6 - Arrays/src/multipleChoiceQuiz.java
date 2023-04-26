/**
 * Program that contains parallel arrays that represent a multiple choice quiz on a topic.
 * The program stores questions and at least 3 possible answers for each question, and the answer key.
 * The program should ask the user a question and then display the 3 possible answers.
 * If they answer correctly, print out "Correct". If they are incorrect, print out "Incorrect. The right answer is: ".
 * Display the number of correct & incorrect answers at the end along with the percent correct.
 * @author Spy-Gaming-TF2
 * 4/25/2023
 */
import java.util.Scanner;
public class multipleChoiceQuiz
{
    public static void main(String[] args)
    {
        //parallel arrays for the question and answers
        String[] questions = {"What year was the Declaration of Independence signed?", "Who was the 40th President of the US?",
                "What year did the \"Iron Curtain\" start to fall?", "When was the PATRIOT Act passed?", "What is the youngest country?"};
        String[] aAns = {"1776", "Barack Obama", "1921", "February 2002", "Russian Federation"};
        String[] bAns = {"1863", "Richard Nixon", "1958", "October 2001", "United States"};
        String[] cAns = {"1791", "Ronald Regan", "1991", "June 2010", "Germany"};
        String[] dAns = {"1945", "George W. Bush", "1989", "November 2016", "South Sudan"};
        //answer key
        String[] ansKey = {"a", "c", "d", "b", "d"};
        Scanner scan = new Scanner(System.in);
        int correct = 0;
        int incorrect = 0;
        //for loop to print out the questions and answers
        for(int i=0; i<questions.length; i++)
        {
            System.out.println(questions[i]);
            System.out.println("A. " + aAns[i]);
            System.out.println("B. " + bAns[i]);
            System.out.println("C. " + cAns[i]);
            System.out.println("D. " + dAns[i]);
            System.out.print("Answer: ");
            String answer = scan.nextLine();
            //if statement to check if the answer is correct
            if(answer.equalsIgnoreCase(ansKey[i]))
            {
                System.out.println("Correct");
                correct++;
            }
            else
            {
                System.out.println("Incorrect. The right answer is: " + ansKey[i]);
                incorrect++;
            }
        }
        double percent = (double)correct / (correct + incorrect) * 100;
        System.out.println("You got " + correct + " correct and " + incorrect + " incorrect. That's " + percent + "% correct.");
        scan.close();
    }
}