package chess;

public abstract class ChessPiece implements Piece {
	private PieceColor color;
	private Board board;
	
	public ChessPiece(PieceColor color) {
		this.color = color;
	}
	
	public void setBoard(Board board) {
		this.board = board;
	}
	
	public Board getBoard() {
		return board;
	}
	
	public PieceColor getPieceColor() {
		return color;
	}
	
	// An abstract method must be implemented by all non-abstract subclasses
	public abstract void greet();
}
