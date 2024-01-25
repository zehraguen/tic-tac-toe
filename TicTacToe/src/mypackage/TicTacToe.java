package mypackage;

public class TicTacToe {
	private char[][] grid;
	
	public TicTacToe(){
		grid = new char[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				grid[i][j]= ' ';
			}
		}
	}
	
	public char getGrid(int i, int j){ 
		return grid[i][j];
	}
	
	public void setGrid(char n, int p) {
		switch(p) {
			case(1):
				grid[0][0] = n;
				break;
			case(2):
				grid[1][0] = n;
				break;
			case(3):
				grid[2][0] = n;
				break;
			case(4):
				grid[0][1] = n;
				break;
			case(5):
				grid[1][1] = n;
				break;
			case(6):
				grid[2][1] = n;
				break;
			case(7):
				grid[0][2] = n;
				break;
			case(8):
				grid[1][2] = n;
				break;
			case(9):
				grid[2][2] = n;
				break;
			default:
				
		}
	}
}
