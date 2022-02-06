package personalityQuiz;

import java.util.Scanner;


import java.io.*;

public class PersonalityQuizRunner 

{
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner userIn = new Scanner(System.in);
		PersonalityQuiz quiz = new PersonalityQuiz();
		PersonalityQuizUI userInput = new PersonalityQuizUI(userIn);
	
		for(int i = 0; i < 5; i++)
		{
			quiz.askQuestion(i);
			userInput.acceptvalidAnswerAndStore();
		
		}
			
		userInput.getResult();
		userInput.determinePasta();
		
	
		
//		
	}
	
	
	
	
	
}
