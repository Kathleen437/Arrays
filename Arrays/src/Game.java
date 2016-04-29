import java.util.Scanner;

public class Game
	{
		static String board [][] = new String[3][3];
		static int row;
		static int col;
		static boolean gameContinues=true;
		
		
		public static void main(String[] args)
			{	

				fillWithSpaces();
				displayBoard();
				while (gameContinues)
					{
				gameContinues();
				playerMoves();
				displayBoard();
				
				computerMoves();
				displayBoard();
				gameContinues();
					}
				
			}
		
			public static void displayBoard()
			{
			
				System.out.println(" |  1  |   2  |   3  |   ");
				System.out.println(" ---------------------");
				System.out.println(" |     |      |      |");
				System.out.println("A|  " +board [0][0]+ "  |   "+board [0][1]+ "  |  "+board [0][2]+ "   | ");
				System.out.println(" |     |      |      |");
				System.out.println(" ---------------------");
				System.out.println(" |     |      |      |");
				System.out.println("B|  " +board [1][0]+ "  |   "+board [1][1]+ "  |  "+board [1][2]+ "   | ");
				System.out.println(" |     |      |      |");
				System.out.println(" ---------------------");
				System.out.println(" |     |      |      |");
				System.out.println("C|  " +board [2][0]+ "  |   "+board [2][1]+ "  |  "+board [2][2]+ "   | ");
				System.out.println(" |     |      |      |");
				System.out.println(" ---------------------");
				
			}
			public static void fillWithSpaces()
				{
					

				for (int i=0; i<3; i++)
					{
						for(int j=0; j<3; j++)
							{
								board [i][j]= " ";
							
							}
					}
				}
			
			public static void playerMoves()
			{
				Scanner playerMoves = new Scanner(System.in);
				System.out.println("Please input your move.");
				String move = playerMoves.nextLine();
				switch (move.substring(0,1))
				{
					case "A":
					case "a":
							{
								row=0;
								break;
							}
					case "B":
					case "b":
							{
								row=1;
								break;
							}
					case "C":
					case "c":
							{
								row=2;
								break;
							}
				}
			col=Integer.parseInt(move.substring(1))-1;
			if (board [row][col] != " ")
				{
					playerMoves();
				}
			board [row][col] = "X";
			}
			
			public static void computerMoves()
			{
				
				row= (int) (Math.random()*3);
				col= (int) (Math.random()*3);
				System.out.println("("+row+", "+col+")");
				
				if (board [row][col] != " ")
					{
						computerMoves();
					}
				board [row][col] = "O";
			}
			public static void gameContinues()
			{
				if ((board[0][0].equals(board[0][1])&&board[0][1].equals(board[0][2])&&!board[0][0].equals(" "))||
					(board[1][0].equals(board[1][1])&&board[1][1].equals(board[1][2])&&!board[1][0].equals(" "))||
					(board[2][0].equals(board[2][1])&&board[2][1].equals(board[2][2])&&!board[2][0].equals(" "))||
					(board[2][0].equals(board[1][1])&&board[1][1].equals(board[0][2])&&!board[2][0].equals(" "))||
					(board[0][0].equals(board[1][1])&&board[1][1].equals(board[2][0])&&!board[0][0].equals(" "))||
					(board[0][0].equals(board[1][0])&&board[1][0].equals(board[2][0])&&!board[0][0].equals(" "))||
					(board[0][1].equals(board[1][1])&&board[1][1].equals(board[2][1])&&!board[0][1].equals(" "))||
					(board[0][2].equals(board[1][2])&&board[1][2].equals(board[2][2])&&!board[0][2].equals(" ")))
								{
									System.out.println("Game Over");
									System.exit(0);
								}
			}
			
			
	}
