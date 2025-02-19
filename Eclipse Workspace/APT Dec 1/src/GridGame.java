//make canMove method

public class GridGame {
	public int winningMoves(String[] grid){
		char[][] board = new char[4][4];
		for(int i = 0; i < 4; i++){
			board[i] = grid[i].toCharArray(); 
		}
		return countWinners(board); 
	}
	private int countWinners(char[][] board) {
		int wins = 0;
		for(int r=0; r < 4; r++){
			for(int c=0; c < 4; c++){
				if (canMove(board,r,c)){
					board[r][c] = 'X';
					int opponentWins = countWinners(board);
					if (opponentWins == 0){
						wins += 1;
					}
					board[r][c] = '.';
				}
			}
		}
		return wins;
	}
	public boolean canMove(char[][] board, int r, int c){
		
	}
}  
