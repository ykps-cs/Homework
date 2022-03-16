package ykps.day_2_chess;

public abstract class ChessPiece {
	
	protected int x;
	protected int y;
	
	public ChessPiece(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract boolean canMoveTo(int targetX, int targetY);
	public abstract String moveTo(int targetX, int targetY);
}
