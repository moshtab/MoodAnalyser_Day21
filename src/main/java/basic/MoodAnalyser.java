package basic.moodAnalyser;

public class MoodAnalyser {
	String message;

	public MoodAnalyser() {
		message = "Iam Feeling Sad";

	}

	public MoodAnalyser(String msg) {
		message = msg;
	}

	public String analyseMood() {

		if (message.contains("Sad") || message.contains("sad")) {
			return "SAD";

		} else {
			return "HAPPY";
		}

	}

	public Object analyseMood(String string) {
		String msg = string;

		try {
			if (msg.equals(null) || msg.contains("Sad") || msg.contains("sad")) {
				return "SAD";

			} else {
				return "HAPPY";
			}
		} catch (NullPointerException exception) {
			return "HAPPY";
		}
	}
}
