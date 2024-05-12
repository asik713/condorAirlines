package condorAirlinescli;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteRevise {

	@Test
	public void autoCompleteTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		

		WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchbox']"));
		searchBox.sendKeys("as");
		
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@tabindex='0']/li"));
		
		for (WebElement webElement : list) {
			
			if(webElement.getText().equals("Honduras")) {
				webElement.click();
			}
		}

		}

	}





/*WebElement enterBox = driver.findElement(By.id("searchbox"));
enterBox.sendKeys("s");

Thread.sleep(3000);


List< WebElement > nameList = 	driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));

System.out.println(nameList.size());

for (WebElement allName : nameList) {

	if(allName.getText().equals("The Bahamas")) {
		allName.click();
		System.out.println("Name is entered");
		break;
	}

	else {

		System.out.println("not enter");
	}*/