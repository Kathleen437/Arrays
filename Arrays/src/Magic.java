import java.util.Scanner;
public class Magic
	{

		public static void main(String[] args)
		{
		numbers();
		cards();
		}
		
			
				public static void numbers()
					{
					Scanner userInput = new Scanner(System.in);
					System.out.println("Choose a number 1-8");
					int number = userInput.nextInt();
					switch (number)
					{
						case 1: 
						case 2:
						case 3:
						case 4:
							{
								System.out.println("Have a nice day.");
								break;
							}
						case 5:
						case 6:
						case 7:
						case 8:
							{
								System.out.println("Wish you were here.");
								break;
							}
					}
				}
				public static void cards()
					{

						Scanner userInput1 = new Scanner(System.in);
						System.out.println("Name a suit");
						String cards = userInput1.nextLine();
						switch (cards)
						{
						case "Spades": 
								{
									System.out.println("Don't you have a sharp mind.");
									break;
								}
						case "Diamonds":
								{
									System.out.println("You're a pretty one.");
									break;
								}
						case "Clubs":
								{
									System.out.println("Violent are we now.");
									break;
								}
						case "Hearts":
								{
								System.out.println("What a loving person you are..");
								break;
							
								}
						default: 
								{
									System.out.println("Have a nice day.");
									break;
								}
				}
				}
}

	
