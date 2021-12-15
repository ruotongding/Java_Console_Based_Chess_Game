package chess;

public class Bishop extends Piece{
    public Bishop (PieceColour p){
        if (p == PieceColour.BLACK){
            setSymbol("♝");
            colour = PieceColour.BLACK;
        }
        else if(p == PieceColour.WHITE){
            setSymbol("♗");
            colour = PieceColour.WHITE;
        }
        
    }
    @Override
    public boolean isLegitMove(int i0, int j0, int i1, int j1){
        Boolean move = false;
        if(Board.hasPiece(i1, j1)&&colour == Board.getPiece(i1, j1).getColour()){
            move = false;
        }else{
            if((i1-i0)==(j1-j0)){
                // down and right
                if(i1>i0){
                    if(i1-i0==1){
                        move = true;
                    }else{
                        for(int i = i0+1; i<i1;i++){
                            j0 = j0+1;
                            if(Board.hasPiece(i, j0)){
                                System.out.println("Kaif");
                                move = false;
                                break;
                            }else{
                                move = true;
                            }
                        }
                    }
                }
                // up and left
                else if(i0>i1){
                    if(i0-i1==1){
                        move = true;
                    }else{
                        for(int i = i1+1; i<i0;i++){
                            j1 = j1+1;
                            if(Board.hasPiece(i, j1)){
                                move = false;
                                break;
                            }else{
                                move = true;
                            }
                        }
                    }
                }
                
            }
            else if((i1-i0)==(j0-j1)){
                // down and left
                if(i1>i0){
                    if(i1-i0==1){
                        move = true;
                    }else{
                        for(int i = i0+1; i <i1;i++){
                            j0 = j0-1;
                            if(Board.hasPiece(i, j0)){
                                move= false;
                                break;
                            }else{
                                move=true;
                            }
                        }
                    }
                }
                // up and right
                else if(i0>i1){
                    if(i0-i1==1){
                        move = true;
                    }else{
                        for(int i = i1+1; i <i0;i++){
                            j0 = j0+1;
                            if(Board.hasPiece(i, j0)){
                                move= false;
                                break;
                            }else{
                                move=true;
                            }
                        }
                    }
                }
                
            }
            else{
                move = false;
            }

        }
        return move;
    }
}
