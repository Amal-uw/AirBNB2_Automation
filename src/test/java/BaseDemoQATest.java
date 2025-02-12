import driver.Driver;
import helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import page.sololeveling.category.CategoryPage;
import page.sololeveling.dashboard.DashboardPage;
import page.sololeveling.login.LoginPage;
import page.sololeveling.category.AddCategoryPage;
import page.sololeveling.users.AddUserPage;
import page.sololeveling.utils.randomEntityUtils.RandomUserGenerator;

public abstract class BaseDemoQATest {

    public WebDriver driver;
    WebElementActions webElementActions = new WebElementActions();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    AddUserPage addUserPage = new AddUserPage();
    RandomUserGenerator randomUserGenerator = new RandomUserGenerator();
    AddCategoryPage addCategoryPage = new AddCategoryPage();
    CategoryPage categoryPage = new CategoryPage();

    @BeforeSuite
    public void beforeSuite (){
        driver = Driver.getDriver();
    }
}
