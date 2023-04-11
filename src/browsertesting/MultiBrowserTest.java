package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {


    static String browser = "Edge";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
           driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }

//        Open the Url
        driver.get("https://www.saucedemo.com/");
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
