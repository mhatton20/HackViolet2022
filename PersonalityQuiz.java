package personalityQuiz;

public class PersonalityQuiz 
{
	
	private Question [] personalityQuiz;
	
	public PersonalityQuiz()
	{ 
		personalityQuiz = new Question[6];
		personalityQuiz[0] = new Question("What is your favorite subject out of the following?\n" + 
				" 1) Computers class \n 2) Science \n 3) Geometry \n 4) History \n 5) Art \n 6) Math");
		personalityQuiz[1] = new Question("What game/gadget interests you the most?\n" + 
				" 1) Drone \n 2) Operation board game \n 3) Rubix Cube \n 4) Monopoly  \n 5) Snap Circuits \n 6) Cards");
		personalityQuiz[2] = new Question("What would your dream room look like?\n" + 
				" \n 1) A futuristic room with automatic light switches and a smart alarm clock." + 
				" \n 2) Lots of plants and natural light with a fish tank.\n" + 
				" 3) Lots of electronics with a high-tech computer" + 
				" \n 4) A high-security room with lasers and a passcode on the door" + 
				"\n 5) Programmed LED lights above your bed to flash to music.\n" + 
				" 6) Lots of whiteboard space and bookshelves organized by color.\n");
		personalityQuiz[3] = new Question("How much do you enjoy working in groups?\n" + 
				" 1) I dislike working in groups, but will do it if needed.\n" + 
				" 2) It is always fun for me.\n" + 
				" 3) All the time! I do not like working alone.\n" + 
				" 4) I am indifferent - teams are fun but I also like working alone.\n" + 
				" 5) Groups are always great to get multiple ideas.\n" + 
				" 6) I prefer to work alone.\n");
		personalityQuiz[4] = new Question("What type of school project would you like to work on?\n 1) Build a robot that can deliver school lunch to students.\n" + 
				" 2) Dissecting frogs and analyzing the anatomy.\n" + 
				" 3) Designing a new game or app.\n" + 
				" 4) Design a secretive code to access lunch menu items\n" + 
				" 5) Competition to build strongest bridge out of matches\n" + 
				" 6) Solving riddles\n");
		personalityQuiz[5] = new Question("What is your optimal workspace setting? \n 1) Big computer screens with access to data\n" + 
				" 2) Research Laboratory\n" + 
				" 3) Full of computers and large keyboards\n" + 
				" 4) Spacious meeting room with lots of whiteboard space for ideas\n" + 
				" 5) Makers space with 3D printers and circuit boards\n" + 
				" 6) A room with a supercomputer calculator \n");
		
	
	}
	
	public void askQuestion(int i)
	{
		System.out.println(personalityQuiz[i].toString());
	}
	

	
	
}
