package chess;

public class Knight extends AbstractPiece {
    public Knight(PieceColor pieceColor) {
        super(pieceColor);
    }

    @Override
    public boolean canTake(String from, String to, Board board) {
        return canMove(from, to, board);
    }

    @Override
    public boolean canMove(String from, String to, Board board) {
//        int colDiff = Math.abs(getPositionColumn(from) - getPositionColumn(to));
//        int rowDiff = Math.abs(getPositionRow(from) - getPositionRow(to));
//        return (colDiff == 2 && rowDiff == 1) || (colDiff == 1 && rowDiff == 2);
        return false;
    }
    
}
