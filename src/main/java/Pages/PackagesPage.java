package Pages;

import Base.BasePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
public class PackagesPage extends BasePage {
    public PackagesPage(SHAFT.GUI.WebDriver driver) {super(driver);}

    // ************* ### Locators ### ********************** :

    static By countryNameLocator = By.id("country-name");                   //  Clcik on  country name Locator .
    static By BhCountryLocator = By.xpath("//*[@alt='bh']");  //  Clcik on  country name Locator .
    static By KwCountryLocator = By.xpath("//*[@alt='kw']");  //  Clcik on  country name Locator .

    static String namePackageUpperCase (String PackageName){          //  Name Packages to return This as UpperCase  .
        return  PackageName.toUpperCase();}

    static By namePackageLowerCaseLocator (String PackageName){       //  Name  Packages Locator .
        return  By.id("name-"+PackageName.toLowerCase());}

    static By currencyLiteLocator (String PackageName){               //  currency Packages Locator .
        return By.id("currency-"+PackageName.toLowerCase());}

    static By VideoQualityLitePackageLocator (String VideoQuality) {  // Video Quality Locator.
        return  By.xpath("//div[.='"+VideoQuality+"']");
    }


    // ************* ### Functions ### ********************** :


    //To Select Baharin Country
    public static void SelectBaharinCountry(){
        driver.element().click(countryNameLocator);
        driver.element().click(BhCountryLocator);
    }



    //To Select Kuwait Country
    public static void SelectKuwaitCountry(){
        driver.element().click(countryNameLocator);
        driver.element().click(KwCountryLocator);
    }


    // This function to Verify Subscription Packages Name ,Currency and Video Quality
    public static void VerifySubscriptionPackages(
            String PackageName , String currency , String VideoQuality) {
        driver.element().assertThat(namePackageLowerCaseLocator(PackageName))
                .text().contains(namePackageUpperCase(PackageName)).perform();

        driver.element().assertThat(currencyLiteLocator(PackageName)).text().contains(currency).perform();
        driver.element().assertThat(VideoQualityLitePackageLocator(VideoQuality)).text().contains(VideoQuality).perform();
    }


}
