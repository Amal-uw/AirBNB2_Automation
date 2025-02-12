package page.sololeveling.users;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage;

public class CategoryList extends BasePage {

    @FindBy(xpath = "//*[@id=\"tl-admin-dashboard\"]/div[3]/div/div[1]/a")
    public WebElement dashboardCategories;

//    @FindBy(xpath = )
}
