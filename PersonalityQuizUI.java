package personalityQuiz;

import java.util.Scanner;

public class PersonalityQuizUI 

{
	private Scanner userIn = new Scanner(System.in);;

	private int totalScore;
	private int averageScore;

	public PersonalityQuizUI(Scanner userInput)
	{
		userIn = userInput;
	}
	
	public void acceptvalidAnswerAndStore() 
	{
		String userInput = userIn.nextLine();
				
		while(isDouble(userInput) == false || stringToNumber(userInput) < 1 || stringToNumber(userInput) > 7)
		{
			System.out.println("Invalid input. Please enter a number 1-6 and press the return key");
			userInput = userIn.nextLine();

		}
		
		totalScore += stringToNumber(userInput);
	}
      
	
	public int getResult()
	{

		return averageScore = 1 + Math.round(totalScore / 6);
	}
	
	public void determinePasta()
	{
		if(averageScore == 1)
			System.out.println("You would enjoy artificial intelligence! You have a knack for building "
					+ "and solving human problems with computers. Check out these websites to learn "
					+ "more about AI career paths!"
					+ "\nhttps://www.create-learn.us/ai-for-kids\n" + 
					"https://kids.kiddle.co/Artificial_intelligence ");
		else if(averageScore == 2)
			System.out.println("You would be a great biologist or researcher! You have a science-oriented "
					+ "brain and love to explore anatomy. Check out some of these science career paths:"
					+ "http://www.biology4kids.com/files/studies_careers.html\n" + 
					"https://www.sciencekids.co.nz/sciencefacts/careers/biologist.html\n");
		else if(averageScore == 3)
			System.out.println("We think you would be interested in computer programming and coding! This "
					+ "career area needs logic-minded women like you and is full of opportunities to work "
					+ "in groups and problem solve. Visit these websites to learn more: "
					+ "/nhttps://www.sciencekids.co.nz/sciencefacts/engineering/computerengineering.html\n" + 
					"https://easyscienceforkids.com/computer-science-careers-for-kids-video/");
		else if(averageScore == 4)
			System.out.println("Hacker alert! You might enjoy the field of cybersecurity. Learn to hack and "
					+ "protect data for banks, governments, and more! This field is also great for women "
					+ "interested in law and rules of the internet. View these websites to explore mroe: "
					+ "\nhttps://www.wgu.edu/blog/cybersecurity-for-kids2004.html\n" + 
					"https://kids.kiddle.co › Computer_security");
		else if(averageScore == 5)
			System.out.println("You got Mechanical Engineering!  Get ready to build with inclined planes, "
					+ "screws and axels! This career area combines creativity and technicality. Learn more here: "
					+ "\nhttps://www.sciencekids.co.nz/sciencefacts/engineering/mechanicalengineering.html" + 
					"https://www.funkidslive.com/learn/techno-mum/everything-you-need-to-know-about-mechanical-engineers/");
		else if(averageScore == 6)
			System.out.println("You got mathematics! If you like numbers and enjoy solving multi-step problems, "
					+ "the field of mathematics has many areas to explore. Visit these websites to learn more! "
					+ "\nhttps://careerkids.com/products/stem-careers-in-mathematics"
					+ "\nhttps://www.dreambox.com/resources/blogs/7-dream-jobs-that-require-math\n");
		
	}
	
  	private double stringToNumber(String input)
	{
		try
		{
			return Double.parseDouble(input);
		}
		catch(NumberFormatException e)
		{
			return -1;
		}
	}
	
	private static boolean isDouble(String value)
    {
        try
        {
            Double.parseDouble(value);
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        
        return true;
    }

}
