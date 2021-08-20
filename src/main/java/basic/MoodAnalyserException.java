package basic.moodAnalyser;

public class MoodAnalyserException extends Exception {
	enum ExceptionType{
		EMPTY,NULL;
	}
	ExceptionType type; 

	public MoodAnalyserException(ExceptionType type,String message) {
		super(message);
		this.type=type;
	}
}
