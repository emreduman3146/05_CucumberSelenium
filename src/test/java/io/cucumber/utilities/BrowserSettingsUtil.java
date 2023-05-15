package io.cucumber.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class BrowserSettingsUtil
{
    public static ChromeOptions chromeSettings()
    {
        ChromeOptions option1=new ChromeOptions();

        option1.addArguments(
                 "--start-maximized",//Browser direk maximized modtalaunc edilsin
                "--disable-notifications",//,//bildirim almak ister misin pop-up'ini otomatik kapatir
                "--remote-allow-origins=*"//Chrome111 ile aldigimiz hatanin cozumu icin
        );

        //bloke eden pop=up'larin cikmasini engeller, otomasyon yapiliyordur yazisini kaldirir.
        option1.setExperimentalOption("excludeSwitches", new String[]{"disable-popup-blocking","enable-automation"});


        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        option1.setExperimentalOption("prefs", prefs);

        return option1;
    }
}
