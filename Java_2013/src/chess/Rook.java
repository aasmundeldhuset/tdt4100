package chess;

public class Rook implements Piece {
    private final PieceColor color;
    
    public Rook(PieceColor color) {
        this.color = color;
    }
    
    public PieceColor getPieceColor() {
        return color;
    }
    
    public boolean canTake(String from, String to, Board board) {
        return true;
    }
    
    public boolean canMove(String from, String to, Board board) {
        return Board.isStraight(from, to)
                && !board.isOccupiedBetween(from, to);
    }
}
