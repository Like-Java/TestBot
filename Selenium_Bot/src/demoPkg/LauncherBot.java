package demoPkg;

import java.awt.*;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LauncherBot {

	private WebDriver driver;
	private ChromeOptions options;
	private Robot rb;
	
	public LauncherBot() throws AWTException, InterruptedException {
		
		options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		rb = new Robot();
		
		driver.get("https://www.amazon.co.jp");
		driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
		for(int i = 0; i < 5; i++) {
			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(0);
		}
		
		for(int i = 0; i < 2; i++) {
			rb.keyPress(KeyEvent.VK_ENTER);
		}
			
		System.out.println(driver.getTitle());
	}
	
}
