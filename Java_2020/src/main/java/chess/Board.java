package chess;

public class Board {
    private Piece[][] pieces = new Piece[8][8];
    
    public Piece getPiece(String position) {
        int col = position.charAt(0) - 'a';
        int row = position.charAt(1) - '0' - 1;
        return pieces[col][row];
    }
    
    public void movePiece(String from, String to) {
        Piece piece = getPiece(from);
        if (piece == null) {
            return;
        }
        Piece otherPiece = getPiece(to);
        if (otherPiece != null && otherPiece.getPieceColor() == piece.getPieceColor()) {
            return;
        }
        if (!piece.canMove(from, to, this)) {
            return;
        }
    }
}
