package chess;

public class Queen implements Piece {
    private PieceColor pieceColor;
    
    @Override
    public PieceColor getPieceColor() {
        return pieceColor;
    }

    @Override
    public boolean canTake(String from, String to, Board board) {
        return false;
    }

    @Override
    public boolean canMove(String from, String to, Board board) {
        return isStraight(from, to) || isDiagonal(from, to);
    }
    
}
