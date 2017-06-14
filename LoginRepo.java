
   import java.util.concurrent.TimeUnit;
   import org.openqa.selenium.By;
   import org.openqa.selenium.chrome.ChromeDriver;
   import org.openqa.selenium.WebDriver;


public class LoginRepo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "d:\\install\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://10.91.65.62:9292/");
        if (driver.findElement(By.xpath("//*[@id=\"id1\"]/span/input[1]")).isEnabled()) {
            System.out.println("Git Repository user name edit box Is enabled.");
            driver.findElement(By.xpath("//*[@id=\"id1\"]/span/input[1]")).sendKeys("kimmejares");
            driver.findElement(By.xpath("//*[@id=\"id1\"]/span/input[2]")).sendKeys("Louise11961");
            driver.findElement(By.xpath("//*[@id=\"id1\"]/span/button")).click();

            String Msg = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div[1]/span")).getText();
            System.out.println("Login to Git Repository");
            //String Msg = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/h2")).getText();

            String WelcomeMsg="owned";
            if (Msg.equals(WelcomeMsg)){
                System.out.println("Successful Login to Git Repository ->>" + Msg + " was displayed on screen");
            }else {
                System.out.println("Failed to Login to Git Repository");

            }


        }else {
            System.out.println("Git Repository user name edit box Is Not enabled.");

        }

        driver.close();
    }
}