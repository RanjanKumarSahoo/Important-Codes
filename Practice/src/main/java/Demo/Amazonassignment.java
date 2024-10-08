package Demo;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
    import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import java.util.concurrent.TimeUnit;

	public class Amazonassignment {
	    private WebDriver driver;

	    @SuppressWarnings("deprecation")
		@BeforeClass
	    public void setUp() {
	        // Set Chrome driver path
	        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	        // Configure Chrome options
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");

	        // Initialize ChromeDriver
	        driver = new ChromeDriver(options);

	        // Implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }

	    @Test(priority = 1)
	    public void testAddItemToCart() throws InterruptedException {
	        // Navigate to Amazon homepage
	        driver.navigate().to("https://www.amazon.com/");
	        driver.navigate().refresh();
	        // Search for a product and select it
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("product name");
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        driver.findElement(By.cssSelector("span.a-size-base-plus.a-color-base.a-text-normal")).click();

	        // Add item to cart
	        driver.findElement(By.id("add-to-cart-button")).click();

	        // Verify item is added to cart
	        WebElement cartCountElement = driver.findElement(By.id("nav-cart-count"));
	        int cartCount = Integer.parseInt(cartCountElement.getText());
	        Assert.assertEquals(cartCount, 1, "Item is not added to cart successfully");
	    }

	    @Test(priority = 2)
	    public void testUpdateShippingInformation() {
	        // Proceed to checkout
	        driver.findElement(By.id("nav-cart")).click();
	        driver.findElement(By.cssSelector("input[name='proceedToRetailCheckout']")).click();
	        
	     // Enter email/phone number
	           WebElement emailField = driver.findElement(By.id("ap_email"));
	           emailField.sendKeys("testingautoamaz@gmail.com");
	           driver.findElement(By.xpath("//input[@id='continue']")).click();

	           // Enter password
	           WebElement passwordField = driver.findElement(By.id("ap_password"));
	           passwordField.sendKeys("Sahoork54@");

	           // Click on the sign-in button
	           WebElement signInButton = driver.findElement(By.id("signInSubmit"));
	           signInButton.click();

	        // Update shipping address
	        driver.findElement(By.xpath("//div[@class='a-section a-text-center address-ui-widgets-desktop-button-text']")).click();
	        driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']")).sendKeys("Testing");
	        driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys("9090876043");
	        driver.findElement(By.id("address-ui-widgets-continue")).click();

	        // Verify shipping address is updated
	        WebElement updatedAddress = driver.findElement(By.id("address-book-entry-0"));
	        Assert.assertTrue(updatedAddress.getText().contains("New Name"), "Shipping address is not updated successfully");
	    }

	    @Test(priority = 3)
	    public void testRemoveItemFromCart() {
	        // Remove item from cart
	        driver.findElement(By.cssSelector("input[data-action='delete']")).click();

	        // Verify item is removed from cart
	        WebElement emptyCartMessage = driver.findElement(By.cssSelector("div.a-row.sc-cart-header"));
	        Assert.assertTrue(emptyCartMessage.getText().contains("Your Shopping Cart is empty."), "Item is not removed from cart successfully");
	    }

	   @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}