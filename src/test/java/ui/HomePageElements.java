package ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class HomePageElements {

    public static Target SEARCH_FIELD = Target.the("Search field")
            .located(By.id("search_title"));
    public static Target SEARCH_BTN = Target.the("Search button")
            .located(By.id("search"));

    public static Target SEARCHRESULT_DIALOG  = Target.the("Search result dialog message")
            .located(By.id("android:id/message"));

    /*public static List<Target> FAVORITOS_TAB = Target.the("FAvori tab")
            .located(By.className("android.widget.TextView"));*/

}
