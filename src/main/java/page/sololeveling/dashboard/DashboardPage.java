package page.sololeveling.dashboard;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage;
import page.sololeveling.entity.Category;
import page.sololeveling.entity.User;
import page.sololeveling.category.AddCategoryPage;
import page.sololeveling.login.LoginPage;
import page.sololeveling.users.AddUserPage;

public class DashboardPage extends BasePage {
    public AddUserPage addUserPage = new AddUserPage();
    public AddCategoryPage addCategoryPage = new AddCategoryPage();

    @FindBy(xpath = "(//a[normalize-space()='Add user'])[2]")
    public WebElement addUserBtn;

    public AddUserPage addNewUser(User user){
        webElementActions.click(addUserBtn);
        webElementActions.sendKeys(addUserPage.firstName, user.getFirstname() )
                .sendKeys(addUserPage.lastName,user.getLastname())
                .sendKeys(addUserPage.email,user.getUsername())
                .sendKeys(addUserPage.login,user.getEmail())
                .sendKeys(addUserPage.password,user.getPassword())
                .click(addUserPage.AddUserButton);
        return new AddUserPage();
    }

    @FindBy(xpath = "//span[@class='arrow-down']")
    public WebElement subMenu;

    @FindBy(xpath = "//a[@data-testid='legacy-menu-item']")
    public WebElement legacyMenuItem;

    public LoginPage switchToLegacyInterface(){
        try{
            webElementActions.click(subMenu).click(legacyMenuItem);
            return new LoginPage();
        } catch(NoSuchElementException e){
            return new LoginPage();
        }
    }

    @FindBy(xpath = "//a[normalize-space()='Add category']")
    public WebElement addCategoryBtn;

    public AddCategoryPage addNewCategory(Category category){
        webElementActions.click(addCategoryBtn);
        webElementActions.sendKeys(addCategoryPage.categoryName, category.getCatName())
//                .randomClick(addCategoryPage.selectorOfParentCategory)
//                .randomClick(addCategoryPage.priceSetter)
                .click(addCategoryPage.addCategoryBtn);
        return new AddCategoryPage();
    }

    @FindBy(xpath = "//div[@class='tl-bold-link']/a[normalize-space()='Categories']" )
    public WebElement CategoriesSection;

    public void SectionKlick(){
        CategoriesSection.click();
    }





}
