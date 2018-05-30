import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BadFracTest2 {

	@Test
	public void testIsReduced() {
		BadFrac f=new BadFrac(2,4);
		assertEquals(false,f.isReduced());
	}
	
	public void testAdd(){
		BadFrac g=new BadFrac(1,9);

	}

}
