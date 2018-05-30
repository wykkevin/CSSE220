import java.util.Random;

/**
 * 
 */

/**
 * This class represents a 7x7 minesweeper game.
 * 
 * When the class is constructed, it populates
 * the game with a random selection of mines
 * 
 * 0| - X - - - - -  
 * 1| - - - - - - -  
 * 2| - - - - - X -  
 * 3| - - - - - - -  
 * 4| - - - X - - -  
 * 5| - - - - - - X  
 * 6| - - - - - - -  
 *  +--------------
 *    0 1 2 3 4 5 6  
 * 
 * (Xs represent mines)
 * 
 * To play, a player selects a slot.  Slots are indexed
 * in row, column order so the slot 0,1 has a mine in the example
 * 
 * First the program should call hasMine to determine if there is a mine there/
 * If there is a mine, the player looses and the program should display that.
 * 
 * Otherwise the program should call calls getNeighborMineCount and displays
 * that (e.g. for index 1,0 the result would be 1 because it is diagonally
 * adjacent to 0,1)  
 * 
 * The goal of the player is to reveal all non-mine slots.
 * 
 * @author hewner
 *
 */
public class MinesweeperGame {
	
	public static final int SIZE = 7;
	private boolean[][] mines;
	
	/**
	 * Makes a new random linear minesweeper board
	 */
	public MinesweeperGame() {

		mines = new boolean[SIZE][SIZE];
		
		Random r = new Random();

		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(r.nextDouble() < .3) {
					this.mines[i][j] = true;
				}
			}
		}
	}
	
	/**
	 * Returns true if the index has a mine
	 * 
	 * If given coordinates outside the limits, always returns false
	 * 
	 * @param row - row to check
	 * @param column - column to check
	 * @return true if a mine
	 */
	public boolean hasMine(int row, int column) {
		if(row < 0 || row >= SIZE || column < 0 || column >= SIZE)
			return false;
		return mines[row][column];
	}
	
	/**
	 * Returns the number of mines adjacent to the given
	 * slot, including diagonals
	 * 
	 * @param row - row to check nearby
	 * @param column - column to check nearby
	 * @return number of mines adjacent
	 */
	public int getNeighborMineCount(int row, int column) {
		int rowOffsets[] = {-1,0,1};
		int colOffsets[] = {-1,0,1};
		int count = 0;
		for(int rowOffset : rowOffsets) {
			for(int colOffset : colOffsets) {
				if(rowOffset == 0 && colOffset == 0)
					continue;
				if(hasMine(row + rowOffset, column + colOffset)) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	/**
	 * Returns the setup of the board, which is useful for testing.
	 * 
	 * 0 1 X 1 0
	 * 
	 * Means a 5 slot board with a mine in the middle slot
	 * 
	 * @return secret position of mines, and counts for each non-mine slot
	 */
	public String getSecretBoardSetup() {
		String output = "";
		for(int row = 0; row < mines.length; row++) {
			output += row + "| ";
			for(int col = 0; col < mines.length; col++) {
				if(hasMine(row,col)) {
					output += "X ";
				} else {
					output += getNeighborMineCount(row,col) + " ";
				}
			}
			output += "\n";
		}
		return output + " +--------------\n   0 1 2 3 4 5 6";
	}

}
