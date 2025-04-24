import org.example.models.Plot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlotTests {
    public static WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        acceptcookies();
    }

    private void acceptcookies() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Test
    public void positiveTest(){
        Plot p = new Plot(driver,"Vilnius","Vilniaus m.","Baltupiai","Goštauto","43","4444-44444-4444","40",new int[]{1,3,7},new int[]{1,3,7},false,false,"pardodu sklipa", "sklip for seil", "a...",new String[]{"",""},"youtube.com","tour3d.com","40000","+37065874125","ne@tavo.reikalas",false,true,1,true);
        p.fill();
        String actual = "";
        Assert.assertEquals(actual,"");
    }

    @Test
    public void positiveTest2(){
        Plot p = new Plot(driver,"Vilnius","Vilniaus m.","Baltupiai","ryto","43","4444-44444-4444","40",new int[]{1,3,7},new int[]{1,3,7},false,false,"pardodu sklipa", "sklip for seil", "a...",new String[]{"",""},"youtube.com","tour3d.com","40000","+37065874125","ne@tavo.reikalas",false,true,1,true);
        p.fill();
        String actual = "";
        Assert.assertEquals(actual,"");
    }

}
