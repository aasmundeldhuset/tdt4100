package chess;

public enum PieceColor {
    WHITE,
    BLACK;
    
    public PieceColor getOtherColor() {
        if (this == WHITE)
            return BLACK;
        else
            return WHITE;
    }
}
