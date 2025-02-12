package page;

import driver.Driver;
import helper.AlertHelper;
import helper.WebElementActions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import page.sololeveling.entity.Category;

public class BasePage {

   public WebElementActions webElementActions = new WebElementActions();
   public Actions actions = new Actions(Driver.getDriver());
   AlertHelper alertHelper;

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
