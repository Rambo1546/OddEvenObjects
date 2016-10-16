import java.util.Scanner;
import java.util.Random;

public class DisplaysOddEven 
{
	
	public void DisplaysOddEven()
	{
		

	
				
						//Declaring the variables.
					    int Answer = 0; 
				        int UserGuess = 1; 
				        int GameCount = 1;
				        int Count = 0;

				        
				        Answer = 1 + (int) ( Math.random() * 10 );  //Makes a random number between 1 and 10.

				        Scanner input = new Scanner(System.in); 

				        System.out.println ("I am going to chose a number between 1 and 10. Guess if it is odd or even. "); 
				        System.out.printf ("You will be playing %d rounds.", GameCount); 
				 
				        do {
				            
				            System.out.println ("Guess odd or even. Type 1 for even and 2 for odd. "); 
				            UserGuess = input.nextInt(); 

				            if ( UserGuess == 1 && Answer == 2 || Answer == 4 || Answer == 6 || Answer == 8 || Answer == 10  ) 
				            {  
				                System.out.println ("Congrats you were right."); 
				                break;
				            } 
				            else if ( UserGuess == 2 && Answer == 1 || Answer == 3 || Answer == 5 || Answer == 7 || Answer == 9  )
				            {
				            	System.out.println ("Congrats you were right. "); 
				            	break;
				            }
				            
				            else 
				            {  
				                System.out.println ("Wrong, you lose."); 
				            
				            System.out.printf ("The correct answer was %d.\n", UserGuess, Answer); 
				            }

				            Count++;  
				        }
				        while (Count < 1); {
				        }

				    }

			}  

	