package chess;

import java.util.Scanner;

public class Board {
	private Piece[][] board;
	
	public Board() {
		this.board = new Piece[8][8];
		this.board[0][0] = new Rook(PieceColor.WHITE);
		this.board[0][1] = new Knight(PieceColor.WHITE);
		this.board[0][3] = new Queen(PieceColor.WHITE);
		this.board[0][6] = new Knight(PieceColor.WHITE);
		this.board[0][7] = new Rook(PieceColor.WHITE);
		this.board[7][0] = new Rook(PieceColor.BLACK);
		this.board[7][1] = new Knight(PieceColor.BLACK);
		this.board[7][3] = new Queen(PieceColor.BLACK);
		this.board[7][6] = new Knight(PieceColor.BLACK);
		this.board[7][7] = new Rook(PieceColor.BLACK);
	}
	
	public static int getRow(String position) {
		return position.charAt(1) - '1';
	}
	
	public static int getColumn(String position) {
		return position.charAt(0) - 'a';
	}
	
	public Piece getPiece(String position) {
		return board[getRow(position)][getColumn(position)];
	}
	
	public void setPiece(String position, Piece piece) { 
		board[getRow(position)][getColumn(position)] = piece;
	}
	
	public static boolean isStraight(String from, String to) { 
		int rowDiff = getRow(from) - getRow(to);
		int colDiff = getColumn(from) - getColumn(to);
		return rowDiff == 0 && colDiff != 0 || 
				colDiff == 0 && rowDiff != 0;
	}
	
	public static boolean isDiagonal(String from, String to) { 
		int rowDiff = Math.abs(getRow(from) - getRow(to));
		int colDiff = Math.abs(getColumn(from) - getColumn(to));
		return rowDiff == colDiff && rowDiff > 0;
	}
	
	public boolean isOccupiedBetween(String from, String to) {
		int startRow = getRow(from);
		int startCol = getColumn(from);
		int rowDiff = getRow(to) - getRow(from);
		int colDiff = getColumn(to) - getColumn(from);
		int rowStep;
		int colStep;
		int distance;
		// Determine which direction we are moving in
		if (rowDiff == 0) { // Horizontal
			distance = Math.abs(colDiff);
		}
		else if (colDiff == 0) { // Vertical
			distance = Math.abs(rowDiff);
		}
		else // Diagonal
			distance = Math.abs(rowDiff);
		
		if (rowDiff > 0)
			rowStep = 1;
		else if (rowDiff < 0)
			rowStep = -1;
		else
			rowStep = 0;
		
		if (colDiff > 0)
			colStep = 1;
		else if (colDiff < 0)
			colStep = -1;
		else
			colStep = 0;
		
		for (int i = 1; i < distance; i++) {
			int thisRow = startRow + rowStep * i;
			int thisCol = startCol + colStep * i;
			if (board[thisRow][thisCol] != null)
				return true;
		}
		return false;
	}
	
	public boolean isLegalMove(PieceColor color, String from, String to) {
		Piece pieceToMove = getPiece(from);
		return pieceToMove != null && pieceToMove.getPieceColor() == color && pieceToMove.canTake(from, to, this);
	}
	
	public void movePiece(String from, String to) {
		Piece pieceToMove = getPiece(from);
		setPiece(from, null);
		setPiece(to, pieceToMove);
	}
	
	// Not from the task
	public void print() {
		System.out.println();
		for (int r = 7; r >= 0; r--) {
			for (int c = 0; c < 8; c++) {
				if (board[r][c] == null)
					System.out.print('.');
				else
					System.out.print(board[r][c].getSymbol());
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		PieceColor currentPlayer = PieceColor.WHITE;
		Scanner sc = new Scanner(System.in);
		while (true) {
			board.print();
			System.out.println(currentPlayer + "'s move:");
			String move = sc.next();
			String[] moveParts = move.split("-"); // E.g. "a4-e2"
			String from = moveParts[0];
			String to = moveParts[1];
			if (!board.isLegalMove(currentPlayer, from, to)) {
				System.out.println("Illegal move!");
				continue;
			}
			board.movePiece(from, to);
			currentPlayer = (currentPlayer == PieceColor.WHITE ? PieceColor.BLACK : PieceColor.WHITE);
		}
	}
}
