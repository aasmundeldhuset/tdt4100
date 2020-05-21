package chess;

public class Queen {
    private final PieceColor color;
    
    public Queen(PieceColor color) {
        this.color = color;
    }
    
    public PieceColor getPieceColor() {
        return color;
    }
    
    public boolean canTake(String from, String to, Board board) {
        return true;
    }
    
    public boolean canMove(String from, String to, Board board) {
        return (Board.isStraight(from, to) || Board.isDiagonal(from, to))
                && !board.isOccupiedBetween(from, to);
    }
}
