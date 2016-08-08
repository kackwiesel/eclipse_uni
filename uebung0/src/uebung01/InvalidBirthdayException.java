package uebung01;

public class InvalidBirthdayException extends Exception{
	String message;
	
	public InvalidBirthdayException(){};
	
	public InvalidBirthdayException(String s){
		this.message = s;
	}
	
	@Override
	public String getMessage(){
		return this.message;
	}
	
}
