package week_15;

import java.io.*;
import java.util.Scanner;

public class Solo {
	 public static void main(String[] args) throws IOException
	    {
	      
	        int id,right,wrong;   //ID #, # of Right, # Number of Wrong
	        double answerPct;     // Answer Percentage
	        int numStud = 0;      // Number of Students counter
	      
	        //open the input file
	        File myfile = new File("myinput.txt");
	      
	        //create a Scanner class object      
	        Scanner inputFile = new Scanner(myfile);
	      
	        //create a PrintWriter object and attach it to a file.
	        PrintWriter outputFile = new PrintWriter("Homework3.txt");
	      
	        //Get Student ID #, -1 Ends loop.
	        System.out.println("Please Enter Student ID:"
	                + "(enter -1 to stop)");
	        id = inputFile.nextInt();
	      
	        //Collects number of Right & Wrong Answers
	        while (id != -1)
	        {
	            System.out.println("Enter Total Number Of "
	                    + "Right Answrs:");
	            right = inputFile.nextInt();
	          
	            System.out.println("Enter Total Number Of "
	                    + "Wrong Answrs:");
	            wrong = inputFile.nextInt();
	          
	            //Calculating total # of Answered Questions
	            int totalNumberAnswered = right + wrong;
	            //Calculating total # of Omitted Questions
	            int numberOmitted = 50 - totalNumberAnswered;
	            //Calculating overall grade
	            int grade = right * 2;
	            //Calculating Right Answer Percentage
	            answerPct = (double)right / totalNumberAnswered;
	          
	            outputFile.println("id " + id);
	            outputFile.println(right + " right\t\t" + wrong + " wrong");
	            outputFile.println("total answered " + totalNumberAnswered);
	            outputFile.println("Grade is " + grade);
	          
	            if (wrong > right)
	            {
	                outputFile.println("More Wrong than right");
	            }
	            else
	            {
	                outputFile.println("More Right than Wrong");
	            }
	          
	            outputFile.printf("Correct answer pct. is %.3f\n" ,answerPct);
	          
	            if (numberOmitted >= 10)
	            {
	                outputFile.println("10 or more omitted");
	            }
	            else
	            {
	                outputFile.println("less than 10 omitted");
	            }
	          
	            System.out.println("");
	          
	            numStud++;
	            System.out.println("Please Enter Student ID:"
	                    + "(enter -1 to stop)");
	            id = inputFile.nextInt();
	          
	        }
	        outputFile.println("Total number of students: " + numStud);
	      
	        //close the Input and Output file
	        inputFile.close();
	        outputFile.close();
	    }
}
