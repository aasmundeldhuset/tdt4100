package chess;

public class Rook extends AbstractPiece {
	public Rook(PieceColor pieceColor) {
		super(pieceColor);
	}
	
	public boolean canMove(String from, String to, Board board) {
		return Board.isStraight(from, to) 
				&& !board.isOccupiedBetween(from, to);
	}
	
	public char getSymbol() {
		return getPieceColor() == PieceColor.WHITE ? 'R' : 'r';
	}
}
