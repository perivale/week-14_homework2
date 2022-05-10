package resources.testdata;

import org.testng.annotations.DataProvider;
import sun.security.util.Password;

public class TestDate {
    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"test1@gmail.com", "test123"},
                {"abcd@gmail.com "," ","Password is required."},
                {"adfdfgfg "," 123456 "," Invalid email address"},
                {"abcd@gmail.com "," 123456 "," Authentication failed."},

        };return data;
    }
}


