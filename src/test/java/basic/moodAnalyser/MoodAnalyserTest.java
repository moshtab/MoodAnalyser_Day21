package basic.moodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {
	MoodAnalyser mood;

	@Before
	public void initialize() {
		mood = new MoodAnalyser();
	}

	@Test
	public void shouldReturnHappyOrSadByRespondingFromAMessage() {
		assertEquals("HAPPY", mood.analyseMood("Iam in any Mood "));
	}
	
}
