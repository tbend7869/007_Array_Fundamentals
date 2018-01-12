
package array_fun;

public class Matrix {

	private int[][] ticTacToe = { 
			{ 00, 01, 02 }, // row col 00, 01, 02
			{ 10, 11, 12 }, // row col 10, 11, 12
			{ 20, 21, 22 }  // row col 20, 21, 22
	};
	
	private int[][] game = { 
			{ 0, 0, 0 }, // row col 00, 01, 02
			{ 0, 1, 0 }, // row col 10, 11, 12
			{ 0, 0, 0 }  // row col 20, 21, 22
	};
	
	private char[][] realGame = { 
			{ '-', '-', '-' }, 
			{ '-', '-', '-' }, 
			{ '-', '-', '-' }  
	};
	
	//example
	String[][] checkers = new String[8][8];
	
	

	public void test2D() {
		
		//example
		checkers[0][0]="red";
		checkers[0][7]="red king";
		checkers[3][4]=" ";
		checkers[7][0]="black";
		checkers[7][7]="black king";

		System.out.println("\nTest of 2D array\n");
		
		for (int row = 0; row < ticTacToe.length; row++) {
			for (int col = 0; col < ticTacToe[0].length; col++) {
				System.out.println("test ticTacToe["
						+ row + "]["
						+ col + "] = " 
						+ ticTacToe[row][col]);
			}
			System.out.println();
		}
		
		System.out.println("\nPrint as 3 x 3\n");
		
		for (int row = 0; row < ticTacToe.length; row++) {
			for (int col = 0; col < ticTacToe[0].length; col++) {
				System.out.print(ticTacToe[row][col] + " ");
			}
			System.out.println();
		}

	}
	
	
	public void gameBoard() {
		System.out.println("\nPrint initial game board, player starts in middle\n");
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col < game[0].length; col++) {
				System.out.print(game[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("\nNow set row 0 col 0 to 1, print again\n");
		game[0][0] = 1;
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col < game[0].length; col++) {
				System.out.print(game[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nNow set row 2 col 0 to 1, print again\n");
		game[2][2] = 1;
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col < game[0].length; col++) {
				System.out.print(game[row][col] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("\nNow work with real game X and O\n");
		realGame[1][1] = 'X';
		realGame[2][2] = 'O';
		realGame[0][1] = 'X';
		for (int row = 0; row < realGame.length; row++) {
			for (int col = 0; col < realGame[0].length; col++) {
				System.out.print(realGame[row][col] + " ");
			}
			System.out.println();
		}
		
		
		/************* END OF ELABORATE, THOROUGH TESTING ************/
		//
		/*************** START THE REAL TIC TAC TOE GAME  ************/
		
		System.out.println("\nEverything working?  YEA!\n");
		System.out.println("Time to earn a grade!");
		System.out.println("1. Change int[][] to char[][]");
		System.out.println("2. Change 0, 1 values to O, X");
		System.out.println("3. Make a 2-player game, player O and player X");
		System.out.println("4. Ask first player to input row, col ");
		System.out.println("-- place an X");
		System.out.println("-- check for WIN! or tie,");
		System.out.println("-- if yes ask if they want to play again! if no next player");
		System.out.println("5. Ask the second player to input row, col ");
		System.out.println("-- place an O ");
		System.out.println("-- check for WIN! or tie,");
		System.out.println("-- if yes ask if they want to play again! if no next player");
		System.out.println("\nHint: To check for win, loop through all");
		System.out.println("possible win conditions:");
		System.out.println("if(game[0][0]==game[0][1] && game[0][1]==game[0][2] we have a row win");
		System.out.println("(remember char use == like int; Strings must use .equals() )");
		System.out.println("3 rows + 3 cols + 2 diags = 8 tests for a win");
		System.out.println("If no winner, but all cells are full that is a tie - 9 moves means all cells are full");
		
		
		System.out.println("\nGRADING IN INCREMENTAL STEPS");
		System.out.println("1. First grade: Have X, O players make moves");
		System.out.println("where you see updated board -- but");
		System.out.println("-- no check for win, no check for tie, no ask to go again");
		
		System.out.println("2. Second grade: Check for win or tie");
		System.out.println("after each check, display one of the following--");
		System.out.println("-- no winner yet, or");
		System.out.println("-- Winner!, or");
		System.out.println("-- no winner, game over");
		
		System.out.println("2. Third grade: Show who won, ask to go again");
		System.out.println("after each check, display one of the following--");
		System.out.println("-- no winner yet, or");
		System.out.println("--  X is the Winner!, (0 is the Winner!) would you like to play again?, or");
		System.out.println("-- no winner, a tie, game over, would you like to play agina?");
		
		
		
		
	}

} // end of Matrix class
