package basic.moodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test  //using default Constructor
	public void shouldReturnHappyOrSadByRespondingFromAMessageUsingConstructor() {
		MoodAnalyser mood = new MoodAnalyser();
		assertEquals("SAD", mood.analyseMood());
	}

	@Test //using parameterised Constructor
	public void shouldReturnHappyOrSadByRespondingFromAMessageUsingConstructorParameter() {
		MoodAnalyser mood = new MoodAnalyser("Iam Feeling happy ");
		assertEquals("HAPPY", mood.analyseMood());
	}

	@Test //normal method
	public void shouldReturnHappyOrSadByRespondingFromAMessage() {
		MoodAnalyser mood = new MoodAnalyser();
		assertEquals("HAPPY", mood.analyseMood("Iam in any Mood "));
	}

}
