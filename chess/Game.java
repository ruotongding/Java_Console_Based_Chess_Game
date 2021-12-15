package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;

	//This method requires your input
	public static void play(){
		while (!gameEnd){
			
			Console console = System.console();
			System.out.println("----- Whites move -----");
			// input origin
			String orInput = console.readLine("Enter origin: \n");
			CheckInput checkInput = new CheckInput();
			// check validity of origin input
			while (checkInput.checkCoordinateValidity(orInput) == false){
				System.out.println("Please enter a valid value: ");
				orInput = console.readLine("");
			}

			// get the origin coordinates through input
			char[] orInputlst = orInput.toCharArray();
			int iOr = orInputlst[0] - '1';
			int jOr = orInputlst[1] - 97;

			
			// avoid using empty square and black piece
			while(!Board.hasPiece(iOr, jOr) || Board.getPiece(iOr, jOr).getColour()==PieceColour.BLACK){
				orInput = console.readLine("Empty coordinates or you are moving the black piece, try again: \n");
				orInputlst = orInput.toCharArray();
			    iOr = orInputlst[0] - '1';
			    jOr = orInputlst[1] - 97;
			}
			
			// check validity of destination input
			String desInput = console.readLine("Enter Destination: \n");
			while (checkInput.checkCoordinateValidity(desInput) == false){
				desInput = console.readLine("Please enter a valid value: \n");
			}
			
			// get the destination coordinates through input
			char[] desInputlst = desInput.toCharArray();
			int iDe = desInputlst[0] - '1';
			int jDe = desInputlst[1] - 97;

			Piece p = Board.getPiece(iOr, jOr);
			
			// check whether legit of the specific piece
			while(!p.isLegitMove(iOr,jOr,iDe,jDe)){
				desInput = console.readLine("Please enter the valid destination: \n");
				desInputlst = desInput.toCharArray();
				iDe = desInputlst[0] - '1';
			    jDe = desInputlst[1] - 97;
			}

			


			



			Piece piece = Board.getPiece(iOr, jOr);

			// move piece and return the boolean value to the variable gameEnd
			gameEnd = Board.movePiece(iOr, jOr, iDe, jDe, piece);

						
			Board.printBoard();
			if (gameEnd == true){
				System.out.println("Whites Won!");
				break;
			}


			// Black piece
			System.out.println("----- Blacks move -----");
			orInput = console.readLine("Enter origin: \n");
			checkInput = new CheckInput();
			// check validity of origin input
			while (checkInput.checkCoordinateValidity(orInput) == false){
				orInput = console.readLine("Please enter a valid value: \n");
			}

			// get the origin coordinates through input
			orInputlst = orInput.toCharArray();
			iOr = orInputlst[0] - '1';
			jOr = orInputlst[1] - 97;

			
			// avoid using empty square and white piece
			while(!Board.hasPiece(iOr, jOr) || Board.getPiece(iOr, jOr).getColour()==PieceColour.WHITE){
				orInput = console.readLine("Empty coordinates or you are moving the black piece, try again: \n");
				orInputlst = orInput.toCharArray();
			    iOr = orInputlst[0] - '1';
			    jOr = orInputlst[1] - 97;
			}
			
			// check validity of destination input
			desInput = console.readLine("Enter Destination: \n");
			while (checkInput.checkCoordinateValidity(desInput) == false){
				desInput = console.readLine("Please enter a valid value: \n");
			}
			
			// get the destination coordinates through input
			desInputlst = desInput.toCharArray();
			iDe = desInputlst[0] - '1';
			jDe = desInputlst[1] - 97;

			// check whether legit of the specific piece
			p = Board.getPiece(iOr, jOr);
			while(!p.isLegitMove(iOr,jOr,iDe,jDe)){
				desInput = console.readLine("Please enter the valid destination: \n");
				desInputlst = desInput.toCharArray();
				iDe = desInputlst[0] - '1';
			    jDe = desInputlst[1] - 97;
			}
			


			piece = Board.getPiece(iOr, jOr);

			// move piece and return the boolean value to the variable gameEnd
			gameEnd = Board.movePiece(iOr, jOr, iDe, jDe, piece);

			
			
			
			Board.printBoard();
			if (gameEnd == true){
				System.out.println("Blacks Won!");
				break;
			}
			
			
			

		}		
	}
	
	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
