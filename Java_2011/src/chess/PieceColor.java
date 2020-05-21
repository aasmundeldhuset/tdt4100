package chess;

// Enum is no longer in the curriculum.
// However, they work like this: When writing
//	public enum PieceColor {
//		White, Black;
//		
//		private String name;
//		
//		public String toString() {
//			return name;
//		}
//	}
// Java would generate this:

public class PieceColor {
	public static final PieceColor White = new PieceColor("White");
	public static final PieceColor Black = new PieceColor("Black");
	
	private String name;
	
	private PieceColor(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
