package chess;

public class Rook extends ChessPiece {
	public Rook(PieceColor color) {
		super(color);
	}
	
	public boolean canMove(String from, String to) {
		return getBoard().isStraight(from, to)
			&& !getBoard().isOccupiedBetween(from, to);
	}
	
	public boolean canTake(String from, String to) {
		// Not implemented
		return false;
	}
	
	public void greet() {
		System.out.println("I am a rook");
	}
}
