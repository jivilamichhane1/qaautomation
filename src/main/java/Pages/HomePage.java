package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public void search_for_an_intem(String item) {
		WebElement search = driver.findElement(By.id("gh-ac"));
		search.sendKeys(item);
		search.sendKeys(Keys.ENTER);
	}

	public void choseBag() {
		WebElement choseBag = driver.findElement(By.xpath("//*[@id=\"item4df7e63d94\"]/div/div[2]/a/div"));
		choseBag.click();

	}

	public void buy_it_now() {

		String mainWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow); // perform required function
				WebElement buy_it_now = driver.findElement(By.xpath("//*[text()='']"));
				buy_it_now.click();
				// and close window
				driver.close();

			}
		}

		driver.switchTo().window(mainWindow);
	}
}
