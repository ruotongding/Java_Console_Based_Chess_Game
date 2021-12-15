package chess;

public class King extends Piece{
    public King (PieceColour p){
        if (p == PieceColour.BLACK){
            setSymbol("♚");
            colour = PieceColour.BLACK;
        }
        else if(p == PieceColour.WHITE){
            setSymbol("♔");
            colour = PieceColour.WHITE;
        }
        
    }

    @Override
    public boolean isLegitMove(int i0, int j0, int i1, int j1){
        Boolean move = false;
        if(Board.hasPiece(i1, j1)&&colour == Board.getPiece(i1, j1).getColour()){
            move = false;
        }else{
            // right 1
            if((i0==i1)&&(j1-j0==1)){
                move = true;
            }
            // left 1
            else if((i0==i1)&&(j0-j1==1)){
                move = true;
            }
            // down 1
            else if((j0==j1)&&(i1-i0==1)){
                move = true;
            }
            // up 1
            else if((j0==j1)&&(i0-i1==1)){
                move = true;
            }
            // up 1 right 1
            else if((i0-i1==1)&&(j1-j0==1)){
                move = true;
            }
            // down 1 left 1
            else if((i1-i0==1)&&(j0-j1==1)){
                move = true;
            }
            // up 1 left 1
            else if((i0-i1==1)&&(j0-j1==1)){
                move = true;
            }
            // down 1 right 1
            else if((i1-i0==1)&&(j1-j0==1)){
                move = true;
            }
            else{
                move = false;
            }

        }
        return move;
    }
	
}
