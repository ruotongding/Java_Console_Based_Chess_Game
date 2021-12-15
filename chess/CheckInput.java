package chess;

public class CheckInput {
	
	//This method requires your input
	public boolean checkCoordinateValidity(String input){
		String regex =  "^[1-8][a-h]$";
		return input.matches(regex);
	}
}
