package juaracoding;

import com.juaracoding.Drivers.DriverSingleton;
import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.Logout;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogoutTest {

    private WebDriver driver;

    private LoginPage loginPage;
    private CartPage cartPage;

    private Logout logout;

    @BeforeClass
    public void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        String url = "https://www.saucedemo.com/";
        driver.get(url);
        loginPage = new LoginPage();
        cartPage = new CartPage();
        logout = new Logout();
    }

    @AfterClass
    public void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testLogout(){
        loginPage.formLogin();
        Assert.assertEquals(loginPage.getTxtAppLogo(),"Swag Labs");
        cartPage.AddToCart();
        Assert.assertEquals(cartPage.getTxtCartIcon(),"Sauce Labs Bike Light");
        logout.LogoutNow();
    }






}
