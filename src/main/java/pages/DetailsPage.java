package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class DetailsPage {
    @FindBy(css = "#kp-wp-tab-overview div[data-attrid*='poslednyaya_versiya'] .LrzXr.kno-fv")
    private WebElement lastVersion;

    @FindBy(css = "#kp-wp-tab-overview div[data-attrid*='licenziya'] .LrzXr.kno-fv")
    private WebElement license;

    @FindBy(css = "h2[data-attrid*='title']")
    private WebElement name;

    public DetailsPage(WebDriver driver) {
        initElements(driver, this);
    }

    public String getLastVersion() {
        return lastVersion.getText();
    }

    public String getLicense() {
        return license.getText();
    }

    public String getName() {
        return name.getText();
    }
}
