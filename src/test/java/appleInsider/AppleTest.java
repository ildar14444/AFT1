package appleInsider;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppleTest extends BaseSelenideTest {

    final static private String BASE_URL = "https://appleinsider.ru/";
    final static private String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    final static private String WAITING_STRING = "iphone-13";

    @Test
    public void main() {
        Main_Page main_page1 = new Main_Page(BASE_URL);
        main_page1.search(SEARCH_STRING);
        SearchPage searchPage1 = new SearchPage();
        String href = searchPage1.hrefFromFirstArticles();
        System.out.println(href);
        assertTrue(href.contains(WAITING_STRING));

        int i = 1;
    }
}
