import org.example.Helper;
import org.example.models.Plot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlotTests {
    public static WebDriver driver;

    @BeforeClass
    public void setUp(){
        Helper.setUp();
        driver = Helper.driver;
    }

    @Test
    public void positiveTest(){
        Plot p = new Plot( "Vilnius", "Vilniaus m.", "Baltupiai", "Goštauto", "4444-44444-4444",
                false, false, "pardodu sklipa", "sklip for seil", "a...",
                new String[]{"", ""}, "youtube.com", "tour3d.com", "40000", "+37065874125",
                "ne@tavo.reikalas", false, true, 1, true,new String[]{"namų valda","kita"},
                "43", "40", new int[]{1, 3, 7});
        p.fill();
        String actual = "";
        Assert.assertEquals(actual,"");
    }

    @Test
    public void positiveTest2(){
        Plot p = new Plot( "Vilnius", "Vilniaus m.", "Baltupiai", "Goštauto", "4444-44444-4444",
                false, false, "pardodu sklipa", "sklip for seil", "a...",
                new String[]{"", ""}, "youtube.com", "tour3d.com", "40000", "+37065874125",
                "ne@tavo.reikalas", false, true, 1, true,new String[]{"namų valda","kita"},
                "43", "40", new int[]{1, 3, 7});

        p.fill();
        String actual = "";
        Assert.assertEquals(actual,"");
    }
}
