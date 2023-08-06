import configuration.BaseClass;
import dat.DataMainPage;
import jdk.jfr.Description;
import objects.HillelMainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TestHullelSearch extends BaseClass {
    HillelMainPage hillelMainPage;
    private final String mainURL="https://ithillel.ua/";
    @BeforeClass
    public void bb() {
        driver.get(mainURL);
        hillelMainPage= new HillelMainPage(driver);
    }
    @Test
    public void chekCourseMenu() throws Exception {
        throw new Exception("dd");
        //Assert.assertTrue(hillelMainPage.openCourseFrame());
    }
    @Description("Some detailed test description")
    @Test(dependsOnMethods = {"chekCourseMenu"},dataProviderClass = DataMainPage.class,dataProvider = "getSearchVariable")
    public void searchCourseTest(String searchVariable, List<String> searchResults) throws InterruptedException {
        Assert.assertEquals(hillelMainPage.getVariablesSearch(searchVariable),searchResults);
    }

}