package mypackage;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		TicTacToe newGame = new TicTacToe();
		printGrid(newGame);
		makeMove(newGame);
		printGrid(newGame);
	}

	public static void printGrid(TicTacToe game){
//		System.out.println();
//		System.out.println("  x | o |  ");
//		System.out.println("  - + - + -");
//		System.out.println("    | x |  ");
//		System.out.println("  - + - + -");
//		System.out.println("    |   | x");
		
		System.out.println();
		System.out.println();
		System.out.println("  "+ game.getGrid(0, 0) +" | "+ game.getGrid(1, 0) +" | "+ game.getGrid(2, 0) );
		System.out.println("  - + - + -");
		System.out.println("  "+ game.getGrid(0, 1) +" | "+ game.getGrid(1, 1) +" | "+ game.getGrid(2, 1) );
		System.out.println("  - + - + -");
		System.out.println("  "+ game.getGrid(0, 2) +" | "+ game.getGrid(1, 2) +" | "+ game.getGrid(2, 2) );
		System.out.println();
		System.out.println();
	}
	
	public static void makeMove(TicTacToe game) {
		Scanner sc = new Scanner(System.in);
		System.out.print("make your move: ");
		int place = sc.nextInt();
		game.setGrid('x', place);
	}
}
