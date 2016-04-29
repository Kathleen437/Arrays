import java.util.Scanner;

public class arrays
	{

		public static void main(String[] args)
			{
				namingPeople();
				listingNumbers();
				assigningOrder();
				averagingNumbers();
				squares();
				monthsToNumbers();
				cards();
			}
			
				
			public static void namingPeople()

			{
				String [] className= new String [4];
				className[0]= "Kathleen";
				className[1]= "Emma";
				className[2]= "Maggie";
				className[3]= "Taylor";
				System.out.println(className[2]);
				System.out.println();
			}
			
			public static void listingNumbers()
			{
			int [] listingNumbers= {4,3,7,1,6};
				{
					System.out.println(listingNumbers[4]);
					System.out.println();
				}
			}
			
		public static void assigningOrder()
		{
			int [] assigningOrder= {4,3,7,1,6};
			for (int i=0; i<assigningOrder.length; i++)
				{
					System.out.println(assigningOrder[i]);
				}
			System.out.println();
		}
		
		public static void averagingNumbers()
		{
		int [] averagingNumbers= {4,3,7,1,6};
		int sum = 0;
		for (int i=0; i<averagingNumbers.length; i++)
			{
				System.out.println(averagingNumbers [i]);
				sum=sum+averagingNumbers[i];
			}
		System.out.println(sum);
		System.out.println(sum/averagingNumbers.length);
		System.out.println();
		}
		
		public static void squares()
			{
				int [] squares = {2,4,6,8,10,12,14,16,18,20};
				int square = 0;
				for (int i=0; i<squares.length; i++)
					{
						System.out.println(squares[i]);
						square = squares[i];
						System.out.println(square*square);
						System.out.println();
					}
				System.out.println();	
			}
		
		public static void monthsToNumbers()
			{
				String [] months = new String [13];
					{
					months [0]= " ";
					months [1]= "January";
					months [2]= "February";
					months [3]= "March";
					months [4]= "April";
					months [5]= "May";
					months [6]= "June";
					months [7]= "July";
					months [8]= "August";
					months [9]= "September";
					months [10]= "October";
					months [11]= "November";
					months [12]= "December";
					Scanner userChoice= new Scanner(System.in);
					System.out.println("Pick a number 1-12 for the corrisponding month.");
					int pick = userChoice.nextInt();
					System.out.println(months[pick]);
					System.out.println("");
					}
			}
		
		public static void cards()
		{
			String [] cardType = new String [4];
				{
					cardType [0] = "Diamonds";
					cardType [1] = "Hearts";
					cardType [2] = "Clubs";
					cardType [3] = "Spades";
				}
				int cardTypePick = (int) (Math.random()*4);
			String [] cardNumber = new String [13];
				{
					cardNumber [0]="Ace";
					cardNumber [1]="Two";
					cardNumber [2]="Three";
					cardNumber [3]="Four";
					cardNumber [4]="Five";
					cardNumber [5]="Six";
					cardNumber [6]="Seven";
					cardNumber [7]= "Eight";
					cardNumber [8]= "Nine";
					cardNumber [9]= "Ten";
					cardNumber [10]= "Jack";
					cardNumber [11]= "Queen";
					cardNumber [12]= "King";
				}
			int cardNumberPick = (int) (Math.random()*13);
			System.out.println(cardNumber[cardNumberPick] + " of " + cardType[cardTypePick]);
			
			
		}
	}

