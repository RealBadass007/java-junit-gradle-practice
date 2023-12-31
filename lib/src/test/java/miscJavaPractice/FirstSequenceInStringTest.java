package miscJavaPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstSequenceInStringTest {

	@Test
	void testStringIndex() {
		assertEquals(3, FirstSequenceInString.findFirstSequenceIndex("rag", "Chirag Bangera"));
	}

}
