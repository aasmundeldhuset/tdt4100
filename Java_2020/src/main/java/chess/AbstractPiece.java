package chess;

public abstract class AbstractPiece implements Piece {
    private PieceColor pieceColor;
    
    public AbstractPiece(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }
    
    @Override
    public PieceColor getPieceColor() {
        return pieceColor;
    }
}
