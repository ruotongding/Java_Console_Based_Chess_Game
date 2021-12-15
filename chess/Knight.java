package chess;

import javax.print.attribute.standard.DialogOwner;

public class Knight extends Piece {
    public Knight (PieceColour p){
        if (p == PieceColour.BLACK){
            setSymbol("♞");
            colour = PieceColour.BLACK;
        }
        else if(p == PieceColour.WHITE){
            setSymbol("♘");
            colour = PieceColour.WHITE;
        }
        
    }
    @Override
    public boolean isLegitMove(int i0, int j0, int i1, int j1){
        Boolean move;
        if(Board.hasPiece(i1, j1)&&colour == Board.getPiece(i1, j1).getColour()){
            move = false;
        }else{
            // down 2 right 1
            if((i1-i0==2)&&(j1-j0==1)){
                move = true;
            }
            // down 2 left 1
            else if((i1-i0==2)&&(j0-j1==1)){
                move = true;
            }
            // right 2 down 1
            else if((i1-i0==1)&&(j1-j0==2)){
                move = true;
            }
            // right 2 up 1
            else if((i0-i1==1)&&(j1-j0==2)){
                move = true;
            }
            // left 2 down 1
            else if((i1-i0==1)&&(j0-j1==2)){
                move = true;
            }
            // left 2 up 1
            else if((i0-i1==1)&&(j0-j1==2)){
                move = true;
            }
            // up 2 right 1
            else if((i0-i1==2)&&(j1-j0==1)){
                move = true;
            }
            // up 2 left 1
            else if((i0-i1==2)&&(j0-j1==1)){
                move = true;
            }
            else{
                move = false;
            }
            
        }
        return move;
    }
    

}
