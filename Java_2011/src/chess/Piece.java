package chess;

public interface Piece {
	public PieceColor getPieceColor();
	public boolean canTake(String from, String to); 
	public boolean canMove(String from, String to);
	public void setBoard(Board board);
}
