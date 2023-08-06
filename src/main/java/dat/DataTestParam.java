package dat;

import org.testng.annotations.DataProvider;

public class DataTestParam {
    @DataProvider
    public static Object[][] getStrings(){
        return new Object[][]{
                {"Shevchenko"},
                {"Igor"},
                {"Supertest"},
        };
    }
}