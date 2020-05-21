package chess;

public class Queen extends AbstractPiece {
	public Queen(PieceColor pieceColor) {
		super(pieceColor);
	}

	public boolean canMove(String from, String to, Board board) {
		return (Board.isStraight(from, to) || Board.isDiagonal(from, to)) 
				&& !board.isOccupiedBetween(from, to);
	}
	
	public char getSymbol() {
		return getPieceColor() == PieceColor.WHITE ? 'Q' : 'q';
	}
}
