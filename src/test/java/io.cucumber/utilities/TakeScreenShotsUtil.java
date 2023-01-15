package io.cucumber.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static io.cucumber.driver.Driver.getDriver;
import static io.cucumber.utilities.ObjectUtil.ekranGoruntusu_aciklamasi;
import static io.cucumber.utilities.ObjectUtil.stepNumber;


public class TakeScreenShotsUtil
{


    /**
     * Description - This is for taking a screenshot of given driver/webelement and enables to highlight webElement
     * @param ssOfWhat - is representing the object to be taken screenshot
     * @param defaultPath - is where to save the screenshot
     * @param fileName - .png file's name
     * @param fullScreen - if it is true, the whole page will be taken
     * @param highlight - if it is true, the given webElement will be highlighted
     * @param webElement
     * @param <T> - This method has 1 generic parameter which can be WebElement or WebDriver
     * @return - The string value of the path for the screenshot
     * @throws IOException
     * @throws InterruptedException
     * @author Duman, Emre
     * @see WaitUtil
     * Date - January 14, 2023
     */
    public static  <T> String takeScreenshot(T ssOfWhat, String defaultPath, String fileName, boolean fullScreen, boolean highlight, WebElement webElement) throws IOException, InterruptedException {


        
        WaitUtil.waitFor(500);

        String date = new SimpleDateFormat("EEE yyyy-MMMM-dd hhmmss a ").format(new Date());

        String aciklama = "Step" + stepNumber + "_" + date + "_" + fileName;
        String target = defaultPath + aciklama + ".png";
        File finalDestination = new File(target);

        try
        {
            if (highlight)
            {
                try {
                    //SELENIUM-JAVA'NIN JS'YI KULLANMASINI SAGLAYAN CLASSTIR
                    JavascriptExecutor jse = (JavascriptExecutor) getDriver();
                    jse.executeScript("arguments[0].style.border='3px solid red'", webElement);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }

            if (fullScreen)
            {
                Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(getDriver());
                ImageIO.write(s.getImage(), "PNG", finalDestination);
            }

            else {

                TakesScreenshot ts = (TakesScreenshot) ssOfWhat;

                byte[] source = ts.getScreenshotAs(OutputType.BYTES);

                //OBJECTUTIL'DEN GELIR - HER ALINAN SS'YI DEPOLAR
                ekranGoruntusu_aciklamasi.put(source, aciklama);

                FileOutputStream fileOutputStream = new FileOutputStream(finalDestination);
                fileOutputStream.write(source);

            }
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }


        return target;
    }
}
