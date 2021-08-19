package basic.moodAnalyser;

public class MoodAnalyser {
	String message;

	public MoodAnalyser() {
		message = "Iam Feeling Sad";

	}

	public MoodAnalyser(String msg) {
		message = msg;
	}

	public Object analyseMood() {

		if (message.contains("Sad") || message.contains("sad")) {
			return "SAD";

		} else {
			return "HAPPY";
		}

	}
  
  //normal method
	public Object analyseMood(String string) {
		String msg = string;
		if (msg.contains("Sad") || msg.contains("sad")) {
			return "SAD";

		} else {
			return "HAPPY";
		}

	}

}
