import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
     public static void main(String[] args){
        //FirefoxDriver drive = new FirefoxDriver();
        //C:\Users\ext.egonzales\Downloads\chromedriver_win32\chromedriver.exe

        System.setProperty("webdriver.chrome.driver",
             "C:\\Users\\ext.egonzales\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver drive = new ChromeDriver();
        drive.get("http://demo.guru99.com/");
        WebElement element = drive.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("algo1@gmail.com");
        WebElement button = drive.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }
}
