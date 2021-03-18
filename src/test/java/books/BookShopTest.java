package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class BookShopTest {

	private BookShop bookShop;

    	@BeforeEach 
	public void setUp(String name) throws Exception {
        	bookShop = new BookShop(name);
    	}

	@Test                                               
    	@DisplayName("Cost of books")
    	public void test(int[] books) {
        	bookShop.cost(books);
    	}

    	@Test
    	public void myFirstTest(){
        	assertTrue(false);
    	}
}