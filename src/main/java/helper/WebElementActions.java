package helper;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementActions {

    public Actions actions =new Actions(Driver.getDriver());

    public WebElementActions waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public WebElementActions waitElementToBeClickAble(WebElement element){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementActions sendKeys(WebElement element, String text){
        waitElementToBeDisplayed(element);
        element.sendKeys(text);
        return this;
    }

    public WebElementActions click(WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickAble(element);
        element.click();
        return this;
//        actions.moveToElement("цукенг").click("addada");
//                //xpath который нужен
    }

    // @author AMAL
    public WebElementActions randomClick(WebElement element){
        double chance = Math.random();
        if(chance < 0.5){
            element.click();
        }
        return this;
    }
}


    //    public WebElementActions randomChoice(WebElement element){
//
//    }
