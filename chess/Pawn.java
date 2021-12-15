package chess;

public class Pawn extends Piece{	
	public Pawn (PieceColour p){
        if (p == PieceColour.BLACK){
            setSymbol("♟︎");
            colour = PieceColour.BLACK;
        }
        else if(p == PieceColour.WHITE){
            setSymbol("♙");
            colour = PieceColour.WHITE;
        }        
    }

    @Override
    public boolean isLegitMove(int i0, int j0, int i1, int j1){
        Boolean move = false;
        if(Board.hasPiece(i1, j1)&&colour == Board.getPiece(i1, j1).getColour()){
            move = false;
        }else{
            // White pawns
            if(Board.getPiece(i0, j0).getColour()==PieceColour.WHITE){
            // left Pawn
                // left pawn starting position
                if((i0==6)&&(j0==0)){
                    // up 1
                    if((i0-i1==1)&&(j0==j1)){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // up 2
                    else if((i0-i1==2)&&(j0==j1)){
                        for(int i=i1; i<i0;i++){
                            if (Board.hasPiece(i, j0)){
                                move = false;
                                break;
                            }
                            else{
                                move = true;
                            }
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0-1, j0+1)&&j1==j0+1&&i1==i0-1){   
                        move = true;
                    }
                }
                // left pawn other position
                else if(j0==0){
                    // up 1
                    if((i0-i1==1)&&(j0==j1)){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0-1, j0+1)&&i1==i0-1&&j1==j0+1){
                        move = true;
                    }
                }
                // right pawn
                // right pawn start position
                else if((i0==6)&&(j0==7)){
                    // up 1
                    if((i0-i1==1)&&(j0==j1)){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // up 2
                    else if((i0-i1==2)&&(j0==j1)){
                        for(int i=i1; i<i0;i++){
                            if (Board.hasPiece(i, j0)){
                                move = false;
                                break;
                            }
                            else{
                                move = true;
                            }
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0-1, j0-1)&&i1==i0-1&&j1==j0-1){
                        move = true;
                    }
                }
                // right pawn other position
                else if(j0==7){
                    // up 1
                    if((i0-i1==1)&&(j0==j1)){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0-1, j0-1)&&i1==i0-1&&j1==j0-1){
                        move = true;
                    }
                }
                // other white pawns
                // start posistion
                else if((i0==6)&&(j0>0)&&(j0<7)){
                    // up 1
                    if(i0-i1==1&&j0==j1){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // up 2
                    else if((i0-i1==2)&&(j0==j1)){
                        for(int i=i1; i<i0;i++){
                            if (Board.hasPiece(i, j0)){
                                move = false;
                                break;
                            }
                            else{
                                move = true;
                            }
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0-1, j0-1)&&i1==i0-1&&j1==j0-1){
                        move = true;
                    }
                    else if(Board.hasPiece(i0-1, j0+1)&&i1==i0-1&&j1==j0+1){
                        move = true;
                    }
                }
                // other position
                else if(j0>0&&j0<7){
                    // up 1
                    if((i0-i1==1)&&(j0==j1)){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0-1, j0+1)&&i1==i0-1&&j1==j0+1){
                        move = true;
                    }
                    else if(Board.hasPiece(i0-1, j0-1)&&i1==i0-1&&j1==j0-1){
                        move = true;
                    }
                }
                
            }
            // Black pawns
            else if(Board.getPiece(i0, j0).getColour()==PieceColour.BLACK){
            // left Pawn
                // left pawn starting position
                if((i0==1)&&(j0==0)){
                    // down 1
                    if((i1-i0==1)&&(j0==j1)){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // down 2
                    else if((i1-i0==2)&&(j0==j1)){
                        for(int i=i0+1; i<i1;i++){
                            if (Board.hasPiece(i, j0)){
                                move = false;
                                break;
                            }
                            else{
                                move = true;
                            }
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0+1, j0+1)&&j1==j0+1&&i1==i0-1){
                        move = true;
                    }
                }
                // left pawn other position
                else if(j0==0){
                    // down 1
                    if((i1-i0==1)&&(j0==j1)){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0+1, j0+1)&&i1==i0+1&&j1==j0+1){
                        move = true;
                    }
                }

                // right pawn
                // right pawn start position
                else if((i0==1)&&(j0==7)){
                    // down 1
                    if((i1-i0==1)&&(j0==j1)){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // down 2
                    else if((i1-i0==2)&&(j0==j1)){
                        for(int i=i0+1; i<i1;i++){
                            if (Board.hasPiece(i, j0)){
                                move = false;
                                break;
                            }
                            else{
                                move = true;
                            }
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0+1, j0-1)&&i1==i0+1&&j1==j0-1){
                        move = true;
                    }
                }
                // right pawn other position  
                else if(j0==7){
                    // down 1
                    if((i1-i0==1)&&(j0==j1)){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0+1, j0-1)&&i1==i0+1&&j1==j0-1){
                        move = true;
                    }
                }

                // other right pawns
                // start position
                else if((i0==1)&&(j0>0)&&(j0<7)){
                    // down 1
                    if(i1-i0==1&&j0==j1){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // down 2
                    else if((i1-i0==2)&&(j0==j1)){
                        for(int i=i0+1; i<i1;i++){
                            if (Board.hasPiece(i, j0)){
                                move = false;
                                break;
                            }
                            else{
                                move = true;
                            }
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0+1, j0-1)&&i1==i0+1&&j1==j0-1){
                        move = true;
                    }
                    else if(Board.hasPiece(i0+1, j0+1)&&i1==i0+1&&j1==j0+1){
                        move = true;
                    }
                }
                // other position
                else if(j0>0&&j0<7){
                    // down 1
                    if((i1-i0==1)&&(j0==j1)){
                        if(!Board.hasPiece(i1, j1)){
                            move = true;
                        }
                    }
                    // capture cross piece
                    else if(Board.hasPiece(i0+1, j0+1)&&i1==i0+1&&j1==j0+1){
                        move = true;
                    }
                    else if(Board.hasPiece(i0+1, j0-1)&&i1==i0+1&&j1==j0-1){
                        move = true;
                    }
                }
            }
        }
        return move;
    }
}
