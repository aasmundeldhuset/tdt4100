package chess;

public class Pawn extends ChessPiece {
	public Pawn(PieceColor color) {
		super(color);
	}
	
	public boolean canMove(String from, String to) {
		// Not implemented
		return false;
	}

	public boolean canTake(String from, String to) {
		// Not implemented
		return false;
	}
	
	public String toString() {
		return getPieceColor() == PieceColor.White ? "P" : "p";
	}
	
	public void greet() {
		System.out.println("I am a poor pawn");
	}
}
