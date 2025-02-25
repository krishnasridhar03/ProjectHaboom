package sample;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGame {
	
	WebDriver driver;
	
	
	public static void main(String[]args) {
		TestGame play=new TestGame();
		play.setup();
		play.login();
		play.slotsdashboard();
//		play.gamepage();
	}

	public void setup() {
    	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://haboom.com/d/login");	
		driver.manage().window().maximize();
	}
	
	public void login() {
		driver.findElement(By.id("email__")).sendKeys("krishnacri");
		driver.findElement(By.id("password__")).sendKeys("Krishna@123");
		driver.findElement(By.id("login")).click();
	}
	public void slotsdashboard() {
		driver.findElement(By.id("ARCADE_SLOTS")).click();
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[4]/div[2]/ul/li[9]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\'display_providers_list\']/div[1]/div/section[1]")).click();
	}
//	public void gamepage() {
//		for (String handle:driver.getWindowHandles()) {
//			driver.switchTo().window(handle);
//			break;
//		}
//		WebElement canvas=driver.findElement(By.id("gameCanvas"));
//		int xOffset = canvas.getLocation().getX();
//		int yOffset = canvas.getLocation().getY();
//
//		// Adjust coordinates based on element position inside the canvas
//		int clickX = xOffset + 100;  // Change 100 to the actual X coordinate inside the game
//		int clickY = yOffset + 200;  // Change 200 to the actual Y coordinate inside the game
//
//		// Perform the click
//		Actions actions = new Actions(driver);
//		actions.moveByOffset(clickX, clickY).click().perform();
//	}
}
	
