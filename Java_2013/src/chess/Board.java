package chess;

public class Board {
    private Piece[][] board = new Piece[8][8];
    
    public Piece getPiece(String position) {
        return board[getPositionRow(position)][getPositionColumn(position)];
    }
    
    public void setPiece(String position, Piece piece) {
        board[getPositionRow(position)][getPositionColumn(position)] = piece;
    }
    
    private int getPositionRow(String position) {
        return position.charAt(1) - '1';
    }
    
    private int getPositionColumn(String position) {
        return position.charAt(0) - 'a';
    }
    
    public static boolean isStraight(String from, String to) { return true; }
    public static boolean isDiagonal(String from, String to) { return true; }
    public boolean isOccupiedBetween(String from, String to) { return true; }
}
