import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void validLoginTest() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        String expectedText = "Logged In Successfully";
        String pageText = driver.getPageSource();

        Assert.assertTrue(pageText.contains(expectedText));

        System.out.println("TEST PASSED: Login Successful!");

        driver.quit();
    }
}

  
// ```

// 4. Click **Commit changes** → **Commit changes** again

// ---

// ### **Fix 3: Delete old LoginTest.java from root**

// 1. Click on the old `LoginTest.java` in root folder
// 2. Click **three dots (...)** on top right
// 3. Click **Delete file**
// 4. Click **Commit changes** → **Commit changes** again

// ---

// ### **Final Structure Should Look Like:**
// ```
// devops_selenium/
// ├── pom.xml              ✅
// └── src/
//     └── test/
//         └── java/
//             └── LoginTest.java ✅
