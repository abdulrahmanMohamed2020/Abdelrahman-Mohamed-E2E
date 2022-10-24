package tests;

import org.testng.annotations.Test;
import pages.ToolTipPage;

import static org.testng.Assert.assertEquals;

public class ToolTipTest extends BaseTest{

    ToolTipPage toolTipPage;

    @Test(description = "Capture The Age Tooltip")
    public void captureTheAgeTooltip(){
        getDriver().get("https://jqueryui.com/tooltip/");
        toolTipPage =  new ToolTipPage(getDriver());

        toolTipPage.hoverOverTheAgeTextBox();

        String expectedTextResult = "We ask for your age only for statistical purposes.";

        takeScreenShot();
        assertEquals(toolTipPage.getTooltipMessage(), expectedTextResult);
    }
}
