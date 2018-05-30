package chessPieces;

public class King extends ChessPiece {

	public King(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean checkMove(int dx, int dy) {
		dx = Math.abs(dx);
		dy = Math.abs(dy);
		return dx <= 1 && dy <= 1;
	}

	public String getName() {
		return "king";
	}
}