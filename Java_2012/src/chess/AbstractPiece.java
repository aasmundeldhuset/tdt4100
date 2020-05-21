package chess;

public abstract class AbstractPiece implements Piece {
	private PieceColor pieceColor;
	
	public AbstractPiece(PieceColor pieceColor) {
		this.pieceColor = pieceColor;
	}
	
	public PieceColor getPieceColor() {
		return pieceColor;
	}
	
	public boolean canTake(String from, String to, Board board) {
		return canMove(from, to, board) 
				&& (board.getPiece(to) == null ||
					board.getPiece(to).getPieceColor() == pieceColor.getOtherColor());
	}
}
