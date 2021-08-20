package basic.moodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

	@Test // using default Constructor
	public void shouldReturnHappyOrSadByRespondingFromAMessageUsingConstructor() {
		MoodAnalyser mood = new MoodAnalyser();
		assertEquals("SAD", mood.analyseMood());
	}

	@Test // using parameterised Constructor
	public void shouldReturnHappyOrSadByRespondingFromAMessageUsingConstructorParameter() {
		MoodAnalyser mood = new MoodAnalyser("Iam Feeling happy ");
		assertEquals("HAPPY", mood.analyseMood());
	}

	@Test // using parameterised Constructor
	public void shouldReturnHappyByRespondingNullMessageUsingConstructorParameter() {
		MoodAnalyser mood = new MoodAnalyser(null);
		assertEquals("HAPPY", mood.analyseMood());
	}

	@Test // normal method
	public void shouldReturnHappyOrSadByRespondingFromAMessage() {
		MoodAnalyser mood = new MoodAnalyser();
		try {
			mood.analyseMood("iam feeling sad");
		} catch (MoodAnalyserException e) {
			assertEquals("SAD", e.getMessage());
		}
	}

	@Test
	public void givenNullMoodShouldThrowExceptionMessage() {
		MoodAnalyser mood = new MoodAnalyser();
		try {
			@SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			mood.analyseMood(null);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenEmptyMoodShouldThrowExceptionMessage() {
		MoodAnalyser mood = new MoodAnalyser();
		try {
			@SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			mood.analyseMood("");
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}
	}
}
