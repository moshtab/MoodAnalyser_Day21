package basic.moodAnalyser;

import basic.moodAnalyser.MoodAnalyserException.ExceptionType;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {
		message = "Iam Feeling Sad";

	}

	public MoodAnalyser(String msg) {
		message = msg;
	}

	public String analyseMood() {

		try {
			if (message.equals(null) || message.contains("Sad") || message.contains("sad")) {
				return "SAD";

			} else {
				return "HAPPY";
			}
		} catch (NullPointerException exception) {
			return "HAPPY";
		}
	}

	public String analyseMood(String string) throws MoodAnalyserException {
		String msg = string;

		try {
			if (msg.length() == 0) {
				throw new MoodAnalyserException(ExceptionType.EMPTY, "you have entered invalid mood");
			}
			if (msg.equals(null) || msg.contains("Sad") || msg.contains("sad")) {
				return "SAD";

			} else {
				return "HAPPY";
			}
		} catch (NullPointerException exception) {
			throw new MoodAnalyserException(ExceptionType.NULL, "You have entered invalid mood ");
		}
	}
}
