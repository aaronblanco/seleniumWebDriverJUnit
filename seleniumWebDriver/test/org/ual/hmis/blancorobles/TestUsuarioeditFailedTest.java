package org.ual.hmis.blancorobles;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
// Generated by Selenium IDE
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
public class TestUsuarioeditFailedTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
//	  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setHeadless(true);
		ChromeOptions ChromeOptions = new ChromeOptions();
		ChromeOptions.setHeadless(true);
	    driver = new ChromeDriver(ChromeOptions);
	   //driver = new FirefoxDriver(firefoxOptions);
		//driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_68,true);


    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    //Con firefox peta
	  //driver.quit();
  }
  @Test
  public void usuarioDeleteAccountFailedPassword() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
    vars.put("pass", js.executeScript("return \"Password1234$\""));
    System.out.println(vars.get("emailrandom").toString());
    System.out.println(vars.get("pass").toString());
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.id("Input_Password")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.cssSelector(".pb-3")).click();
    driver.findElement(By.id("registerSubmit")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Register confirmation"));
    driver.findElement(By.id("confirm-link")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.id("Input_Password")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello "+vars.get("emailrandom").toString()+"!")).click();
    driver.findElement(By.id("personal-data")).click();
    driver.findElement(By.id("delete")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("gthser");
    driver.findElement(By.cssSelector(".btn-danger")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Incorrect password."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
  @Test
  public void usuarioEmailEditFailedEmail() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
    vars.put("pass", js.executeScript("return \"Password1234$\""));
    System.out.println(vars.get("emailrandom").toString());
    System.out.println(vars.get("pass").toString());
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.id("Input_Password")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.cssSelector(".pb-3")).click();
    driver.findElement(By.id("registerSubmit")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Register confirmation"));
    driver.findElement(By.id("confirm-link")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.id("Input_Password")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello "+ vars.get("emailrandom").toString()+"!")).click();
    driver.findElement(By.cssSelector(".container:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Manage your account"));
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("Input_NewEmail")).click();
    driver.findElement(By.id("Input_NewEmail")).clear();

    driver.findElement(By.id("Input_NewEmail")).sendKeys("hyt5e");
    {
      WebElement element = driver.findElement(By.id("change-email-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    driver.findElement(By.id("email-form")).click();
    try {
    	Thread.sleep(2000);
    }catch(InterruptedException e) {
    	e.printStackTrace();
    }

    assertThat(driver.findElement(By.id("Input_NewEmail-error")).getText(), is("The New email field is not a valid e-mail address."));
    driver.findElement(By.id("change-email-button")).click();
    driver.findElement(By.cssSelector(".btn-link")).click();

    driver.findElement(By.cssSelector(".container:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Log out"));
    driver.findElement(By.cssSelector(".container:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("p")).getText(), is("You have successfully logged out of the application."));
    driver.close();
  }
  @Test
  public void usuarioTlfNumberFailedNumberString() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
    vars.put("pass", js.executeScript("return \"Password1234$\""));
    System.out.println(vars.get("emailrandom").toString());
    System.out.println(vars.get("pass").toString());
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.id("Input_Password")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.cssSelector(".pb-3")).click();
    driver.findElement(By.id("registerSubmit")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Register confirmation"));
    driver.findElement(By.id("confirm-link")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.id("Input_Password")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello "+vars.get("emailrandom").toString()+"!")).click();
    driver.findElement(By.cssSelector(".container:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Manage your account"));
    driver.findElement(By.id("Input_PhoneNumber")).click();
    driver.findElement(By.id("Input_PhoneNumber")).sendKeys("arewtg");
    driver.findElement(By.id("update-profile-button")).click();
    driver.findElement(By.cssSelector(".col-md-6")).click();
    assertThat(driver.findElement(By.cssSelector(".field-validation-error")).getText(), is("The Phone number field is not a valid phone number."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
}
