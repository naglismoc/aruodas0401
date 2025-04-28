import org.example.Helper;
import org.example.models.Apartment;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ApartmentTests {
    public static WebDriver driver;
    @BeforeClass
    public void setUp(){
        Helper.setUp();
        driver = Helper.driver;
    }
    @Test
    public void positiveTest(){
        Apartment a = new Apartment("Vilnius", "Vilniaus m.", "Žirmūnai", "Kalvarijų g.", "1234-5678-9101", false, true, "Parduodamas butas Vilniuje", "Apartment for sale in Vilnius", "Продается квартира в Вильнюсе", new String[]{"foto1.jpg", "foto2.jpg"}, "youtube.com/watch?v=abc", "3dtour.com/view?id=abc", "150000", "+37061234567", "info@butai.lt", false, false, 1, true, new String[]{"Atskiras įėjimas", "terasa", "Skalbimo mašina", "drabuzine", "Šarvuotos durys"}, "25A", "12", "55", 2, 3, 5, 2005, "Mūrinis", "Įrengtas", new int[]{1, 2}, "Daugiabutis", new int[]{1, 3}, "B");
        a.fill();
    }
}
