import dat.DataTestParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParam  {

    @DataProvider
    public static Object[][] getNames() {
        return new Object[][]{
                {"Vasiliy"},
                {"Igor"},
                {"Elena"},
        };
    }

    @Test(dataProvider = "getNames")
    public void testParam(String name) {
        System.out.println(name);
    }

    @Test(dataProviderClass = DataTestParam.class, dataProvider = "getStrings")
    public void testParam2(String str) {
        System.out.println(str);
    }
}
