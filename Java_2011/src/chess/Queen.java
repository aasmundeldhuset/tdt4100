package chess;

public class Queen extends ChessPiece {
	private boolean hasTiara; // Just demonstrating that subclasses may add new variables
	
	public boolean getHasTiara() {
		return hasTiara;
	}
	
	public Queen(PieceColor color, boolean hasTiara) {
		super(color);
		this.hasTiara = hasTiara;
	}
	
	public boolean canMove(String from, String to) {
		return (getBoard().isStraight(from, to)
				|| getBoard().isDiagonal(from, to))
			&& !getBoard().isOccupiedBetween(from, to);
	}

	public boolean canTake(String from, String to) {
		// Not implemented
		return false;
	}
	
	public String toString() {
		return getPieceColor() == PieceColor.White ? "Q" : "q";
	}
	
	public void greet() {
		System.out.println("I am a queen " + 
				(hasTiara ? "with" : "without")
				+ " a tiara");
		
	}
}
