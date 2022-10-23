import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;



class TestingTD  {
	
		int menuItem = 0;
		int showList = 1;
		int addItem = 2;
		int remove = 3;
		
		
		@Test
		@DisplayName("Testing Showlist Method")

	 void testshowList() {
			
		    assertEquals(menuItem,0,0);	
		   

		} 
		
		@Test
		@DisplayName("Testing addItem Method")

	 void testaddItem() {
			
		    assertEquals(addItem,2,0);	


		
	}
		@Test
		@DisplayName("Testing removeItem Method")

	 void testremoveItem() {
			
			   assertEquals(remove,3,0);	
		}
}
