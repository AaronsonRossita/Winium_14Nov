import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CalcTest {

    @Test
    void testOne() throws Exception{
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);
        Thread.sleep(5000);
        // 87 + 23
        driver.findElement(By.id("num8Button")).click();
        driver.findElement(By.id("num7Button")).click();
        driver.findElement(By.id("plusButton")).click();
        driver.findElement(By.id("num2Button")).click();
        driver.findElement(By.id("num3Button")).click();
        driver.findElement(By.id("equalButton")).click();
        String result = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
        System.out.println(result.substring(11));
        //this is a new line
    }

}
