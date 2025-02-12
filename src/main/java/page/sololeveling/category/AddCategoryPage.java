package page.sololeveling.category;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage;

public class AddCategoryPage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement categoryName;

    @FindBy(xpath = "//div[@class='controls']/div[@id='s2id_688059186']")
    public  WebElement selectorOfParentCategory;

    // до нажатия на кнопку xpath
    @FindBy(xpath = "//*[@id='show-price']")
    public WebElement priceSetter;

    // после нажатия на кнопку xpath
    @FindBy(xpath = "//*[@name='price']")
    public WebElement priceSetter2ndStage;

    @FindBy(xpath = "//input[@name='submit_category']")
    public WebElement addCategoryBtn;

    @FindBy(xpath = "//a[normalize-space()='cancel']")
    public WebElement cancelCategoryBtn;

}
