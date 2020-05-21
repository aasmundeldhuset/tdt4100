import chess.ChessPiece;
import chess.Pawn;
import chess.Piece;
import chess.PieceColor;
import chess.Queen;
import chess.Rook;

public class Polymorphism {
	public static void main(String[] args) {
		// A variable of a class type may refer to any instance of any subclass of that type.
		ChessPiece cp = new Queen(PieceColor.White, true);
		System.out.println(cp.toString());
		cp = new Pawn(PieceColor.Black);
		System.out.println(cp.toString());
		cp = new Rook(PieceColor.White);
		System.out.println(cp.toString());
		// Note that the type of the variable decides which methods may be called at all.
		// For instance, a method that exists in Rook, but not in ChessPiece, may not be called through "cp", even when it refers to a Rook.
		
		// A variable of an interface type may refer to any instance of any class that implements that interface.
		// Only methods defined in the interface may be called through that variable.
		Piece p = cp;
		System.out.println(p.toString());
		
		// Note that static methods cannot be overridden, and that they should be called through the class names, not through variables.
		// If they are called through a variable, it is the variable's type (not the type of the object the variable refers to)
		// that decides which class' static method gets called.
	}
}
