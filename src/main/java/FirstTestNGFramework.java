

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.prefs.PreferenceChangeEvent;


public class FirstTestNGFramework {
    WebDriver driver;

    @Test(priority = 1)
    void browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }



    @Test(priority = 2)
    void Computer() {
        System.out.println("user able to Select the Computer");

        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();


    }

    @Test(priority = 3)

    void Desktop() {
        System.out.println(" user able to select the desktop");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();


    }

    @Test(priority = 4)
    void selectlenovoimage() {

        System.out.println("user able to select lonovo image");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
    }

    @Test(priority = 5)

    void Addtocart(){
        System.out.println("user able to verify add to cart");
        driver.findElement(By.id("add-to-cart-button-3")).click();

    }

   @Test(priority = 6)
   void Messagebar(){
       System.out.println("user able to show the message");
       //driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).click();
   }
   @Test(priority = 7)
   void Shoppingcart(){
       System.out.println("click the Shoppingcart");
       driver.findElement(By.className("ico-cart")).click();

   }

   @Test(priority = 8)
    void quantity(){
        System.out.println("user able to add quantity");
        driver.findElement(By.className("qty-input")).clear();
       driver.findElement(By.className("qty-input")).sendKeys("3");

   }

   @Test(priority = 9)
    void updatecart(){
       System.out.println("user able to select updatecart");
       driver.findElement(By.id("updatecart")).click();

   }
   @Test(priority = 10)
    void clickthecheckbox(){
       System.out.println("user able to click the checkbox");
       driver.findElement(By.id("termsofservice")).click();
   }

   @Test(priority = 11)
    void checkbox(){
       System.out.println("user able to click the checkbox");
       driver.findElement(By.id("checkout")).click();
   }
   @Test(priority = 12)
    void checkoutasguest(){
       System.out.println("user able to click checkoutasguest");
       driver.findElement(By.className("checkout-as-guest-button")).click();

   }
   @Test(priority = 13)
    void Billing(){
       System.out.println("user able to fill the form");
       driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Simy");
       driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Patel");
       driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("patel.simy883@yahoo.com");
       driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("KinghtFranke");
       driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United Kingdom");
       driver.findElement(By.id("BillingNewAddress_City")).sendKeys("London");
       driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys(" 2 ReptonRoad,Stanmore,London");
       driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("2 ReptonRoad,Stanmore,London" );
       driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("HA3 1QB");
       driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("07775559643");
       driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("07774445324");
       driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
   }




}






