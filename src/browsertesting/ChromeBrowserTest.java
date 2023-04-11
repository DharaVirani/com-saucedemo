package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
    String baseUrl = "https://www.saucedemo.com/";

    WebDriver driver= new ChromeDriver();
//    Open the Url
        driver.get(baseUrl);
//        Maximise the window
        driver.manage().window().maximize();
//        Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        Print the title of the page
        System.out.println("Title of the Page is: " + driver.getTitle());
//        Print the current Url
        System.out.println("Current Url: " + driver.getCurrentUrl());
//        Print the Page source
        System.out.println("Page source: " + driver.getPageSource());
//        Enter the email to email field
        driver.findElement(By.id("user-name")).sendKeys("gherkin123@gmail.com");
//        Enter password to password field
        driver.findElement(By.id("password")).sendKeys("gherkin12");
//      Closing the browser
        driver.close();
    }

}
