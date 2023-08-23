package Test;

import org.testng.annotations.Test;

import Library.BaseTest;
import Pages.HomePage;

public class HomePageTest extends BaseTest{

	HomePage page;
	
	@Test
	public void search() {
		page = new HomePage (driver);
		page.search_for_an_intem("fan");
		page.choseBag();
		page.buy_it_now();
	
	}
}
