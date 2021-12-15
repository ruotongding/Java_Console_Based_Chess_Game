package chess;

//This class requires your input
public abstract class Piece {
	private String symbol;
	protected PieceColour colour;
	public String getSymbol() {
		return symbol;
	}	
	public void setSymbol(String s){
		symbol = s;
	}

	public PieceColour getColour(){
		
		if (colour == PieceColour.BLACK){
			return PieceColour.BLACK;
		}else{
			return PieceColour.WHITE;
		}
		
	}

	public abstract boolean isLegitMove(int i0, int j0, int i1, int j1);
		
	

	
}
