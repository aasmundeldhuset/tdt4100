package chess;

public enum PieceColor {
	WHITE,
	BLACK;
	
	public PieceColor getOtherColor() {
		if (this == PieceColor.WHITE)
			return PieceColor.BLACK;
		else
			return PieceColor.WHITE;
	}
}
