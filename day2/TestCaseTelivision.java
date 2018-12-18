import static org.junit.Assert.*;

import org.junit.Test;


public class TestCaseTelivision {

	Telivision telivision = new Telivision();
	public void setup(){
		telivision.setChangeChannel(301);
		telivision.setDescVolume(1);
		telivision.setIncVolume(1);
		telivision.setTurn(true);
	}
	@Test
	public void testState() {
		boolean state = telivision.tvstate();
		assertTrue(state);
		
	}
	@Test
	public void testVolume(){
		int tvChannelNo = telivision.tvChannel();
		assertEquals(1, tvChannelNo);
	}
	@Test
	public void testChannel(){
		int tvVolumeNo = telivision.tvVolume();
		assertEquals(1, tvVolumeNo);
	}

}
