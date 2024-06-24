package appleInsider;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {

    final private ElementsCollection articleTitles = $$x("//h2//a");

    public String hrefFromFirstArticles() {
        return articleTitles.first().getAttribute("href");
    }

}
