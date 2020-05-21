package chess;

import java.util.Scanner;

public class Board {
	private Piece[][] pieces = new Piece[8][8];
	
	public Board() {
		for (int col = 0; col < 8; col++) {
			this.setPiece((char)('a' + col) + "2", new Pawn(PieceColor.White));
			this.setPiece((char)('a' + col) + "7", new Pawn(PieceColor.Black));
		}
		this.setPiece("d1", new Queen(PieceColor.White, false));
		this.setPiece("d8", new Queen(PieceColor.Black, true));
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		System.out.println(board.toString());
		PieceColor currentPlayer = PieceColor.White;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(currentPlayer + "'s move:");
			String move = sc.next();
			String[] moveParts = move.split("-");
			Piece pieceToMove = board.getPiece(moveParts[0]);
			board.setPiece(moveParts[1], pieceToMove);
			board.setPiece(moveParts[0], null);
			System.out.println(board.toString());
			currentPlayer = (currentPlayer == PieceColor.White ? PieceColor.Black : PieceColor.White);
		}	
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int row = 7; row >= 0; row--) {
			for (int col = 0; col < 8; col++) {
				if (pieces[col][row] == null)
					s.append(".");
				else
					s.append(pieces[col][row].toString());
			}
			s.append("\n");
		}
		return s.toString();
	}
	
	public Piece getPiece(String position) {
		return pieces[getColumn(position)][getRow(position)];
	}
	
	public void setPiece(String position, Piece piece) {
		if (piece != null)
			piece.setBoard(this);
		pieces[getColumn(position)][getRow(position)] = piece;
	}
	
	private static int getColumn(String position) {
		return position.charAt(0) - 'a';
	}
	
	private static int getRow(String position) {
		return position.charAt(1) - '1';
	}
	
	public static boolean isStraight(String from, String to) {
		return getColumn(from) == getColumn(to) || getRow(from) == getRow(to);
	} 
	
	public static boolean isDiagonal(String from, String to) { 
		return Math.abs(getColumn(to) - getColumn(from)) == 
			Math.abs(getRow(to) - getRow(from));
	}
	
	public boolean isOccupiedBetween(String from, String to) {
		int colStep = (int)Math.signum(getColumn(to) - getColumn(from));
		int rowStep = (int)Math.signum(getRow(to) - getColumn(from));
		int numSteps = (int)Math.max(
				Math.abs(getColumn(to) - getColumn(from)), 
				Math.abs(getRow(to) - getRow(from))) - 1;
		
		int col = getColumn(from);
		int row = getRow(from);
		for (int i = 0; i < numSteps; i++) {
			col += colStep;
			row += rowStep;
			if (pieces[col][row] != null)
				return true;
		}
		return false;
	}
}
