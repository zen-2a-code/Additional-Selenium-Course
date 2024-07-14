package infinityscroll;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.InfinityScrollPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InfinityScrollTests extends BaseTest {

    @Test
    public void testExactScrolling() {
        welcomePage.open();
        InfinityScrollPage infinityScrollPage = welcomePage.clickInfinityScrollLink();
        int scrollToParagraphNumber = 5;

        infinityScrollPage.scrollToParagraph(scrollToParagraphNumber);
        int actualParagraphsOnPage = infinityScrollPage.getCurrentParagraphCount();

        Assert.assertTrue(scrollToParagraphNumber == actualParagraphsOnPage,
                "Expected paragraphs: " + scrollToParagraphNumber + "\nActual paragraphs: "
                        + actualParagraphsOnPage);
        System.out.println(actualParagraphsOnPage);
    }
}
