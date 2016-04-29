import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
public class arrays2D
	{

		public static void main(String[] args)
			{
				
				rowsAndColumns();
				MHS();
				numbers();
				threeByThree();
			}
			
	
			public static void rowsAndColumns()
			{
				int array2D [][] = new int[3][2];
				array2D [0][0] = 10;
				array2D [0][1] = 20;
				array2D [1][0] = 30;
				array2D [1][1] = 40;
				array2D [2][0] = 50;
				array2D [2][1] = 60;
				
				for (int i=0; i<3; i++)
					{
						for(int j=0; j<2; j++)
							{
								
								System.out.print(array2D[i][j]+" ");
							}
					System.out.println();
				
					}
				System.out.println(array2D[2][1]);
				System.out.println("");
			}
			
			public static void MHS()
			{
				String index [][]= new String [4][3];
				
				for (int i=0; i<4; i++)
					{
						for(int j=0; j<3; j++)
							{
								index [i][j]= "MHS";
								System.out.print(index[i][j]+" ");
							}
					System.out.println();
					}
				System.out.println("");
			}
			
			public static void numbers()
			{
				int num [][] = new int [3][3];
				int counter =1;
				int sum = 0;
				for (int i=0; i<3; i++)
					{
						for(int j=0; j<3; j++)
							{
								num [i][j]= counter;
								counter ++;
								System.out.print(num[i][j]+" ");
							}
					System.out.println();
					}
				sum = sum + num[0][0]+ num[2][0]+num[0][2]+num[2][2];
				System.out.println(sum);
				System.out.println("");
			}
			
			public static void threeByThree()
			{
				int num [][][] = new int [3][3][3];
				int counter =1;
				int sum = 0;
				for (int i=0; i<3; i++)
					{
						for(int j=0; j<3; j++)
							{
								for(int k=0; k<3; k++)
									{
										num [i][j][k]= counter;
										counter ++;
										System.out.print(num[i][j][k]+" ");
										sum = sum + num[i][j][k];
									}
							}
					System.out.println();
					}
				System.out.println(sum);
				System.out.println("");
			}
	}
