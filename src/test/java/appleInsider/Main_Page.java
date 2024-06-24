package appleInsider;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class Main_Page {

    private final SelenideElement inputBox = $x("//form//input");

    public Main_Page(String url){
         Selenide.open(url);
    }

    public void search(String searchString) {
        inputBox.setValue(searchString);
        inputBox.sendKeys(Keys.ENTER);
    }
}
