package chess;

public class Knight extends AbstractPiece {
	public Knight(PieceColor pieceColor) {
		super(pieceColor);
	}
	
	public boolean canMove(String from, String to, Board board) {
		int rowDiff = Math.abs(Board.getRow(to) - Board.getRow(from));
		int colDiff = Math.abs(Board.getColumn(to) - Board.getColumn(from));
		return rowDiff == 1 && colDiff == 2 || rowDiff == 2 && colDiff == 1;
	}
	
	public char getSymbol() {
		return getPieceColor() == PieceColor.WHITE ? 'N' : 'n';
	}
}
